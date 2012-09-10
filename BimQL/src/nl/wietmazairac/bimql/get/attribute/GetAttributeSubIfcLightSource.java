package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcLightSource;

public class GetAttributeSubIfcLightSource {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcLightSource(Object object, String string) {
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
		if (string.equals("AmbientIntensityAsString")) {
			resultList.add(((IfcLightSource) object).getAmbientIntensityAsString());
			 //1String
		}
		else if (string.equals("LightColour")) {
			resultList.add(((IfcLightSource) object).getLightColour());
			 //1IfcColourRgb
		}
		else if (string.equals("AmbientIntensity")) {
			resultList.add(((IfcLightSource) object).getAmbientIntensity());
			 //1double
		}
		else if (string.equals("IntensityAsString")) {
			resultList.add(((IfcLightSource) object).getIntensityAsString());
			 //1String
		}
		else if (string.equals("Intensity")) {
			resultList.add(((IfcLightSource) object).getIntensity());
			 //1double
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcLightSource) object).getName());
			 //1String
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcLightSource) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcLightSource) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcLightSource) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcLightSource) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
