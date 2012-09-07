package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcDiscreteAccessoryType {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcDiscreteAccessoryType(Object object, String string) {
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
		if (string.equals("ElementType")) {
			resultList.add(((IfcDiscreteAccessoryType) object).getElementType());
			 //3String
		}
		else if (string.equals("RepresentationMaps")) {
			//3xxx
			for (int i = 0; i < ((IfcDiscreteAccessoryType) object).getRepresentationMaps().size(); i++) {
				resultList.add(((IfcDiscreteAccessoryType) object).getRepresentationMaps().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcDiscreteAccessoryType) object).getTag());
			 //3String
		}
		else if (string.equals("ApplicableOccurrence")) {
			resultList.add(((IfcDiscreteAccessoryType) object).getApplicableOccurrence());
			 //3String
		}
		else if (string.equals("ObjectTypeOf")) {
			//3xxx
			for (int i = 0; i < ((IfcDiscreteAccessoryType) object).getObjectTypeOf().size(); i++) {
				resultList.add(((IfcDiscreteAccessoryType) object).getObjectTypeOf().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPropertySets")) {
			//3xxx
			for (int i = 0; i < ((IfcDiscreteAccessoryType) object).getHasPropertySets().size(); i++) {
				resultList.add(((IfcDiscreteAccessoryType) object).getHasPropertySets().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcDiscreteAccessoryType) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcDiscreteAccessoryType) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcDiscreteAccessoryType) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcDiscreteAccessoryType) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcDiscreteAccessoryType) object).getDecomposes().size(); i++) {
				resultList.add(((IfcDiscreteAccessoryType) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcDiscreteAccessoryType) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcDiscreteAccessoryType) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcDiscreteAccessoryType) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcDiscreteAccessoryType) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcDiscreteAccessoryType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcDiscreteAccessoryType) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcDiscreteAccessoryType) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
