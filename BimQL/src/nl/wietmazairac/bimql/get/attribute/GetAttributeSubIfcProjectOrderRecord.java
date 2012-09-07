package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcProjectOrderRecord {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcProjectOrderRecord(Object object, String string) {
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
		if (string.equals("Records")) {
			//3xxx
			for (int i = 0; i < ((IfcProjectOrderRecord) object).getRecords().size(); i++) {
				resultList.add(((IfcProjectOrderRecord) object).getRecords().get(i));
			}
			 //1EList
		}
		else if (string.equals("PredefinedType")) {
			resultList.add(((IfcProjectOrderRecord) object).getPredefinedType());
			 //1IfcProjectOrderRecordTypeEnum
		}
		else if (string.equals("Controls")) {
			//3xxx
			for (int i = 0; i < ((IfcProjectOrderRecord) object).getControls().size(); i++) {
				resultList.add(((IfcProjectOrderRecord) object).getControls().get(i));
			}
			 //2EList
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcProjectOrderRecord) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcProjectOrderRecord) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcProjectOrderRecord) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcProjectOrderRecord) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcProjectOrderRecord) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcProjectOrderRecord) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcProjectOrderRecord) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcProjectOrderRecord) object).getDecomposes().size(); i++) {
				resultList.add(((IfcProjectOrderRecord) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcProjectOrderRecord) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcProjectOrderRecord) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcProjectOrderRecord) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcProjectOrderRecord) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcProjectOrderRecord) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcProjectOrderRecord) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcProjectOrderRecord) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
