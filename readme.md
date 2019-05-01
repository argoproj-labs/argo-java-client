# Argo Project Java Data Model

Java classes for [argo project](https://github.com/argoproj/argo) based on their openapi json file.

## Getting Started

First add the corresponding maven or gradle dependency:
```groovy
	repositories {
	    // Use jcenter for resolving this dependency.
	    jcenter()
	}

	dependencies {
	    compile 'io.unikzforce:argo-java-client:0.1__v2.3.0-rc2'
	    ...
	}
```
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
