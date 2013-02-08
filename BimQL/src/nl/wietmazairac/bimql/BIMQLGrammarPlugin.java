package nl.wietmazairac.bimql;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.IfcModel;

public interface BIMQLGrammarPlugin {
	void init(IfcModel ifcModel, List<Object> objectList);
	ArrayList<String> getKeywords();
	List<List<Object>> getResult();
	
}
