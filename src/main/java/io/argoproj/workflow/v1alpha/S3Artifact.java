package io.argoproj.workflow.v1alpha;

import java.util.Objects;

import io.kubernetes.client.models.V1SecretKeySelector;

/**
 * S3Artifact is the location of an S3 artifact
 */
public class S3Artifact   {
  private V1SecretKeySelector accessKeySecret = null;

  private String bucket;

  private String endpoint;

  private Boolean insecure;

  private String key;

  private String region;

  private V1SecretKeySelector secretKeySecret = null;

  public S3Artifact accessKeySecret(V1SecretKeySelector accessKeySecret) {
    this.accessKeySecret = accessKeySecret;
    return this;
  }

  /**
   * Get accessKeySecret
   * @return accessKeySecret
  */
  public V1SecretKeySelector getAccessKeySecret() {
    return accessKeySecret;
  }

  public void setAccessKeySecret(V1SecretKeySelector accessKeySecret) {
    this.accessKeySecret = accessKeySecret;
  }

  public S3Artifact bucket(String bucket) {
    this.bucket = bucket;
    return this;
  }

  /**
   * Bucket is the name of the bucket
   * @return bucket
  */
  public String getBucket() {
    return bucket;
  }

  public void setBucket(String bucket) {
    this.bucket = bucket;
  }

  public S3Artifact endpoint(String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

  /**
   * Endpoint is the hostname of the bucket endpoint
   * @return endpoint
  */
  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  public S3Artifact insecure(Boolean insecure) {
    this.insecure = insecure;
    return this;
  }

  /**
   * Insecure will connect to the service with TLS
   * @return insecure
  */
  public Boolean getInsecure() {
    return insecure;
  }

  public void setInsecure(Boolean insecure) {
    this.insecure = insecure;
  }

  public S3Artifact key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Key is the key in the bucket where the artifact resides
   * @return key
  */
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public S3Artifact region(String region) {
    this.region = region;
    return this;
  }

  /**
   * Region contains the optional bucket region
   * @return region
  */
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public S3Artifact secretKeySecret(V1SecretKeySelector secretKeySecret) {
    this.secretKeySecret = secretKeySecret;
    return this;
  }

  /**
   * Get secretKeySecret
   * @return secretKeySecret
  */
  public V1SecretKeySelector getSecretKeySecret() {
    return secretKeySecret;
  }

  public void setSecretKeySecret(V1SecretKeySelector secretKeySecret) {
    this.secretKeySecret = secretKeySecret;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    S3Artifact ioArgoprojWorkflowV1alpha1S3Artifact = (S3Artifact) o;
    return Objects.equals(this.accessKeySecret, ioArgoprojWorkflowV1alpha1S3Artifact.accessKeySecret) &&
        Objects.equals(this.bucket, ioArgoprojWorkflowV1alpha1S3Artifact.bucket) &&
        Objects.equals(this.endpoint, ioArgoprojWorkflowV1alpha1S3Artifact.endpoint) &&
        Objects.equals(this.insecure, ioArgoprojWorkflowV1alpha1S3Artifact.insecure) &&
        Objects.equals(this.key, ioArgoprojWorkflowV1alpha1S3Artifact.key) &&
        Objects.equals(this.region, ioArgoprojWorkflowV1alpha1S3Artifact.region) &&
        Objects.equals(this.secretKeySecret, ioArgoprojWorkflowV1alpha1S3Artifact.secretKeySecret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKeySecret, bucket, endpoint, insecure, key, region, secretKeySecret);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1S3Artifact {\n");
    
    sb.append("    accessKeySecret: ").append(toIndentedString(accessKeySecret)).append("\n");
    sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    insecure: ").append(toIndentedString(insecure)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    secretKeySecret: ").append(toIndentedString(secretKeySecret)).append("\n");
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

