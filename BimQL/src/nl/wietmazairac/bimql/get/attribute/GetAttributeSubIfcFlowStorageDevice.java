package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcFlowStorageDevice {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcFlowStorageDevice(Object object, String string) {
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
			for (int i = 0; i < ((IfcFlowStorageDevice) object).getHasControlElements().size(); i++) {
				resultList.add(((IfcFlowStorageDevice) object).getHasControlElements().get(i));
			}
			 //2EList
		}
		else if (string.equals("HasStructuralMember")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowStorageDevice) object).getHasStructuralMember().size(); i++) {
				resultList.add(((IfcFlowStorageDevice) object).getHasStructuralMember().get(i));
			}
			 //3EList
		}
		else if (string.equals("ReferencedInStructures")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowStorageDevice) object).getReferencedInStructures().size(); i++) {
				resultList.add(((IfcFlowStorageDevice) object).getReferencedInStructures().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsConnectionRealization")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowStorageDevice) object).getIsConnectionRealization().size(); i++) {
				resultList.add(((IfcFlowStorageDevice) object).getIsConnectionRealization().get(i));
			}
			 //3EList
		}
		else if (string.equals("ProvidesBoundaries")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowStorageDevice) object).getProvidesBoundaries().size(); i++) {
				resultList.add(((IfcFlowStorageDevice) object).getProvidesBoundaries().get(i));
			}
			 //3EList
		}
		else if (string.equals("ContainedInStructure")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowStorageDevice) object).getContainedInStructure().size(); i++) {
				resultList.add(((IfcFlowStorageDevice) object).getContainedInStructure().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPorts")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowStorageDevice) object).getHasPorts().size(); i++) {
				resultList.add(((IfcFlowStorageDevice) object).getHasPorts().get(i));
			}
			 //3EList
		}
		else if (string.equals("FillsVoids")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowStorageDevice) object).getFillsVoids().size(); i++) {
				resultList.add(((IfcFlowStorageDevice) object).getFillsVoids().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedTo")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowStorageDevice) object).getConnectedTo().size(); i++) {
				resultList.add(((IfcFlowStorageDevice) object).getConnectedTo().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasCoverings")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowStorageDevice) object).getHasCoverings().size(); i++) {
				resultList.add(((IfcFlowStorageDevice) object).getHasCoverings().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasProjections")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowStorageDevice) object).getHasProjections().size(); i++) {
				resultList.add(((IfcFlowStorageDevice) object).getHasProjections().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasOpenings")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowStorageDevice) object).getHasOpenings().size(); i++) {
				resultList.add(((IfcFlowStorageDevice) object).getHasOpenings().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedFrom")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowStorageDevice) object).getConnectedFrom().size(); i++) {
				resultList.add(((IfcFlowStorageDevice) object).getConnectedFrom().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcFlowStorageDevice) object).getTag());
			 //3String
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcFlowStorageDevice) object).getObjectPlacement());
			 //3IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcFlowStorageDevice) object).getRepresentation());
			 //3IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowStorageDevice) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcFlowStorageDevice) object).getReferencedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcFlowStorageDevice) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowStorageDevice) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcFlowStorageDevice) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowStorageDevice) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcFlowStorageDevice) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowStorageDevice) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcFlowStorageDevice) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowStorageDevice) object).getDecomposes().size(); i++) {
				resultList.add(((IfcFlowStorageDevice) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowStorageDevice) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcFlowStorageDevice) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcFlowStorageDevice) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcFlowStorageDevice) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcFlowStorageDevice) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcFlowStorageDevice) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcFlowStorageDevice) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
