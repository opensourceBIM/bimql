package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcFlowMovingDevice;

public class GetAttributeSubIfcFlowMovingDevice {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcFlowMovingDevice(Object object, String string) {
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
		if (string.equals("HasControlElements")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowMovingDevice) object).getHasControlElements().size(); i++) {
				resultList.add(((IfcFlowMovingDevice) object).getHasControlElements().get(i));
			}
			 //2EList
		}
		else if (string.equals("HasStructuralMember")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowMovingDevice) object).getHasStructuralMember().size(); i++) {
				resultList.add(((IfcFlowMovingDevice) object).getHasStructuralMember().get(i));
			}
			 //3EList
		}
		else if (string.equals("ReferencedInStructures")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowMovingDevice) object).getReferencedInStructures().size(); i++) {
				resultList.add(((IfcFlowMovingDevice) object).getReferencedInStructures().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsConnectionRealization")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowMovingDevice) object).getIsConnectionRealization().size(); i++) {
				resultList.add(((IfcFlowMovingDevice) object).getIsConnectionRealization().get(i));
			}
			 //3EList
		}
		else if (string.equals("ProvidesBoundaries")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowMovingDevice) object).getProvidesBoundaries().size(); i++) {
				resultList.add(((IfcFlowMovingDevice) object).getProvidesBoundaries().get(i));
			}
			 //3EList
		}
		else if (string.equals("ContainedInStructure")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowMovingDevice) object).getContainedInStructure().size(); i++) {
				resultList.add(((IfcFlowMovingDevice) object).getContainedInStructure().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPorts")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowMovingDevice) object).getHasPorts().size(); i++) {
				resultList.add(((IfcFlowMovingDevice) object).getHasPorts().get(i));
			}
			 //3EList
		}
		else if (string.equals("FillsVoids")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowMovingDevice) object).getFillsVoids().size(); i++) {
				resultList.add(((IfcFlowMovingDevice) object).getFillsVoids().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedTo")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowMovingDevice) object).getConnectedTo().size(); i++) {
				resultList.add(((IfcFlowMovingDevice) object).getConnectedTo().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasCoverings")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowMovingDevice) object).getHasCoverings().size(); i++) {
				resultList.add(((IfcFlowMovingDevice) object).getHasCoverings().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasProjections")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowMovingDevice) object).getHasProjections().size(); i++) {
				resultList.add(((IfcFlowMovingDevice) object).getHasProjections().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasOpenings")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowMovingDevice) object).getHasOpenings().size(); i++) {
				resultList.add(((IfcFlowMovingDevice) object).getHasOpenings().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedFrom")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowMovingDevice) object).getConnectedFrom().size(); i++) {
				resultList.add(((IfcFlowMovingDevice) object).getConnectedFrom().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcFlowMovingDevice) object).getTag());
			 //3String
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcFlowMovingDevice) object).getObjectPlacement());
			 //3IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcFlowMovingDevice) object).getRepresentation());
			 //3IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowMovingDevice) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcFlowMovingDevice) object).getReferencedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcFlowMovingDevice) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowMovingDevice) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcFlowMovingDevice) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowMovingDevice) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcFlowMovingDevice) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowMovingDevice) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcFlowMovingDevice) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowMovingDevice) object).getDecomposes().size(); i++) {
				resultList.add(((IfcFlowMovingDevice) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowMovingDevice) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcFlowMovingDevice) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcFlowMovingDevice) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcFlowMovingDevice) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcFlowMovingDevice) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcFlowMovingDevice) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcFlowMovingDevice) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
