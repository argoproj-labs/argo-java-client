package io.argoproj.workflow.v1alpha;

import java.util.Objects;

import io.kubernetes.client.models.V1ObjectMeta;

/**
 * Workflow is the definition of a workflow resource
 */
public class Workflow   {
  private String apiVersion;

  private String kind;

  private V1ObjectMeta metadata = null;

  private WorkflowSpec spec = null;

  private WorkflowStatus status = null;

  public Workflow apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
   * @return apiVersion
  */
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public Workflow kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
   * @return kind
  */
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public Workflow metadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
  */
  public V1ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
  }

  public Workflow spec(WorkflowSpec spec) {
    this.spec = spec;
    return this;
  }

  /**
   * Get spec
   * @return spec
  */
  public WorkflowSpec getSpec() {
    return spec;
  }

  public void setSpec(WorkflowSpec spec) {
    this.spec = spec;
  }

  public Workflow status(WorkflowStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  public WorkflowStatus getStatus() {
    return status;
  }

  public void setStatus(WorkflowStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Workflow ioArgoprojWorkflowV1alpha1Workflow = (Workflow) o;
    return Objects.equals(this.apiVersion, ioArgoprojWorkflowV1alpha1Workflow.apiVersion) &&
        Objects.equals(this.kind, ioArgoprojWorkflowV1alpha1Workflow.kind) &&
        Objects.equals(this.metadata, ioArgoprojWorkflowV1alpha1Workflow.metadata) &&
        Objects.equals(this.spec, ioArgoprojWorkflowV1alpha1Workflow.spec) &&
        Objects.equals(this.status, ioArgoprojWorkflowV1alpha1Workflow.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, kind, metadata, spec, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1Workflow {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

