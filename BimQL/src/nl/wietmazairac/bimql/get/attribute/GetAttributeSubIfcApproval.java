package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcApproval;

public class GetAttributeSubIfcApproval {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcApproval(Object object, String string) {
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
		if (string.equals("Actors")) {
			//3xxx
			for (int i = 0; i < ((IfcApproval) object).getActors().size(); i++) {
				resultList.add(((IfcApproval) object).getActors().get(i));
			}
			 //1EList
		}
		else if (string.equals("ApprovalDateTime")) {
			resultList.add(((IfcApproval) object).getApprovalDateTime());
			 //1IfcDateTimeSelect
		}
		else if (string.equals("ApprovalStatus")) {
			resultList.add(((IfcApproval) object).getApprovalStatus());
			 //1String
		}
		else if (string.equals("ApprovalLevel")) {
			resultList.add(((IfcApproval) object).getApprovalLevel());
			 //1String
		}
		else if (string.equals("ApprovalQualifier")) {
			resultList.add(((IfcApproval) object).getApprovalQualifier());
			 //1String
		}
		else if (string.equals("IsRelatedWith")) {
			//3xxx
			for (int i = 0; i < ((IfcApproval) object).getIsRelatedWith().size(); i++) {
				resultList.add(((IfcApproval) object).getIsRelatedWith().get(i));
			}
			 //1EList
		}
		else if (string.equals("Relates")) {
			//3xxx
			for (int i = 0; i < ((IfcApproval) object).getRelates().size(); i++) {
				resultList.add(((IfcApproval) object).getRelates().get(i));
			}
			 //1EList
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcApproval) object).getName());
			 //1String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcApproval) object).getDescription());
			 //1String
		}
		else if (string.equals("Identifier")) {
			resultList.add(((IfcApproval) object).getIdentifier());
			 //1String
		}
		return resultList;
	}
}
