package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcDistributionElement {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcDistributionElement(Object object, String string) {
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
			for (int i = 0; i < ((IfcDistributionElement) object).getHasStructuralMember().size(); i++) {
				resultList.add(((IfcDistributionElement) object).getHasStructuralMember().get(i));
			}
			 //2EList
		}
		else if (string.equals("ReferencedInStructures")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionElement) object).getReferencedInStructures().size(); i++) {
				resultList.add(((IfcDistributionElement) object).getReferencedInStructures().get(i));
			}
			 //2EList
		}
		else if (string.equals("IsConnectionRealization")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionElement) object).getIsConnectionRealization().size(); i++) {
				resultList.add(((IfcDistributionElement) object).getIsConnectionRealization().get(i));
			}
			 //2EList
		}
		else if (string.equals("ProvidesBoundaries")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionElement) object).getProvidesBoundaries().size(); i++) {
				resultList.add(((IfcDistributionElement) object).getProvidesBoundaries().get(i));
			}
			 //2EList
		}
		else if (string.equals("ContainedInStructure")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionElement) object).getContainedInStructure().size(); i++) {
				resultList.add(((IfcDistributionElement) object).getContainedInStructure().get(i));
			}
			 //2EList
		}
		else if (string.equals("HasPorts")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionElement) object).getHasPorts().size(); i++) {
				resultList.add(((IfcDistributionElement) object).getHasPorts().get(i));
			}
			 //2EList
		}
		else if (string.equals("FillsVoids")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionElement) object).getFillsVoids().size(); i++) {
				resultList.add(((IfcDistributionElement) object).getFillsVoids().get(i));
			}
			 //2EList
		}
		else if (string.equals("ConnectedTo")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionElement) object).getConnectedTo().size(); i++) {
				resultList.add(((IfcDistributionElement) object).getConnectedTo().get(i));
			}
			 //2EList
		}
		else if (string.equals("HasCoverings")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionElement) object).getHasCoverings().size(); i++) {
				resultList.add(((IfcDistributionElement) object).getHasCoverings().get(i));
			}
			 //2EList
		}
		else if (string.equals("HasProjections")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionElement) object).getHasProjections().size(); i++) {
				resultList.add(((IfcDistributionElement) object).getHasProjections().get(i));
			}
			 //2EList
		}
		else if (string.equals("HasOpenings")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionElement) object).getHasOpenings().size(); i++) {
				resultList.add(((IfcDistributionElement) object).getHasOpenings().get(i));
			}
			 //2EList
		}
		else if (string.equals("ConnectedFrom")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionElement) object).getConnectedFrom().size(); i++) {
				resultList.add(((IfcDistributionElement) object).getConnectedFrom().get(i));
			}
			 //2EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcDistributionElement) object).getTag());
			 //2String
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcDistributionElement) object).getObjectPlacement());
			 //3IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcDistributionElement) object).getRepresentation());
			 //3IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionElement) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcDistributionElement) object).getReferencedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcDistributionElement) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionElement) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcDistributionElement) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionElement) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcDistributionElement) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionElement) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcDistributionElement) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionElement) object).getDecomposes().size(); i++) {
				resultList.add(((IfcDistributionElement) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcDistributionElement) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcDistributionElement) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcDistributionElement) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcDistributionElement) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcDistributionElement) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcDistributionElement) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcDistributionElement) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
