package nl.wietmazairac.bimql.set.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class SetAttributeSubIfcApproval {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcApproval() {
	}

	public SetAttributeSubIfcApproval(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("ApprovalDateTime")) {
			//1NoEList
			 //1void
			 //1IfcDateTimeSelect
		}
		else if (attributeName.equals("ApprovalStatus")) {
			//1NoEList
			((IfcApproval) object).setApprovalStatus(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("ApprovalLevel")) {
			//1NoEList
			((IfcApproval) object).setApprovalLevel(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("ApprovalQualifier")) {
			//1NoEList
			((IfcApproval) object).setApprovalQualifier(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("Name")) {
			//1NoEList
			((IfcApproval) object).setName(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("Description")) {
			//1NoEList
			((IfcApproval) object).setDescription(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("Identifier")) {
			//1NoEList
			((IfcApproval) object).setIdentifier(attributeNewValue);
			 //1void
			 //1String
		}
	}
}
