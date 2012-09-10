package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcBuildingElementProxy;

public class GetAttributeSubIfcBuildingElementProxy {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcBuildingElementProxy(Object object, String string) {
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
		if (string.equals("CompositionType")) {
			resultList.add(((IfcBuildingElementProxy) object).getCompositionType());
			 //1IfcElementCompositionEnum
		}
		else if (string.equals("HasStructuralMember")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingElementProxy) object).getHasStructuralMember().size(); i++) {
				resultList.add(((IfcBuildingElementProxy) object).getHasStructuralMember().get(i));
			}
			 //3EList
		}
		else if (string.equals("ReferencedInStructures")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingElementProxy) object).getReferencedInStructures().size(); i++) {
				resultList.add(((IfcBuildingElementProxy) object).getReferencedInStructures().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsConnectionRealization")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingElementProxy) object).getIsConnectionRealization().size(); i++) {
				resultList.add(((IfcBuildingElementProxy) object).getIsConnectionRealization().get(i));
			}
			 //3EList
		}
		else if (string.equals("ProvidesBoundaries")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingElementProxy) object).getProvidesBoundaries().size(); i++) {
				resultList.add(((IfcBuildingElementProxy) object).getProvidesBoundaries().get(i));
			}
			 //3EList
		}
		else if (string.equals("ContainedInStructure")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingElementProxy) object).getContainedInStructure().size(); i++) {
				resultList.add(((IfcBuildingElementProxy) object).getContainedInStructure().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPorts")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingElementProxy) object).getHasPorts().size(); i++) {
				resultList.add(((IfcBuildingElementProxy) object).getHasPorts().get(i));
			}
			 //3EList
		}
		else if (string.equals("FillsVoids")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingElementProxy) object).getFillsVoids().size(); i++) {
				resultList.add(((IfcBuildingElementProxy) object).getFillsVoids().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedTo")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingElementProxy) object).getConnectedTo().size(); i++) {
				resultList.add(((IfcBuildingElementProxy) object).getConnectedTo().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasCoverings")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingElementProxy) object).getHasCoverings().size(); i++) {
				resultList.add(((IfcBuildingElementProxy) object).getHasCoverings().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasProjections")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingElementProxy) object).getHasProjections().size(); i++) {
				resultList.add(((IfcBuildingElementProxy) object).getHasProjections().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasOpenings")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingElementProxy) object).getHasOpenings().size(); i++) {
				resultList.add(((IfcBuildingElementProxy) object).getHasOpenings().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedFrom")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingElementProxy) object).getConnectedFrom().size(); i++) {
				resultList.add(((IfcBuildingElementProxy) object).getConnectedFrom().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcBuildingElementProxy) object).getTag());
			 //3String
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcBuildingElementProxy) object).getObjectPlacement());
			 //3IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcBuildingElementProxy) object).getRepresentation());
			 //3IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingElementProxy) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcBuildingElementProxy) object).getReferencedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcBuildingElementProxy) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingElementProxy) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcBuildingElementProxy) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingElementProxy) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcBuildingElementProxy) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingElementProxy) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcBuildingElementProxy) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingElementProxy) object).getDecomposes().size(); i++) {
				resultList.add(((IfcBuildingElementProxy) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcBuildingElementProxy) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcBuildingElementProxy) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcBuildingElementProxy) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcBuildingElementProxy) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcBuildingElementProxy) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcBuildingElementProxy) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcBuildingElementProxy) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
