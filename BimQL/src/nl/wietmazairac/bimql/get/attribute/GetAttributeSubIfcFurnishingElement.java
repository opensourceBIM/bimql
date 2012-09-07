package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcFurnishingElement {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcFurnishingElement(Object object, String string) {
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
			for (int i = 0; i < ((IfcFurnishingElement) object).getHasStructuralMember().size(); i++) {
				resultList.add(((IfcFurnishingElement) object).getHasStructuralMember().get(i));
			}
			 //2EList
		}
		else if (string.equals("ReferencedInStructures")) {
			//3xxx
			for (int i = 0; i < ((IfcFurnishingElement) object).getReferencedInStructures().size(); i++) {
				resultList.add(((IfcFurnishingElement) object).getReferencedInStructures().get(i));
			}
			 //2EList
		}
		else if (string.equals("IsConnectionRealization")) {
			//3xxx
			for (int i = 0; i < ((IfcFurnishingElement) object).getIsConnectionRealization().size(); i++) {
				resultList.add(((IfcFurnishingElement) object).getIsConnectionRealization().get(i));
			}
			 //2EList
		}
		else if (string.equals("ProvidesBoundaries")) {
			//3xxx
			for (int i = 0; i < ((IfcFurnishingElement) object).getProvidesBoundaries().size(); i++) {
				resultList.add(((IfcFurnishingElement) object).getProvidesBoundaries().get(i));
			}
			 //2EList
		}
		else if (string.equals("ContainedInStructure")) {
			//3xxx
			for (int i = 0; i < ((IfcFurnishingElement) object).getContainedInStructure().size(); i++) {
				resultList.add(((IfcFurnishingElement) object).getContainedInStructure().get(i));
			}
			 //2EList
		}
		else if (string.equals("HasPorts")) {
			//3xxx
			for (int i = 0; i < ((IfcFurnishingElement) object).getHasPorts().size(); i++) {
				resultList.add(((IfcFurnishingElement) object).getHasPorts().get(i));
			}
			 //2EList
		}
		else if (string.equals("FillsVoids")) {
			//3xxx
			for (int i = 0; i < ((IfcFurnishingElement) object).getFillsVoids().size(); i++) {
				resultList.add(((IfcFurnishingElement) object).getFillsVoids().get(i));
			}
			 //2EList
		}
		else if (string.equals("ConnectedTo")) {
			//3xxx
			for (int i = 0; i < ((IfcFurnishingElement) object).getConnectedTo().size(); i++) {
				resultList.add(((IfcFurnishingElement) object).getConnectedTo().get(i));
			}
			 //2EList
		}
		else if (string.equals("HasCoverings")) {
			//3xxx
			for (int i = 0; i < ((IfcFurnishingElement) object).getHasCoverings().size(); i++) {
				resultList.add(((IfcFurnishingElement) object).getHasCoverings().get(i));
			}
			 //2EList
		}
		else if (string.equals("HasProjections")) {
			//3xxx
			for (int i = 0; i < ((IfcFurnishingElement) object).getHasProjections().size(); i++) {
				resultList.add(((IfcFurnishingElement) object).getHasProjections().get(i));
			}
			 //2EList
		}
		else if (string.equals("HasOpenings")) {
			//3xxx
			for (int i = 0; i < ((IfcFurnishingElement) object).getHasOpenings().size(); i++) {
				resultList.add(((IfcFurnishingElement) object).getHasOpenings().get(i));
			}
			 //2EList
		}
		else if (string.equals("ConnectedFrom")) {
			//3xxx
			for (int i = 0; i < ((IfcFurnishingElement) object).getConnectedFrom().size(); i++) {
				resultList.add(((IfcFurnishingElement) object).getConnectedFrom().get(i));
			}
			 //2EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcFurnishingElement) object).getTag());
			 //2String
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcFurnishingElement) object).getObjectPlacement());
			 //3IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcFurnishingElement) object).getRepresentation());
			 //3IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcFurnishingElement) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcFurnishingElement) object).getReferencedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcFurnishingElement) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcFurnishingElement) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcFurnishingElement) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcFurnishingElement) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcFurnishingElement) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcFurnishingElement) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcFurnishingElement) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcFurnishingElement) object).getDecomposes().size(); i++) {
				resultList.add(((IfcFurnishingElement) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcFurnishingElement) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcFurnishingElement) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcFurnishingElement) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcFurnishingElement) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcFurnishingElement) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcFurnishingElement) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcFurnishingElement) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
