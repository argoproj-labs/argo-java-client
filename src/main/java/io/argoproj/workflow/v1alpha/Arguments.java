package io.argoproj.workflow.v1alpha;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

/**
 * Arguments to a template
 */
public class Arguments   {
  private List<Artifact> artifacts = null;

  private List<Parameter> parameters = null;

  public Arguments artifacts(List<Artifact> artifacts) {
    this.artifacts = artifacts;
    return this;
  }

  public Arguments addArtifactsItem(Artifact artifactsItem) {
    if (this.artifacts == null) {
      this.artifacts = new ArrayList<>();
    }
    this.artifacts.add(artifactsItem);
    return this;
  }

  /**
   * Artifacts is the list of artifacts to pass to the template or workflow
   * @return artifacts
  */
  public List<Artifact> getArtifacts() {
    return artifacts;
  }

  public void setArtifacts(List<Artifact> artifacts) {
    this.artifacts = artifacts;
  }

  public Arguments parameters(List<Parameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  public Arguments addParametersItem(Parameter parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

  /**
   * Parameters is the list of parameters to pass to the template or workflow
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
    Arguments ioArgoprojWorkflowV1alpha1Arguments = (Arguments) o;
    return Objects.equals(this.artifacts, ioArgoprojWorkflowV1alpha1Arguments.artifacts) &&
        Objects.equals(this.parameters, ioArgoprojWorkflowV1alpha1Arguments.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artifacts, parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1Arguments {\n");
    
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

