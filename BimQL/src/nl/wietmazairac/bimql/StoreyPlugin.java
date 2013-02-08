package nl.wietmazairac.bimql;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.bimserver.ifc.IfcModel;
import org.bimserver.models.ifc2x3tc1.*;
import org.eclipse.emf.common.util.EList;
public class StoreyPlugin implements BIMQLGrammarPlugin {

	List<Object> ifcObjects;
	ArrayList<String> keywords = new ArrayList<String>();
	List<List<Object>> results =new ArrayList<List<Object>>();;
	List<Object > test = new ArrayList<Object>();
	IfcModel model;
	public StoreyPlugin(){
		this.keywords.add("Storey");
		this.keywords.add("Verdieping");

	}
	
	
	@Override
	public void init(IfcModel ifcModel, List<Object> objectList) {
		
		
		this.model=ifcModel;
		this.ifcObjects = objectList;
		
	}
	
	public void init(IfcModel model){
		this.model=model;
	}

	@Override
	public ArrayList<String> getKeywords() {
		
		return this.keywords;
	}

	@Override
	public List<List<Object>> getResult() {
		
		HashMap<IfcRoot,ArrayList<Object>> storeyNames = new HashMap<IfcRoot,ArrayList<Object>>();
		
		List<? extends IfcRelContainedInSpatialStructure> spatialContainers = model.getAll(IfcRelContainedInSpatialStructure.class);
		Iterator<? extends IfcRelContainedInSpatialStructure> iterator = spatialContainers.iterator();
		while (iterator.hasNext()) {
			IfcRelContainedInSpatialStructure container = (IfcRelContainedInSpatialStructure) iterator
					.next();
			String containerName = container.getRelatingStructure().getName();
			
			Iterator<IfcProduct> relIter = container.getRelatedElements().iterator();
			while (relIter.hasNext()) {
				IfcProduct ifcProduct = (IfcProduct) relIter.next();
				//is product allready contained in other container? add it, else create a new list
				if (storeyNames.containsKey(ifcProduct))
				{
					storeyNames.get(ifcProduct).add(containerName);
				}
				else
				{
					ArrayList newNameList = new ArrayList<Object>();
					newNameList.add(containerName);
					storeyNames.put(ifcProduct, newNameList);
				}
			}
			
		}
		// For all objects in the input list, look whether they are contained in a container. 
		// Add List list of name(s) to results
		
		for (Object object:ifcObjects){
			IfcRoot rootObject = (IfcRoot)object;
			if (storeyNames.get(rootObject) != null)
			{
				results.add(storeyNames.get(rootObject));
				
			}
			else
			{
				results.add(new ArrayList<Object>());
			}
		}
		
		
		return this.results;
	}

}
