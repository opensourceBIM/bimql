package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcRepresentationMap {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcRepresentationMap(Object object, String string) {
		this.object = object;
		this.string = string;
	}

	// methods
	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public ArrayList<Object> getResult() {
	ArrayList<Object> resultList = new ArrayList<Object>();
		if (string.equals("MapUsage")) {
			//3xxx
			for (int i = 0; i < ((IfcRepresentationMap) object).getMapUsage().size(); i++) {
				resultList.add(((IfcRepresentationMap) object).getMapUsage().get(i));
			}
			 //1EList
		}
		else if (string.equals("MappingOrigin")) {
			resultList.add(((IfcRepresentationMap) object).getMappingOrigin());
			 //1IfcAxis2Placement
		}
		else if (string.equals("MappedRepresentation")) {
			resultList.add(((IfcRepresentationMap) object).getMappedRepresentation());
			 //1IfcRepresentation
		}
		return resultList;
	}
}
