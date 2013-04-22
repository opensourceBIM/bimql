package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcStructuralAnalysisModel;

public class GetAttributeSubIfcStructuralAnalysisModel {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcStructuralAnalysisModel(Object object, String string) {
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
		if (string.equals("LoadedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralAnalysisModel) object).getLoadedBy().size(); i++) {
				resultList.add(((IfcStructuralAnalysisModel) object).getLoadedBy().get(i));
			}
			 //1EList
		}
		else if (string.equals("OrientationOf2DPlane")) {
			resultList.add(((IfcStructuralAnalysisModel) object).getOrientationOf2DPlane());
			 //1IfcAxis2Placement3D
		}
		else if (string.equals("HasResults")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralAnalysisModel) object).getHasResults().size(); i++) {
				resultList.add(((IfcStructuralAnalysisModel) object).getHasResults().get(i));
			}
			 //1EList
		}
		else if (string.equals("PredefinedType")) {
			resultList.add(((IfcStructuralAnalysisModel) object).getPredefinedType());
			 //1IfcAnalysisModelTypeEnum
		}
		else if (string.equals("ServicesBuildings")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralAnalysisModel) object).getServicesBuildings().size(); i++) {
				resultList.add(((IfcStructuralAnalysisModel) object).getServicesBuildings().get(i));
			}
			 //2EList
		}
		else if (string.equals("IsGroupedBy")) {
			resultList.add(((IfcStructuralAnalysisModel) object).getIsGroupedBy());
			 //3IfcRelAssignsToGroup
		}
		else if (string.equals("ObjectType")) {
			resultList.add(((IfcStructuralAnalysisModel) object).getObjectType());
			 //3String
		}
		else if (string.equals("IsDefinedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralAnalysisModel) object).getIsDefinedBy().size(); i++) {
				resultList.add(((IfcStructuralAnalysisModel) object).getIsDefinedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralAnalysisModel) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcStructuralAnalysisModel) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralAnalysisModel) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcStructuralAnalysisModel) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralAnalysisModel) object).getDecomposes().size(); i++) {
				resultList.add(((IfcStructuralAnalysisModel) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcStructuralAnalysisModel) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcStructuralAnalysisModel) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcStructuralAnalysisModel) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcStructuralAnalysisModel) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcStructuralAnalysisModel) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcStructuralAnalysisModel) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcStructuralAnalysisModel) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
