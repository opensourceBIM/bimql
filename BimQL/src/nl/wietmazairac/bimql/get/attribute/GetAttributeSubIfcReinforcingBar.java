package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcReinforcingBar {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcReinforcingBar(Object object, String string) {
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
			resultList.add(((IfcReinforcingBar) object).getNominalDiameterAsString());
			 //1String
		}
		else if (string.equals("CrossSectionAreaAsString")) {
			resultList.add(((IfcReinforcingBar) object).getCrossSectionAreaAsString());
			 //1String
		}
		else if (string.equals("NominalDiameter")) {
			resultList.add(((IfcReinforcingBar) object).getNominalDiameter());
			 //1double
		}
		else if (string.equals("CrossSectionArea")) {
			resultList.add(((IfcReinforcingBar) object).getCrossSectionArea());
			 //1double
		}
		else if (string.equals("BarSurface")) {
			resultList.add(((IfcReinforcingBar) object).getBarSurface());
			 //1IfcReinforcingBarSurfaceEnum
		}
		else if (string.equals("BarLength")) {
			resultList.add(((IfcReinforcingBar) object).getBarLength());
			 //1double
		}
		else if (string.equals("BarRole")) {
			resultList.add(((IfcReinforcingBar) object).getBarRole());
			 //1IfcReinforcingBarRoleEnum
		}
		else if (string.equals("BarLengthAsString")) {
			resultList.add(((IfcReinforcingBar) object).getBarLengthAsString());
			 //1String
		}
		else if (string.equals("SteelGrade")) {
			resultList.add(((IfcReinforcingBar) object).getSteelGrade());
			 //2String
		}
		else if (string.equals("HasStructuralMember")) {
			//3xxx
			for (int i = 0; i < ((IfcReinforcingBar) object).getHasStructuralMember().size(); i++) {
				resultList.add(((IfcReinforcingBar) object).getHasStructuralMember().get(i));
			}
			 //3EList
		}
		else if (string.equals("ReferencedInStructures")) {
			//3xxx
			for (int i = 0; i < ((IfcReinforcingBar) object).getReferencedInStructures().size(); i++) {
				resultList.add(((IfcReinforcingBar) object).getReferencedInStructures().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsConnectionRealization")) {
			//3xxx
			for (int i = 0; i < ((IfcReinforcingBar) object).getIsConnectionRealization().size(); i++) {
				resultList.add(((IfcReinforcingBar) object).getIsConnectionRealization().get(i));
			}
			 //3EList
		}
		else if (string.equals("ProvidesBoundaries")) {
			//3xxx
			for (int i = 0; i < ((IfcReinforcingBar) object).getProvidesBoundaries().size(); i++) {
				resultList.add(((IfcReinforcingBar) object).getProvidesBoundaries().get(i));
			}
			 //3EList
		}
		else if (string.equals("ContainedInStructure")) {
			//3xxx
			for (int i = 0; i < ((IfcReinforcingBar) object).getContainedInStructure().size(); i++) {
				resultList.add(((IfcReinforcingBar) object).getContainedInStructure().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPorts")) {
			//3xxx
			for (int i = 0; i < ((IfcReinforcingBar) object).getHasPorts().size(); i++) {
				resultList.add(((IfcReinforcingBar) object).getHasPorts().get(i));
			}
			 //3EList
		}
		else if (string.equals("FillsVoids")) {
			//3xxx
			for (int i = 0; i < ((IfcReinforcingBar) object).getFillsVoids().size(); i++) {
				resultList.add(((IfcReinforcingBar) object).getFillsVoids().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedTo")) {
			//3xxx
			for (int i = 0; i < ((IfcReinforcingBar) object).getConnectedTo().size(); i++) {
				resultList.add(((IfcReinforcingBar) object).getConnectedTo().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasCoverings")) {
			//3xxx
			for (int i = 0; i < ((IfcReinforcingBar) object).getHasCoverings().size(); i++) {
				resultList.add(((IfcReinforcingBar) object).getHasCoverings().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasProjections")) {
			//3xxx
			for (int i = 0; i < ((IfcReinforcingBar) object).getHasProjections().size(); i++) {
				resultList.add(((IfcReinforcingBar) object).getHasProjections().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasOpenings")) {
			//3xxx
			for (int i = 0; i < ((IfcReinforcingBar) object).getHasOpenings().size(); i++) {
				resultList.add(((IfcReinforcingBar) object).getHasOpenings().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedFrom")) {
			//3xxx
			for (int i = 0; i < ((IfcReinforcingBar) object).getConnectedFrom().size(); i++) {
				resultList.add(((IfcReinforcingBar) object).getConnectedFrom().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcReinforcingBar) object).getTag());
			 //3String
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcReinforcingBar) object).getObjectPlacement());
			 //3IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcReinforcingBar) object).getRepresentation());
			 //3IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcReinforcingBar) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcReinforcingBar) object).getReferencedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcReinforcingBar) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcReinforcingBar) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcReinforcingBar) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcReinforcingBar) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcReinforcingBar) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcReinforcingBar) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcReinforcingBar) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcReinforcingBar) object).getDecomposes().size(); i++) {
				resultList.add(((IfcReinforcingBar) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcReinforcingBar) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcReinforcingBar) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcReinforcingBar) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcReinforcingBar) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcReinforcingBar) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcReinforcingBar) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcReinforcingBar) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
