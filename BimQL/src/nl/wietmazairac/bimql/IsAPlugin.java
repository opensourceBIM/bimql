package nl.wietmazairac.bimql;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.bimserver.ifc.IfcModel;
import org.bimserver.models.ifc2x3tc1.IfcProduct;
import org.bimserver.models.ifc2x3tc1.IfcRelContainedInSpatialStructure;
import org.bimserver.models.ifc2x3tc1.IfcRoot;
import org.ifd_library.services.api._3_0.Ifd_wsdl_express_v3Proxy;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.jotne.epmtech.IFD_API_IMPLEMENTATION_V3.ifd_wsdl_express_v3.*;


public class IsAPlugin implements BIMQLGrammarPlugin {

	List<Object> ifcObjects;
	ArrayList<String> keywords = new ArrayList<String>();
	List<List<Object>> results =new ArrayList<List<Object>>();;
	List<Object > test = new ArrayList<Object>();
	IfcModel model;
	HashMap<String,ArrayList<String>> nameMap = new HashMap<String,ArrayList<String>>();
	
	
	public IsAPlugin(){
		
		keywords.add("isA");
		Gson gson = new Gson();
		
	    try {
			nameMap = gson.fromJson(new FileReader("Output.json"), nameMap.getClass() );
			System.out.println(nameMap);
		} catch (JsonSyntaxException | JsonIOException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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
		
		for (Object obj : ifcObjects) {
			IfcRoot ifcObj = (IfcRoot)obj;
			String shortName = ifcObj.getClass().getSimpleName();
			shortName = shortName.replace("Impl", "");
			ArrayList<Object> names= new ArrayList<Object>();
			if (nameMap.containsKey(shortName))
			{
				
				for(String s : nameMap.get(shortName)){
					names.add(s);
				}
				results.add(names);
				
			}
			else
			{
				System.out.println("no name found for "+ shortName);
				names.add("DUMMY");
				results.add(names);
			}
			
		}
		
		
		
				
		return this.results;
	}

}

