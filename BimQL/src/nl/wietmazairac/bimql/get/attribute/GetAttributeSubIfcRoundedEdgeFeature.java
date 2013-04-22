package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcRoundedEdgeFeature;

public class GetAttributeSubIfcRoundedEdgeFeature {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcRoundedEdgeFeature(Object object, String string) {
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
		if (string.equals("RadiusAsString")) {
			resultList.add(((IfcRoundedEdgeFeature) object).getRadiusAsString());
			 //1String
		}
		else if (string.equals("Radius")) {
			resultList.add(((IfcRoundedEdgeFeature) object).getRadius());
			 //1double
		}
		else if (string.equals("FeatureLength")) {
			resultList.add(((IfcRoundedEdgeFeature) object).getFeatureLength());
			 //2double
		}
		else if (string.equals("FeatureLengthAsString")) {
			resultList.add(((IfcRoundedEdgeFeature) object).getFeatureLengthAsString());
			 //2String
		}
		else if (string.equals("VoidsElements")) {
			resultList.add(((IfcRoundedEdgeFeature) object).getVoidsElements());
			 //3IfcRelVoidsElement
		}
		else if (string.equals("HasStructuralMember")) {
			//3xxx
			for (int i = 0; i < ((IfcRoundedEdgeFeature) object).getHasStructuralMember().size(); i++) {
				resultList.add(((IfcRoundedEdgeFeature) object).getHasStructuralMember().get(i));
			}
			 //3EList
		}
		else if (string.equals("ReferencedInStructures")) {
			//3xxx
			for (int i = 0; i < ((IfcRoundedEdgeFeature) object).getReferencedInStructures().size(); i++) {
				resultList.add(((IfcRoundedEdgeFeature) object).getReferencedInStructures().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsConnectionRealization")) {
			//3xxx
			for (int i = 0; i < ((IfcRoundedEdgeFeature) object).getIsConnectionRealization().size(); i++) {
				resultList.add(((IfcRoundedEdgeFeature) object).getIsConnectionRealization().get(i));
			}
			 //3EList
		}
		else if (string.equals("ProvidesBoundaries")) {
			//3xxx
			for (int i = 0; i < ((IfcRoundedEdgeFeature) object).getProvidesBoundaries().size(); i++) {
				resultList.add(((IfcRoundedEdgeFeature) object).getProvidesBoundaries().get(i));
			}
			 //3EList
		}
		else if (string.equals("ContainedInStructure")) {
			//3xxx
			for (int i = 0; i < ((IfcRoundedEdgeFeature) object).getContainedInStructure().size(); i++) {
				resultList.add(((IfcRoundedEdgeFeature) object).getContainedInStructure().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPorts")) {
			//3xxx
			for (int i = 0; i < ((IfcRoundedEdgeFeature) object).getHasPorts().size(); i++) {
				resultList.add(((IfcRoundedEdgeFeature) object).getHasPorts().get(i));
			}
			 //3EList
		}
		else if (string.equals("FillsVoids")) {
			//3xxx
			for (int i = 0; i < ((IfcRoundedEdgeFeature) object).getFillsVoids().size(); i++) {
				resultList.add(((IfcRoundedEdgeFeature) object).getFillsVoids().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedTo")) {
			//3xxx
			for (int i = 0; i < ((IfcRoundedEdgeFeature) object).getConnectedTo().size(); i++) {
				resultList.add(((IfcRoundedEdgeFeature) object).getConnectedTo().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasCoverings")) {
			//3xxx
			for (int i = 0; i < ((IfcRoundedEdgeFeature) object).getHasCoverings().size(); i++) {
				resultList.add(((IfcRoundedEdgeFeature) object).getHasCoverings().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasProjections")) {
			//3xxx
			for (int i = 0; i < ((IfcRoundedEdgeFeature) object).getHasProjections().size(); i++) {
				resultList.add(((IfcRoundedEdgeFeature) object).getHasProjections().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasOpenings")) {
			//3xxx
			for (int i = 0; i < ((IfcRoundedEdgeFeature) object).getHasOpenings().size(); i++) {
				resultList.add(((IfcRoundedEdgeFeature) object).getHasOpenings().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedFrom")) {
			//3xxx
			for (int i = 0; i < ((IfcRoundedEdgeFeature) object).getConnectedFrom().size(); i++) {
				resultList.add(((IfcRoundedEdgeFeature) object).getConnectedFrom().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcRoundedEdgeFeature) object).getTag());
			 //3String
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcRoundedEdgeFeature) object).getObjectPlacement());
			 //3IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcRoundedEdgeFeature) object).getRepresentation());
			 //3IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcRoundedEdgeFeature) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcRoundedEdgeFeature) object).getReferencedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcRoundedEdgeFeature) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcRoundedEdgeFeature) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcRoundedEdgeFeature) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcRoundedEdgeFeature) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcRoundedEdgeFeature) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcRoundedEdgeFeature) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcRoundedEdgeFeature) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcRoundedEdgeFeature) object).getDecomposes().size(); i++) {
				resultList.add(((IfcRoundedEdgeFeature) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcRoundedEdgeFeature) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcRoundedEdgeFeature) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcRoundedEdgeFeature) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcRoundedEdgeFeature) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcRoundedEdgeFeature) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcRoundedEdgeFeature) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcRoundedEdgeFeature) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
