package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcRelConnectsPathElements;

public class GetAttributeSubIfcRelConnectsPathElements {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcRelConnectsPathElements(Object object, String string) {
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
		if (string.equals("RelatedPriorities")) {
			//3xxx
			for (int i = 0; i < ((IfcRelConnectsPathElements) object).getRelatedPriorities().size(); i++) {
				resultList.add(((IfcRelConnectsPathElements) object).getRelatedPriorities().get(i));
			}
			 //1EList
		}
		else if (string.equals("RelatingPriorities")) {
			//3xxx
			for (int i = 0; i < ((IfcRelConnectsPathElements) object).getRelatingPriorities().size(); i++) {
				resultList.add(((IfcRelConnectsPathElements) object).getRelatingPriorities().get(i));
			}
			 //1EList
		}
		else if (string.equals("RelatedConnectionType")) {
			resultList.add(((IfcRelConnectsPathElements) object).getRelatedConnectionType());
			 //1IfcConnectionTypeEnum
		}
		else if (string.equals("RelatingConnectionType")) {
			resultList.add(((IfcRelConnectsPathElements) object).getRelatingConnectionType());
			 //1IfcConnectionTypeEnum
		}
		else if (string.equals("RelatingElement")) {
			resultList.add(((IfcRelConnectsPathElements) object).getRelatingElement());
			 //2IfcElement
		}
		else if (string.equals("ConnectionGeometry")) {
			resultList.add(((IfcRelConnectsPathElements) object).getConnectionGeometry());
			 //2IfcConnectionGeometry
		}
		else if (string.equals("RelatedElement")) {
			resultList.add(((IfcRelConnectsPathElements) object).getRelatedElement());
			 //2IfcElement
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcRelConnectsPathElements) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcRelConnectsPathElements) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcRelConnectsPathElements) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcRelConnectsPathElements) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcRelConnectsPathElements) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
