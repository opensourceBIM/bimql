package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcWindowLiningProperties;

public class GetAttributeSubIfcWindowLiningProperties {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcWindowLiningProperties(Object object, String string) {
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
		if (string.equals("LiningDepthAsString")) {
			resultList.add(((IfcWindowLiningProperties) object).getLiningDepthAsString());
			 //1String
		}
		else if (string.equals("LiningDepth")) {
			resultList.add(((IfcWindowLiningProperties) object).getLiningDepth());
			 //1double
		}
		else if (string.equals("LiningThickness")) {
			resultList.add(((IfcWindowLiningProperties) object).getLiningThickness());
			 //1double
		}
		else if (string.equals("LiningThicknessAsString")) {
			resultList.add(((IfcWindowLiningProperties) object).getLiningThicknessAsString());
			 //1String
		}
		else if (string.equals("TransomThicknessAsString")) {
			resultList.add(((IfcWindowLiningProperties) object).getTransomThicknessAsString());
			 //1String
		}
		else if (string.equals("TransomThickness")) {
			resultList.add(((IfcWindowLiningProperties) object).getTransomThickness());
			 //1double
		}
		else if (string.equals("FirstTransomOffsetAsString")) {
			resultList.add(((IfcWindowLiningProperties) object).getFirstTransomOffsetAsString());
			 //1String
		}
		else if (string.equals("SecondTransomOffsetAsString")) {
			resultList.add(((IfcWindowLiningProperties) object).getSecondTransomOffsetAsString());
			 //1String
		}
		else if (string.equals("FirstMullionOffsetAsString")) {
			resultList.add(((IfcWindowLiningProperties) object).getFirstMullionOffsetAsString());
			 //1String
		}
		else if (string.equals("SecondMullionOffsetAsString")) {
			resultList.add(((IfcWindowLiningProperties) object).getSecondMullionOffsetAsString());
			 //1String
		}
		else if (string.equals("MullionThickness")) {
			resultList.add(((IfcWindowLiningProperties) object).getMullionThickness());
			 //1double
		}
		else if (string.equals("ShapeAspectStyle")) {
			resultList.add(((IfcWindowLiningProperties) object).getShapeAspectStyle());
			 //1IfcShapeAspect
		}
		else if (string.equals("MullionThicknessAsString")) {
			resultList.add(((IfcWindowLiningProperties) object).getMullionThicknessAsString());
			 //1String
		}
		else if (string.equals("FirstTransomOffset")) {
			resultList.add(((IfcWindowLiningProperties) object).getFirstTransomOffset());
			 //1double
		}
		else if (string.equals("SecondTransomOffset")) {
			resultList.add(((IfcWindowLiningProperties) object).getSecondTransomOffset());
			 //1double
		}
		else if (string.equals("FirstMullionOffset")) {
			resultList.add(((IfcWindowLiningProperties) object).getFirstMullionOffset());
			 //1double
		}
		else if (string.equals("SecondMullionOffset")) {
			resultList.add(((IfcWindowLiningProperties) object).getSecondMullionOffset());
			 //1double
		}
		else if (string.equals("DefinesType")) {
			//3xxx
			for (int i = 0; i < ((IfcWindowLiningProperties) object).getDefinesType().size(); i++) {
				resultList.add(((IfcWindowLiningProperties) object).getDefinesType().get(i));
			}
			 //2EList
		}
		else if (string.equals("PropertyDefinitionOf")) {
			//3xxx
			for (int i = 0; i < ((IfcWindowLiningProperties) object).getPropertyDefinitionOf().size(); i++) {
				resultList.add(((IfcWindowLiningProperties) object).getPropertyDefinitionOf().get(i));
			}
			 //2EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcWindowLiningProperties) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcWindowLiningProperties) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcWindowLiningProperties) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcWindowLiningProperties) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcWindowLiningProperties) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcWindowLiningProperties) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcWindowLiningProperties) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
