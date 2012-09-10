package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcProjectionElement;

public class GetAttributeSubIfcProjectionElement {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcProjectionElement(Object object, String string) {
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
		if (string.equals("ProjectsElements")) {
			resultList.add(((IfcProjectionElement) object).getProjectsElements());
			 //2IfcRelProjectsElement
		}
		else if (string.equals("HasStructuralMember")) {
			//3xxx
			for (int i = 0; i < ((IfcProjectionElement) object).getHasStructuralMember().size(); i++) {
				resultList.add(((IfcProjectionElement) object).getHasStructuralMember().get(i));
			}
			 //3EList
		}
		else if (string.equals("ReferencedInStructures")) {
			//3xxx
			for (int i = 0; i < ((IfcProjectionElement) object).getReferencedInStructures().size(); i++) {
				resultList.add(((IfcProjectionElement) object).getReferencedInStructures().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsConnectionRealization")) {
			//3xxx
			for (int i = 0; i < ((IfcProjectionElement) object).getIsConnectionRealization().size(); i++) {
				resultList.add(((IfcProjectionElement) object).getIsConnectionRealization().get(i));
			}
			 //3EList
		}
		else if (string.equals("ProvidesBoundaries")) {
			//3xxx
			for (int i = 0; i < ((IfcProjectionElement) object).getProvidesBoundaries().size(); i++) {
				resultList.add(((IfcProjectionElement) object).getProvidesBoundaries().get(i));
			}
			 //3EList
		}
		else if (string.equals("ContainedInStructure")) {
			//3xxx
			for (int i = 0; i < ((IfcProjectionElement) object).getContainedInStructure().size(); i++) {
				resultList.add(((IfcProjectionElement) object).getContainedInStructure().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPorts")) {
			//3xxx
			for (int i = 0; i < ((IfcProjectionElement) object).getHasPorts().size(); i++) {
				resultList.add(((IfcProjectionElement) object).getHasPorts().get(i));
			}
			 //3EList
		}
		else if (string.equals("FillsVoids")) {
			//3xxx
			for (int i = 0; i < ((IfcProjectionElement) object).getFillsVoids().size(); i++) {
				resultList.add(((IfcProjectionElement) object).getFillsVoids().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedTo")) {
			//3xxx
			for (int i = 0; i < ((IfcProjectionElement) object).getConnectedTo().size(); i++) {
				resultList.add(((IfcProjectionElement) object).getConnectedTo().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasCoverings")) {
			//3xxx
			for (int i = 0; i < ((IfcProjectionElement) object).getHasCoverings().size(); i++) {
				resultList.add(((IfcProjectionElement) object).getHasCoverings().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasProjections")) {
			//3xxx
			for (int i = 0; i < ((IfcProjectionElement) object).getHasProjections().size(); i++) {
				resultList.add(((IfcProjectionElement) object).getHasProjections().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasOpenings")) {
			//3xxx
			for (int i = 0; i < ((IfcProjectionElement) object).getHasOpenings().size(); i++) {
				resultList.add(((IfcProjectionElement) object).getHasOpenings().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedFrom")) {
			//3xxx
			for (int i = 0; i < ((IfcProjectionElement) object).getConnectedFrom().size(); i++) {
				resultList.add(((IfcProjectionElement) object).getConnectedFrom().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcProjectionElement) object).getTag());
			 //3String
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcProjectionElement) object).getObjectPlacement());
			 //3IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcProjectionElement) object).getRepresentation());
			 //3IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcProjectionElement) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcProjectionElement) object).getReferencedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcProjectionElement) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcProjectionElement) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcProjectionElement) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcProjectionElement) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcProjectionElement) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcProjectionElement) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcProjectionElement) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcProjectionElement) object).getDecomposes().size(); i++) {
				resultList.add(((IfcProjectionElement) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcProjectionElement) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcProjectionElement) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcProjectionElement) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcProjectionElement) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcProjectionElement) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcProjectionElement) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcProjectionElement) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
