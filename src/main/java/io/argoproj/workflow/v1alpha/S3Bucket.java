package io.argoproj.workflow.v1alpha;

import java.util.Objects;

import io.kubernetes.client.models.V1SecretKeySelector;

/**
 * S3Bucket contains the access information required for interfacing with an S3 bucket
 */
public class S3Bucket   {
  private V1SecretKeySelector accessKeySecret = null;

  private String bucket;

  private String endpoint;

  private Boolean insecure;

  private String region;

  private V1SecretKeySelector secretKeySecret = null;

  public S3Bucket accessKeySecret(V1SecretKeySelector accessKeySecret) {
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

  public S3Bucket bucket(String bucket) {
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

  public S3Bucket endpoint(String endpoint) {
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

  public S3Bucket insecure(Boolean insecure) {
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

  public S3Bucket region(String region) {
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

  public S3Bucket secretKeySecret(V1SecretKeySelector secretKeySecret) {
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
    S3Bucket ioArgoprojWorkflowV1alpha1S3Bucket = (S3Bucket) o;
    return Objects.equals(this.accessKeySecret, ioArgoprojWorkflowV1alpha1S3Bucket.accessKeySecret) &&
        Objects.equals(this.bucket, ioArgoprojWorkflowV1alpha1S3Bucket.bucket) &&
        Objects.equals(this.endpoint, ioArgoprojWorkflowV1alpha1S3Bucket.endpoint) &&
        Objects.equals(this.insecure, ioArgoprojWorkflowV1alpha1S3Bucket.insecure) &&
        Objects.equals(this.region, ioArgoprojWorkflowV1alpha1S3Bucket.region) &&
        Objects.equals(this.secretKeySecret, ioArgoprojWorkflowV1alpha1S3Bucket.secretKeySecret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKeySecret, bucket, endpoint, insecure, region, secretKeySecret);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1S3Bucket {\n");
    
    sb.append("    accessKeySecret: ").append(toIndentedString(accessKeySecret)).append("\n");
    sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    insecure: ").append(toIndentedString(insecure)).append("\n");
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

