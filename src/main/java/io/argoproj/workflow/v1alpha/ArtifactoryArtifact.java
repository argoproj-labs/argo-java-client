package io.argoproj.workflow.v1alpha;

import java.util.Objects;

import io.kubernetes.client.models.V1SecretKeySelector;

/**
 * ArtifactoryArtifact is the location of an artifactory artifact
 */
public class ArtifactoryArtifact   {
  private V1SecretKeySelector passwordSecret = null;

  private String url;

  private V1SecretKeySelector usernameSecret = null;

  public ArtifactoryArtifact passwordSecret(V1SecretKeySelector passwordSecret) {
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

  public ArtifactoryArtifact url(String url) {
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

  public ArtifactoryArtifact usernameSecret(V1SecretKeySelector usernameSecret) {
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
    ArtifactoryArtifact ioArgoprojWorkflowV1alpha1ArtifactoryArtifact = (ArtifactoryArtifact) o;
    return Objects.equals(this.passwordSecret, ioArgoprojWorkflowV1alpha1ArtifactoryArtifact.passwordSecret) &&
        Objects.equals(this.url, ioArgoprojWorkflowV1alpha1ArtifactoryArtifact.url) &&
        Objects.equals(this.usernameSecret, ioArgoprojWorkflowV1alpha1ArtifactoryArtifact.usernameSecret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(passwordSecret, url, usernameSecret);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1ArtifactoryArtifact {\n");
    
    sb.append("    passwordSecret: ").append(toIndentedString(passwordSecret)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

