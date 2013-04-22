package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcOpeningElement;

public class GetAttributeSubIfcOpeningElement {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcOpeningElement(Object object, String string) {
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
		if (string.equals("HasFillings")) {
			//3xxx
			for (int i = 0; i < ((IfcOpeningElement) object).getHasFillings().size(); i++) {
				resultList.add(((IfcOpeningElement) object).getHasFillings().get(i));
			}
			 //1EList
		}
		else if (string.equals("VoidsElements")) {
			resultList.add(((IfcOpeningElement) object).getVoidsElements());
			 //2IfcRelVoidsElement
		}
		else if (string.equals("HasStructuralMember")) {
			//3xxx
			for (int i = 0; i < ((IfcOpeningElement) object).getHasStructuralMember().size(); i++) {
				resultList.add(((IfcOpeningElement) object).getHasStructuralMember().get(i));
			}
			 //3EList
		}
		else if (string.equals("ReferencedInStructures")) {
			//3xxx
			for (int i = 0; i < ((IfcOpeningElement) object).getReferencedInStructures().size(); i++) {
				resultList.add(((IfcOpeningElement) object).getReferencedInStructures().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsConnectionRealization")) {
			//3xxx
			for (int i = 0; i < ((IfcOpeningElement) object).getIsConnectionRealization().size(); i++) {
				resultList.add(((IfcOpeningElement) object).getIsConnectionRealization().get(i));
			}
			 //3EList
		}
		else if (string.equals("ProvidesBoundaries")) {
			//3xxx
			for (int i = 0; i < ((IfcOpeningElement) object).getProvidesBoundaries().size(); i++) {
				resultList.add(((IfcOpeningElement) object).getProvidesBoundaries().get(i));
			}
			 //3EList
		}
		else if (string.equals("ContainedInStructure")) {
			//3xxx
			for (int i = 0; i < ((IfcOpeningElement) object).getContainedInStructure().size(); i++) {
				resultList.add(((IfcOpeningElement) object).getContainedInStructure().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPorts")) {
			//3xxx
			for (int i = 0; i < ((IfcOpeningElement) object).getHasPorts().size(); i++) {
				resultList.add(((IfcOpeningElement) object).getHasPorts().get(i));
			}
			 //3EList
		}
		else if (string.equals("FillsVoids")) {
			//3xxx
			for (int i = 0; i < ((IfcOpeningElement) object).getFillsVoids().size(); i++) {
				resultList.add(((IfcOpeningElement) object).getFillsVoids().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedTo")) {
			//3xxx
			for (int i = 0; i < ((IfcOpeningElement) object).getConnectedTo().size(); i++) {
				resultList.add(((IfcOpeningElement) object).getConnectedTo().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasCoverings")) {
			//3xxx
			for (int i = 0; i < ((IfcOpeningElement) object).getHasCoverings().size(); i++) {
				resultList.add(((IfcOpeningElement) object).getHasCoverings().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasProjections")) {
			//3xxx
			for (int i = 0; i < ((IfcOpeningElement) object).getHasProjections().size(); i++) {
				resultList.add(((IfcOpeningElement) object).getHasProjections().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasOpenings")) {
			//3xxx
			for (int i = 0; i < ((IfcOpeningElement) object).getHasOpenings().size(); i++) {
				resultList.add(((IfcOpeningElement) object).getHasOpenings().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedFrom")) {
			//3xxx
			for (int i = 0; i < ((IfcOpeningElement) object).getConnectedFrom().size(); i++) {
				resultList.add(((IfcOpeningElement) object).getConnectedFrom().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcOpeningElement) object).getTag());
			 //3String
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcOpeningElement) object).getObjectPlacement());
			 //3IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcOpeningElement) object).getRepresentation());
			 //3IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcOpeningElement) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcOpeningElement) object).getReferencedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcOpeningElement) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcOpeningElement) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcOpeningElement) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcOpeningElement) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcOpeningElement) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcOpeningElement) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcOpeningElement) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcOpeningElement) object).getDecomposes().size(); i++) {
				resultList.add(((IfcOpeningElement) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcOpeningElement) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcOpeningElement) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcOpeningElement) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcOpeningElement) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcOpeningElement) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcOpeningElement) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcOpeningElement) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
