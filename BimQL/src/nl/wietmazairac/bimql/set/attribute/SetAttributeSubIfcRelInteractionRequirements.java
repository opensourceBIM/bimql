package nl.wietmazairac.bimql.set.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class SetAttributeSubIfcRelInteractionRequirements {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcRelInteractionRequirements() {
	}

	public SetAttributeSubIfcRelInteractionRequirements(Object object, String attributeName, String attributeNewValue) {
		this.object = object;
		this.attributeName = attributeName;
		this.attributeNewValue = attributeNewValue;
	}

	// methods
	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public String getAttributeName() {
		return attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	public String getAttributeNewValue() {
		return attributeNewValue;
	}

	public void setAttributeNewValue(String attributeNewValue) {
		this.attributeNewValue = attributeNewValue;
	}

	public void setAttribute() {
		if (attributeName.equals("DailyInteraction")) {
			//1NoEList
			((IfcRelInteractionRequirements) object).setDailyInteraction(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("DailyInteractionAsString")) {
			//1NoEList
			((IfcRelInteractionRequirements) object).setDailyInteractionAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("ImportanceRatingAsString")) {
			//1NoEList
			((IfcRelInteractionRequirements) object).setImportanceRatingAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("LocationOfInteraction")) {
			//1NoEList
			 //1void
			 //1IfcSpatialStructureElement
		}
		else if (attributeName.equals("RelatedSpaceProgram")) {
			//1NoEList
			 //1void
			 //1IfcSpaceProgram
		}
		else if (attributeName.equals("RelatingSpaceProgram")) {
			//1NoEList
			 //1void
			 //1IfcSpaceProgram
		}
		else if (attributeName.equals("ImportanceRating")) {
			//1NoEList
			((IfcRelInteractionRequirements) object).setImportanceRating(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("GlobalId")) {
			//5NoEList
			 //5void
			 //5IfcGloballyUniqueId
		}
		else if (attributeName.equals("OwnerHistory")) {
			//5NoEList
			 //5void
			 //5IfcOwnerHistory
		}
		else if (attributeName.equals("Name")) {
			//5NoEList
			((IfcRelInteractionRequirements) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("Description")) {
			//5NoEList
			((IfcRelInteractionRequirements) object).setDescription(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
