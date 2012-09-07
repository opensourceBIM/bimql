package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcDoor {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcDoor(Object object, String string) {
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
			resultList.add(((IfcDoor) object).getOverallWidthAsString());
			 //1String
		}
		else if (string.equals("OverallWidth")) {
			resultList.add(((IfcDoor) object).getOverallWidth());
			 //1double
		}
		else if (string.equals("OverallHeight")) {
			resultList.add(((IfcDoor) object).getOverallHeight());
			 //1double
		}
		else if (string.equals("OverallHeightAsString")) {
			resultList.add(((IfcDoor) object).getOverallHeightAsString());
			 //1String
		}
		else if (string.equals("HasStructuralMember")) {
			//3xxx
			for (int i = 0; i < ((IfcDoor) object).getHasStructuralMember().size(); i++) {
				resultList.add(((IfcDoor) object).getHasStructuralMember().get(i));
			}
			 //3EList
		}
		else if (string.equals("ReferencedInStructures")) {
			//3xxx
			for (int i = 0; i < ((IfcDoor) object).getReferencedInStructures().size(); i++) {
				resultList.add(((IfcDoor) object).getReferencedInStructures().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsConnectionRealization")) {
			//3xxx
			for (int i = 0; i < ((IfcDoor) object).getIsConnectionRealization().size(); i++) {
				resultList.add(((IfcDoor) object).getIsConnectionRealization().get(i));
			}
			 //3EList
		}
		else if (string.equals("ProvidesBoundaries")) {
			//3xxx
			for (int i = 0; i < ((IfcDoor) object).getProvidesBoundaries().size(); i++) {
				resultList.add(((IfcDoor) object).getProvidesBoundaries().get(i));
			}
			 //3EList
		}
		else if (string.equals("ContainedInStructure")) {
			//3xxx
			for (int i = 0; i < ((IfcDoor) object).getContainedInStructure().size(); i++) {
				resultList.add(((IfcDoor) object).getContainedInStructure().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPorts")) {
			//3xxx
			for (int i = 0; i < ((IfcDoor) object).getHasPorts().size(); i++) {
				resultList.add(((IfcDoor) object).getHasPorts().get(i));
			}
			 //3EList
		}
		else if (string.equals("FillsVoids")) {
			//3xxx
			for (int i = 0; i < ((IfcDoor) object).getFillsVoids().size(); i++) {
				resultList.add(((IfcDoor) object).getFillsVoids().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedTo")) {
			//3xxx
			for (int i = 0; i < ((IfcDoor) object).getConnectedTo().size(); i++) {
				resultList.add(((IfcDoor) object).getConnectedTo().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasCoverings")) {
			//3xxx
			for (int i = 0; i < ((IfcDoor) object).getHasCoverings().size(); i++) {
				resultList.add(((IfcDoor) object).getHasCoverings().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasProjections")) {
			//3xxx
			for (int i = 0; i < ((IfcDoor) object).getHasProjections().size(); i++) {
				resultList.add(((IfcDoor) object).getHasProjections().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasOpenings")) {
			//3xxx
			for (int i = 0; i < ((IfcDoor) object).getHasOpenings().size(); i++) {
				resultList.add(((IfcDoor) object).getHasOpenings().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedFrom")) {
			//3xxx
			for (int i = 0; i < ((IfcDoor) object).getConnectedFrom().size(); i++) {
				resultList.add(((IfcDoor) object).getConnectedFrom().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcDoor) object).getTag());
			 //3String
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcDoor) object).getObjectPlacement());
			 //3IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcDoor) object).getRepresentation());
			 //3IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcDoor) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcDoor) object).getReferencedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcDoor) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcDoor) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcDoor) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcDoor) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcDoor) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcDoor) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcDoor) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcDoor) object).getDecomposes().size(); i++) {
				resultList.add(((IfcDoor) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcDoor) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcDoor) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcDoor) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcDoor) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcDoor) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcDoor) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcDoor) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
