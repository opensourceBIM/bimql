package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcCurtainWall;

public class GetAttributeSubIfcCurtainWall {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcCurtainWall(Object object, String string) {
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
			for (int i = 0; i < ((IfcCurtainWall) object).getHasStructuralMember().size(); i++) {
				resultList.add(((IfcCurtainWall) object).getHasStructuralMember().get(i));
			}
			 //3EList
		}
		else if (string.equals("ReferencedInStructures")) {
			//3xxx
			for (int i = 0; i < ((IfcCurtainWall) object).getReferencedInStructures().size(); i++) {
				resultList.add(((IfcCurtainWall) object).getReferencedInStructures().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsConnectionRealization")) {
			//3xxx
			for (int i = 0; i < ((IfcCurtainWall) object).getIsConnectionRealization().size(); i++) {
				resultList.add(((IfcCurtainWall) object).getIsConnectionRealization().get(i));
			}
			 //3EList
		}
		else if (string.equals("ProvidesBoundaries")) {
			//3xxx
			for (int i = 0; i < ((IfcCurtainWall) object).getProvidesBoundaries().size(); i++) {
				resultList.add(((IfcCurtainWall) object).getProvidesBoundaries().get(i));
			}
			 //3EList
		}
		else if (string.equals("ContainedInStructure")) {
			//3xxx
			for (int i = 0; i < ((IfcCurtainWall) object).getContainedInStructure().size(); i++) {
				resultList.add(((IfcCurtainWall) object).getContainedInStructure().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPorts")) {
			//3xxx
			for (int i = 0; i < ((IfcCurtainWall) object).getHasPorts().size(); i++) {
				resultList.add(((IfcCurtainWall) object).getHasPorts().get(i));
			}
			 //3EList
		}
		else if (string.equals("FillsVoids")) {
			//3xxx
			for (int i = 0; i < ((IfcCurtainWall) object).getFillsVoids().size(); i++) {
				resultList.add(((IfcCurtainWall) object).getFillsVoids().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedTo")) {
			//3xxx
			for (int i = 0; i < ((IfcCurtainWall) object).getConnectedTo().size(); i++) {
				resultList.add(((IfcCurtainWall) object).getConnectedTo().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasCoverings")) {
			//3xxx
			for (int i = 0; i < ((IfcCurtainWall) object).getHasCoverings().size(); i++) {
				resultList.add(((IfcCurtainWall) object).getHasCoverings().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasProjections")) {
			//3xxx
			for (int i = 0; i < ((IfcCurtainWall) object).getHasProjections().size(); i++) {
				resultList.add(((IfcCurtainWall) object).getHasProjections().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasOpenings")) {
			//3xxx
			for (int i = 0; i < ((IfcCurtainWall) object).getHasOpenings().size(); i++) {
				resultList.add(((IfcCurtainWall) object).getHasOpenings().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedFrom")) {
			//3xxx
			for (int i = 0; i < ((IfcCurtainWall) object).getConnectedFrom().size(); i++) {
				resultList.add(((IfcCurtainWall) object).getConnectedFrom().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcCurtainWall) object).getTag());
			 //3String
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcCurtainWall) object).getObjectPlacement());
			 //3IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcCurtainWall) object).getRepresentation());
			 //3IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcCurtainWall) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcCurtainWall) object).getReferencedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcCurtainWall) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcCurtainWall) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcCurtainWall) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcCurtainWall) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcCurtainWall) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcCurtainWall) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcCurtainWall) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcCurtainWall) object).getDecomposes().size(); i++) {
				resultList.add(((IfcCurtainWall) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcCurtainWall) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcCurtainWall) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcCurtainWall) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcCurtainWall) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcCurtainWall) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcCurtainWall) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcCurtainWall) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
