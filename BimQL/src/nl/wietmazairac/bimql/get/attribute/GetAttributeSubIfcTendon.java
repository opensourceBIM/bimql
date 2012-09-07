package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcTendon {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcTendon(Object object, String string) {
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
		if (string.equals("NominalDiameterAsString")) {
			resultList.add(((IfcTendon) object).getNominalDiameterAsString());
			 //1String
		}
		else if (string.equals("CrossSectionAreaAsString")) {
			resultList.add(((IfcTendon) object).getCrossSectionAreaAsString());
			 //1String
		}
		else if (string.equals("NominalDiameter")) {
			resultList.add(((IfcTendon) object).getNominalDiameter());
			 //1double
		}
		else if (string.equals("CrossSectionArea")) {
			resultList.add(((IfcTendon) object).getCrossSectionArea());
			 //1double
		}
		else if (string.equals("FrictionCoefficientAsString")) {
			resultList.add(((IfcTendon) object).getFrictionCoefficientAsString());
			 //1String
		}
		else if (string.equals("MinCurvatureRadiusAsString")) {
			resultList.add(((IfcTendon) object).getMinCurvatureRadiusAsString());
			 //1String
		}
		else if (string.equals("TensionForce")) {
			resultList.add(((IfcTendon) object).getTensionForce());
			 //1double
		}
		else if (string.equals("PreStressAsString")) {
			resultList.add(((IfcTendon) object).getPreStressAsString());
			 //1String
		}
		else if (string.equals("AnchorageSlip")) {
			resultList.add(((IfcTendon) object).getAnchorageSlip());
			 //1double
		}
		else if (string.equals("TensionForceAsString")) {
			resultList.add(((IfcTendon) object).getTensionForceAsString());
			 //1String
		}
		else if (string.equals("FrictionCoefficient")) {
			resultList.add(((IfcTendon) object).getFrictionCoefficient());
			 //1double
		}
		else if (string.equals("AnchorageSlipAsString")) {
			resultList.add(((IfcTendon) object).getAnchorageSlipAsString());
			 //1String
		}
		else if (string.equals("MinCurvatureRadius")) {
			resultList.add(((IfcTendon) object).getMinCurvatureRadius());
			 //1double
		}
		else if (string.equals("PreStress")) {
			resultList.add(((IfcTendon) object).getPreStress());
			 //1double
		}
		else if (string.equals("PredefinedType")) {
			resultList.add(((IfcTendon) object).getPredefinedType());
			 //1IfcTendonTypeEnum
		}
		else if (string.equals("SteelGrade")) {
			resultList.add(((IfcTendon) object).getSteelGrade());
			 //2String
		}
		else if (string.equals("HasStructuralMember")) {
			//3xxx
			for (int i = 0; i < ((IfcTendon) object).getHasStructuralMember().size(); i++) {
				resultList.add(((IfcTendon) object).getHasStructuralMember().get(i));
			}
			 //3EList
		}
		else if (string.equals("ReferencedInStructures")) {
			//3xxx
			for (int i = 0; i < ((IfcTendon) object).getReferencedInStructures().size(); i++) {
				resultList.add(((IfcTendon) object).getReferencedInStructures().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsConnectionRealization")) {
			//3xxx
			for (int i = 0; i < ((IfcTendon) object).getIsConnectionRealization().size(); i++) {
				resultList.add(((IfcTendon) object).getIsConnectionRealization().get(i));
			}
			 //3EList
		}
		else if (string.equals("ProvidesBoundaries")) {
			//3xxx
			for (int i = 0; i < ((IfcTendon) object).getProvidesBoundaries().size(); i++) {
				resultList.add(((IfcTendon) object).getProvidesBoundaries().get(i));
			}
			 //3EList
		}
		else if (string.equals("ContainedInStructure")) {
			//3xxx
			for (int i = 0; i < ((IfcTendon) object).getContainedInStructure().size(); i++) {
				resultList.add(((IfcTendon) object).getContainedInStructure().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPorts")) {
			//3xxx
			for (int i = 0; i < ((IfcTendon) object).getHasPorts().size(); i++) {
				resultList.add(((IfcTendon) object).getHasPorts().get(i));
			}
			 //3EList
		}
		else if (string.equals("FillsVoids")) {
			//3xxx
			for (int i = 0; i < ((IfcTendon) object).getFillsVoids().size(); i++) {
				resultList.add(((IfcTendon) object).getFillsVoids().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedTo")) {
			//3xxx
			for (int i = 0; i < ((IfcTendon) object).getConnectedTo().size(); i++) {
				resultList.add(((IfcTendon) object).getConnectedTo().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasCoverings")) {
			//3xxx
			for (int i = 0; i < ((IfcTendon) object).getHasCoverings().size(); i++) {
				resultList.add(((IfcTendon) object).getHasCoverings().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasProjections")) {
			//3xxx
			for (int i = 0; i < ((IfcTendon) object).getHasProjections().size(); i++) {
				resultList.add(((IfcTendon) object).getHasProjections().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasOpenings")) {
			//3xxx
			for (int i = 0; i < ((IfcTendon) object).getHasOpenings().size(); i++) {
				resultList.add(((IfcTendon) object).getHasOpenings().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedFrom")) {
			//3xxx
			for (int i = 0; i < ((IfcTendon) object).getConnectedFrom().size(); i++) {
				resultList.add(((IfcTendon) object).getConnectedFrom().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcTendon) object).getTag());
			 //3String
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcTendon) object).getObjectPlacement());
			 //3IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcTendon) object).getRepresentation());
			 //3IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcTendon) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcTendon) object).getReferencedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcTendon) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcTendon) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcTendon) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcTendon) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcTendon) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcTendon) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcTendon) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcTendon) object).getDecomposes().size(); i++) {
				resultList.add(((IfcTendon) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcTendon) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcTendon) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcTendon) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcTendon) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcTendon) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcTendon) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcTendon) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
