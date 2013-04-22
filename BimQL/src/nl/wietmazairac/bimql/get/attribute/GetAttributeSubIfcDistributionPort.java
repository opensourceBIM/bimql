package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcDistributionPort;

public class GetAttributeSubIfcDistributionPort {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcDistributionPort(Object object, String string) {
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
		if (string.equals("FlowDirection")) {
			resultList.add(((IfcDistributionPort) object).getFlowDirection());
			 //1IfcFlowDirectionEnum
		}
		else if (string.equals("ContainedIn")) {
			resultList.add(((IfcDistributionPort) object).getContainedIn());
			 //2IfcRelConnectsPortToElement
		}
		else if (string.equals("ConnectedTo")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionPort) object).getConnectedTo().size(); i++) {
				resultList.add(((IfcDistributionPort) object).getConnectedTo().get(i));
			}
			 //2EList
		}
		else if (string.equals("ConnectedFrom")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionPort) object).getConnectedFrom().size(); i++) {
				resultList.add(((IfcDistributionPort) object).getConnectedFrom().get(i));
			}
			 //2EList
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcDistributionPort) object).getObjectPlacement());
			 //3IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcDistributionPort) object).getRepresentation());
			 //3IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionPort) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcDistributionPort) object).getReferencedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcDistributionPort) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionPort) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcDistributionPort) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionPort) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcDistributionPort) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionPort) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcDistributionPort) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionPort) object).getDecomposes().size(); i++) {
				resultList.add(((IfcDistributionPort) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionPort) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcDistributionPort) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcDistributionPort) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcDistributionPort) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcDistributionPort) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcDistributionPort) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcDistributionPort) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
