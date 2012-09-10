package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcTextLiteralWithExtent;

public class GetAttributeSubIfcTextLiteralWithExtent {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcTextLiteralWithExtent(Object object, String string) {
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
		if (string.equals("BoxAlignment")) {
			resultList.add(((IfcTextLiteralWithExtent) object).getBoxAlignment());
			 //1String
		}
		else if (string.equals("Extent")) {
			resultList.add(((IfcTextLiteralWithExtent) object).getExtent());
			 //1IfcPlanarExtent
		}
		else if (string.equals("Placement")) {
			resultList.add(((IfcTextLiteralWithExtent) object).getPlacement());
			 //2IfcAxis2Placement
		}
		else if (string.equals("Literal")) {
			resultList.add(((IfcTextLiteralWithExtent) object).getLiteral());
			 //2String
		}
		else if (string.equals("Path")) {
			resultList.add(((IfcTextLiteralWithExtent) object).getPath());
			 //2IfcTextPath
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcTextLiteralWithExtent) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcTextLiteralWithExtent) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcTextLiteralWithExtent) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcTextLiteralWithExtent) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
