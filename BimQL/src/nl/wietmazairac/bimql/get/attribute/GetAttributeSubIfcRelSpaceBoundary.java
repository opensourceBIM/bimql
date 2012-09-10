package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcRelSpaceBoundary;

public class GetAttributeSubIfcRelSpaceBoundary {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcRelSpaceBoundary(Object object, String string) {
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
		if (string.equals("ConnectionGeometry")) {
			resultList.add(((IfcRelSpaceBoundary) object).getConnectionGeometry());
			 //1IfcConnectionGeometry
		}
		else if (string.equals("InternalOrExternalBoundary")) {
			resultList.add(((IfcRelSpaceBoundary) object).getInternalOrExternalBoundary());
			 //1IfcInternalOrExternalEnum
		}
		else if (string.equals("RelatingSpace")) {
			resultList.add(((IfcRelSpaceBoundary) object).getRelatingSpace());
			 //1IfcSpace
		}
		else if (string.equals("RelatedBuildingElement")) {
			resultList.add(((IfcRelSpaceBoundary) object).getRelatedBuildingElement());
			 //1IfcElement
		}
		else if (string.equals("PhysicalOrVirtualBoundary")) {
			resultList.add(((IfcRelSpaceBoundary) object).getPhysicalOrVirtualBoundary());
			 //1IfcPhysicalOrVirtualEnum
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcRelSpaceBoundary) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcRelSpaceBoundary) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcRelSpaceBoundary) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcRelSpaceBoundary) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcRelSpaceBoundary) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
