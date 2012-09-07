package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcConstraint {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcConstraint(Object object, String string) {
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
		if (string.equals("IsRelatedWith")) {
			//3xxx
			for (int i = 0; i < ((IfcConstraint) object).getIsRelatedWith().size(); i++) {
				resultList.add(((IfcConstraint) object).getIsRelatedWith().get(i));
			}
			 //1EList
		}
		else if (string.equals("ConstraintGrade")) {
			resultList.add(((IfcConstraint) object).getConstraintGrade());
			 //1IfcConstraintEnum
		}
		else if (string.equals("ConstraintSource")) {
			resultList.add(((IfcConstraint) object).getConstraintSource());
			 //1String
		}
		else if (string.equals("CreatingActor")) {
			resultList.add(((IfcConstraint) object).getCreatingActor());
			 //1IfcActorSelect
		}
		else if (string.equals("CreationTime")) {
			resultList.add(((IfcConstraint) object).getCreationTime());
			 //1IfcDateTimeSelect
		}
		else if (string.equals("UserDefinedGrade")) {
			resultList.add(((IfcConstraint) object).getUserDefinedGrade());
			 //1String
		}
		else if (string.equals("ClassifiedAs")) {
			//3xxx
			for (int i = 0; i < ((IfcConstraint) object).getClassifiedAs().size(); i++) {
				resultList.add(((IfcConstraint) object).getClassifiedAs().get(i));
			}
			 //1EList
		}
		else if (string.equals("Aggregates")) {
			//3xxx
			for (int i = 0; i < ((IfcConstraint) object).getAggregates().size(); i++) {
				resultList.add(((IfcConstraint) object).getAggregates().get(i));
			}
			 //1EList
		}
		else if (string.equals("IsAggregatedIn")) {
			//3xxx
			for (int i = 0; i < ((IfcConstraint) object).getIsAggregatedIn().size(); i++) {
				resultList.add(((IfcConstraint) object).getIsAggregatedIn().get(i));
			}
			 //1EList
		}
		else if (string.equals("RelatesConstraints")) {
			//3xxx
			for (int i = 0; i < ((IfcConstraint) object).getRelatesConstraints().size(); i++) {
				resultList.add(((IfcConstraint) object).getRelatesConstraints().get(i));
			}
			 //1EList
		}
		else if (string.equals("PropertiesForConstraint")) {
			//3xxx
			for (int i = 0; i < ((IfcConstraint) object).getPropertiesForConstraint().size(); i++) {
				resultList.add(((IfcConstraint) object).getPropertiesForConstraint().get(i));
			}
			 //1EList
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcConstraint) object).getName());
			 //1String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcConstraint) object).getDescription());
			 //1String
		}
		return resultList;
	}
}
