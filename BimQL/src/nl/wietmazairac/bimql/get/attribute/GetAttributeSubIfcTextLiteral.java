package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcTextLiteral;

public class GetAttributeSubIfcTextLiteral {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcTextLiteral(Object object, String string) {
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
			resultList.add(((IfcTextLiteral) object).getPlacement());
			 //1IfcAxis2Placement
		}
		else if (string.equals("Literal")) {
			resultList.add(((IfcTextLiteral) object).getLiteral());
			 //1String
		}
		else if (string.equals("Path")) {
			resultList.add(((IfcTextLiteral) object).getPath());
			 //1IfcTextPath
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcTextLiteral) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcTextLiteral) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcTextLiteral) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcTextLiteral) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
