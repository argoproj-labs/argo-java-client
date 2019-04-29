package io.argoproj.workflow.v1alpha;

import java.util.Objects;

import io.kubernetes.client.models.V1ConfigMapKeySelector;
import io.kubernetes.client.models.V1SecretKeySelector;

import java.util.ArrayList;
import java.util.List;

/**
 * HDFSConfig is configurations for HDFS
 */
public class HDFSConfig   {
  private List<String> addresses = new ArrayList<>();

  private String hdfsUser;

  private V1SecretKeySelector krbCCacheSecret = null;

  private V1ConfigMapKeySelector krbConfigConfigMap = null;

  private V1SecretKeySelector krbKeytabSecret = null;

  private String krbRealm;

  private String krbServicePrincipalName;

  private String krbUsername;

  public HDFSConfig addresses(List<String> addresses) {
    this.addresses = addresses;
    return this;
  }

  public HDFSConfig addAddressesItem(String addressesItem) {
    this.addresses.add(addressesItem);
    return this;
  }

  /**
   * Addresses is accessible addresses of HDFS name nodes
   * @return addresses
  */

  public List<String> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<String> addresses) {
    this.addresses = addresses;
  }

  public HDFSConfig hdfsUser(String hdfsUser) {
    this.hdfsUser = hdfsUser;
    return this;
  }

  /**
   * HDFSUser is the user to access HDFS file system. It is ignored if either ccache or keytab is used.
   * @return hdfsUser
  */

  public String getHdfsUser() {
    return hdfsUser;
  }

  public void setHdfsUser(String hdfsUser) {
    this.hdfsUser = hdfsUser;
  }

  public HDFSConfig krbCCacheSecret(V1SecretKeySelector krbCCacheSecret) {
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

  public HDFSConfig krbConfigConfigMap(V1ConfigMapKeySelector krbConfigConfigMap) {
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

  public HDFSConfig krbKeytabSecret(V1SecretKeySelector krbKeytabSecret) {
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

  public HDFSConfig krbRealm(String krbRealm) {
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

  public HDFSConfig krbServicePrincipalName(String krbServicePrincipalName) {
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

  public HDFSConfig krbUsername(String krbUsername) {
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
    HDFSConfig ioArgoprojWorkflowV1alpha1HDFSConfig = (HDFSConfig) o;
    return Objects.equals(this.addresses, ioArgoprojWorkflowV1alpha1HDFSConfig.addresses) &&
        Objects.equals(this.hdfsUser, ioArgoprojWorkflowV1alpha1HDFSConfig.hdfsUser) &&
        Objects.equals(this.krbCCacheSecret, ioArgoprojWorkflowV1alpha1HDFSConfig.krbCCacheSecret) &&
        Objects.equals(this.krbConfigConfigMap, ioArgoprojWorkflowV1alpha1HDFSConfig.krbConfigConfigMap) &&
        Objects.equals(this.krbKeytabSecret, ioArgoprojWorkflowV1alpha1HDFSConfig.krbKeytabSecret) &&
        Objects.equals(this.krbRealm, ioArgoprojWorkflowV1alpha1HDFSConfig.krbRealm) &&
        Objects.equals(this.krbServicePrincipalName, ioArgoprojWorkflowV1alpha1HDFSConfig.krbServicePrincipalName) &&
        Objects.equals(this.krbUsername, ioArgoprojWorkflowV1alpha1HDFSConfig.krbUsername);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses, hdfsUser, krbCCacheSecret, krbConfigConfigMap, krbKeytabSecret, krbRealm, krbServicePrincipalName, krbUsername);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojWorkflowV1alpha1HDFSConfig {\n");
    
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    hdfsUser: ").append(toIndentedString(hdfsUser)).append("\n");
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

