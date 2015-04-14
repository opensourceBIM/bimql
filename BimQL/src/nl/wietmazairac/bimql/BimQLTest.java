package nl.wietmazairac.bimql;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.TreeSet;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.bimserver.emf.IfcModelInterface;
import org.bimserver.emf.Schema;
import org.bimserver.ifc.BasicIfcModel;
import org.bimserver.ifc.IfcModel;
import org.bimserver.ifc.step.deserializer.Ifc2x3tc1StepDeserializer;
import org.bimserver.ifc.step.deserializer.IfcStepDeserializer;
import org.bimserver.ifc.step.serializer.Ifc2x3tc1StepSerializer;
import org.bimserver.ifc.step.serializer.IfcStepSerializer;
import org.bimserver.plugins.PluginConfiguration;
import org.bimserver.plugins.PluginException;
import org.bimserver.plugins.PluginManager;
import org.bimserver.plugins.deserializers.DeserializeException;
import org.bimserver.plugins.schema.SchemaPlugin;
import org.bimserver.plugins.serializers.ProjectInfo;
import org.bimserver.plugins.serializers.SerializerException;

public class BimQLTest {

	public static void main(String[] args) throws RecognitionException {

		// L O A D M O D E L

		IfcModelInterface ifcModel = new BasicIfcModel(null, null); // TODO find right PackageMetaData thing
		ifcModel = importModel("Clinic_A_20110906.ifc");

		// E X A M P L E S S E L E C T

		// CharStream charStream = new ANTLRStringStream("Select $Var1");

		// CharStream charStream = new
		// ANTLRStringStream("Select $Var1 Where $Var1.EntityType = IfcDoor");
		CharStream charStream = new ANTLRStringStream(
				"Select $Var1 Where $Var1.Attribute.GlobalId = 1qc5HjZvrCsga38tqxQ3VC");
		// CharStream charStream = new
		// ANTLRStringStream("Select $Var1 Where $Var1.Attribute.GlobalId = 1*");
		// CharStream charStream = new
		// ANTLRStringStream("Select $Var1 Where $Var1.Attribute.OverallHeight = 2.325");
		// CharStream charStream = new
		// ANTLRStringStream("Select $Var1 Where $Var1.Property.Volume = 3.726407576004009");

		// CharStream charStream = new
		// ANTLRStringStream("Select $Var1 Where $Var1.Attribute.OverallHeight > 1.4 And $Var1.Attribute.OverallHeight < 1.6");
		// CharStream charStream = new
		// ANTLRStringStream("Select $Var1 Where $Var1.Attribute.OverallHeight < 1.4 Or $Var1.Attribute.OverallHeight > 1.6");

		// CharStream charStream = new
		// ANTLRStringStream("Select $Var1 Where $Var1.Attribute.Name = ?set*");
		// CharStream charStream = new
		// ANTLRStringStream("Select $Var1 Where $Var1.Attribute.Name = *Level");
		// CharStream charStream = new
		// ANTLRStringStream("Select $Var1 Where $Var1.Attribute.Name = *");

		// CharStream charStream = new
		// ANTLRStringStream("Select $Var1 Where $Var1.EntityType = IfcDoor Select $Var2 := $Var1.Attribute.GlobalId");
		// CharStream charStream = new
		// ANTLRStringStream("Select $Var1 Where $Var1.EntityType = IfcDoor Select $Var2 := $Var1.Attribute.GlobalIdObject");

		BimQLLexer lexer = new BimQLLexer(charStream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		BimQLParser parser = new BimQLParser(tokenStream);

		List<Object> result;
		System.out.println("Start searching");
		result = parser.bimql(ifcModel);
		System.out.println("Stop searching");
		System.out.println();
		for (Object object : result) {
			// System.out.println(((IfcRoot) object).eClass().getName() + " - "
			// + ((IfcRoot) object).getName() + " - " + ((IfcRoot)
			// object).getGlobalId().getWrappedValue());
			System.out.println(object);
		}
		System.out.println();
		System.out.println("Number of results: " + result.size());
		System.out.println("Done!!!");
		System.out.println();
		System.out.println();
		System.out.println();

		System.exit(0);

		// E X A M P L E S S E T

		CharStream charStream2 = new ANTLRStringStream(
				"Select ?Var1 Where ?Var1.Attribute.GlobalIdWrappedValue = 1eHJakbVPEdf9cGdMXVBAY Select ?Var2 := ?Var1.Attribute.Description");

		BimQLLexer lexer2 = new BimQLLexer(charStream2);
		TokenStream tokenStream2 = new CommonTokenStream(lexer2);
		BimQLParser parser2 = new BimQLParser(tokenStream2);

		List<Object> result2;
		System.out.println("Start searching");
		result2 = parser2.bimql(ifcModel);
		System.out.println("Stop searching");
		System.out.println();
		for (Object object : result2) {
			System.out.println(object);
		}
		System.out.println();
		System.out.println("Number of results: " + result2.size());
		System.out.println("Done!!!");
		System.out.println();
		System.out.println();
		System.out.println();

		CharStream charStream3 = new ANTLRStringStream(
				"Select ?Var1 Where ?Var1.Attribute.GlobalIdWrappedValue = 1eHJakbVPEdf9cGdMXVBAY Set ?Var1.Attribute.Description := deurtje");

		BimQLLexer lexer3 = new BimQLLexer(charStream3);
		TokenStream tokenStream3 = new CommonTokenStream(lexer3);
		BimQLParser parser3 = new BimQLParser(tokenStream3);

		List<Object> result3;
		System.out.println("Start searching");
		result3 = parser3.bimql(ifcModel);
		System.out.println("Stop searching");
		System.out.println();
		for (Object object : result3) {
			System.out.println(object);
		}
		System.out.println();
		System.out.println("Number of results: " + result3.size());
		System.out.println("Done!!!");
		System.out.println();
		System.out.println();
		System.out.println();

		CharStream charStream4 = new ANTLRStringStream(
				"Select ?Var1 Where ?Var1.Attribute.GlobalIdWrappedValue = 1eHJakbVPEdf9cGdMXVBAY Select ?Var2 := ?Var1.Attribute.Description");

		BimQLLexer lexer4 = new BimQLLexer(charStream4);
		TokenStream tokenStream4 = new CommonTokenStream(lexer4);
		BimQLParser parser4 = new BimQLParser(tokenStream4);

		List<Object> result4;
		System.out.println("Start searching");
		result4 = parser4.bimql(ifcModel);
		System.out.println("Stop searching");
		System.out.println();
		for (Object object : result4) {
			System.out.println(object);
		}
		System.out.println();
		System.out.println("Number of results: " + result4.size());
		System.out.println("Done!!!");
		System.out.println();
		System.out.println();
		System.out.println();
	}

	public static Class<?>[] getClasses(String packageName) {
		try {
			ClassLoader classLoader = Thread.currentThread()
					.getContextClassLoader();
			assert classLoader != null;
			String path = packageName.replace('.', '/');
			Enumeration<URL> resources = classLoader.getResources(path);
			List<String> dirs = new ArrayList<String>();
			while (resources.hasMoreElements()) {
				URL resource = resources.nextElement();
				dirs.add(resource.getFile());
			}
			TreeSet<String> classes = new TreeSet<String>();
			for (String directory : dirs) {
				classes.addAll(findClasses(directory, packageName));
			}
			ArrayList<Class<?>> classList = new ArrayList<Class<?>>();
			for (String clazz : classes) {
				classList.add(Class.forName(clazz));
			}
			return classList.toArray(new Class[classes.size()]);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * Recursive method used to find all classes in a given directory and
	 * subdirs. Adapted from http://snippets.dzone.com/posts/show/4831 and
	 * extended to support use of JAR files
	 * 
	 * @param directory
	 *            The base directory
	 * @param packageName
	 *            The package name for classes found inside the base directory
	 * @return The classes
	 * @throws ClassNotFoundException
	 */

	private static TreeSet<String> findClasses(String directory,
			String packageName) throws Exception {
		TreeSet<String> classes = new TreeSet<String>();
		if (directory.startsWith("file:") && directory.contains("!")) {
			String[] split = directory.split("!");
			URL jar = new URL(split[0]);
			ZipInputStream zip = new ZipInputStream(jar.openStream());
			ZipEntry entry = null;
			while ((entry = zip.getNextEntry()) != null) {
				if (entry.getName().endsWith(".class")) {
					String className = entry.getName().replaceAll("[$].*", "")
							.replaceAll("[.]class", "").replace('/', '.');
					classes.add(className);
				}
			}
		}
		File dir = new File(directory);
		if (!dir.exists()) {
			return classes;
		}
		File[] files = dir.listFiles();
		for (File file : files) {
			if (file.isDirectory()) {
				assert !file.getName().contains(".");
				classes.addAll(findClasses(file.getAbsolutePath(), packageName
						+ "." + file.getName()));
			} else if (file.getName().endsWith(".class")) {
				classes.add(packageName
						+ '.'
						+ file.getName().substring(0,
								file.getName().length() - 6));
			}
		}
		return classes;
	}

	public static IfcModelInterface importModel(String ifcFile) {
		IfcStepDeserializer reader = new Ifc2x3tc1StepDeserializer(Schema.IFC2X3TC1);
		IfcModelInterface ifcModel = new BasicIfcModel(null, null); // TODO find right PackageMetaData thing
		reader.init(ifcModel.getPackageMetaData());
		try {
			ifcModel = reader.read(new File(ifcFile));
		} catch (DeserializeException e) {
			e.printStackTrace();
		}
		return ifcModel;
	}

	public static void exportModel(IfcModel ifcModel, String ifcFile) {
		IfcStepSerializer writer = new Ifc2x3tc1StepSerializer(new PluginConfiguration());
		ProjectInfo projectInfo = new ProjectInfo();
		PluginManager pluginManager = new PluginManager();

		File projectRoot = new File(
				"C:\\Users\\Wiet\\Dropbox\\workspace\\buildingSMARTLibrary");

		try {
			pluginManager.loadPluginsFromEclipseProject(projectRoot);
			List<SchemaPlugin> schemaPluginList = new ArrayList<SchemaPlugin>(
					pluginManager.getAllSchemaPlugins(true));
			System.out.println(schemaPluginList.size());
		} catch (PluginException e) {
			e.printStackTrace();
		}

		try {
			writer.init(ifcModel, projectInfo, pluginManager, null, null, false); // TODO find right PackageMetaData thing
			writer.writeToFile(new File(ifcFile), null);
		} catch (SerializerException e) {
			e.printStackTrace();
		}
	}
}
