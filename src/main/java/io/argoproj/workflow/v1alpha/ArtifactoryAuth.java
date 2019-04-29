package io.argoproj.workflow.v1alpha;

import java.util.Objects;

import io.kubernetes.client.models.V1SecretKeySelector;

/**
 * ArtifactoryAuth describes the secret selectors required for authenticating to artifactory
 */
public class ArtifactoryAuth   {
  private V1SecretKeySelector passwordSecret = null;

  private V1SecretKeySelector usernameSecret = null;

  public ArtifactoryAuth passwordSecret(V1SecretKeySelector passwordSecret) {
    this.passwordSecret = passwordSecret;
    return this;
  }

  /**
   * Get passwordSecret
   * @return passwordSecret
  */
  public V1SecretKeySelector getPasswordSecret() {
    return passwordSecret;
  }

  public void setPasswordSecret(V1SecretKeySelector passwordSecret) {
    this.passwordSecret = passwordSecret;
  }

  public ArtifactoryAuth usernameSecret(V1SecretKeySelector usernameSecret) {
    this.usernameSecret = usernameSecret;
    return this;
  }

  /**
   * Get usernameSecret
   * @return usernameSecret
  */
  public V1SecretKeySelector getUsernameSecret() {
    return usernameSecret;
  }

  public void setUsernameSecret(V1SecretKeySelector usernameSecret) {
    this.usernameSecret = usernameSecret;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArtifactoryAuth ioArgoprojWorkflowV1alpha1ArtifactoryAuth = (ArtifactoryAuth) o;
    return Objects.equals(this.passwordSecret, ioArgoprojWorkflowV1alpha1ArtifactoryAuth.passwordSecret) &&
        Objects.equals(this.usernameSecret, ioArgoprojWorkflowV1alpha1ArtifactoryAuth.usernameSecret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(passwordSecret, usernameSecret);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1ArtifactoryAuth {\n");
    
    sb.append("    passwordSecret: ").append(toIndentedString(passwordSecret)).append("\n");
    sb.append("    usernameSecret: ").append(toIndentedString(usernameSecret)).append("\n");
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

