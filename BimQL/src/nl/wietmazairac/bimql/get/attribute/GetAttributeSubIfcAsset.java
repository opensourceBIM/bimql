package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcAsset;

public class GetAttributeSubIfcAsset {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcAsset(Object object, String string) {
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
		if (string.equals("AssetID")) {
			resultList.add(((IfcAsset) object).getAssetID());
			 //1String
		}
		else if (string.equals("User")) {
			resultList.add(((IfcAsset) object).getUser());
			 //1IfcActorSelect
		}
		else if (string.equals("TotalReplacementCost")) {
			resultList.add(((IfcAsset) object).getTotalReplacementCost());
			 //1IfcCostValue
		}
		else if (string.equals("OriginalValue")) {
			resultList.add(((IfcAsset) object).getOriginalValue());
			 //1IfcCostValue
		}
		else if (string.equals("CurrentValue")) {
			resultList.add(((IfcAsset) object).getCurrentValue());
			 //1IfcCostValue
		}
		else if (string.equals("ResponsiblePerson")) {
			resultList.add(((IfcAsset) object).getResponsiblePerson());
			 //1IfcPerson
		}
		else if (string.equals("IncorporationDate")) {
			resultList.add(((IfcAsset) object).getIncorporationDate());
			 //1IfcCalendarDate
		}
		else if (string.equals("DepreciatedValue")) {
			resultList.add(((IfcAsset) object).getDepreciatedValue());
			 //1IfcCostValue
		}
		else if (string.equals("Owner")) {
			resultList.add(((IfcAsset) object).getOwner());
			 //1IfcActorSelect
		}
		else if (string.equals("IsGroupedBy")) {
			resultList.add(((IfcAsset) object).getIsGroupedBy());
			 //2IfcRelAssignsToGroup
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcAsset) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcAsset) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcAsset) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcAsset) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcAsset) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcAsset) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcAsset) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcAsset) object).getDecomposes().size(); i++) {
				resultList.add(((IfcAsset) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcAsset) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcAsset) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcAsset) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcAsset) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcAsset) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcAsset) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcAsset) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
