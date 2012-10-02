package nl.wietmazairac.bimql;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.bimserver.plugins.PluginException;
import org.bimserver.plugins.PluginManager;
import org.bimserver.plugins.queryengine.QueryEngine;
import org.bimserver.plugins.queryengine.QueryEnginePlugin;

public class BimQLQueryEnginePlugin implements QueryEnginePlugin {

	private boolean initialized;
	private final Map<String, String> examples = new HashMap<String, String>();

	@Override
	public void init(PluginManager pluginManager) throws PluginException {
		examples.put("All Doors", "Select $Var1 Where $Var1.EntityType = IfcDoor");
		examples.put("Specific GUID", "Select $Var1 Where $Var1.Attribute.GlobalId = 1qc5HjZvrCsga38tqxQ3VC");
		examples.put("Range of height", "Select $Var1 Where $Var1.Attribute.OverallHeight > 1.4 And $Var1.Attribute.OverallHeight < 1.6");
	}

	@Override
	public String getDescription() {
		return "BimQL";
	}

	@Override
	public String getVersion() {
		return "1.0";
	}

	@Override
	public boolean isInitialized() {
		return initialized;
	}

	@Override
	public QueryEngine getQueryEngine() {
		return new BimQLQueryEngine();
	}

	@Override
	public String getDefaultName() {
		return "BimQL Engine";
	}

	@Override
	public Collection<String> getExampleKeys() {
		return examples.keySet();
	}

	@Override
	public String getExample(String key) {
		return examples.get(key);
	}
}