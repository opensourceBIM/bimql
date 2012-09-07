package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcFlowFitting {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcFlowFitting(Object object, String string) {
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
			for (int i = 0; i < ((IfcFlowFitting) object).getHasControlElements().size(); i++) {
				resultList.add(((IfcFlowFitting) object).getHasControlElements().get(i));
			}
			 //2EList
		}
		else if (string.equals("HasStructuralMember")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowFitting) object).getHasStructuralMember().size(); i++) {
				resultList.add(((IfcFlowFitting) object).getHasStructuralMember().get(i));
			}
			 //3EList
		}
		else if (string.equals("ReferencedInStructures")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowFitting) object).getReferencedInStructures().size(); i++) {
				resultList.add(((IfcFlowFitting) object).getReferencedInStructures().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsConnectionRealization")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowFitting) object).getIsConnectionRealization().size(); i++) {
				resultList.add(((IfcFlowFitting) object).getIsConnectionRealization().get(i));
			}
			 //3EList
		}
		else if (string.equals("ProvidesBoundaries")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowFitting) object).getProvidesBoundaries().size(); i++) {
				resultList.add(((IfcFlowFitting) object).getProvidesBoundaries().get(i));
			}
			 //3EList
		}
		else if (string.equals("ContainedInStructure")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowFitting) object).getContainedInStructure().size(); i++) {
				resultList.add(((IfcFlowFitting) object).getContainedInStructure().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPorts")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowFitting) object).getHasPorts().size(); i++) {
				resultList.add(((IfcFlowFitting) object).getHasPorts().get(i));
			}
			 //3EList
		}
		else if (string.equals("FillsVoids")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowFitting) object).getFillsVoids().size(); i++) {
				resultList.add(((IfcFlowFitting) object).getFillsVoids().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedTo")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowFitting) object).getConnectedTo().size(); i++) {
				resultList.add(((IfcFlowFitting) object).getConnectedTo().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasCoverings")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowFitting) object).getHasCoverings().size(); i++) {
				resultList.add(((IfcFlowFitting) object).getHasCoverings().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasProjections")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowFitting) object).getHasProjections().size(); i++) {
				resultList.add(((IfcFlowFitting) object).getHasProjections().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasOpenings")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowFitting) object).getHasOpenings().size(); i++) {
				resultList.add(((IfcFlowFitting) object).getHasOpenings().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedFrom")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowFitting) object).getConnectedFrom().size(); i++) {
				resultList.add(((IfcFlowFitting) object).getConnectedFrom().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcFlowFitting) object).getTag());
			 //3String
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcFlowFitting) object).getObjectPlacement());
			 //3IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcFlowFitting) object).getRepresentation());
			 //3IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowFitting) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcFlowFitting) object).getReferencedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcFlowFitting) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowFitting) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcFlowFitting) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowFitting) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcFlowFitting) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowFitting) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcFlowFitting) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowFitting) object).getDecomposes().size(); i++) {
				resultList.add(((IfcFlowFitting) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowFitting) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcFlowFitting) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcFlowFitting) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcFlowFitting) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcFlowFitting) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcFlowFitting) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcFlowFitting) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
