package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcCovering;

public class GetAttributeSubIfcCovering {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcCovering(Object object, String string) {
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
		if (string.equals("CoversSpaces")) {
			//3xxx
			for (int i = 0; i < ((IfcCovering) object).getCoversSpaces().size(); i++) {
				resultList.add(((IfcCovering) object).getCoversSpaces().get(i));
			}
			 //1EList
		}
		else if (string.equals("Covers")) {
			//3xxx
			for (int i = 0; i < ((IfcCovering) object).getCovers().size(); i++) {
				resultList.add(((IfcCovering) object).getCovers().get(i));
			}
			 //1EList
		}
		else if (string.equals("PredefinedType")) {
			resultList.add(((IfcCovering) object).getPredefinedType());
			 //1IfcCoveringTypeEnum
		}
		else if (string.equals("HasStructuralMember")) {
			//3xxx
			for (int i = 0; i < ((IfcCovering) object).getHasStructuralMember().size(); i++) {
				resultList.add(((IfcCovering) object).getHasStructuralMember().get(i));
			}
			 //3EList
		}
		else if (string.equals("ReferencedInStructures")) {
			//3xxx
			for (int i = 0; i < ((IfcCovering) object).getReferencedInStructures().size(); i++) {
				resultList.add(((IfcCovering) object).getReferencedInStructures().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsConnectionRealization")) {
			//3xxx
			for (int i = 0; i < ((IfcCovering) object).getIsConnectionRealization().size(); i++) {
				resultList.add(((IfcCovering) object).getIsConnectionRealization().get(i));
			}
			 //3EList
		}
		else if (string.equals("ProvidesBoundaries")) {
			//3xxx
			for (int i = 0; i < ((IfcCovering) object).getProvidesBoundaries().size(); i++) {
				resultList.add(((IfcCovering) object).getProvidesBoundaries().get(i));
			}
			 //3EList
		}
		else if (string.equals("ContainedInStructure")) {
			//3xxx
			for (int i = 0; i < ((IfcCovering) object).getContainedInStructure().size(); i++) {
				resultList.add(((IfcCovering) object).getContainedInStructure().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPorts")) {
			//3xxx
			for (int i = 0; i < ((IfcCovering) object).getHasPorts().size(); i++) {
				resultList.add(((IfcCovering) object).getHasPorts().get(i));
			}
			 //3EList
		}
		else if (string.equals("FillsVoids")) {
			//3xxx
			for (int i = 0; i < ((IfcCovering) object).getFillsVoids().size(); i++) {
				resultList.add(((IfcCovering) object).getFillsVoids().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedTo")) {
			//3xxx
			for (int i = 0; i < ((IfcCovering) object).getConnectedTo().size(); i++) {
				resultList.add(((IfcCovering) object).getConnectedTo().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasCoverings")) {
			//3xxx
			for (int i = 0; i < ((IfcCovering) object).getHasCoverings().size(); i++) {
				resultList.add(((IfcCovering) object).getHasCoverings().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasProjections")) {
			//3xxx
			for (int i = 0; i < ((IfcCovering) object).getHasProjections().size(); i++) {
				resultList.add(((IfcCovering) object).getHasProjections().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasOpenings")) {
			//3xxx
			for (int i = 0; i < ((IfcCovering) object).getHasOpenings().size(); i++) {
				resultList.add(((IfcCovering) object).getHasOpenings().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedFrom")) {
			//3xxx
			for (int i = 0; i < ((IfcCovering) object).getConnectedFrom().size(); i++) {
				resultList.add(((IfcCovering) object).getConnectedFrom().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcCovering) object).getTag());
			 //3String
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcCovering) object).getObjectPlacement());
			 //3IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcCovering) object).getRepresentation());
			 //3IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcCovering) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcCovering) object).getReferencedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcCovering) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcCovering) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcCovering) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcCovering) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcCovering) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcCovering) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcCovering) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcCovering) object).getDecomposes().size(); i++) {
				resultList.add(((IfcCovering) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcCovering) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcCovering) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcCovering) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcCovering) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcCovering) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcCovering) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcCovering) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
