package io.argoproj.workflow.v1alpha;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.kubernetes.client.models.V1NodeStatus;
import io.kubernetes.client.models.V1Volume;
//import io.kubernetes.client.proto.Meta.Time;
//import io.kubernetes.client.proto.Meta.Time;

public class WorkflowStatus {

	private String phase;

	private String startedAt;

	private String finishedAt;

	private String message;

	private Map<String, V1NodeStatus> nodes = new HashMap<String, V1NodeStatus>();;

	private List<V1Volume> persistentVolumeClaims = new ArrayList<V1Volume>();;

	private Outputs outputs;
	
	
	public WorkflowStatus kind(String phase) {
		this.phase = phase;
		return this;
	}
	
	public String getPhase() {
		return phase;
	}
	
	public void setPhase(String phase) {
		this.phase = phase;
	}
	
	public WorkflowStatus startedAt(String startedAt) {
		this.startedAt = startedAt;
		return this;
	}
	
	public String getStartedAt() {
		return startedAt;
	}
	
	public void setStartedAt(String startedAt) {
		this.startedAt = startedAt;
	}
	
	public WorkflowStatus finishedAt(String finishedAt) {
		this.finishedAt = finishedAt;
		return this;
	}	
	
	public String getFinishedAt() {
		return finishedAt;
	}
	
	public void setFinishedAt(String finishedAt) {
		this.finishedAt = finishedAt;
	}
	
	public WorkflowStatus message(String message) {
		this.message = message;
		return this;
	}	
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public WorkflowStatus nodes(Map<String, V1NodeStatus> nodes) {
		this.nodes = nodes;
		return this;
	}
	
	public Map<String, V1NodeStatus> getNodes() {
		return nodes;
	}
	
	public void setNodes(Map<String, V1NodeStatus> nodes) {
		this.nodes = nodes;
	}
	
	public WorkflowStatus persistentVolumeClaims(List<V1Volume> persistentVolumeClaims) {
		this.persistentVolumeClaims = persistentVolumeClaims;
		return this;
	}
	
	public List<V1Volume> getPersistentVolumeClaims() {
		return persistentVolumeClaims;
	}
	
	public void setPersistentVolumeClaims(List<V1Volume> persistentVolumeClaims) {
		this.persistentVolumeClaims = persistentVolumeClaims;
	}
	
	public WorkflowStatus outputs(Outputs outputs) {
		this.outputs = outputs;
		return this;
	}
	
	public Outputs getOutputs() {
		return outputs;
	}
	
	public void setOutputs(Outputs outputs) {
		this.outputs = outputs;
	}
}