package io.argoproj.workflow.v1alpha;

import java.util.Objects;

/**
 * RawArtifact allows raw string content to be placed as an artifact in a container
 */
public class RawArtifact   {
  private String data;

  public RawArtifact data(String data) {
    this.data = data;
    return this;
  }

  /**
   * Data is the string contents of the artifact
   * @return data
  */
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RawArtifact ioArgoprojWorkflowV1alpha1RawArtifact = (RawArtifact) o;
    return Objects.equals(this.data, ioArgoprojWorkflowV1alpha1RawArtifact.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1RawArtifact {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

