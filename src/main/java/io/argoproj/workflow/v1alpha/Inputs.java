package io.argoproj.workflow.v1alpha;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

/**
 * Inputs are the mechanism for passing parameters, artifacts, volumes from one template to another
 */
public class Inputs   {
  private List<Artifact> artifacts = null;

  private List<Parameter> parameters = null;

  public Inputs artifacts(List<Artifact> artifacts) {
    this.artifacts = artifacts;
    return this;
  }

  public Inputs addArtifactsItem(Artifact artifactsItem) {
    if (this.artifacts == null) {
      this.artifacts = new ArrayList<>();
    }
    this.artifacts.add(artifactsItem);
    return this;
  }

  /**
   * Artifact are a list of artifacts passed as inputs
   * @return artifacts
  */
  public List<Artifact> getArtifacts() {
    return artifacts;
  }

  public void setArtifacts(List<Artifact> artifacts) {
    this.artifacts = artifacts;
  }

  public Inputs parameters(List<Parameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  public Inputs addParametersItem(Parameter parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

  /**
   * Parameters are a list of parameters passed as inputs
   * @return parameters
  */
  public List<Parameter> getParameters() {
    return parameters;
  }

  public void setParameters(List<Parameter> parameters) {
    this.parameters = parameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Inputs ioArgoprojWorkflowV1alpha1Inputs = (Inputs) o;
    return Objects.equals(this.artifacts, ioArgoprojWorkflowV1alpha1Inputs.artifacts) &&
        Objects.equals(this.parameters, ioArgoprojWorkflowV1alpha1Inputs.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artifacts, parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1Inputs {\n");
    
    sb.append("    artifacts: ").append(toIndentedString(artifacts)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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

