package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcConnectedFaceSet;

public class GetAttributeSubIfcConnectedFaceSet {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcConnectedFaceSet(Object object, String string) {
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
		if (string.equals("CfsFaces")) {
			//3xxx
			for (int i = 0; i < ((IfcConnectedFaceSet) object).getCfsFaces().size(); i++) {
				resultList.add(((IfcConnectedFaceSet) object).getCfsFaces().get(i));
			}
			 //1EList
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcConnectedFaceSet) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcConnectedFaceSet) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcConnectedFaceSet) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcConnectedFaceSet) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
