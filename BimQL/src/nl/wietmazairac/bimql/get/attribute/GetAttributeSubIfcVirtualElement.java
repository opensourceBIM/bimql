package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcVirtualElement;

public class GetAttributeSubIfcVirtualElement {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcVirtualElement(Object object, String string) {
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
			for (int i = 0; i < ((IfcVirtualElement) object).getHasStructuralMember().size(); i++) {
				resultList.add(((IfcVirtualElement) object).getHasStructuralMember().get(i));
			}
			 //2EList
		}
		else if (string.equals("ReferencedInStructures")) {
			//3xxx
			for (int i = 0; i < ((IfcVirtualElement) object).getReferencedInStructures().size(); i++) {
				resultList.add(((IfcVirtualElement) object).getReferencedInStructures().get(i));
			}
			 //2EList
		}
		else if (string.equals("IsConnectionRealization")) {
			//3xxx
			for (int i = 0; i < ((IfcVirtualElement) object).getIsConnectionRealization().size(); i++) {
				resultList.add(((IfcVirtualElement) object).getIsConnectionRealization().get(i));
			}
			 //2EList
		}
		else if (string.equals("ProvidesBoundaries")) {
			//3xxx
			for (int i = 0; i < ((IfcVirtualElement) object).getProvidesBoundaries().size(); i++) {
				resultList.add(((IfcVirtualElement) object).getProvidesBoundaries().get(i));
			}
			 //2EList
		}
		else if (string.equals("ContainedInStructure")) {
			//3xxx
			for (int i = 0; i < ((IfcVirtualElement) object).getContainedInStructure().size(); i++) {
				resultList.add(((IfcVirtualElement) object).getContainedInStructure().get(i));
			}
			 //2EList
		}
		else if (string.equals("HasPorts")) {
			//3xxx
			for (int i = 0; i < ((IfcVirtualElement) object).getHasPorts().size(); i++) {
				resultList.add(((IfcVirtualElement) object).getHasPorts().get(i));
			}
			 //2EList
		}
		else if (string.equals("FillsVoids")) {
			//3xxx
			for (int i = 0; i < ((IfcVirtualElement) object).getFillsVoids().size(); i++) {
				resultList.add(((IfcVirtualElement) object).getFillsVoids().get(i));
			}
			 //2EList
		}
		else if (string.equals("ConnectedTo")) {
			//3xxx
			for (int i = 0; i < ((IfcVirtualElement) object).getConnectedTo().size(); i++) {
				resultList.add(((IfcVirtualElement) object).getConnectedTo().get(i));
			}
			 //2EList
		}
		else if (string.equals("HasCoverings")) {
			//3xxx
			for (int i = 0; i < ((IfcVirtualElement) object).getHasCoverings().size(); i++) {
				resultList.add(((IfcVirtualElement) object).getHasCoverings().get(i));
			}
			 //2EList
		}
		else if (string.equals("HasProjections")) {
			//3xxx
			for (int i = 0; i < ((IfcVirtualElement) object).getHasProjections().size(); i++) {
				resultList.add(((IfcVirtualElement) object).getHasProjections().get(i));
			}
			 //2EList
		}
		else if (string.equals("HasOpenings")) {
			//3xxx
			for (int i = 0; i < ((IfcVirtualElement) object).getHasOpenings().size(); i++) {
				resultList.add(((IfcVirtualElement) object).getHasOpenings().get(i));
			}
			 //2EList
		}
		else if (string.equals("ConnectedFrom")) {
			//3xxx
			for (int i = 0; i < ((IfcVirtualElement) object).getConnectedFrom().size(); i++) {
				resultList.add(((IfcVirtualElement) object).getConnectedFrom().get(i));
			}
			 //2EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcVirtualElement) object).getTag());
			 //2String
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcVirtualElement) object).getObjectPlacement());
			 //3IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcVirtualElement) object).getRepresentation());
			 //3IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcVirtualElement) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcVirtualElement) object).getReferencedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcVirtualElement) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcVirtualElement) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcVirtualElement) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcVirtualElement) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcVirtualElement) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcVirtualElement) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcVirtualElement) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcVirtualElement) object).getDecomposes().size(); i++) {
				resultList.add(((IfcVirtualElement) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcVirtualElement) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcVirtualElement) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcVirtualElement) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcVirtualElement) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcVirtualElement) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcVirtualElement) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcVirtualElement) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
