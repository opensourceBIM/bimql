package nl.wietmazairac.bimql;

import java.util.List;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.bimserver.emf.IdEObject;
import org.bimserver.emf.IfcModelInterface;
import org.bimserver.emf.IfcModelInterfaceException;
import org.bimserver.ifc.IfcModel;
import org.bimserver.plugins.ModelHelper;
import org.bimserver.plugins.Reporter;
import org.bimserver.plugins.objectidms.AbstractObjectIDM;
import org.bimserver.plugins.objectidms.ObjectIDM;
import org.bimserver.plugins.queryengine.QueryEngine;
import org.bimserver.plugins.queryengine.QueryEngineException;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

public class BimQLQueryEngine implements QueryEngine {

	@Override
	public IfcModelInterface query(IfcModelInterface model, String code, final Reporter reporter, ModelHelper modelHelper) throws QueryEngineException {
		CharStream charStream = new ANTLRStringStream(code);
		BimQLLexer lexer = new BimQLLexer(charStream) {
			@Override
			public void reportError(RecognitionException e) {
				String hdr = getErrorHeader(e);
				String msg = getErrorMessage(e, getTokenNames());
				emitErrorMessage(hdr + " " + msg);
				reporter.error(new Exception(hdr + " fault " + msg));
			}
		};
		TokenStream tokenStream = new CommonTokenStream(lexer);
		BimQLParser parser = new BimQLParser(tokenStream) {
			@Override
			public void reportError(RecognitionException e) {
				String hdr = getErrorHeader(e);
				String msg = getErrorMessage(e, tokenNames);
				emitErrorMessage(hdr + " threw this " + msg);
				reporter.error(new Exception(hdr + " " + msg));
			}
		};
		try {
//			IfcModelInterface resultModel = modelHelper.getTargetModel();
//			resultModel.clear();
			IfcModelInterface resultModel = new IfcModel();
			AbstractObjectIDM idm = new AbstractObjectIDM(null){

				@Override
				public boolean shouldFollowReference(EClass originalClass,
						EClass eClass, EStructuralFeature eStructuralFeature) {
//					System.out.println(eStructuralFeature.getName());
					if (eStructuralFeature instanceof EAttribute)
						return true;
					if (eStructuralFeature.getName().equalsIgnoreCase("HasAssignments"))
						return true;
					if (eStructuralFeature.getName().equalsIgnoreCase("HasAssociations"))
						return true;
					if (eStructuralFeature.getName().equalsIgnoreCase("IsDefinedBy"))
						return true;
					if (eStructuralFeature.getName().equalsIgnoreCase("RelatingPropertyDefinition"))
						return true;
					if (eStructuralFeature.getName().equalsIgnoreCase("HasProperties"))
						return true;
					if (eStructuralFeature.getName().equalsIgnoreCase("NominalValue"))
						return true;
					if (eStructuralFeature.getName().equalsIgnoreCase("Quantities"))
						return true;
					if (eStructuralFeature.getName().equalsIgnoreCase("wrappedValue"))
						return true;
					return false;
				}

				@Override
				public boolean shouldIncludeClass(EClass originalClass,
						EClass eClass) {
					// TODO Auto-generated method stub
					return true;
				}
				
			};
			
			ModelHelper mh = new ModelHelper(idm,resultModel);
			mh.setKeepOriginalOids(false);
			
			mh.setTargetModel(resultModel);
			
//			for (IdEObject obj : resultModel.getObjects().values())
//			{
//				resultModel.remove(obj);
//			}
			List<Object> result = parser.bimql(model);
			if (result != null) {
				for (Object object : result) {
					if (object instanceof IdEObject) {
//						resultModel.add(1,((IdEObject)object));
						mh.copy((IdEObject)object);
						for (EStructuralFeature feature : ((IdEObject)object).eClass().getEAllStructuralFeatures())
						{
							if (feature.getName().equalsIgnoreCase("HasAssociations"))
							{
								Object eGet = ((IdEObject)object).eGet(feature);
//								System.out.println(eGet.toString());
							}
						}
					}
				}
			}
			return resultModel;
//			return mh.getTargetModel();
		} catch (RecognitionException e) {
			throw new QueryEngineException(e);
		} catch (IfcModelInterfaceException e) {
			throw new QueryEngineException(e);
		}
	}
}