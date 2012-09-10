package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcElement;

public class GetAttributeSubIfcElement {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcElement(Object object, String string) {
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
		if (string.equals("HasStructuralMember")) {
			//3xxx
			for (int i = 0; i < ((IfcElement) object).getHasStructuralMember().size(); i++) {
				resultList.add(((IfcElement) object).getHasStructuralMember().get(i));
			}
			 //1EList
		}
		else if (string.equals("ReferencedInStructures")) {
			//3xxx
			for (int i = 0; i < ((IfcElement) object).getReferencedInStructures().size(); i++) {
				resultList.add(((IfcElement) object).getReferencedInStructures().get(i));
			}
			 //1EList
		}
		else if (string.equals("IsConnectionRealization")) {
			//3xxx
			for (int i = 0; i < ((IfcElement) object).getIsConnectionRealization().size(); i++) {
				resultList.add(((IfcElement) object).getIsConnectionRealization().get(i));
			}
			 //1EList
		}
		else if (string.equals("ProvidesBoundaries")) {
			//3xxx
			for (int i = 0; i < ((IfcElement) object).getProvidesBoundaries().size(); i++) {
				resultList.add(((IfcElement) object).getProvidesBoundaries().get(i));
			}
			 //1EList
		}
		else if (string.equals("ContainedInStructure")) {
			//3xxx
			for (int i = 0; i < ((IfcElement) object).getContainedInStructure().size(); i++) {
				resultList.add(((IfcElement) object).getContainedInStructure().get(i));
			}
			 //1EList
		}
		else if (string.equals("HasPorts")) {
			//3xxx
			for (int i = 0; i < ((IfcElement) object).getHasPorts().size(); i++) {
				resultList.add(((IfcElement) object).getHasPorts().get(i));
			}
			 //1EList
		}
		else if (string.equals("FillsVoids")) {
			//3xxx
			for (int i = 0; i < ((IfcElement) object).getFillsVoids().size(); i++) {
				resultList.add(((IfcElement) object).getFillsVoids().get(i));
			}
			 //1EList
		}
		else if (string.equals("ConnectedTo")) {
			//3xxx
			for (int i = 0; i < ((IfcElement) object).getConnectedTo().size(); i++) {
				resultList.add(((IfcElement) object).getConnectedTo().get(i));
			}
			 //1EList
		}
		else if (string.equals("HasCoverings")) {
			//3xxx
			for (int i = 0; i < ((IfcElement) object).getHasCoverings().size(); i++) {
				resultList.add(((IfcElement) object).getHasCoverings().get(i));
			}
			 //1EList
		}
		else if (string.equals("HasProjections")) {
			//3xxx
			for (int i = 0; i < ((IfcElement) object).getHasProjections().size(); i++) {
				resultList.add(((IfcElement) object).getHasProjections().get(i));
			}
			 //1EList
		}
		else if (string.equals("HasOpenings")) {
			//3xxx
			for (int i = 0; i < ((IfcElement) object).getHasOpenings().size(); i++) {
				resultList.add(((IfcElement) object).getHasOpenings().get(i));
			}
			 //1EList
		}
		else if (string.equals("ConnectedFrom")) {
			//3xxx
			for (int i = 0; i < ((IfcElement) object).getConnectedFrom().size(); i++) {
				resultList.add(((IfcElement) object).getConnectedFrom().get(i));
			}
			 //1EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcElement) object).getTag());
			 //1String
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcElement) object).getObjectPlacement());
			 //2IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcElement) object).getRepresentation());
			 //2IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcElement) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcElement) object).getReferencedBy().get(i));
			}
			 //2EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcElement) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcElement) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcElement) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcElement) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcElement) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcElement) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcElement) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcElement) object).getDecomposes().size(); i++) {
				resultList.add(((IfcElement) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcElement) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcElement) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcElement) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcElement) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcElement) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcElement) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcElement) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
