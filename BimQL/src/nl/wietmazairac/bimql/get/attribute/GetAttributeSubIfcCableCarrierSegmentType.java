package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcCableCarrierSegmentType {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcCableCarrierSegmentType(Object object, String string) {
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
			resultList.add(((IfcCableCarrierSegmentType) object).getPredefinedType());
			 //1IfcCableCarrierSegmentTypeEnum
		}
		else if (string.equals("ElementType")) {
			resultList.add(((IfcCableCarrierSegmentType) object).getElementType());
			 //3String
		}
		else if (string.equals("RepresentationMaps")) {
			//3xxx
			for (int i = 0; i < ((IfcCableCarrierSegmentType) object).getRepresentationMaps().size(); i++) {
				resultList.add(((IfcCableCarrierSegmentType) object).getRepresentationMaps().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcCableCarrierSegmentType) object).getTag());
			 //3String
		}
		else if (string.equals("ApplicableOccurrence")) {
			resultList.add(((IfcCableCarrierSegmentType) object).getApplicableOccurrence());
			 //3String
		}
		else if (string.equals("ObjectTypeOf")) {
			//3xxx
			for (int i = 0; i < ((IfcCableCarrierSegmentType) object).getObjectTypeOf().size(); i++) {
				resultList.add(((IfcCableCarrierSegmentType) object).getObjectTypeOf().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPropertySets")) {
			//3xxx
			for (int i = 0; i < ((IfcCableCarrierSegmentType) object).getHasPropertySets().size(); i++) {
				resultList.add(((IfcCableCarrierSegmentType) object).getHasPropertySets().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcCableCarrierSegmentType) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcCableCarrierSegmentType) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcCableCarrierSegmentType) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcCableCarrierSegmentType) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcCableCarrierSegmentType) object).getDecomposes().size(); i++) {
				resultList.add(((IfcCableCarrierSegmentType) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcCableCarrierSegmentType) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcCableCarrierSegmentType) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcCableCarrierSegmentType) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcCableCarrierSegmentType) object).getGlobalId().getWrappedValue());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcCableCarrierSegmentType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcCableCarrierSegmentType) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcCableCarrierSegmentType) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
