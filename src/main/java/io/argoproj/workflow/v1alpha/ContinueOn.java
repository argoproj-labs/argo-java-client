package io.argoproj.workflow.v1alpha;

import java.util.Objects;

/**
 * ContinueOn defines if a workflow should continue even if a task or step fails/errors. It can be specified if the workflow should continue when the pod errors, fails or both.
 */
public class ContinueOn   {
  private Boolean error;

  private Boolean failed;

  public ContinueOn error(Boolean error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
  */

  public Boolean getError() {
    return error;
  }

  public void setError(Boolean error) {
    this.error = error;
  }

  public ContinueOn failed(Boolean failed) {
    this.failed = failed;
    return this;
  }

  /**
   * Get failed
   * @return failed
  */
  public Boolean getFailed() {
    return failed;
  }

  public void setFailed(Boolean failed) {
    this.failed = failed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContinueOn ioArgoprojWorkflowV1alpha1ContinueOn = (ContinueOn) o;
    return Objects.equals(this.error, ioArgoprojWorkflowV1alpha1ContinueOn.error) &&
        Objects.equals(this.failed, ioArgoprojWorkflowV1alpha1ContinueOn.failed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, failed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1ContinueOn {\n");
    
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
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

