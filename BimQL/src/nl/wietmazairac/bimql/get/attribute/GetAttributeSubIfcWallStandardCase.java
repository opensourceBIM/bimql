package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcWallStandardCase;

public class GetAttributeSubIfcWallStandardCase {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcWallStandardCase(Object object, String string) {
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
			for (int i = 0; i < ((IfcWallStandardCase) object).getHasStructuralMember().size(); i++) {
				resultList.add(((IfcWallStandardCase) object).getHasStructuralMember().get(i));
			}
			 //3EList
		}
		else if (string.equals("ReferencedInStructures")) {
			//3xxx
			for (int i = 0; i < ((IfcWallStandardCase) object).getReferencedInStructures().size(); i++) {
				resultList.add(((IfcWallStandardCase) object).getReferencedInStructures().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsConnectionRealization")) {
			//3xxx
			for (int i = 0; i < ((IfcWallStandardCase) object).getIsConnectionRealization().size(); i++) {
				resultList.add(((IfcWallStandardCase) object).getIsConnectionRealization().get(i));
			}
			 //3EList
		}
		else if (string.equals("ProvidesBoundaries")) {
			//3xxx
			for (int i = 0; i < ((IfcWallStandardCase) object).getProvidesBoundaries().size(); i++) {
				resultList.add(((IfcWallStandardCase) object).getProvidesBoundaries().get(i));
			}
			 //3EList
		}
		else if (string.equals("ContainedInStructure")) {
			//3xxx
			for (int i = 0; i < ((IfcWallStandardCase) object).getContainedInStructure().size(); i++) {
				resultList.add(((IfcWallStandardCase) object).getContainedInStructure().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPorts")) {
			//3xxx
			for (int i = 0; i < ((IfcWallStandardCase) object).getHasPorts().size(); i++) {
				resultList.add(((IfcWallStandardCase) object).getHasPorts().get(i));
			}
			 //3EList
		}
		else if (string.equals("FillsVoids")) {
			//3xxx
			for (int i = 0; i < ((IfcWallStandardCase) object).getFillsVoids().size(); i++) {
				resultList.add(((IfcWallStandardCase) object).getFillsVoids().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedTo")) {
			//3xxx
			for (int i = 0; i < ((IfcWallStandardCase) object).getConnectedTo().size(); i++) {
				resultList.add(((IfcWallStandardCase) object).getConnectedTo().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasCoverings")) {
			//3xxx
			for (int i = 0; i < ((IfcWallStandardCase) object).getHasCoverings().size(); i++) {
				resultList.add(((IfcWallStandardCase) object).getHasCoverings().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasProjections")) {
			//3xxx
			for (int i = 0; i < ((IfcWallStandardCase) object).getHasProjections().size(); i++) {
				resultList.add(((IfcWallStandardCase) object).getHasProjections().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasOpenings")) {
			//3xxx
			for (int i = 0; i < ((IfcWallStandardCase) object).getHasOpenings().size(); i++) {
				resultList.add(((IfcWallStandardCase) object).getHasOpenings().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedFrom")) {
			//3xxx
			for (int i = 0; i < ((IfcWallStandardCase) object).getConnectedFrom().size(); i++) {
				resultList.add(((IfcWallStandardCase) object).getConnectedFrom().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcWallStandardCase) object).getTag());
			 //3String
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcWallStandardCase) object).getObjectPlacement());
			 //3IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcWallStandardCase) object).getRepresentation());
			 //3IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcWallStandardCase) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcWallStandardCase) object).getReferencedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcWallStandardCase) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcWallStandardCase) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcWallStandardCase) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcWallStandardCase) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcWallStandardCase) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcWallStandardCase) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcWallStandardCase) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcWallStandardCase) object).getDecomposes().size(); i++) {
				resultList.add(((IfcWallStandardCase) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcWallStandardCase) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcWallStandardCase) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcWallStandardCase) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcWallStandardCase) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcWallStandardCase) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcWallStandardCase) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcWallStandardCase) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
