package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcDistributionControlElement;

public class GetAttributeSubIfcDistributionControlElement {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcDistributionControlElement(Object object, String string) {
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
		if (string.equals("AssignedToFlowElement")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionControlElement) object).getAssignedToFlowElement().size(); i++) {
				resultList.add(((IfcDistributionControlElement) object).getAssignedToFlowElement().get(i));
			}
			 //1EList
		}
		else if (string.equals("ControlElementId")) {
			resultList.add(((IfcDistributionControlElement) object).getControlElementId());
			 //1String
		}
		else if (string.equals("HasStructuralMember")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionControlElement) object).getHasStructuralMember().size(); i++) {
				resultList.add(((IfcDistributionControlElement) object).getHasStructuralMember().get(i));
			}
			 //3EList
		}
		else if (string.equals("ReferencedInStructures")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionControlElement) object).getReferencedInStructures().size(); i++) {
				resultList.add(((IfcDistributionControlElement) object).getReferencedInStructures().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsConnectionRealization")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionControlElement) object).getIsConnectionRealization().size(); i++) {
				resultList.add(((IfcDistributionControlElement) object).getIsConnectionRealization().get(i));
			}
			 //3EList
		}
		else if (string.equals("ProvidesBoundaries")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionControlElement) object).getProvidesBoundaries().size(); i++) {
				resultList.add(((IfcDistributionControlElement) object).getProvidesBoundaries().get(i));
			}
			 //3EList
		}
		else if (string.equals("ContainedInStructure")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionControlElement) object).getContainedInStructure().size(); i++) {
				resultList.add(((IfcDistributionControlElement) object).getContainedInStructure().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPorts")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionControlElement) object).getHasPorts().size(); i++) {
				resultList.add(((IfcDistributionControlElement) object).getHasPorts().get(i));
			}
			 //3EList
		}
		else if (string.equals("FillsVoids")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionControlElement) object).getFillsVoids().size(); i++) {
				resultList.add(((IfcDistributionControlElement) object).getFillsVoids().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedTo")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionControlElement) object).getConnectedTo().size(); i++) {
				resultList.add(((IfcDistributionControlElement) object).getConnectedTo().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasCoverings")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionControlElement) object).getHasCoverings().size(); i++) {
				resultList.add(((IfcDistributionControlElement) object).getHasCoverings().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasProjections")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionControlElement) object).getHasProjections().size(); i++) {
				resultList.add(((IfcDistributionControlElement) object).getHasProjections().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasOpenings")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionControlElement) object).getHasOpenings().size(); i++) {
				resultList.add(((IfcDistributionControlElement) object).getHasOpenings().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedFrom")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionControlElement) object).getConnectedFrom().size(); i++) {
				resultList.add(((IfcDistributionControlElement) object).getConnectedFrom().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcDistributionControlElement) object).getTag());
			 //3String
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcDistributionControlElement) object).getObjectPlacement());
			 //3IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcDistributionControlElement) object).getRepresentation());
			 //3IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionControlElement) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcDistributionControlElement) object).getReferencedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcDistributionControlElement) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionControlElement) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcDistributionControlElement) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionControlElement) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcDistributionControlElement) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionControlElement) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcDistributionControlElement) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionControlElement) object).getDecomposes().size(); i++) {
				resultList.add(((IfcDistributionControlElement) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionControlElement) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcDistributionControlElement) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcDistributionControlElement) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcDistributionControlElement) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcDistributionControlElement) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcDistributionControlElement) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcDistributionControlElement) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
