package io.argoproj.workflow.v1alpha;

import java.util.Objects;

/**
 * ResourceTemplate is a template subtype to manipulate kubernetes resources
 */
public class ResourceTemplate   {
  private String action;

  private String failureCondition;

  private String manifest;

  private String mergeStrategy;

  private String successCondition;

  public ResourceTemplate action(String action) {
    this.action = action;
    return this;
  }

  /**
   * Action is the action to perform to the resource. Must be one of: get, create, apply, delete, replace
   * @return action
  */
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public ResourceTemplate failureCondition(String failureCondition) {
    this.failureCondition = failureCondition;
    return this;
  }

  /**
   * FailureCondition is a label selector expression which describes the conditions of the k8s resource in which the step was considered failed
   * @return failureCondition
  */
  public String getFailureCondition() {
    return failureCondition;
  }

  public void setFailureCondition(String failureCondition) {
    this.failureCondition = failureCondition;
  }

  public ResourceTemplate manifest(String manifest) {
    this.manifest = manifest;
    return this;
  }

  /**
   * Manifest contains the kubernetes manifest
   * @return manifest
  */
  public String getManifest() {
    return manifest;
  }

  public void setManifest(String manifest) {
    this.manifest = manifest;
  }

  public ResourceTemplate mergeStrategy(String mergeStrategy) {
    this.mergeStrategy = mergeStrategy;
    return this;
  }

  /**
   * MergeStrategy is the strategy used to merge a patch. It defaults to \"strategic\" Must be one of: strategic, merge, json
   * @return mergeStrategy
  */
  public String getMergeStrategy() {
    return mergeStrategy;
  }

  public void setMergeStrategy(String mergeStrategy) {
    this.mergeStrategy = mergeStrategy;
  }

  public ResourceTemplate successCondition(String successCondition) {
    this.successCondition = successCondition;
    return this;
  }

  /**
   * SuccessCondition is a label selector expression which describes the conditions of the k8s resource in which it is acceptable to proceed to the following step
   * @return successCondition
  */
  public String getSuccessCondition() {
    return successCondition;
  }

  public void setSuccessCondition(String successCondition) {
    this.successCondition = successCondition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceTemplate ioArgoprojWorkflowV1alpha1ResourceTemplate = (ResourceTemplate) o;
    return Objects.equals(this.action, ioArgoprojWorkflowV1alpha1ResourceTemplate.action) &&
        Objects.equals(this.failureCondition, ioArgoprojWorkflowV1alpha1ResourceTemplate.failureCondition) &&
        Objects.equals(this.manifest, ioArgoprojWorkflowV1alpha1ResourceTemplate.manifest) &&
        Objects.equals(this.mergeStrategy, ioArgoprojWorkflowV1alpha1ResourceTemplate.mergeStrategy) &&
        Objects.equals(this.successCondition, ioArgoprojWorkflowV1alpha1ResourceTemplate.successCondition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, failureCondition, manifest, mergeStrategy, successCondition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1ResourceTemplate {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    failureCondition: ").append(toIndentedString(failureCondition)).append("\n");
    sb.append("    manifest: ").append(toIndentedString(manifest)).append("\n");
    sb.append("    mergeStrategy: ").append(toIndentedString(mergeStrategy)).append("\n");
    sb.append("    successCondition: ").append(toIndentedString(successCondition)).append("\n");
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

