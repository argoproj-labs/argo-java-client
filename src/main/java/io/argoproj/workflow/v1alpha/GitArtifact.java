package io.argoproj.workflow.v1alpha;

import java.util.Objects;

import io.kubernetes.client.models.V1SecretKeySelector;

/**
 * GitArtifact is the location of an git artifact
 */
public class GitArtifact   {
  private Boolean insecureIgnoreHostKey;

  private V1SecretKeySelector passwordSecret = null;

  private String repo;

  private String revision;

  private V1SecretKeySelector sshPrivateKeySecret = null;

  private V1SecretKeySelector usernameSecret = null;

  public GitArtifact insecureIgnoreHostKey(Boolean insecureIgnoreHostKey) {
    this.insecureIgnoreHostKey = insecureIgnoreHostKey;
    return this;
  }

  /**
   * InsecureIgnoreHostKey disables SSH strict host key checking during git clone
   * @return insecureIgnoreHostKey
  */
  public Boolean getInsecureIgnoreHostKey() {
    return insecureIgnoreHostKey;
  }

  public void setInsecureIgnoreHostKey(Boolean insecureIgnoreHostKey) {
    this.insecureIgnoreHostKey = insecureIgnoreHostKey;
  }

  public GitArtifact passwordSecret(V1SecretKeySelector passwordSecret) {
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

  public GitArtifact repo(String repo) {
    this.repo = repo;
    return this;
  }

  /**
   * Repo is the git repository
   * @return repo
  */
  public String getRepo() {
    return repo;
  }

  public void setRepo(String repo) {
    this.repo = repo;
  }

  public GitArtifact revision(String revision) {
    this.revision = revision;
    return this;
  }

  /**
   * Revision is the git commit, tag, branch to checkout
   * @return revision
  */
  public String getRevision() {
    return revision;
  }

  public void setRevision(String revision) {
    this.revision = revision;
  }

  public GitArtifact sshPrivateKeySecret(V1SecretKeySelector sshPrivateKeySecret) {
    this.sshPrivateKeySecret = sshPrivateKeySecret;
    return this;
  }

  /**
   * Get sshPrivateKeySecret
   * @return sshPrivateKeySecret
  */
  public V1SecretKeySelector getSshPrivateKeySecret() {
    return sshPrivateKeySecret;
  }

  public void setSshPrivateKeySecret(V1SecretKeySelector sshPrivateKeySecret) {
    this.sshPrivateKeySecret = sshPrivateKeySecret;
  }

  public GitArtifact usernameSecret(V1SecretKeySelector usernameSecret) {
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
    GitArtifact ioArgoprojWorkflowV1alpha1GitArtifact = (GitArtifact) o;
    return Objects.equals(this.insecureIgnoreHostKey, ioArgoprojWorkflowV1alpha1GitArtifact.insecureIgnoreHostKey) &&
        Objects.equals(this.passwordSecret, ioArgoprojWorkflowV1alpha1GitArtifact.passwordSecret) &&
        Objects.equals(this.repo, ioArgoprojWorkflowV1alpha1GitArtifact.repo) &&
        Objects.equals(this.revision, ioArgoprojWorkflowV1alpha1GitArtifact.revision) &&
        Objects.equals(this.sshPrivateKeySecret, ioArgoprojWorkflowV1alpha1GitArtifact.sshPrivateKeySecret) &&
        Objects.equals(this.usernameSecret, ioArgoprojWorkflowV1alpha1GitArtifact.usernameSecret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(insecureIgnoreHostKey, passwordSecret, repo, revision, sshPrivateKeySecret, usernameSecret);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1GitArtifact {\n");
    
    sb.append("    insecureIgnoreHostKey: ").append(toIndentedString(insecureIgnoreHostKey)).append("\n");
    sb.append("    passwordSecret: ").append(toIndentedString(passwordSecret)).append("\n");
    sb.append("    repo: ").append(toIndentedString(repo)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    sshPrivateKeySecret: ").append(toIndentedString(sshPrivateKeySecret)).append("\n");
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

