package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcReinforcingElement {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcReinforcingElement(Object object, String string) {
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
		if (string.equals("SteelGrade")) {
			resultList.add(((IfcReinforcingElement) object).getSteelGrade());
			 //1String
		}
		else if (string.equals("HasStructuralMember")) {
			//3xxx
			for (int i = 0; i < ((IfcReinforcingElement) object).getHasStructuralMember().size(); i++) {
				resultList.add(((IfcReinforcingElement) object).getHasStructuralMember().get(i));
			}
			 //3EList
		}
		else if (string.equals("ReferencedInStructures")) {
			//3xxx
			for (int i = 0; i < ((IfcReinforcingElement) object).getReferencedInStructures().size(); i++) {
				resultList.add(((IfcReinforcingElement) object).getReferencedInStructures().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsConnectionRealization")) {
			//3xxx
			for (int i = 0; i < ((IfcReinforcingElement) object).getIsConnectionRealization().size(); i++) {
				resultList.add(((IfcReinforcingElement) object).getIsConnectionRealization().get(i));
			}
			 //3EList
		}
		else if (string.equals("ProvidesBoundaries")) {
			//3xxx
			for (int i = 0; i < ((IfcReinforcingElement) object).getProvidesBoundaries().size(); i++) {
				resultList.add(((IfcReinforcingElement) object).getProvidesBoundaries().get(i));
			}
			 //3EList
		}
		else if (string.equals("ContainedInStructure")) {
			//3xxx
			for (int i = 0; i < ((IfcReinforcingElement) object).getContainedInStructure().size(); i++) {
				resultList.add(((IfcReinforcingElement) object).getContainedInStructure().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPorts")) {
			//3xxx
			for (int i = 0; i < ((IfcReinforcingElement) object).getHasPorts().size(); i++) {
				resultList.add(((IfcReinforcingElement) object).getHasPorts().get(i));
			}
			 //3EList
		}
		else if (string.equals("FillsVoids")) {
			//3xxx
			for (int i = 0; i < ((IfcReinforcingElement) object).getFillsVoids().size(); i++) {
				resultList.add(((IfcReinforcingElement) object).getFillsVoids().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedTo")) {
			//3xxx
			for (int i = 0; i < ((IfcReinforcingElement) object).getConnectedTo().size(); i++) {
				resultList.add(((IfcReinforcingElement) object).getConnectedTo().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasCoverings")) {
			//3xxx
			for (int i = 0; i < ((IfcReinforcingElement) object).getHasCoverings().size(); i++) {
				resultList.add(((IfcReinforcingElement) object).getHasCoverings().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasProjections")) {
			//3xxx
			for (int i = 0; i < ((IfcReinforcingElement) object).getHasProjections().size(); i++) {
				resultList.add(((IfcReinforcingElement) object).getHasProjections().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasOpenings")) {
			//3xxx
			for (int i = 0; i < ((IfcReinforcingElement) object).getHasOpenings().size(); i++) {
				resultList.add(((IfcReinforcingElement) object).getHasOpenings().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedFrom")) {
			//3xxx
			for (int i = 0; i < ((IfcReinforcingElement) object).getConnectedFrom().size(); i++) {
				resultList.add(((IfcReinforcingElement) object).getConnectedFrom().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcReinforcingElement) object).getTag());
			 //3String
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcReinforcingElement) object).getObjectPlacement());
			 //3IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcReinforcingElement) object).getRepresentation());
			 //3IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcReinforcingElement) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcReinforcingElement) object).getReferencedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcReinforcingElement) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcReinforcingElement) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcReinforcingElement) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcReinforcingElement) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcReinforcingElement) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcReinforcingElement) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcReinforcingElement) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcReinforcingElement) object).getDecomposes().size(); i++) {
				resultList.add(((IfcReinforcingElement) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcReinforcingElement) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcReinforcingElement) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcReinforcingElement) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcReinforcingElement) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcReinforcingElement) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcReinforcingElement) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcReinforcingElement) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
