import java.util.ArrayList;
import java.util.Arrays;

import io.argoproj.workflow.v1alpha.Metadata;
import io.argoproj.workflow.v1alpha.Template;
import io.argoproj.workflow.v1alpha.Workflow;
import io.argoproj.workflow.v1alpha.WorkflowSpec;
import io.kubernetes.client.models.V1Container;
import io.kubernetes.client.models.V1ObjectMeta;

public class Main2 {
	public static void main(String[] args) {
		
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
	}
}
