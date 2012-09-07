package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcLightSourcePositional {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcLightSourcePositional(Object object, String string) {
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
		if (string.equals("ConstantAttenuation")) {
			resultList.add(((IfcLightSourcePositional) object).getConstantAttenuation());
			 //1double
		}
		else if (string.equals("DistanceAttenuation")) {
			resultList.add(((IfcLightSourcePositional) object).getDistanceAttenuation());
			 //1double
		}
		else if (string.equals("QuadricAttenuation")) {
			resultList.add(((IfcLightSourcePositional) object).getQuadricAttenuation());
			 //1double
		}
		else if (string.equals("ConstantAttenuationAsString")) {
			resultList.add(((IfcLightSourcePositional) object).getConstantAttenuationAsString());
			 //1String
		}
		else if (string.equals("DistanceAttenuationAsString")) {
			resultList.add(((IfcLightSourcePositional) object).getDistanceAttenuationAsString());
			 //1String
		}
		else if (string.equals("QuadricAttenuationAsString")) {
			resultList.add(((IfcLightSourcePositional) object).getQuadricAttenuationAsString());
			 //1String
		}
		else if (string.equals("RadiusAsString")) {
			resultList.add(((IfcLightSourcePositional) object).getRadiusAsString());
			 //1String
		}
		else if (string.equals("Radius")) {
			resultList.add(((IfcLightSourcePositional) object).getRadius());
			 //1double
		}
		else if (string.equals("Position")) {
			resultList.add(((IfcLightSourcePositional) object).getPosition());
			 //1IfcCartesianPoint
		}
		else if (string.equals("AmbientIntensityAsString")) {
			resultList.add(((IfcLightSourcePositional) object).getAmbientIntensityAsString());
			 //2String
		}
		else if (string.equals("LightColour")) {
			resultList.add(((IfcLightSourcePositional) object).getLightColour());
			 //2IfcColourRgb
		}
		else if (string.equals("AmbientIntensity")) {
			resultList.add(((IfcLightSourcePositional) object).getAmbientIntensity());
			 //2double
		}
		else if (string.equals("IntensityAsString")) {
			resultList.add(((IfcLightSourcePositional) object).getIntensityAsString());
			 //2String
		}
		else if (string.equals("Intensity")) {
			resultList.add(((IfcLightSourcePositional) object).getIntensity());
			 //2double
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcLightSourcePositional) object).getName());
			 //2String
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcLightSourcePositional) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcLightSourcePositional) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcLightSourcePositional) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcLightSourcePositional) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
