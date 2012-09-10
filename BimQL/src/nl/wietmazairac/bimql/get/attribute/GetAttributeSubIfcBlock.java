package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcBlock;

public class GetAttributeSubIfcBlock {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcBlock(Object object, String string) {
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
		if (string.equals("XLength")) {
			resultList.add(((IfcBlock) object).getXLength());
			 //1double
		}
		else if (string.equals("YLength")) {
			resultList.add(((IfcBlock) object).getYLength());
			 //1double
		}
		else if (string.equals("ZLength")) {
			resultList.add(((IfcBlock) object).getZLength());
			 //1double
		}
		else if (string.equals("XLengthAsString")) {
			resultList.add(((IfcBlock) object).getXLengthAsString());
			 //1String
		}
		else if (string.equals("YLengthAsString")) {
			resultList.add(((IfcBlock) object).getYLengthAsString());
			 //1String
		}
		else if (string.equals("ZLengthAsString")) {
			resultList.add(((IfcBlock) object).getZLengthAsString());
			 //1String
		}
		else if (string.equals("Dim")) {
			resultList.add(((IfcBlock) object).getDim());
			 //2int
		}
		else if (string.equals("Position")) {
			resultList.add(((IfcBlock) object).getPosition());
			 //2IfcAxis2Placement3D
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcBlock) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcBlock) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcBlock) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcBlock) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
