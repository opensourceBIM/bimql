package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcWindow;

public class GetAttributeSubIfcWindow {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcWindow(Object object, String string) {
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
		if (string.equals("OverallWidthAsString")) {
			resultList.add(((IfcWindow) object).getOverallWidthAsString());
			 //1String
		}
		else if (string.equals("OverallWidth")) {
			resultList.add(((IfcWindow) object).getOverallWidth());
			 //1double
		}
		else if (string.equals("OverallHeight")) {
			resultList.add(((IfcWindow) object).getOverallHeight());
			 //1double
		}
		else if (string.equals("OverallHeightAsString")) {
			resultList.add(((IfcWindow) object).getOverallHeightAsString());
			 //1String
		}
		else if (string.equals("HasStructuralMember")) {
			//3xxx
			for (int i = 0; i < ((IfcWindow) object).getHasStructuralMember().size(); i++) {
				resultList.add(((IfcWindow) object).getHasStructuralMember().get(i));
			}
			 //3EList
		}
		else if (string.equals("ReferencedInStructures")) {
			//3xxx
			for (int i = 0; i < ((IfcWindow) object).getReferencedInStructures().size(); i++) {
				resultList.add(((IfcWindow) object).getReferencedInStructures().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsConnectionRealization")) {
			//3xxx
			for (int i = 0; i < ((IfcWindow) object).getIsConnectionRealization().size(); i++) {
				resultList.add(((IfcWindow) object).getIsConnectionRealization().get(i));
			}
			 //3EList
		}
		else if (string.equals("ProvidesBoundaries")) {
			//3xxx
			for (int i = 0; i < ((IfcWindow) object).getProvidesBoundaries().size(); i++) {
				resultList.add(((IfcWindow) object).getProvidesBoundaries().get(i));
			}
			 //3EList
		}
		else if (string.equals("ContainedInStructure")) {
			//3xxx
			for (int i = 0; i < ((IfcWindow) object).getContainedInStructure().size(); i++) {
				resultList.add(((IfcWindow) object).getContainedInStructure().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPorts")) {
			//3xxx
			for (int i = 0; i < ((IfcWindow) object).getHasPorts().size(); i++) {
				resultList.add(((IfcWindow) object).getHasPorts().get(i));
			}
			 //3EList
		}
		else if (string.equals("FillsVoids")) {
			//3xxx
			for (int i = 0; i < ((IfcWindow) object).getFillsVoids().size(); i++) {
				resultList.add(((IfcWindow) object).getFillsVoids().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedTo")) {
			//3xxx
			for (int i = 0; i < ((IfcWindow) object).getConnectedTo().size(); i++) {
				resultList.add(((IfcWindow) object).getConnectedTo().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasCoverings")) {
			//3xxx
			for (int i = 0; i < ((IfcWindow) object).getHasCoverings().size(); i++) {
				resultList.add(((IfcWindow) object).getHasCoverings().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasProjections")) {
			//3xxx
			for (int i = 0; i < ((IfcWindow) object).getHasProjections().size(); i++) {
				resultList.add(((IfcWindow) object).getHasProjections().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasOpenings")) {
			//3xxx
			for (int i = 0; i < ((IfcWindow) object).getHasOpenings().size(); i++) {
				resultList.add(((IfcWindow) object).getHasOpenings().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedFrom")) {
			//3xxx
			for (int i = 0; i < ((IfcWindow) object).getConnectedFrom().size(); i++) {
				resultList.add(((IfcWindow) object).getConnectedFrom().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcWindow) object).getTag());
			 //3String
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcWindow) object).getObjectPlacement());
			 //3IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcWindow) object).getRepresentation());
			 //3IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcWindow) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcWindow) object).getReferencedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcWindow) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcWindow) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcWindow) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcWindow) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcWindow) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcWindow) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcWindow) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcWindow) object).getDecomposes().size(); i++) {
				resultList.add(((IfcWindow) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcWindow) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcWindow) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcWindow) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcWindow) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcWindow) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcWindow) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcWindow) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
