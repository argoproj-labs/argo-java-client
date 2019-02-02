package io.argoproj.workflow.v1alpha1;

import java.util.List;
import java.util.Map;

import io.kubernetes.client.proto.Meta.Time;
import io.kubernetes.client.proto.V1.NodeStatus;
import io.kubernetes.client.proto.V1.Volume;

public class WorkflowStatus {
	
	private String phase;
	
	private Time startedAt;
	
	private Time finishedAt;
	
	private String message;
	
	private Map<String, NodeStatus> nodes;
	
	private List<Volume> persistentVolumeClaims;
	
	private Outputs outputs;

}
