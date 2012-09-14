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
import org.bimserver.plugins.queryengine.QueryEngine;
import org.bimserver.plugins.queryengine.QueryEngineException;

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
				reporter.error(hdr + " " + msg);
			}
		};
		TokenStream tokenStream = new CommonTokenStream(lexer);
		BimQLParser parser = new BimQLParser(tokenStream) {
			@Override
			public void reportError(RecognitionException e) {
				String hdr = getErrorHeader(e);
				String msg = getErrorMessage(e, tokenNames);
				emitErrorMessage(hdr + " " + msg);
				reporter.error(hdr + " " + msg);
			}
		};
		try {
			IfcModelInterface resultModel = new IfcModel();
			List<Object> result = parser.bimql(model);
			if (result != null) {
				for (Object object : result) {
					if (object instanceof IdEObject) {
						modelHelper.copy((IdEObject)object, resultModel);
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