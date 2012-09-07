package nl.wietmazairac.bimql.set.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class SetAttributeSubIfcMove {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcMove() {
	}

	public SetAttributeSubIfcMove(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("MoveFrom")) {
			//1NoEList
			 //1void
			 //1IfcSpatialStructureElement
		}
		else if (attributeName.equals("MoveTo")) {
			//1NoEList
			 //1void
			 //1IfcSpatialStructureElement
		}
		else if (attributeName.equals("WorkMethod")) {
			//2NoEList
			((IfcMove) object).setWorkMethod(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("IsMilestone")) {
			//2NoEList
			 //2void
			 //2Tristate
		}
		else if (attributeName.equals("TaskId")) {
			//2NoEList
			((IfcMove) object).setTaskId(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("Priority")) {
			//2NoEList
			 //2void
			 //2int
		}
		else if (attributeName.equals("Status")) {
			//2NoEList
			((IfcMove) object).setStatus(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("ObjectType")) {
			//5NoEList
			((IfcMove) object).setObjectType(attributeNewValue);
			 //5void
			 //5String
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
			((IfcMove) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("Description")) {
			//5NoEList
			((IfcMove) object).setDescription(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
