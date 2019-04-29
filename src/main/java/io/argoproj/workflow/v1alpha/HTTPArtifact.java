package io.argoproj.workflow.v1alpha;

import java.util.Objects;

/**
 * HTTPArtifact allows an file served on HTTP to be placed as an input artifact in a container
 */
public class HTTPArtifact   {
  private String url;

  public HTTPArtifact url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL of the artifact
   * @return url
  */

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HTTPArtifact ioArgoprojWorkflowV1alpha1HTTPArtifact = (HTTPArtifact) o;
    return Objects.equals(this.url, ioArgoprojWorkflowV1alpha1HTTPArtifact.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1HTTPArtifact {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

