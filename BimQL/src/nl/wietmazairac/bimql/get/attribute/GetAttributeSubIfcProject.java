package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcProject;

public class GetAttributeSubIfcProject {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcProject(Object object, String string) {
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
		if (string.equals("LongName")) {
			resultList.add(((IfcProject) object).getLongName());
			 //1String
		}
		else if (string.equals("RepresentationContexts")) {
			//3xxx
			for (int i = 0; i < ((IfcProject) object).getRepresentationContexts().size(); i++) {
				resultList.add(((IfcProject) object).getRepresentationContexts().get(i));
			}
			 //1EList
		}
		else if (string.equals("Phase")) {
			resultList.add(((IfcProject) object).getPhase());
			 //1String
		}
		else if (string.equals("UnitsInContext")) {
			resultList.add(((IfcProject) object).getUnitsInContext());
			 //1IfcUnitAssignment
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcProject) object).getObjectType());
			 //2String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcProject) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcProject) object).getIsDefinedBy().get(i));
			}
			 //2EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcProject) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcProject) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcProject) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcProject) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcProject) object).getDecomposes().size(); i++) {
				resultList.add(((IfcProject) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcProject) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcProject) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcProject) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcProject) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcProject) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcProject) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcProject) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
