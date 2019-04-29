package io.argoproj.workflow.v1alpha;

import java.util.Objects;

/**
 * Sequence expands a workflow step into numeric range
 */
public class Sequence   {
  private String count;

  private String end;

  private String format;

  private String start;

  public Sequence count(String count) {
    this.count = count;
    return this;
  }

  /**
   * Count is number of elements in the sequence (default: 0). Not to be used with end
   * @return count
  */
  public String getCount() {
    return count;
  }

  public void setCount(String count) {
    this.count = count;
  }

  public Sequence end(String end) {
    this.end = end;
    return this;
  }

  /**
   * Number at which to end the sequence (default: 0). Not to be used with Count
   * @return end
  */
  public String getEnd() {
    return end;
  }

  public void setEnd(String end) {
    this.end = end;
  }

  public Sequence format(String format) {
    this.format = format;
    return this;
  }

  /**
   * Format is a printf format string to format the value in the sequence
   * @return format
  */
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public Sequence start(String start) {
    this.start = start;
    return this;
  }

  /**
   * Number at which to start the sequence (default: 0)
   * @return start
  */
  public String getStart() {
    return start;
  }

  public void setStart(String start) {
    this.start = start;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sequence ioArgoprojWorkflowV1alpha1Sequence = (Sequence) o;
    return Objects.equals(this.count, ioArgoprojWorkflowV1alpha1Sequence.count) &&
        Objects.equals(this.end, ioArgoprojWorkflowV1alpha1Sequence.end) &&
        Objects.equals(this.format, ioArgoprojWorkflowV1alpha1Sequence.format) &&
        Objects.equals(this.start, ioArgoprojWorkflowV1alpha1Sequence.start);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, end, format, start);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1Sequence {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
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

