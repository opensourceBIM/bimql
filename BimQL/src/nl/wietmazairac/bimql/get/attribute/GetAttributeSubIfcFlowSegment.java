package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcFlowSegment;

public class GetAttributeSubIfcFlowSegment {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcFlowSegment(Object object, String string) {
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
			for (int i = 0; i < ((IfcFlowSegment) object).getHasControlElements().size(); i++) {
				resultList.add(((IfcFlowSegment) object).getHasControlElements().get(i));
			}
			 //2EList
		}
		else if (string.equals("HasStructuralMember")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowSegment) object).getHasStructuralMember().size(); i++) {
				resultList.add(((IfcFlowSegment) object).getHasStructuralMember().get(i));
			}
			 //3EList
		}
		else if (string.equals("ReferencedInStructures")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowSegment) object).getReferencedInStructures().size(); i++) {
				resultList.add(((IfcFlowSegment) object).getReferencedInStructures().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsConnectionRealization")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowSegment) object).getIsConnectionRealization().size(); i++) {
				resultList.add(((IfcFlowSegment) object).getIsConnectionRealization().get(i));
			}
			 //3EList
		}
		else if (string.equals("ProvidesBoundaries")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowSegment) object).getProvidesBoundaries().size(); i++) {
				resultList.add(((IfcFlowSegment) object).getProvidesBoundaries().get(i));
			}
			 //3EList
		}
		else if (string.equals("ContainedInStructure")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowSegment) object).getContainedInStructure().size(); i++) {
				resultList.add(((IfcFlowSegment) object).getContainedInStructure().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPorts")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowSegment) object).getHasPorts().size(); i++) {
				resultList.add(((IfcFlowSegment) object).getHasPorts().get(i));
			}
			 //3EList
		}
		else if (string.equals("FillsVoids")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowSegment) object).getFillsVoids().size(); i++) {
				resultList.add(((IfcFlowSegment) object).getFillsVoids().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedTo")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowSegment) object).getConnectedTo().size(); i++) {
				resultList.add(((IfcFlowSegment) object).getConnectedTo().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasCoverings")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowSegment) object).getHasCoverings().size(); i++) {
				resultList.add(((IfcFlowSegment) object).getHasCoverings().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasProjections")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowSegment) object).getHasProjections().size(); i++) {
				resultList.add(((IfcFlowSegment) object).getHasProjections().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasOpenings")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowSegment) object).getHasOpenings().size(); i++) {
				resultList.add(((IfcFlowSegment) object).getHasOpenings().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedFrom")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowSegment) object).getConnectedFrom().size(); i++) {
				resultList.add(((IfcFlowSegment) object).getConnectedFrom().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcFlowSegment) object).getTag());
			 //3String
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcFlowSegment) object).getObjectPlacement());
			 //3IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcFlowSegment) object).getRepresentation());
			 //3IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowSegment) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcFlowSegment) object).getReferencedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcFlowSegment) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowSegment) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcFlowSegment) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowSegment) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcFlowSegment) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowSegment) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcFlowSegment) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowSegment) object).getDecomposes().size(); i++) {
				resultList.add(((IfcFlowSegment) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowSegment) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcFlowSegment) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcFlowSegment) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcFlowSegment) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcFlowSegment) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcFlowSegment) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcFlowSegment) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
