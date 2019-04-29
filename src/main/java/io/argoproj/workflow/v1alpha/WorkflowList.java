package io.argoproj.workflow.v1alpha;

import java.util.Objects;

import io.kubernetes.client.models.V1ListMeta;

import java.util.ArrayList;
import java.util.List;

/**
 * WorkflowList is list of Workflow resources
 */
public class WorkflowList   {
  private String apiVersion;

  private List<Workflow> items = new ArrayList<>();

  private String kind;

  private V1ListMeta metadata = null;

  public WorkflowList apiVersion(String apiVersion) {
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

  public WorkflowList items(List<Workflow> items) {
    this.items = items;
    return this;
  }

  public WorkflowList addItemsItem(Workflow itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
  */
  public List<Workflow> getItems() {
    return items;
  }

  public void setItems(List<Workflow> items) {
    this.items = items;
  }

  public WorkflowList kind(String kind) {
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

  public WorkflowList metadata(V1ListMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
  */
  public V1ListMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(V1ListMeta metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowList ioArgoprojWorkflowV1alpha1WorkflowList = (WorkflowList) o;
    return Objects.equals(this.apiVersion, ioArgoprojWorkflowV1alpha1WorkflowList.apiVersion) &&
        Objects.equals(this.items, ioArgoprojWorkflowV1alpha1WorkflowList.items) &&
        Objects.equals(this.kind, ioArgoprojWorkflowV1alpha1WorkflowList.kind) &&
        Objects.equals(this.metadata, ioArgoprojWorkflowV1alpha1WorkflowList.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, items, kind, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1WorkflowList {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

