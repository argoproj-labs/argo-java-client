package io.argoproj.workflow.v1alpha;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

/**
 * Outputs hold parameters, artifacts, and results from a step
 */
public class Outputs   {
  private List<Artifact> artifacts = null;

  private List<Parameter> parameters = null;

  private String result;

  public Outputs artifacts(List<Artifact> artifacts) {
    this.artifacts = artifacts;
    return this;
  }

  public Outputs addArtifactsItem(Artifact artifactsItem) {
    if (this.artifacts == null) {
      this.artifacts = new ArrayList<>();
    }
    this.artifacts.add(artifactsItem);
    return this;
  }

  /**
   * Artifacts holds the list of output artifacts produced by a step
   * @return artifacts
  */
  public List<Artifact> getArtifacts() {
    return artifacts;
  }

  public void setArtifacts(List<Artifact> artifacts) {
    this.artifacts = artifacts;
  }

  public Outputs parameters(List<Parameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  public Outputs addParametersItem(Parameter parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

  /**
   * Parameters holds the list of output parameters produced by a step
   * @return parameters
  */
  public List<Parameter> getParameters() {
    return parameters;
  }

  public void setParameters(List<Parameter> parameters) {
    this.parameters = parameters;
  }

  public Outputs result(String result) {
    this.result = result;
    return this;
  }

  /**
   * Result holds the result (stdout) of a script template
   * @return result
  */
  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Outputs ioArgoprojWorkflowV1alpha1Outputs = (Outputs) o;
    return Objects.equals(this.artifacts, ioArgoprojWorkflowV1alpha1Outputs.artifacts) &&
        Objects.equals(this.parameters, ioArgoprojWorkflowV1alpha1Outputs.parameters) &&
        Objects.equals(this.result, ioArgoprojWorkflowV1alpha1Outputs.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artifacts, parameters, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1Outputs {\n");
    
    sb.append("    artifacts: ").append(toIndentedString(artifacts)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

