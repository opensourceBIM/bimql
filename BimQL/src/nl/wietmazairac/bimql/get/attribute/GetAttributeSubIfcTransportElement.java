package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcTransportElement;

public class GetAttributeSubIfcTransportElement {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcTransportElement(Object object, String string) {
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
		if (string.equals("OperationType")) {
			resultList.add(((IfcTransportElement) object).getOperationType());
			 //1IfcTransportElementTypeEnum
		}
		else if (string.equals("CapacityByWeight")) {
			resultList.add(((IfcTransportElement) object).getCapacityByWeight());
			 //1double
		}
		else if (string.equals("CapacityByNumber")) {
			resultList.add(((IfcTransportElement) object).getCapacityByNumber());
			 //1double
		}
		else if (string.equals("CapacityByWeightAsString")) {
			resultList.add(((IfcTransportElement) object).getCapacityByWeightAsString());
			 //1String
		}
		else if (string.equals("CapacityByNumberAsString")) {
			resultList.add(((IfcTransportElement) object).getCapacityByNumberAsString());
			 //1String
		}
		else if (string.equals("HasStructuralMember")) {
			//3xxx
			for (int i = 0; i < ((IfcTransportElement) object).getHasStructuralMember().size(); i++) {
				resultList.add(((IfcTransportElement) object).getHasStructuralMember().get(i));
			}
			 //2EList
		}
		else if (string.equals("ReferencedInStructures")) {
			//3xxx
			for (int i = 0; i < ((IfcTransportElement) object).getReferencedInStructures().size(); i++) {
				resultList.add(((IfcTransportElement) object).getReferencedInStructures().get(i));
			}
			 //2EList
		}
		else if (string.equals("IsConnectionRealization")) {
			//3xxx
			for (int i = 0; i < ((IfcTransportElement) object).getIsConnectionRealization().size(); i++) {
				resultList.add(((IfcTransportElement) object).getIsConnectionRealization().get(i));
			}
			 //2EList
		}
		else if (string.equals("ProvidesBoundaries")) {
			//3xxx
			for (int i = 0; i < ((IfcTransportElement) object).getProvidesBoundaries().size(); i++) {
				resultList.add(((IfcTransportElement) object).getProvidesBoundaries().get(i));
			}
			 //2EList
		}
		else if (string.equals("ContainedInStructure")) {
			//3xxx
			for (int i = 0; i < ((IfcTransportElement) object).getContainedInStructure().size(); i++) {
				resultList.add(((IfcTransportElement) object).getContainedInStructure().get(i));
			}
			 //2EList
		}
		else if (string.equals("HasPorts")) {
			//3xxx
			for (int i = 0; i < ((IfcTransportElement) object).getHasPorts().size(); i++) {
				resultList.add(((IfcTransportElement) object).getHasPorts().get(i));
			}
			 //2EList
		}
		else if (string.equals("FillsVoids")) {
			//3xxx
			for (int i = 0; i < ((IfcTransportElement) object).getFillsVoids().size(); i++) {
				resultList.add(((IfcTransportElement) object).getFillsVoids().get(i));
			}
			 //2EList
		}
		else if (string.equals("ConnectedTo")) {
			//3xxx
			for (int i = 0; i < ((IfcTransportElement) object).getConnectedTo().size(); i++) {
				resultList.add(((IfcTransportElement) object).getConnectedTo().get(i));
			}
			 //2EList
		}
		else if (string.equals("HasCoverings")) {
			//3xxx
			for (int i = 0; i < ((IfcTransportElement) object).getHasCoverings().size(); i++) {
				resultList.add(((IfcTransportElement) object).getHasCoverings().get(i));
			}
			 //2EList
		}
		else if (string.equals("HasProjections")) {
			//3xxx
			for (int i = 0; i < ((IfcTransportElement) object).getHasProjections().size(); i++) {
				resultList.add(((IfcTransportElement) object).getHasProjections().get(i));
			}
			 //2EList
		}
		else if (string.equals("HasOpenings")) {
			//3xxx
			for (int i = 0; i < ((IfcTransportElement) object).getHasOpenings().size(); i++) {
				resultList.add(((IfcTransportElement) object).getHasOpenings().get(i));
			}
			 //2EList
		}
		else if (string.equals("ConnectedFrom")) {
			//3xxx
			for (int i = 0; i < ((IfcTransportElement) object).getConnectedFrom().size(); i++) {
				resultList.add(((IfcTransportElement) object).getConnectedFrom().get(i));
			}
			 //2EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcTransportElement) object).getTag());
			 //2String
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcTransportElement) object).getObjectPlacement());
			 //3IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcTransportElement) object).getRepresentation());
			 //3IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcTransportElement) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcTransportElement) object).getReferencedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcTransportElement) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcTransportElement) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcTransportElement) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcTransportElement) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcTransportElement) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcTransportElement) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcTransportElement) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcTransportElement) object).getDecomposes().size(); i++) {
				resultList.add(((IfcTransportElement) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcTransportElement) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcTransportElement) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcTransportElement) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcTransportElement) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcTransportElement) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcTransportElement) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcTransportElement) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
