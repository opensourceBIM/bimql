package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcRightCircularCone;

public class GetAttributeSubIfcRightCircularCone {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcRightCircularCone(Object object, String string) {
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
		if (string.equals("HeightAsString")) {
			resultList.add(((IfcRightCircularCone) object).getHeightAsString());
			 //1String
		}
		else if (string.equals("BottomRadius")) {
			resultList.add(((IfcRightCircularCone) object).getBottomRadius());
			 //1double
		}
		else if (string.equals("BottomRadiusAsString")) {
			resultList.add(((IfcRightCircularCone) object).getBottomRadiusAsString());
			 //1String
		}
		else if (string.equals("Height")) {
			resultList.add(((IfcRightCircularCone) object).getHeight());
			 //1double
		}
		else if (string.equals("Dim")) {
			resultList.add(((IfcRightCircularCone) object).getDim());
			 //2int
		}
		else if (string.equals("Position")) {
			resultList.add(((IfcRightCircularCone) object).getPosition());
			 //2IfcAxis2Placement3D
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcRightCircularCone) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcRightCircularCone) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcRightCircularCone) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcRightCircularCone) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
