package nl.wietmazairac.bimql.set.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class SetAttributeSubIfcConstraint {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcConstraint() {
	}

	public SetAttributeSubIfcConstraint(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("ConstraintGrade")) {
			//1NoEList
			 //1void
			 //1IfcConstraintEnum
		}
		else if (attributeName.equals("ConstraintSource")) {
			//1NoEList
			((IfcConstraint) object).setConstraintSource(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("CreatingActor")) {
			//1NoEList
			 //1void
			 //1IfcActorSelect
		}
		else if (attributeName.equals("CreationTime")) {
			//1NoEList
			 //1void
			 //1IfcDateTimeSelect
		}
		else if (attributeName.equals("UserDefinedGrade")) {
			//1NoEList
			((IfcConstraint) object).setUserDefinedGrade(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("Name")) {
			//1NoEList
			((IfcConstraint) object).setName(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("Description")) {
			//1NoEList
			((IfcConstraint) object).setDescription(attributeNewValue);
			 //1void
			 //1String
		}
	}
}
