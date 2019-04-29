package io.argoproj.workflow.v1alpha;

import java.util.Objects;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Pod metdata
 */
public class Metadata   {
  private Map<String, String> annotations = null;

  private Map<String, String> labels = null;

  public Metadata annotations(Map<String, String> annotations) {
    this.annotations = annotations;
    return this;
  }

  public Metadata putAnnotationsItem(String key, String annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new HashMap<>();
    }
    this.annotations.put(key, annotationsItem);
    return this;
  }

  /**
   * Get annotations
   * @return annotations
  */
  public Map<String, String> getAnnotations() {
    return annotations;
  }

  public void setAnnotations(Map<String, String> annotations) {
    this.annotations = annotations;
  }

  public Metadata labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public Metadata putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

  /**
   * Get labels
   * @return labels
  */
  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Metadata ioArgoprojWorkflowV1alpha1Metadata = (Metadata) o;
    return Objects.equals(this.annotations, ioArgoprojWorkflowV1alpha1Metadata.annotations) &&
        Objects.equals(this.labels, ioArgoprojWorkflowV1alpha1Metadata.labels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotations, labels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1Metadata {\n");
    
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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

