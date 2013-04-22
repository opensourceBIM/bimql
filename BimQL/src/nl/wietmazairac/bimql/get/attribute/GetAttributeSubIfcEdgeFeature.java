package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcEdgeFeature;

public class GetAttributeSubIfcEdgeFeature {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcEdgeFeature(Object object, String string) {
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
		if (string.equals("FeatureLength")) {
			resultList.add(((IfcEdgeFeature) object).getFeatureLength());
			 //1double
		}
		else if (string.equals("FeatureLengthAsString")) {
			resultList.add(((IfcEdgeFeature) object).getFeatureLengthAsString());
			 //1String
		}
		else if (string.equals("VoidsElements")) {
			resultList.add(((IfcEdgeFeature) object).getVoidsElements());
			 //2IfcRelVoidsElement
		}
		else if (string.equals("HasStructuralMember")) {
			//3xxx
			for (int i = 0; i < ((IfcEdgeFeature) object).getHasStructuralMember().size(); i++) {
				resultList.add(((IfcEdgeFeature) object).getHasStructuralMember().get(i));
			}
			 //3EList
		}
		else if (string.equals("ReferencedInStructures")) {
			//3xxx
			for (int i = 0; i < ((IfcEdgeFeature) object).getReferencedInStructures().size(); i++) {
				resultList.add(((IfcEdgeFeature) object).getReferencedInStructures().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsConnectionRealization")) {
			//3xxx
			for (int i = 0; i < ((IfcEdgeFeature) object).getIsConnectionRealization().size(); i++) {
				resultList.add(((IfcEdgeFeature) object).getIsConnectionRealization().get(i));
			}
			 //3EList
		}
		else if (string.equals("ProvidesBoundaries")) {
			//3xxx
			for (int i = 0; i < ((IfcEdgeFeature) object).getProvidesBoundaries().size(); i++) {
				resultList.add(((IfcEdgeFeature) object).getProvidesBoundaries().get(i));
			}
			 //3EList
		}
		else if (string.equals("ContainedInStructure")) {
			//3xxx
			for (int i = 0; i < ((IfcEdgeFeature) object).getContainedInStructure().size(); i++) {
				resultList.add(((IfcEdgeFeature) object).getContainedInStructure().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPorts")) {
			//3xxx
			for (int i = 0; i < ((IfcEdgeFeature) object).getHasPorts().size(); i++) {
				resultList.add(((IfcEdgeFeature) object).getHasPorts().get(i));
			}
			 //3EList
		}
		else if (string.equals("FillsVoids")) {
			//3xxx
			for (int i = 0; i < ((IfcEdgeFeature) object).getFillsVoids().size(); i++) {
				resultList.add(((IfcEdgeFeature) object).getFillsVoids().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedTo")) {
			//3xxx
			for (int i = 0; i < ((IfcEdgeFeature) object).getConnectedTo().size(); i++) {
				resultList.add(((IfcEdgeFeature) object).getConnectedTo().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasCoverings")) {
			//3xxx
			for (int i = 0; i < ((IfcEdgeFeature) object).getHasCoverings().size(); i++) {
				resultList.add(((IfcEdgeFeature) object).getHasCoverings().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasProjections")) {
			//3xxx
			for (int i = 0; i < ((IfcEdgeFeature) object).getHasProjections().size(); i++) {
				resultList.add(((IfcEdgeFeature) object).getHasProjections().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasOpenings")) {
			//3xxx
			for (int i = 0; i < ((IfcEdgeFeature) object).getHasOpenings().size(); i++) {
				resultList.add(((IfcEdgeFeature) object).getHasOpenings().get(i));
			}
			 //3EList
		}
		else if (string.equals("ConnectedFrom")) {
			//3xxx
			for (int i = 0; i < ((IfcEdgeFeature) object).getConnectedFrom().size(); i++) {
				resultList.add(((IfcEdgeFeature) object).getConnectedFrom().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcEdgeFeature) object).getTag());
			 //3String
		}
		else if (string.equals("ObjectPlacement")) {
			resultList.add(((IfcEdgeFeature) object).getObjectPlacement());
			 //3IfcObjectPlacement
		}
		else if (string.equals("Representation")) {
			resultList.add(((IfcEdgeFeature) object).getRepresentation());
			 //3IfcProductRepresentation
		}
		else if (string.equals("ReferencedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcEdgeFeature) object).getReferencedBy().size(); i++) {
				resultList.add(((IfcEdgeFeature) object).getReferencedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcEdgeFeature) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcEdgeFeature) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcEdgeFeature) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcEdgeFeature) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcEdgeFeature) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcEdgeFeature) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcEdgeFeature) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcEdgeFeature) object).getDecomposes().size(); i++) {
				resultList.add(((IfcEdgeFeature) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcEdgeFeature) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcEdgeFeature) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcEdgeFeature) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcEdgeFeature) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcEdgeFeature) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcEdgeFeature) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcEdgeFeature) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
