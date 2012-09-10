package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcMaterialLayerSet;

public class GetAttributeSubIfcMaterialLayerSet {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcMaterialLayerSet(Object object, String string) {
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
		if (string.equals("TotalThicknessAsString")) {
			resultList.add(((IfcMaterialLayerSet) object).getTotalThicknessAsString());
			 //1String
		}
		else if (string.equals("MaterialLayers")) {
			//3xxx
			for (int i = 0; i < ((IfcMaterialLayerSet) object).getMaterialLayers().size(); i++) {
				resultList.add(((IfcMaterialLayerSet) object).getMaterialLayers().get(i));
			}
			 //1EList
		}
		else if (string.equals("LayerSetName")) {
			resultList.add(((IfcMaterialLayerSet) object).getLayerSetName());
			 //1String
		}
		else if (string.equals("TotalThickness")) {
			resultList.add(((IfcMaterialLayerSet) object).getTotalThickness());
			 //1double
		}
		return resultList;
	}
}
