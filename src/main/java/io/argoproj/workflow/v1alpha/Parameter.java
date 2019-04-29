package io.argoproj.workflow.v1alpha;

import java.util.Objects;

/**
 * Parameter indicate a passed string parameter to a service template with an optional default value
 */
public class Parameter   {
  private String _default;

  private String globalName;

  private String name;

  private String value;

  private ValueFrom valueFrom = null;

  public Parameter _default(String _default) {
    this._default = _default;
    return this;
  }

  /**
   * Default is the default value to use for an input parameter if a value was not supplied
   * @return _default
  */
  public String getDefault() {
    return _default;
  }

  public void setDefault(String _default) {
    this._default = _default;
  }

  public Parameter globalName(String globalName) {
    this.globalName = globalName;
    return this;
  }

  /**
   * GlobalName exports an output parameter to the global scope, making it available as '{{workflow.outputs.parameters.XXXX}} and in workflow.status.outputs.parameters
   * @return globalName
  */
  public String getGlobalName() {
    return globalName;
  }

  public void setGlobalName(String globalName) {
    this.globalName = globalName;
  }

  public Parameter name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name is the parameter name
   * @return name
  */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Parameter value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Value is the literal value to use for the parameter. If specified in the context of an input parameter, the value takes precedence over any passed values
   * @return value
  */
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Parameter valueFrom(ValueFrom valueFrom) {
    this.valueFrom = valueFrom;
    return this;
  }

  /**
   * Get valueFrom
   * @return valueFrom
  */
  public ValueFrom getValueFrom() {
    return valueFrom;
  }

  public void setValueFrom(ValueFrom valueFrom) {
    this.valueFrom = valueFrom;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Parameter ioArgoprojWorkflowV1alpha1Parameter = (Parameter) o;
    return Objects.equals(this._default, ioArgoprojWorkflowV1alpha1Parameter._default) &&
        Objects.equals(this.globalName, ioArgoprojWorkflowV1alpha1Parameter.globalName) &&
        Objects.equals(this.name, ioArgoprojWorkflowV1alpha1Parameter.name) &&
        Objects.equals(this.value, ioArgoprojWorkflowV1alpha1Parameter.value) &&
        Objects.equals(this.valueFrom, ioArgoprojWorkflowV1alpha1Parameter.valueFrom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_default, globalName, name, value, valueFrom);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1Parameter {\n");
    
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    globalName: ").append(toIndentedString(globalName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    valueFrom: ").append(toIndentedString(valueFrom)).append("\n");
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

