package io.argoproj.workflow.v1alpha;

import java.util.Objects;

/**
 * ValueFrom describes a location in which to obtain the value to a parameter
 */
public class ValueFrom   {
  private String jqFilter;

  private String jsonPath;

  private String parameter;

  private String path;

  public ValueFrom jqFilter(String jqFilter) {
    this.jqFilter = jqFilter;
    return this;
  }

  /**
   * JQFilter expression against the resource object in resource templates
   * @return jqFilter
  */
  public String getJqFilter() {
    return jqFilter;
  }

  public void setJqFilter(String jqFilter) {
    this.jqFilter = jqFilter;
  }

  public ValueFrom jsonPath(String jsonPath) {
    this.jsonPath = jsonPath;
    return this;
  }

  /**
   * JSONPath of a resource to retrieve an output parameter value from in resource templates
   * @return jsonPath
  */
  public String getJsonPath() {
    return jsonPath;
  }

  public void setJsonPath(String jsonPath) {
    this.jsonPath = jsonPath;
  }

  public ValueFrom parameter(String parameter) {
    this.parameter = parameter;
    return this;
  }

  /**
   * Parameter reference to a step or dag task in which to retrieve an output parameter value from (e.g. '{{steps.mystep.outputs.myparam}}')
   * @return parameter
  */
  public String getParameter() {
    return parameter;
  }

  public void setParameter(String parameter) {
    this.parameter = parameter;
  }

  public ValueFrom path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Path in the container to retrieve an output parameter value from in container templates
   * @return path
  */
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValueFrom ioArgoprojWorkflowV1alpha1ValueFrom = (ValueFrom) o;
    return Objects.equals(this.jqFilter, ioArgoprojWorkflowV1alpha1ValueFrom.jqFilter) &&
        Objects.equals(this.jsonPath, ioArgoprojWorkflowV1alpha1ValueFrom.jsonPath) &&
        Objects.equals(this.parameter, ioArgoprojWorkflowV1alpha1ValueFrom.parameter) &&
        Objects.equals(this.path, ioArgoprojWorkflowV1alpha1ValueFrom.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jqFilter, jsonPath, parameter, path);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1ValueFrom {\n");
    
    sb.append("    jqFilter: ").append(toIndentedString(jqFilter)).append("\n");
    sb.append("    jsonPath: ").append(toIndentedString(jsonPath)).append("\n");
    sb.append("    parameter: ").append(toIndentedString(parameter)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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

