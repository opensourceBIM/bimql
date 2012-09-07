package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcMotorConnectionType {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcMotorConnectionType(Object object, String string) {
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
		if (string.equals("PredefinedType")) {
			resultList.add(((IfcMotorConnectionType) object).getPredefinedType());
			 //1IfcMotorConnectionTypeEnum
		}
		else if (string.equals("ElementType")) {
			resultList.add(((IfcMotorConnectionType) object).getElementType());
			 //3String
		}
		else if (string.equals("RepresentationMaps")) {
			//3xxx
			for (int i = 0; i < ((IfcMotorConnectionType) object).getRepresentationMaps().size(); i++) {
				resultList.add(((IfcMotorConnectionType) object).getRepresentationMaps().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcMotorConnectionType) object).getTag());
			 //3String
		}
		else if (string.equals("ApplicableOccurrence")) {
			resultList.add(((IfcMotorConnectionType) object).getApplicableOccurrence());
			 //3String
		}
		else if (string.equals("ObjectTypeOf")) {
			//3xxx
			for (int i = 0; i < ((IfcMotorConnectionType) object).getObjectTypeOf().size(); i++) {
				resultList.add(((IfcMotorConnectionType) object).getObjectTypeOf().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPropertySets")) {
			//3xxx
			for (int i = 0; i < ((IfcMotorConnectionType) object).getHasPropertySets().size(); i++) {
				resultList.add(((IfcMotorConnectionType) object).getHasPropertySets().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcMotorConnectionType) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcMotorConnectionType) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcMotorConnectionType) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcMotorConnectionType) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcMotorConnectionType) object).getDecomposes().size(); i++) {
				resultList.add(((IfcMotorConnectionType) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcMotorConnectionType) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcMotorConnectionType) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcMotorConnectionType) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcMotorConnectionType) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcMotorConnectionType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcMotorConnectionType) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcMotorConnectionType) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
