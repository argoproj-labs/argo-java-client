package io.argoproj.workflow.codegen;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openapitools.codegen.CodegenConfig;
import org.openapitools.codegen.CodegenOperation;
import org.openapitools.codegen.CodegenType;
import org.openapitools.codegen.SupportingFile;
import org.openapitools.codegen.languages.JavaClientCodegen;

public class ArgoprojJavaClientOpenapiCodeGenerator extends JavaClientCodegen implements CodegenConfig {

//  source folder where to write the files
	protected String sourceFolder = "src";
	protected String apiVersion = "1.0.0";

	/**
	 * Configures the type of generator.
	 *
	 * @return the CodegenType for this generator
	 * @see org.openapitools.codegen.CodegenType
	 */
	public CodegenType getTag() {
		return CodegenType.CLIENT;
	}

	/**
	 * Configures a friendly name for the generator. This will be used by the
	 * generator to select the library with the -g flag.
	 *
	 * @return the friendly name for the generator
	 */
	public String getName() {
		return "argo-java-client";
	}

	public ArgoprojJavaClientOpenapiCodeGenerator() {
		super();

		importMapping.put("DateTime", "org.joda.time.DateTime");
		importMapping.put("V1SecretKeySelector", "io.kubernetes.client.models.V1SecretKeySelector");
		importMapping.put("V1ConfigMapKeySelector", "io.kubernetes.client.models.V1ConfigMapKeySelector");
		importMapping.put("V1Container", "io.kubernetes.client.models.V1Container");
		importMapping.put("V1ContainerPort", "io.kubernetes.client.models.V1ContainerPort");
		importMapping.put("V1EnvFromSource", "io.kubernetes.client.models.V1EnvFromSource");
		importMapping.put("V1EnvVar", "io.kubernetes.client.models.V1EnvVar");
		importMapping.put("V1LocalObjectReference", "io.kubernetes.client.models.V1LocalObjectReference");
		importMapping.put("V1Lifecycle", "io.kubernetes.client.models.V1Lifecycle");
		importMapping.put("V1ObjectReference", "io.kubernetes.client.models.V1ObjectReference");
		importMapping.put("V1PersistentVolumeClaim", "io.kubernetes.client.models.V1PersistentVolumeClaim");
		importMapping.put("V1PodDNSConfig", "io.kubernetes.client.models.V1PodDNSConfig");
		importMapping.put("V1Probe", "io.kubernetes.client.models.V1Probe");
		importMapping.put("V1ResourceRequirements", "io.kubernetes.client.models.V1ResourceRequirements");
		importMapping.put("V1SecurityContext", "io.kubernetes.client.models.V1SecurityContext");
		importMapping.put("V1Volume", "io.kubernetes.client.models.V1Volume");
		importMapping.put("V1VolumeDevice", "io.kubernetes.client.models.V1VolumeDevice");
		importMapping.put("V1VolumeMount", "io.kubernetes.client.models.V1VolumeMount");
		importMapping.put("V1Affinity", "io.kubernetes.client.models.V1Affinity");
		importMapping.put("V1HostAlias", "io.kubernetes.client.models.V1HostAlias");
		importMapping.put("V1PodSecurityContext", "io.kubernetes.client.models.V1PodSecurityContext");
		importMapping.put("V1Toleration", "io.kubernetes.client.models.V1Toleration");
		importMapping.put("V1ObjectMeta", "io.kubernetes.client.models.V1ObjectMeta");
		importMapping.put("V1ListMeta", "io.kubernetes.client.models.V1ListMeta");

		modelPackage = "io.argoproj.workflow.v1alpha";
		dateLibrary = "joda";

		templateDir = "/supportingFiles/";
		
	}
	
    @Override
    public void processOpts() {
    	super.processOpts();
    	
		supportingFiles.add(new SupportingFile(
				"okhttp-gson-kubernetes.build.gradle.mustache", // the input template or file
				"", // the destination folder, relative `outputFolder`
				"build.gradle"
			)
		);
    }


	@Override
	public String toModelName(final String name) {
		String[] splits = name.split("\\.");
//        String result = super.toModelName(Spli);
//        System.out.println("ARGO ARGO ARGO " + result);
//        if(splits.length > 0)
//            System.out.println(" ARGO SPLIT " + splits.length);

		if (splits[splits.length - 1].equals("SecretKeySelector"))
			return "V1SecretKeySelector";
		else if (splits[splits.length - 1].equals("ConfigMapKeySelector"))
			return "V1ConfigMapKeySelector";
		else if (splits[splits.length - 1].equals("Time"))
			return "DateTime";
		else if (splits[splits.length - 1].equals("Container"))
			return "V1Container";
		else if (splits[splits.length - 1].equals("ContainerPort"))
			return "V1ContainerPort";
		else if (splits[splits.length - 1].equals("EnvFromSource"))
			return "V1EnvFromSource";
		else if (splits[splits.length - 1].equals("EnvVar"))
			return "V1EnvVar";
		else if (splits[splits.length - 1].equals("LocalObjectReference"))
			return "V1LocalObjectReference";
		else if (splits[splits.length - 1].equals("ObjectReference"))
			return "V1ObjectReference";
		else if (splits[splits.length - 1].equals("Lifecycle"))
			return "V1Lifecycle";
		else if (splits[splits.length - 1].equals("PersistentVolumeClaim"))
			return "V1PersistentVolumeClaim";
		else if (splits[splits.length - 1].equals("PodDNSConfig"))
			return "V1PodDNSConfig";
		else if (splits[splits.length - 1].equals("Probe"))
			return "V1Probe";
		else if (splits[splits.length - 1].equals("ResourceRequirements"))
			return "V1ResourceRequirements";
		else if (splits[splits.length - 1].equals("SecurityContext"))
			return "V1SecurityContext";
		else if (splits[splits.length - 1].equals("Volume"))
			return "V1Volume";
		else if (splits[splits.length - 1].equals("VolumeDevice"))
			return "V1VolumeDevice";
		else if (splits[splits.length - 1].equals("VolumeMount"))
			return "V1VolumeMount";
		else if (splits[splits.length - 1].equals("Affinity"))
			return "V1Affinity";
		else if (splits[splits.length - 1].equals("HostAlias"))
			return "V1HostAlias";
		else if (splits[splits.length - 1].equals("PodSecurityContext"))
			return "V1PodSecurityContext";
		else if (splits[splits.length - 1].equals("Toleration"))
			return "V1Toleration";
		else if (splits[splits.length - 1].equals("ObjectMeta"))
			return "V1ObjectMeta";
		else if (splits[splits.length - 1].equals("ListMeta"))
			return "V1ListMeta";
		return splits[splits.length - 1];
	}
}