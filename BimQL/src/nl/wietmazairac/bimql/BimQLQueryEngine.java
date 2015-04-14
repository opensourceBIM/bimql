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
import org.bimserver.models.ifc2x3tc1.IfcProject;
import org.bimserver.plugins.ModelHelper;
import org.bimserver.plugins.Reporter;
import org.bimserver.plugins.objectidms.ObjectIDM;
import org.bimserver.plugins.queryengine.QueryEngine;
import org.bimserver.plugins.queryengine.QueryEngineException;
import org.bimserver.plugins.schema.Attribute;
import org.bimserver.plugins.schema.EntityDefinition;
import org.bimserver.plugins.schema.InverseAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BimQLQueryEngine implements QueryEngine {
	private static final Logger LOGGER = LoggerFactory.getLogger(BimQLQueryEngine.class);

	@Override
	public IfcModelInterface query(final IfcModelInterface model, String code, final Reporter reporter, ModelHelper modelHelper) throws QueryEngineException {
		model.fixInverseMismatches();
		
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
			IfcModelInterface resultModel = modelHelper.getTargetModel();
			ObjectIDM idm = new ObjectIDM(){

				@Override
				public boolean shouldFollowReference(EClass originalClass,
						EClass eClass, EStructuralFeature eStructuralFeature) {
					EntityDefinition entityBN = model.getPackageMetaData().getSchemaDefinition().getEntityBN(eClass.getName());
					if (entityBN == null) {
						LOGGER.error(eClass.getName() + " not found");
						return false;
					} else {
						Attribute attributeBN = entityBN.getAttributeBNWithSuper(eStructuralFeature.getName());
						if (attributeBN instanceof InverseAttribute) {
							return false;
						} else {
							return true;
						}
					}
//					if (eStructuralFeature instanceof EAttribute)
//						return true;
//					if (eStructuralFeature.getName().equalsIgnoreCase("HasAssignments"))
//						return true;
//					if (eStructuralFeature.getName().equalsIgnoreCase("ContainedInStructure"))
//						return true;
//					if (eStructuralFeature.getName().equalsIgnoreCase("RelatingStructure"))
//						return true;
//					if (eStructuralFeature.getName().equalsIgnoreCase("RelatingObject"))
//						return true;
//					if (eStructuralFeature.getName().equalsIgnoreCase("UnitsInContext"))
//						return true;
//					if (eStructuralFeature.getName().equalsIgnoreCase("Units"))
//						return true;
//					if (eStructuralFeature.getName().equalsIgnoreCase("ConversionFactor"))
//						return true;
//					if (eStructuralFeature.getName().equalsIgnoreCase("PlacesObject"))
//						return true;
//					if (eStructuralFeature.getName().equalsIgnoreCase("ReferencedByPlacements"))
//						return true;
//					if (eStructuralFeature.getName().equalsIgnoreCase("ObjectPlacement"))
//						return true;
//					if (eStructuralFeature.getName().equalsIgnoreCase("Representation"))
//						return true;
//					if (eStructuralFeature.getName().equalsIgnoreCase("PlacementRelTo"))
//						return true;
//					if (eStructuralFeature.getName().equalsIgnoreCase("AssignedItems"))
//						return true;
//					if (eStructuralFeature.getName().equalsIgnoreCase("RelativePlacement"))
//						return true;
//					if (eStructuralFeature.getName().equalsIgnoreCase("Representations"))
//						return true;
//					if (eStructuralFeature.getName().equalsIgnoreCase("Items"))
//						return true;
//					if (eStructuralFeature.getName().equalsIgnoreCase("RepresentationMap"))
//						return true;
//					if (eStructuralFeature.getName().equalsIgnoreCase("LayerAssignments"))
//						return true;
//					if (eStructuralFeature.getName().equalsIgnoreCase("StyledByItem"))
//						return true;
//					if (eStructuralFeature.getName().equalsIgnoreCase("Styles"))
//						return true;
//					if (eStructuralFeature.getName().equalsIgnoreCase("Item"))
//						return true;
//					if (eStructuralFeature.getName().equalsIgnoreCase("Bounds"))
//						return true;
//					if (eStructuralFeature.getName().equalsIgnoreCase("ContextOfItems"))
//						return true;
//					if (eStructuralFeature.getName().equalsIgnoreCase("WorldCoordinateSystem"))
//						return true;
//					if (eStructuralFeature.getName().equalsIgnoreCase("TrueNorth"))
//						return true;
//					if (eStructuralFeature.getName().equalsIgnoreCase("Bound"))
//						return true;
//					if (eStructuralFeature.getName().equalsIgnoreCase("Location"))
//						return true;
//					if (eStructuralFeature.getName().equalsIgnoreCase("Axis"))
//						return true;
//					if (eStructuralFeature.getName().equalsIgnoreCase("CfsFaces"))
//						return true;
//					if (eStructuralFeature.getName().equalsIgnoreCase("RefDirection"))
//						return true;
//					if (eStructuralFeature.getName().equalsIgnoreCase("Outer"))
//						return true;
//					if (eStructuralFeature.getName().equalsIgnoreCase("Axis1"))
//						return true;
//					if (eStructuralFeature.getName().equalsIgnoreCase("Axis2"))
//						return true;
//					if (eStructuralFeature.getName().equalsIgnoreCase("Axis3"))
//						return true;
//					if (eStructuralFeature.getName().equalsIgnoreCase("LocalOrigin"))
//						return true;
//					if (eStructuralFeature.getName().equalsIgnoreCase("MappingOrigin"))
//						return true;
//					if (eStructuralFeature.getName().equalsIgnoreCase("MappedRepresentation"))
//						return true;
//					if (eStructuralFeature.getName().equalsIgnoreCase("MappingTarget"))
//						return true;
//					if (eStructuralFeature.getName().equalsIgnoreCase("MappingSource"))
//						return true;
//					if (eStructuralFeature.getName().equalsIgnoreCase("Decomposes"))
//						return true;
//					if (eStructuralFeature.getName().equalsIgnoreCase("HasAssociations"))
//						return true;
//					if (eStructuralFeature.getName().equalsIgnoreCase("IsDefinedBy"))
//						return true;
//					if (eStructuralFeature.getName().equalsIgnoreCase("RelatingPropertyDefinition"))
//						return true;
//					if (eStructuralFeature.getName().equalsIgnoreCase("HasProperties"))
//						return true;
//					if (eStructuralFeature.getName().equalsIgnoreCase("NominalValue"))
//						return true;
//					if (eStructuralFeature.getName().equalsIgnoreCase("Quantities"))
//						return true;
//					if (eStructuralFeature.getName().equalsIgnoreCase("wrappedValue"))
//						return true;
//					return false;
				}

				@Override
				public boolean shouldIncludeClass(EClass originalClass,
						EClass eClass) {
					return true;
				}
			};
			
			modelHelper.setKeepOriginalOids(true);
			modelHelper.setObjectIDM(idm);
			
			List<Object> result = parser.bimql(model);
			result.addAll(model.getAllWithSubTypes(IfcProject.class));
			if (result != null) {
				for (Object object : result) {
					if (object instanceof IdEObject) {
						modelHelper.copy((IdEObject)object, true);
					}
				}
			}
			return resultModel;
		} catch (RecognitionException e) {
			throw new QueryEngineException(e);
		} catch (IfcModelInterfaceException e) {
			throw new QueryEngineException(e);
		}
	}
}