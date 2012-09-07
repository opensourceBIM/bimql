package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcFeatureElementSubtraction {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcFeatureElementSubtraction(Object object, String string) {
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
		if (string.equals("VoidsElements")) {
			resultList.add(((IfcFeatureElementSubtraction) object).getVoidsElements());
			 //1IfcRelVoidsElement
		}
		else if (string.equals("HasStructuralMember")) {
			//3xxx
			for (int i = 0; i < ((IfcFeatureElementSubtraction) object).getHasStructuralMember().size(); i++) {
				resultList.add(((IfcFeatureElementSubtraction) object).getHasStructuralMember().get(i));
			}
			 //3EList
		}
		else if (string.equals("ReferencedInStructures")) {
			//3xxx
			for (int i = 0; i < ((IfcFeatureElementSubtraction) object).getReferencedInStructures().size(); i++) {
				resultList.add(((IfcFeatureElementSubtraction) object).getReferencedInStructures().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsConnectionRealization")) {
			//3xxx
			for (int i = 0; i < ((IfcFeatureElementSubtraction) object).getIsConnectionRealization().size(); i++) {
				resultList.add(((IfcFeatureElementSubtraction) object).getIsConnectionRealization().get(i));
			}
			 //3EList
		}
		else if (string.equals("ProvidesBoundaries")) {
			//3xxx
			for (int i = 0; i < ((IfcFeatureElementSubtraction) object).getProvidesBoundaries().size(); i++) {
				resultList.add(((IfcFeatureElementSubtraction) object).getProvidesBoundaries().get(i));
			}
			 //3EList
		}
		else if (string.equals("ContainedInStructure")) {
			//3xxx
			for (int i = 0; i < ((IfcFeatureElementSubtraction) object).getContainedInStructure().size(); i++) {
				resultList.add(((IfcFeatureElementSubtraction) object).getContainedInStructure().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPorts")) {
			//3xxx
			for (int i = 0; i < ((IfcFeatureElementSubtraction) object).getHasPorts().size(); i++) {
				resultList.add(((IfcFeatureElementSubtraction) object).getHasPorts().get(i));
			}
			 //3EList
		}
		else if (string.equals("FillsVoids")) {
			//3xxx
			for (int i = 0; i < ((IfcFeatureElementSubtraction) object).getFillsVoids().size(); i++) {
				resultList.add(((IfcFeatureElementSubtraction) object).getFillsVoids().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedTo")) {
			//3xxx
			for (int i = 0; i < ((IfcFeatureElementSubtraction) object).getConnectedTo().size(); i++) {
				resultList.add(((IfcFeatureElementSubtraction) object).getConnectedTo().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasCoverings")) {
			//3xxx
			for (int i = 0; i < ((IfcFeatureElementSubtraction) object).getHasCoverings().size(); i++) {
				resultList.add(((IfcFeatureElementSubtraction) object).getHasCoverings().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasProjections")) {
			//3xxx
			for (int i = 0; i < ((IfcFeatureElementSubtraction) object).getHasProjections().size(); i++) {
				resultList.add(((IfcFeatureElementSubtraction) object).getHasProjections().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasOpenings")) {
			//3xxx
			for (int i = 0; i < ((IfcFeatureElementSubtraction) object).getHasOpenings().size(); i++) {
				resultList.add(((IfcFeatureElementSubtraction) object).getHasOpenings().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedFrom")) {
			//3xxx
			for (int i = 0; i < ((IfcFeatureElementSubtraction) object).getConnectedFrom().size(); i++) {
				resultList.add(((IfcFeatureElementSubtraction) object).getConnectedFrom().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcFeatureElementSubtraction) object).getTag());
			 //3String
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcFeatureElementSubtraction) object).getObjectPlacement());
			 //3IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcFeatureElementSubtraction) object).getRepresentation());
			 //3IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcFeatureElementSubtraction) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcFeatureElementSubtraction) object).getReferencedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcFeatureElementSubtraction) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcFeatureElementSubtraction) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcFeatureElementSubtraction) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcFeatureElementSubtraction) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcFeatureElementSubtraction) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcFeatureElementSubtraction) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcFeatureElementSubtraction) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcFeatureElementSubtraction) object).getDecomposes().size(); i++) {
				resultList.add(((IfcFeatureElementSubtraction) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcFeatureElementSubtraction) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcFeatureElementSubtraction) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcFeatureElementSubtraction) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcFeatureElementSubtraction) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcFeatureElementSubtraction) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcFeatureElementSubtraction) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcFeatureElementSubtraction) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
