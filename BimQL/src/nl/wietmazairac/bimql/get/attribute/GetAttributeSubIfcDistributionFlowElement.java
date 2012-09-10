package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcDistributionFlowElement;

public class GetAttributeSubIfcDistributionFlowElement {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcDistributionFlowElement(Object object, String string) {
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
		if (string.equals("HasControlElements")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionFlowElement) object).getHasControlElements().size(); i++) {
				resultList.add(((IfcDistributionFlowElement) object).getHasControlElements().get(i));
			}
			 //1EList
		}
		else if (string.equals("HasStructuralMember")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionFlowElement) object).getHasStructuralMember().size(); i++) {
				resultList.add(((IfcDistributionFlowElement) object).getHasStructuralMember().get(i));
			}
			 //3EList
		}
		else if (string.equals("ReferencedInStructures")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionFlowElement) object).getReferencedInStructures().size(); i++) {
				resultList.add(((IfcDistributionFlowElement) object).getReferencedInStructures().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsConnectionRealization")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionFlowElement) object).getIsConnectionRealization().size(); i++) {
				resultList.add(((IfcDistributionFlowElement) object).getIsConnectionRealization().get(i));
			}
			 //3EList
		}
		else if (string.equals("ProvidesBoundaries")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionFlowElement) object).getProvidesBoundaries().size(); i++) {
				resultList.add(((IfcDistributionFlowElement) object).getProvidesBoundaries().get(i));
			}
			 //3EList
		}
		else if (string.equals("ContainedInStructure")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionFlowElement) object).getContainedInStructure().size(); i++) {
				resultList.add(((IfcDistributionFlowElement) object).getContainedInStructure().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPorts")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionFlowElement) object).getHasPorts().size(); i++) {
				resultList.add(((IfcDistributionFlowElement) object).getHasPorts().get(i));
			}
			 //3EList
		}
		else if (string.equals("FillsVoids")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionFlowElement) object).getFillsVoids().size(); i++) {
				resultList.add(((IfcDistributionFlowElement) object).getFillsVoids().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedTo")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionFlowElement) object).getConnectedTo().size(); i++) {
				resultList.add(((IfcDistributionFlowElement) object).getConnectedTo().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasCoverings")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionFlowElement) object).getHasCoverings().size(); i++) {
				resultList.add(((IfcDistributionFlowElement) object).getHasCoverings().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasProjections")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionFlowElement) object).getHasProjections().size(); i++) {
				resultList.add(((IfcDistributionFlowElement) object).getHasProjections().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasOpenings")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionFlowElement) object).getHasOpenings().size(); i++) {
				resultList.add(((IfcDistributionFlowElement) object).getHasOpenings().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedFrom")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionFlowElement) object).getConnectedFrom().size(); i++) {
				resultList.add(((IfcDistributionFlowElement) object).getConnectedFrom().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcDistributionFlowElement) object).getTag());
			 //3String
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcDistributionFlowElement) object).getObjectPlacement());
			 //3IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcDistributionFlowElement) object).getRepresentation());
			 //3IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionFlowElement) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcDistributionFlowElement) object).getReferencedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcDistributionFlowElement) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionFlowElement) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcDistributionFlowElement) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionFlowElement) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcDistributionFlowElement) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionFlowElement) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcDistributionFlowElement) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionFlowElement) object).getDecomposes().size(); i++) {
				resultList.add(((IfcDistributionFlowElement) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionFlowElement) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcDistributionFlowElement) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcDistributionFlowElement) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcDistributionFlowElement) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcDistributionFlowElement) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcDistributionFlowElement) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcDistributionFlowElement) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
