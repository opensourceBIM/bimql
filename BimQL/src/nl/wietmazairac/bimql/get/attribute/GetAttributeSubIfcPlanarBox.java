package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcPlanarBox;

public class GetAttributeSubIfcPlanarBox {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcPlanarBox(Object object, String string) {
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
		if (string.equals("Placement")) {
			resultList.add(((IfcPlanarBox) object).getPlacement());
			 //1IfcAxis2Placement
		}
		else if (string.equals("SizeInXAsString")) {
			resultList.add(((IfcPlanarBox) object).getSizeInXAsString());
			 //2String
		}
		else if (string.equals("SizeInYAsString")) {
			resultList.add(((IfcPlanarBox) object).getSizeInYAsString());
			 //2String
		}
		else if (string.equals("SizeInX")) {
			resultList.add(((IfcPlanarBox) object).getSizeInX());
			 //2double
		}
		else if (string.equals("SizeInY")) {
			resultList.add(((IfcPlanarBox) object).getSizeInY());
			 //2double
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcPlanarBox) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcPlanarBox) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcPlanarBox) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcPlanarBox) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
