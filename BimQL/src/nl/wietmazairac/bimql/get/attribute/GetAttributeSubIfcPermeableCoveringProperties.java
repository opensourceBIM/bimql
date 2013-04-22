package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcPermeableCoveringProperties;

public class GetAttributeSubIfcPermeableCoveringProperties {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcPermeableCoveringProperties(Object object, String string) {
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
		if (string.equals("FrameDepthAsString")) {
			resultList.add(((IfcPermeableCoveringProperties) object).getFrameDepthAsString());
			 //1String
		}
		else if (string.equals("FrameThicknessAsString")) {
			resultList.add(((IfcPermeableCoveringProperties) object).getFrameThicknessAsString());
			 //1String
		}
		else if (string.equals("OperationType")) {
			resultList.add(((IfcPermeableCoveringProperties) object).getOperationType());
			 //1IfcPermeableCoveringOperationEnum
		}
		else if (string.equals("FrameDepth")) {
			resultList.add(((IfcPermeableCoveringProperties) object).getFrameDepth());
			 //1double
		}
		else if (string.equals("FrameThickness")) {
			resultList.add(((IfcPermeableCoveringProperties) object).getFrameThickness());
			 //1double
		}
		else if (string.equals("PanelPosition")) {
			resultList.add(((IfcPermeableCoveringProperties) object).getPanelPosition());
			 //1IfcWindowPanelPositionEnum
		}
		else if (string.equals("ShapeAspectStyle")) {
			resultList.add(((IfcPermeableCoveringProperties) object).getShapeAspectStyle());
			 //1IfcShapeAspect
		}
		else if (string.equals("DefinesType")) {
			//3xxx
			for (int i = 0; i < ((IfcPermeableCoveringProperties) object).getDefinesType().size(); i++) {
				resultList.add(((IfcPermeableCoveringProperties) object).getDefinesType().get(i));
			}
			 //2EList
		}
		else if (string.equals("PropertyDefinitionOf")) {
			//3xxx
			for (int i = 0; i < ((IfcPermeableCoveringProperties) object).getPropertyDefinitionOf().size(); i++) {
				resultList.add(((IfcPermeableCoveringProperties) object).getPropertyDefinitionOf().get(i));
			}
			 //2EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcPermeableCoveringProperties) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcPermeableCoveringProperties) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcPermeableCoveringProperties) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcPermeableCoveringProperties) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcPermeableCoveringProperties) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcPermeableCoveringProperties) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcPermeableCoveringProperties) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
