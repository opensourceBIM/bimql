package nl.wietmazairac.bimql;

import java.util.List;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.bimserver.emf.IdEObject;
import org.bimserver.emf.IfcModelInterface;
import org.bimserver.ifc.IfcModel;
import org.bimserver.plugins.QueryEngineHelper;
import org.bimserver.plugins.Reporter;
import org.bimserver.plugins.queryengine.QueryEngine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BimQLQueryEngine implements QueryEngine {
	private static final Logger LOGGER = LoggerFactory.getLogger(BimQLQueryEngine.class);

	@Override
	public IfcModelInterface query(IfcModelInterface model, String code, final Reporter reporter, QueryEngineHelper queryEngineHelper) {
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
						queryEngineHelper.copy((IdEObject)object, resultModel);
					}
				}
			}
			return resultModel;
		} catch (RecognitionException e) {
			LOGGER.error("", e);
		}
		return null;
	}
}