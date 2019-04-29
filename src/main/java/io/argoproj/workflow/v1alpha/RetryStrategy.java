package io.argoproj.workflow.v1alpha;

import java.util.Objects;

/**
 * RetryStrategy provides controls on how to retry a workflow step
 */
public class RetryStrategy   {
  private Integer limit;

  public RetryStrategy limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Limit is the maximum number of attempts when retrying a container
   * @return limit
  */
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetryStrategy ioArgoprojWorkflowV1alpha1RetryStrategy = (RetryStrategy) o;
    return Objects.equals(this.limit, ioArgoprojWorkflowV1alpha1RetryStrategy.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1RetryStrategy {\n");
    
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

