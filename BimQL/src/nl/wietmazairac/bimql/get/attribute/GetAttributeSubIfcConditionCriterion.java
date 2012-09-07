package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcConditionCriterion {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcConditionCriterion(Object object, String string) {
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
		if (string.equals("Criterion")) {
			resultList.add(((IfcConditionCriterion) object).getCriterion());
			 //1IfcConditionCriterionSelect
		}
		else if (string.equals("CriterionDateTime")) {
			resultList.add(((IfcConditionCriterion) object).getCriterionDateTime());
			 //1IfcDateTimeSelect
		}
		else if (string.equals("Controls")) {
			//3xxx
			for (int i = 0; i < ((IfcConditionCriterion) object).getControls().size(); i++) {
				resultList.add(((IfcConditionCriterion) object).getControls().get(i));
			}
			 //2EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcConditionCriterion) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcConditionCriterion) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcConditionCriterion) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcConditionCriterion) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcConditionCriterion) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcConditionCriterion) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcConditionCriterion) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcConditionCriterion) object).getDecomposes().size(); i++) {
				resultList.add(((IfcConditionCriterion) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcConditionCriterion) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcConditionCriterion) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcConditionCriterion) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcConditionCriterion) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcConditionCriterion) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcConditionCriterion) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcConditionCriterion) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
