package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcFeatureElement;

public class GetAttributeSubIfcFeatureElement {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcFeatureElement(Object object, String string) {
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
			for (int i = 0; i < ((IfcFeatureElement) object).getHasStructuralMember().size(); i++) {
				resultList.add(((IfcFeatureElement) object).getHasStructuralMember().get(i));
			}
			 //2EList
		}
		else if (string.equals("ReferencedInStructures")) {
			//3xxx
			for (int i = 0; i < ((IfcFeatureElement) object).getReferencedInStructures().size(); i++) {
				resultList.add(((IfcFeatureElement) object).getReferencedInStructures().get(i));
			}
			 //2EList
		}
		else if (string.equals("IsConnectionRealization")) {
			//3xxx
			for (int i = 0; i < ((IfcFeatureElement) object).getIsConnectionRealization().size(); i++) {
				resultList.add(((IfcFeatureElement) object).getIsConnectionRealization().get(i));
			}
			 //2EList
		}
		else if (string.equals("ProvidesBoundaries")) {
			//3xxx
			for (int i = 0; i < ((IfcFeatureElement) object).getProvidesBoundaries().size(); i++) {
				resultList.add(((IfcFeatureElement) object).getProvidesBoundaries().get(i));
			}
			 //2EList
		}
		else if (string.equals("ContainedInStructure")) {
			//3xxx
			for (int i = 0; i < ((IfcFeatureElement) object).getContainedInStructure().size(); i++) {
				resultList.add(((IfcFeatureElement) object).getContainedInStructure().get(i));
			}
			 //2EList
		}
		else if (string.equals("HasPorts")) {
			//3xxx
			for (int i = 0; i < ((IfcFeatureElement) object).getHasPorts().size(); i++) {
				resultList.add(((IfcFeatureElement) object).getHasPorts().get(i));
			}
			 //2EList
		}
		else if (string.equals("FillsVoids")) {
			//3xxx
			for (int i = 0; i < ((IfcFeatureElement) object).getFillsVoids().size(); i++) {
				resultList.add(((IfcFeatureElement) object).getFillsVoids().get(i));
			}
			 //2EList
		}
		else if (string.equals("ConnectedTo")) {
			//3xxx
			for (int i = 0; i < ((IfcFeatureElement) object).getConnectedTo().size(); i++) {
				resultList.add(((IfcFeatureElement) object).getConnectedTo().get(i));
			}
			 //2EList
		}
		else if (string.equals("HasCoverings")) {
			//3xxx
			for (int i = 0; i < ((IfcFeatureElement) object).getHasCoverings().size(); i++) {
				resultList.add(((IfcFeatureElement) object).getHasCoverings().get(i));
			}
			 //2EList
		}
		else if (string.equals("HasProjections")) {
			//3xxx
			for (int i = 0; i < ((IfcFeatureElement) object).getHasProjections().size(); i++) {
				resultList.add(((IfcFeatureElement) object).getHasProjections().get(i));
			}
			 //2EList
		}
		else if (string.equals("HasOpenings")) {
			//3xxx
			for (int i = 0; i < ((IfcFeatureElement) object).getHasOpenings().size(); i++) {
				resultList.add(((IfcFeatureElement) object).getHasOpenings().get(i));
			}
			 //2EList
		}
		else if (string.equals("ConnectedFrom")) {
			//3xxx
			for (int i = 0; i < ((IfcFeatureElement) object).getConnectedFrom().size(); i++) {
				resultList.add(((IfcFeatureElement) object).getConnectedFrom().get(i));
			}
			 //2EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcFeatureElement) object).getTag());
			 //2String
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcFeatureElement) object).getObjectPlacement());
			 //3IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcFeatureElement) object).getRepresentation());
			 //3IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcFeatureElement) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcFeatureElement) object).getReferencedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcFeatureElement) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcFeatureElement) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcFeatureElement) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcFeatureElement) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcFeatureElement) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcFeatureElement) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcFeatureElement) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcFeatureElement) object).getDecomposes().size(); i++) {
				resultList.add(((IfcFeatureElement) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcFeatureElement) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcFeatureElement) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcFeatureElement) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcFeatureElement) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcFeatureElement) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcFeatureElement) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcFeatureElement) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
