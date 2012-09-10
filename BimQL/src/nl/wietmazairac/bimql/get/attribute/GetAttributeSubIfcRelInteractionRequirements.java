package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcRelInteractionRequirements;

public class GetAttributeSubIfcRelInteractionRequirements {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcRelInteractionRequirements(Object object, String string) {
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
		if (string.equals("DailyInteractionAsString")) {
			resultList.add(((IfcRelInteractionRequirements) object).getDailyInteractionAsString());
			 //1String
		}
		else if (string.equals("ImportanceRatingAsString")) {
			resultList.add(((IfcRelInteractionRequirements) object).getImportanceRatingAsString());
			 //1String
		}
		else if (string.equals("LocationOfInteraction")) {
			resultList.add(((IfcRelInteractionRequirements) object).getLocationOfInteraction());
			 //1IfcSpatialStructureElement
		}
		else if (string.equals("RelatedSpaceProgram")) {
			resultList.add(((IfcRelInteractionRequirements) object).getRelatedSpaceProgram());
			 //1IfcSpaceProgram
		}
		else if (string.equals("RelatingSpaceProgram")) {
			resultList.add(((IfcRelInteractionRequirements) object).getRelatingSpaceProgram());
			 //1IfcSpaceProgram
		}
		else if (string.equals("DailyInteraction")) {
			resultList.add(((IfcRelInteractionRequirements) object).getDailyInteraction());
			 //1double
		}
		else if (string.equals("ImportanceRating")) {
			resultList.add(((IfcRelInteractionRequirements) object).getImportanceRating());
			 //1double
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcRelInteractionRequirements) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcRelInteractionRequirements) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcRelInteractionRequirements) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcRelInteractionRequirements) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcRelInteractionRequirements) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
