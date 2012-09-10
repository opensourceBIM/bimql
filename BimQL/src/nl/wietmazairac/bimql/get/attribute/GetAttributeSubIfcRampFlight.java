package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcRampFlight;

public class GetAttributeSubIfcRampFlight {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcRampFlight(Object object, String string) {
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
			for (int i = 0; i < ((IfcRampFlight) object).getHasStructuralMember().size(); i++) {
				resultList.add(((IfcRampFlight) object).getHasStructuralMember().get(i));
			}
			 //3EList
		}
		else if (string.equals("ReferencedInStructures")) {
			//3xxx
			for (int i = 0; i < ((IfcRampFlight) object).getReferencedInStructures().size(); i++) {
				resultList.add(((IfcRampFlight) object).getReferencedInStructures().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsConnectionRealization")) {
			//3xxx
			for (int i = 0; i < ((IfcRampFlight) object).getIsConnectionRealization().size(); i++) {
				resultList.add(((IfcRampFlight) object).getIsConnectionRealization().get(i));
			}
			 //3EList
		}
		else if (string.equals("ProvidesBoundaries")) {
			//3xxx
			for (int i = 0; i < ((IfcRampFlight) object).getProvidesBoundaries().size(); i++) {
				resultList.add(((IfcRampFlight) object).getProvidesBoundaries().get(i));
			}
			 //3EList
		}
		else if (string.equals("ContainedInStructure")) {
			//3xxx
			for (int i = 0; i < ((IfcRampFlight) object).getContainedInStructure().size(); i++) {
				resultList.add(((IfcRampFlight) object).getContainedInStructure().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPorts")) {
			//3xxx
			for (int i = 0; i < ((IfcRampFlight) object).getHasPorts().size(); i++) {
				resultList.add(((IfcRampFlight) object).getHasPorts().get(i));
			}
			 //3EList
		}
		else if (string.equals("FillsVoids")) {
			//3xxx
			for (int i = 0; i < ((IfcRampFlight) object).getFillsVoids().size(); i++) {
				resultList.add(((IfcRampFlight) object).getFillsVoids().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedTo")) {
			//3xxx
			for (int i = 0; i < ((IfcRampFlight) object).getConnectedTo().size(); i++) {
				resultList.add(((IfcRampFlight) object).getConnectedTo().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasCoverings")) {
			//3xxx
			for (int i = 0; i < ((IfcRampFlight) object).getHasCoverings().size(); i++) {
				resultList.add(((IfcRampFlight) object).getHasCoverings().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasProjections")) {
			//3xxx
			for (int i = 0; i < ((IfcRampFlight) object).getHasProjections().size(); i++) {
				resultList.add(((IfcRampFlight) object).getHasProjections().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasOpenings")) {
			//3xxx
			for (int i = 0; i < ((IfcRampFlight) object).getHasOpenings().size(); i++) {
				resultList.add(((IfcRampFlight) object).getHasOpenings().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedFrom")) {
			//3xxx
			for (int i = 0; i < ((IfcRampFlight) object).getConnectedFrom().size(); i++) {
				resultList.add(((IfcRampFlight) object).getConnectedFrom().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcRampFlight) object).getTag());
			 //3String
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcRampFlight) object).getObjectPlacement());
			 //3IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcRampFlight) object).getRepresentation());
			 //3IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcRampFlight) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcRampFlight) object).getReferencedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcRampFlight) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcRampFlight) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcRampFlight) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcRampFlight) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcRampFlight) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcRampFlight) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcRampFlight) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcRampFlight) object).getDecomposes().size(); i++) {
				resultList.add(((IfcRampFlight) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcRampFlight) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcRampFlight) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcRampFlight) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcRampFlight) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcRampFlight) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcRampFlight) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcRampFlight) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
