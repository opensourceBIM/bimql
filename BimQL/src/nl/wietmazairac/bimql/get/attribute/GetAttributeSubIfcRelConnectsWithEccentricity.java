package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcRelConnectsWithEccentricity {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcRelConnectsWithEccentricity(Object object, String string) {
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
		if (string.equals("ConnectionConstraint")) {
			resultList.add(((IfcRelConnectsWithEccentricity) object).getConnectionConstraint());
			 //1IfcConnectionGeometry
		}
		else if (string.equals("RelatingStructuralMember")) {
			resultList.add(((IfcRelConnectsWithEccentricity) object).getRelatingStructuralMember());
			 //2IfcStructuralMember
		}
		else if (string.equals("AdditionalConditions")) {
			resultList.add(((IfcRelConnectsWithEccentricity) object).getAdditionalConditions());
			 //2IfcStructuralConnectionCondition
		}
		else if (string.equals("SupportedLengthAsString")) {
			resultList.add(((IfcRelConnectsWithEccentricity) object).getSupportedLengthAsString());
			 //2String
		}
		else if (string.equals("ConditionCoordinateSystem")) {
			resultList.add(((IfcRelConnectsWithEccentricity) object).getConditionCoordinateSystem());
			 //2IfcAxis2Placement3D
		}
		else if (string.equals("RelatedStructuralConnection")) {
			resultList.add(((IfcRelConnectsWithEccentricity) object).getRelatedStructuralConnection());
			 //2IfcStructuralConnection
		}
		else if (string.equals("AppliedCondition")) {
			resultList.add(((IfcRelConnectsWithEccentricity) object).getAppliedCondition());
			 //2IfcBoundaryCondition
		}
		else if (string.equals("SupportedLength")) {
			resultList.add(((IfcRelConnectsWithEccentricity) object).getSupportedLength());
			 //2double
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcRelConnectsWithEccentricity) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcRelConnectsWithEccentricity) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcRelConnectsWithEccentricity) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcRelConnectsWithEccentricity) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcRelConnectsWithEccentricity) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
