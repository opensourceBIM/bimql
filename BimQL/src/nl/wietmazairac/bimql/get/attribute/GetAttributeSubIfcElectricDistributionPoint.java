package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcElectricDistributionPoint;

public class GetAttributeSubIfcElectricDistributionPoint {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcElectricDistributionPoint(Object object, String string) {
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
		if (string.equals("DistributionPointFunction")) {
			resultList.add(((IfcElectricDistributionPoint) object).getDistributionPointFunction());
			 //1IfcElectricDistributionPointFunctionEnum
		}
		else if (string.equals("UserDefinedFunction")) {
			resultList.add(((IfcElectricDistributionPoint) object).getUserDefinedFunction());
			 //1String
		}
		else if (string.equals("HasControlElements")) {
			//3xxx
			for (int i = 0; i < ((IfcElectricDistributionPoint) object).getHasControlElements().size(); i++) {
				resultList.add(((IfcElectricDistributionPoint) object).getHasControlElements().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasStructuralMember")) {
			//3xxx
			for (int i = 0; i < ((IfcElectricDistributionPoint) object).getHasStructuralMember().size(); i++) {
				resultList.add(((IfcElectricDistributionPoint) object).getHasStructuralMember().get(i));
			}
			 //3EList
		}
		else if (string.equals("ReferencedInStructures")) {
			//3xxx
			for (int i = 0; i < ((IfcElectricDistributionPoint) object).getReferencedInStructures().size(); i++) {
				resultList.add(((IfcElectricDistributionPoint) object).getReferencedInStructures().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsConnectionRealization")) {
			//3xxx
			for (int i = 0; i < ((IfcElectricDistributionPoint) object).getIsConnectionRealization().size(); i++) {
				resultList.add(((IfcElectricDistributionPoint) object).getIsConnectionRealization().get(i));
			}
			 //3EList
		}
		else if (string.equals("ProvidesBoundaries")) {
			//3xxx
			for (int i = 0; i < ((IfcElectricDistributionPoint) object).getProvidesBoundaries().size(); i++) {
				resultList.add(((IfcElectricDistributionPoint) object).getProvidesBoundaries().get(i));
			}
			 //3EList
		}
		else if (string.equals("ContainedInStructure")) {
			//3xxx
			for (int i = 0; i < ((IfcElectricDistributionPoint) object).getContainedInStructure().size(); i++) {
				resultList.add(((IfcElectricDistributionPoint) object).getContainedInStructure().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPorts")) {
			//3xxx
			for (int i = 0; i < ((IfcElectricDistributionPoint) object).getHasPorts().size(); i++) {
				resultList.add(((IfcElectricDistributionPoint) object).getHasPorts().get(i));
			}
			 //3EList
		}
		else if (string.equals("FillsVoids")) {
			//3xxx
			for (int i = 0; i < ((IfcElectricDistributionPoint) object).getFillsVoids().size(); i++) {
				resultList.add(((IfcElectricDistributionPoint) object).getFillsVoids().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedTo")) {
			//3xxx
			for (int i = 0; i < ((IfcElectricDistributionPoint) object).getConnectedTo().size(); i++) {
				resultList.add(((IfcElectricDistributionPoint) object).getConnectedTo().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasCoverings")) {
			//3xxx
			for (int i = 0; i < ((IfcElectricDistributionPoint) object).getHasCoverings().size(); i++) {
				resultList.add(((IfcElectricDistributionPoint) object).getHasCoverings().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasProjections")) {
			//3xxx
			for (int i = 0; i < ((IfcElectricDistributionPoint) object).getHasProjections().size(); i++) {
				resultList.add(((IfcElectricDistributionPoint) object).getHasProjections().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasOpenings")) {
			//3xxx
			for (int i = 0; i < ((IfcElectricDistributionPoint) object).getHasOpenings().size(); i++) {
				resultList.add(((IfcElectricDistributionPoint) object).getHasOpenings().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedFrom")) {
			//3xxx
			for (int i = 0; i < ((IfcElectricDistributionPoint) object).getConnectedFrom().size(); i++) {
				resultList.add(((IfcElectricDistributionPoint) object).getConnectedFrom().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcElectricDistributionPoint) object).getTag());
			 //3String
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcElectricDistributionPoint) object).getObjectPlacement());
			 //3IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcElectricDistributionPoint) object).getRepresentation());
			 //3IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcElectricDistributionPoint) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcElectricDistributionPoint) object).getReferencedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcElectricDistributionPoint) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcElectricDistributionPoint) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcElectricDistributionPoint) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcElectricDistributionPoint) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcElectricDistributionPoint) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcElectricDistributionPoint) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcElectricDistributionPoint) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcElectricDistributionPoint) object).getDecomposes().size(); i++) {
				resultList.add(((IfcElectricDistributionPoint) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcElectricDistributionPoint) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcElectricDistributionPoint) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcElectricDistributionPoint) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcElectricDistributionPoint) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcElectricDistributionPoint) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcElectricDistributionPoint) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcElectricDistributionPoint) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
