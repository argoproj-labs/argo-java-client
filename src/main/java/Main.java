import java.io.IOException;

import io.kubernetes.client.ApiClient;
import io.kubernetes.client.ApiException;
import io.kubernetes.client.Configuration;
import io.kubernetes.client.apis.CoreV1Api;
import io.kubernetes.client.models.V1Pod;
import io.kubernetes.client.models.V1PodList;
import io.kubernetes.client.util.Config;

public class Main {
	public static void main(String[] args) throws IOException, ApiException {
		ApiClient  client = Config.defaultClient();
		Configuration.setDefaultApiClient(client);
		System.out.println(client.getBasePath());
		
		CoreV1Api api = new CoreV1Api();
		V1PodList list =
				api.listPodForAllNamespaces(null, null, null, null, null, null, null, null, null);
		
	    for (V1Pod item : list.getItems()) {
	        System.out.println(item.getMetadata().getName());
	    }
	}
}
