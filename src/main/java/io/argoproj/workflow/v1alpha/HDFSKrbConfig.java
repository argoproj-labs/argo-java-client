package io.argoproj.workflow.v1alpha;

import java.util.Objects;

import io.kubernetes.client.models.V1ConfigMapKeySelector;
import io.kubernetes.client.models.V1SecretKeySelector;

/**
 * HDFSKrbConfig is auth configurations for Kerberos
 */
public class HDFSKrbConfig   {
  private V1SecretKeySelector krbCCacheSecret = null;

  private V1ConfigMapKeySelector krbConfigConfigMap = null;

  private V1SecretKeySelector krbKeytabSecret = null;

  private String krbRealm;

  private String krbServicePrincipalName;

  private String krbUsername;

  public HDFSKrbConfig krbCCacheSecret(V1SecretKeySelector krbCCacheSecret) {
    this.krbCCacheSecret = krbCCacheSecret;
    return this;
  }

  /**
   * Get krbCCacheSecret
   * @return krbCCacheSecret
  */
  public V1SecretKeySelector getKrbCCacheSecret() {
    return krbCCacheSecret;
  }

  public void setKrbCCacheSecret(V1SecretKeySelector krbCCacheSecret) {
    this.krbCCacheSecret = krbCCacheSecret;
  }

  public HDFSKrbConfig krbConfigConfigMap(V1ConfigMapKeySelector krbConfigConfigMap) {
    this.krbConfigConfigMap = krbConfigConfigMap;
    return this;
  }

  /**
   * Get krbConfigConfigMap
   * @return krbConfigConfigMap
  */
  public V1ConfigMapKeySelector getKrbConfigConfigMap() {
    return krbConfigConfigMap;
  }

  public void setKrbConfigConfigMap(V1ConfigMapKeySelector krbConfigConfigMap) {
    this.krbConfigConfigMap = krbConfigConfigMap;
  }

  public HDFSKrbConfig krbKeytabSecret(V1SecretKeySelector krbKeytabSecret) {
    this.krbKeytabSecret = krbKeytabSecret;
    return this;
  }

  /**
   * Get krbKeytabSecret
   * @return krbKeytabSecret
  */
  public V1SecretKeySelector getKrbKeytabSecret() {
    return krbKeytabSecret;
  }

  public void setKrbKeytabSecret(V1SecretKeySelector krbKeytabSecret) {
    this.krbKeytabSecret = krbKeytabSecret;
  }

  public HDFSKrbConfig krbRealm(String krbRealm) {
    this.krbRealm = krbRealm;
    return this;
  }

  /**
   * KrbRealm is the Kerberos realm used with Kerberos keytab It must be set if keytab is used.
   * @return krbRealm
  */
  public String getKrbRealm() {
    return krbRealm;
  }

  public void setKrbRealm(String krbRealm) {
    this.krbRealm = krbRealm;
  }

  public HDFSKrbConfig krbServicePrincipalName(String krbServicePrincipalName) {
    this.krbServicePrincipalName = krbServicePrincipalName;
    return this;
  }

  /**
   * KrbServicePrincipalName is the principal name of Kerberos service It must be set if either ccache or keytab is used.
   * @return krbServicePrincipalName
  */
  public String getKrbServicePrincipalName() {
    return krbServicePrincipalName;
  }

  public void setKrbServicePrincipalName(String krbServicePrincipalName) {
    this.krbServicePrincipalName = krbServicePrincipalName;
  }

  public HDFSKrbConfig krbUsername(String krbUsername) {
    this.krbUsername = krbUsername;
    return this;
  }

  /**
   * KrbUsername is the Kerberos username used with Kerberos keytab It must be set if keytab is used.
   * @return krbUsername
  */
  public String getKrbUsername() {
    return krbUsername;
  }

  public void setKrbUsername(String krbUsername) {
    this.krbUsername = krbUsername;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HDFSKrbConfig ioArgoprojWorkflowV1alpha1HDFSKrbConfig = (HDFSKrbConfig) o;
    return Objects.equals(this.krbCCacheSecret, ioArgoprojWorkflowV1alpha1HDFSKrbConfig.krbCCacheSecret) &&
        Objects.equals(this.krbConfigConfigMap, ioArgoprojWorkflowV1alpha1HDFSKrbConfig.krbConfigConfigMap) &&
        Objects.equals(this.krbKeytabSecret, ioArgoprojWorkflowV1alpha1HDFSKrbConfig.krbKeytabSecret) &&
        Objects.equals(this.krbRealm, ioArgoprojWorkflowV1alpha1HDFSKrbConfig.krbRealm) &&
        Objects.equals(this.krbServicePrincipalName, ioArgoprojWorkflowV1alpha1HDFSKrbConfig.krbServicePrincipalName) &&
        Objects.equals(this.krbUsername, ioArgoprojWorkflowV1alpha1HDFSKrbConfig.krbUsername);
  }

  @Override
  public int hashCode() {
    return Objects.hash(krbCCacheSecret, krbConfigConfigMap, krbKeytabSecret, krbRealm, krbServicePrincipalName, krbUsername);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1HDFSKrbConfig {\n");
    
    sb.append("    krbCCacheSecret: ").append(toIndentedString(krbCCacheSecret)).append("\n");
    sb.append("    krbConfigConfigMap: ").append(toIndentedString(krbConfigConfigMap)).append("\n");
    sb.append("    krbKeytabSecret: ").append(toIndentedString(krbKeytabSecret)).append("\n");
    sb.append("    krbRealm: ").append(toIndentedString(krbRealm)).append("\n");
    sb.append("    krbServicePrincipalName: ").append(toIndentedString(krbServicePrincipalName)).append("\n");
    sb.append("    krbUsername: ").append(toIndentedString(krbUsername)).append("\n");
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

