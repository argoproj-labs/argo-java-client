This project is no longer actively developed due to the integration into the official codes.
Now the argoproj has an [Official Java SDK](https://github.com/argoproj-labs/argo-client-java).

# OpenAPI Generator for the [argo-java-client] library

### How to regenerate the code
This project is created to easily generate the [argo-java-client].
To generate the code you should do the following steps:

  - `mvn package` to compile this project
  - `docker-compose -f generate.yml up` to generate the argo-java-client in `generated-code` folder.


So I'll generate [argo-java-client] by the use of this project. External help in maintaining this code generator and original [argo-java-client] is much appreciated.

### Argo Project Java Data Model

Java classes for [argo project](https://github.com/argoproj/argo) based on their openapi json file.

## Getting Started

First add the corresponding maven or gradle dependency (will be updated soon)(also from time to time)
<pre>
<code>repositories {
    // Use jcenter for resolving this dependency.
    <b>jcenter()</b>
}

dependencies {
    <b>compile 'io.unikzforce:argo-java-client:0.1__v2.3.0-rc2'</b>
    ...
}</code>
</pre>
for the time being this artifact is only provided in jcenter.

this is an example Usage:
```java
	
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import io.argoproj.workflow.v1alpha.Template;
import io.argoproj.workflow.v1alpha.Workflow;
import io.argoproj.workflow.v1alpha.WorkflowSpec;
import io.kubernetes.client.ApiClient;
import io.kubernetes.client.ApiException;
import io.kubernetes.client.Configuration;
import io.kubernetes.client.apis.CustomObjectsApi;
import io.kubernetes.client.models.V1Container;
import io.kubernetes.client.models.V1ObjectMeta;
import io.kubernetes.client.util.Config;

public class Main2 {

	public static void main(String[] args) throws IOException, ApiException {

		V1ObjectMeta metadata = new V1ObjectMeta();
		metadata.generateName("hello-world-");

		V1Container container = new V1Container();
		container.setImage("docker/whalesay:latest");
		container.setCommand(Arrays.asList("cowsay"));
		container.setArgs(Arrays.asList("hello world"));

		Template t = new Template();
		t.setName("whalesay");
		t.setContainer(container);

		WorkflowSpec spec = new WorkflowSpec();
		spec.entrypoint("whalesay");
		spec.setTemplates(new ArrayList<Template>());
		spec.addTemplatesItem(t);



		Workflow wf = 
			new Workflow()
				.apiVersion("argoproj.io/v1alpha1")
				.kind("Workflow")
				.metadata(metadata)
				.spec(spec);

		ApiClient  client = Config.defaultClient();
		client.setDebugging(true);
		Configuration.setDefaultApiClient(client);

		// Configure API key authorization: BearerToken
		// ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
		// BearerToken.setApiKey("YOUR API KEY");
		// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
		//BearerToken.setApiKeyPrefix("Token");

		CustomObjectsApi apiInstance = new CustomObjectsApi();
		Object result = apiInstance.createNamespacedCustomObject("argoproj.io", "v1alpha1", "default", "workflows", wf, "true");
		System.out.println(result);
	}
}
```

   [argo-java-client]: <https://github.com/argoproj-labs/argo-java-client>
