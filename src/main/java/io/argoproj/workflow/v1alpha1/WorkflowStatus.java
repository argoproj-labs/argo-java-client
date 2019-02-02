package io.argoproj.workflow.v1alpha1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import io.kubernetes.client.proto.Meta.Time;
import io.kubernetes.client.proto.V1.NodeStatus;
import io.kubernetes.client.proto.V1.Volume;

public class WorkflowStatus {

	public static final String SERIALIZED_NAME_PHASE = "phase";
	@SerializedName(SERIALIZED_NAME_PHASE)
	private String phase;

	public static final String SERIALIZED_NAME_STARTED_AT = "startedAt";
	@SerializedName(SERIALIZED_NAME_STARTED_AT)
	private Time startedAt;

	public static final String SERIALIZED_NAME_FINISHED_AT = "finishedAt";
	@SerializedName(SERIALIZED_NAME_FINISHED_AT)
	private Time finishedAt;

	public static final String SERIALIZED_NAME_MESSAGE = "message";
	@SerializedName(SERIALIZED_NAME_MESSAGE)
	private String message;

	public static final String SERIALIZED_NAME_NODES = "nodes";
	@SerializedName(SERIALIZED_NAME_NODES)
	private Map<String, NodeStatus> nodes = new HashMap<String, NodeStatus>();;

	public static final String SERIALIZED_NAME_PERSISTENT_VOLUME_CLAIMES = "persistentVolumeClaims";
	@SerializedName(SERIALIZED_NAME_PERSISTENT_VOLUME_CLAIMES)
	private List<Volume> persistentVolumeClaims = new ArrayList<Volume>();;

	public static final String SERIALIZED_NAME_OUTPUTS = "outputs";
	@SerializedName(SERIALIZED_NAME_OUTPUTS)
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
	
	public WorkflowStatus startedAt(Time startedAt) {
		this.startedAt = startedAt;
		return this;
	}
	
	public Time getStartedAt() {
		return startedAt;
	}
	
	public void setStartedAt(Time startedAt) {
		this.startedAt = startedAt;
	}
	
	public WorkflowStatus finishedAt(Time finishedAt) {
		this.finishedAt = finishedAt;
		return this;
	}	
	
	public Time getFinishedAt() {
		return finishedAt;
	}
	
	public void setFinishedAt(Time finishedAt) {
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
	
	public WorkflowStatus nodes(Map<String, NodeStatus> nodes) {
		this.nodes = nodes;
		return this;
	}
	
	public Map<String, NodeStatus> getNodes() {
		return nodes;
	}
	
	public void setNodes(Map<String, NodeStatus> nodes) {
		this.nodes = nodes;
	}
	
	public WorkflowStatus persistentVolumeClaims(List<Volume> persistentVolumeClaims) {
		this.persistentVolumeClaims = persistentVolumeClaims;
		return this;
	}
	
	public List<Volume> getPersistentVolumeClaims() {
		return persistentVolumeClaims;
	}
	
	public void setPersistentVolumeClaims(List<Volume> persistentVolumeClaims) {
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
