package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcStairFlight {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcStairFlight(Object object, String string) {
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
		if (string.equals("NumberOfRiser")) {
			resultList.add(((IfcStairFlight) object).getNumberOfRiser());
			 //1int
		}
		else if (string.equals("NumberOfTreads")) {
			resultList.add(((IfcStairFlight) object).getNumberOfTreads());
			 //1int
		}
		else if (string.equals("RiserHeight")) {
			resultList.add(((IfcStairFlight) object).getRiserHeight());
			 //1double
		}
		else if (string.equals("TreadLength")) {
			resultList.add(((IfcStairFlight) object).getTreadLength());
			 //1double
		}
		else if (string.equals("RiserHeightAsString")) {
			resultList.add(((IfcStairFlight) object).getRiserHeightAsString());
			 //1String
		}
		else if (string.equals("TreadLengthAsString")) {
			resultList.add(((IfcStairFlight) object).getTreadLengthAsString());
			 //1String
		}
		else if (string.equals("HasStructuralMember")) {
			//3xxx
			for (int i = 0; i < ((IfcStairFlight) object).getHasStructuralMember().size(); i++) {
				resultList.add(((IfcStairFlight) object).getHasStructuralMember().get(i));
			}
			 //3EList
		}
		else if (string.equals("ReferencedInStructures")) {
			//3xxx
			for (int i = 0; i < ((IfcStairFlight) object).getReferencedInStructures().size(); i++) {
				resultList.add(((IfcStairFlight) object).getReferencedInStructures().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsConnectionRealization")) {
			//3xxx
			for (int i = 0; i < ((IfcStairFlight) object).getIsConnectionRealization().size(); i++) {
				resultList.add(((IfcStairFlight) object).getIsConnectionRealization().get(i));
			}
			 //3EList
		}
		else if (string.equals("ProvidesBoundaries")) {
			//3xxx
			for (int i = 0; i < ((IfcStairFlight) object).getProvidesBoundaries().size(); i++) {
				resultList.add(((IfcStairFlight) object).getProvidesBoundaries().get(i));
			}
			 //3EList
		}
		else if (string.equals("ContainedInStructure")) {
			//3xxx
			for (int i = 0; i < ((IfcStairFlight) object).getContainedInStructure().size(); i++) {
				resultList.add(((IfcStairFlight) object).getContainedInStructure().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPorts")) {
			//3xxx
			for (int i = 0; i < ((IfcStairFlight) object).getHasPorts().size(); i++) {
				resultList.add(((IfcStairFlight) object).getHasPorts().get(i));
			}
			 //3EList
		}
		else if (string.equals("FillsVoids")) {
			//3xxx
			for (int i = 0; i < ((IfcStairFlight) object).getFillsVoids().size(); i++) {
				resultList.add(((IfcStairFlight) object).getFillsVoids().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedTo")) {
			//3xxx
			for (int i = 0; i < ((IfcStairFlight) object).getConnectedTo().size(); i++) {
				resultList.add(((IfcStairFlight) object).getConnectedTo().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasCoverings")) {
			//3xxx
			for (int i = 0; i < ((IfcStairFlight) object).getHasCoverings().size(); i++) {
				resultList.add(((IfcStairFlight) object).getHasCoverings().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasProjections")) {
			//3xxx
			for (int i = 0; i < ((IfcStairFlight) object).getHasProjections().size(); i++) {
				resultList.add(((IfcStairFlight) object).getHasProjections().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasOpenings")) {
			//3xxx
			for (int i = 0; i < ((IfcStairFlight) object).getHasOpenings().size(); i++) {
				resultList.add(((IfcStairFlight) object).getHasOpenings().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedFrom")) {
			//3xxx
			for (int i = 0; i < ((IfcStairFlight) object).getConnectedFrom().size(); i++) {
				resultList.add(((IfcStairFlight) object).getConnectedFrom().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcStairFlight) object).getTag());
			 //3String
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcStairFlight) object).getObjectPlacement());
			 //3IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcStairFlight) object).getRepresentation());
			 //3IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcStairFlight) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcStairFlight) object).getReferencedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcStairFlight) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcStairFlight) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcStairFlight) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcStairFlight) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcStairFlight) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcStairFlight) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcStairFlight) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcStairFlight) object).getDecomposes().size(); i++) {
				resultList.add(((IfcStairFlight) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcStairFlight) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcStairFlight) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcStairFlight) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcStairFlight) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcStairFlight) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcStairFlight) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcStairFlight) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
