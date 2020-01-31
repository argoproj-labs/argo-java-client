/*
 * Argo
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v2.5.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.argoproj.workflow.v1alpha;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ItemValue
 */
@javax.annotation.Generated(value = "io.argoproj.workflow.codegen.ArgoprojJavaClientOpenapiCodeGenerator", date = "2020-01-30T23:33:15.337Z[GMT]")
public class ItemValue {
  public static final String SERIALIZED_NAME_BOOL_VAL = "BoolVal";
  @SerializedName(SERIALIZED_NAME_BOOL_VAL)
  private Boolean boolVal;

  public static final String SERIALIZED_NAME_LIST_VAL = "ListVal";
  @SerializedName(SERIALIZED_NAME_LIST_VAL)
  private List<byte[]> listVal = new ArrayList<byte[]>();

  public static final String SERIALIZED_NAME_MAP_VAL = "MapVal";
  @SerializedName(SERIALIZED_NAME_MAP_VAL)
  private Map<String, String> mapVal = new HashMap<String, String>();

  public static final String SERIALIZED_NAME_NUM_VAL = "NumVal";
  @SerializedName(SERIALIZED_NAME_NUM_VAL)
  private String numVal;

  public static final String SERIALIZED_NAME_STR_VAL = "StrVal";
  @SerializedName(SERIALIZED_NAME_STR_VAL)
  private String strVal;

  public static final String SERIALIZED_NAME_TYPE = "Type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private Integer type;


  public ItemValue boolVal(Boolean boolVal) {
    
    this.boolVal = boolVal;
    return this;
  }

   /**
   * Get boolVal
   * @return boolVal
  **/
  @ApiModelProperty(required = true, value = "")

  public Boolean getBoolVal() {
    return boolVal;
  }


  public void setBoolVal(Boolean boolVal) {
    this.boolVal = boolVal;
  }


  public ItemValue listVal(List<byte[]> listVal) {
    
    this.listVal = listVal;
    return this;
  }

  public ItemValue addListValItem(byte[] listValItem) {
    this.listVal.add(listValItem);
    return this;
  }

   /**
   * Get listVal
   * @return listVal
  **/
  @ApiModelProperty(required = true, value = "")

  public List<byte[]> getListVal() {
    return listVal;
  }


  public void setListVal(List<byte[]> listVal) {
    this.listVal = listVal;
  }


  public ItemValue mapVal(Map<String, String> mapVal) {
    
    this.mapVal = mapVal;
    return this;
  }

  public ItemValue putMapValItem(String key, String mapValItem) {
    this.mapVal.put(key, mapValItem);
    return this;
  }

   /**
   * Get mapVal
   * @return mapVal
  **/
  @ApiModelProperty(required = true, value = "")

  public Map<String, String> getMapVal() {
    return mapVal;
  }


  public void setMapVal(Map<String, String> mapVal) {
    this.mapVal = mapVal;
  }


  public ItemValue numVal(String numVal) {
    
    this.numVal = numVal;
    return this;
  }

   /**
   * Get numVal
   * @return numVal
  **/
  @ApiModelProperty(required = true, value = "")

  public String getNumVal() {
    return numVal;
  }


  public void setNumVal(String numVal) {
    this.numVal = numVal;
  }


  public ItemValue strVal(String strVal) {
    
    this.strVal = strVal;
    return this;
  }

   /**
   * Get strVal
   * @return strVal
  **/
  @ApiModelProperty(required = true, value = "")

  public String getStrVal() {
    return strVal;
  }


  public void setStrVal(String strVal) {
    this.strVal = strVal;
  }


  public ItemValue type(Integer type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")

  public Integer getType() {
    return type;
  }


  public void setType(Integer type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemValue ioArgoprojWorkflowV1alpha1ItemValue = (ItemValue) o;
    return Objects.equals(this.boolVal, ioArgoprojWorkflowV1alpha1ItemValue.boolVal) &&
        Objects.equals(this.listVal, ioArgoprojWorkflowV1alpha1ItemValue.listVal) &&
        Objects.equals(this.mapVal, ioArgoprojWorkflowV1alpha1ItemValue.mapVal) &&
        Objects.equals(this.numVal, ioArgoprojWorkflowV1alpha1ItemValue.numVal) &&
        Objects.equals(this.strVal, ioArgoprojWorkflowV1alpha1ItemValue.strVal) &&
        Objects.equals(this.type, ioArgoprojWorkflowV1alpha1ItemValue.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boolVal, listVal, mapVal, numVal, strVal, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemValue {\n");
    sb.append("    boolVal: ").append(toIndentedString(boolVal)).append("\n");
    sb.append("    listVal: ").append(toIndentedString(listVal)).append("\n");
    sb.append("    mapVal: ").append(toIndentedString(mapVal)).append("\n");
    sb.append("    numVal: ").append(toIndentedString(numVal)).append("\n");
    sb.append("    strVal: ").append(toIndentedString(strVal)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

