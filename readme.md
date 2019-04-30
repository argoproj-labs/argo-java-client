# Argo Project Java Data Model

Java classes for [argo project](https://github.com/argoproj/argo) project Based on their openapi json file.

## Getting Started

I'll publish the maven jar artifacts as soon as possible.
for the time being just clone the project.
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

### Installing

just clone the project and do `gradle clean build` and see and modify the Main.java & Main2.java 

I'll publish to Maven repositories as soon as possible 
