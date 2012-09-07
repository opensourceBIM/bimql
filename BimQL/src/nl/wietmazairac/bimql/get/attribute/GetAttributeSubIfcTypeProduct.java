package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcTypeProduct {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcTypeProduct(Object object, String string) {
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
		if (string.equals("RepresentationMaps")) {
			//3xxx
			for (int i = 0; i < ((IfcTypeProduct) object).getRepresentationMaps().size(); i++) {
				resultList.add(((IfcTypeProduct) object).getRepresentationMaps().get(i));
			}
			 //1EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcTypeProduct) object).getTag());
			 //1String
		}
		else if (string.equals("ApplicableOccurrence")) {
			resultList.add(((IfcTypeProduct) object).getApplicableOccurrence());
			 //2String
		}
		else if (string.equals("ObjectTypeOf")) {
			//3xxx
			for (int i = 0; i < ((IfcTypeProduct) object).getObjectTypeOf().size(); i++) {
				resultList.add(((IfcTypeProduct) object).getObjectTypeOf().get(i));
			}
			 //2EList
		}
		else if (string.equals("HasPropertySets")) {
			//3xxx
			for (int i = 0; i < ((IfcTypeProduct) object).getHasPropertySets().size(); i++) {
				resultList.add(((IfcTypeProduct) object).getHasPropertySets().get(i));
			}
			 //2EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcTypeProduct) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcTypeProduct) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcTypeProduct) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcTypeProduct) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcTypeProduct) object).getDecomposes().size(); i++) {
				resultList.add(((IfcTypeProduct) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcTypeProduct) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcTypeProduct) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcTypeProduct) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcTypeProduct) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcTypeProduct) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcTypeProduct) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcTypeProduct) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
