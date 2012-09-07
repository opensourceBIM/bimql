package nl.tue.buildingsmart.emf;

import java.io.File;

import nl.tue.buildingsmart.express.parser.SchemaLoader;

import org.bimserver.ifc.IfcModel;
import org.bimserver.ifc.step.deserializer.IfcStepDeserializer;
import org.bimserver.plugins.deserializers.DeserializeException;
import nl.tue.buildingsmart.express.parser.*;

public class IfcEMFReader {

	static IfcStepDeserializer reader;
	static IfcModel model;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SchemaLoader loader = new SchemaLoader("Ifc2x3_TC1.exp");
		
		
		reader = new IfcStepDeserializer();
		reader.init(new SchemaLoader("Ifc2x3_TC1.exp").getSchema());
		try {
			model= reader.read(new File("example.ifc"), false);
		} catch (DeserializeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
