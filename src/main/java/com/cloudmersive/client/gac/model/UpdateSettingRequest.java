/*
 * configapi
 * Config API lets you easily manage configuration at scale.
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cloudmersive.client.gac.model;

import java.util.Objects;
import java.util.Arrays;
import com.cloudmersive.client.gac.model.SettingValue;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Request to update a setting
 */
@ApiModel(description = "Request to update a setting")
@JsonPropertyOrder({
  UpdateSettingRequest.JSON_PROPERTY_BUCKET_I_D,
  UpdateSettingRequest.JSON_PROPERTY_BUCKET_SECRET_KEY,
  UpdateSettingRequest.JSON_PROPERTY_SETTING_TO_UPDATE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-02T23:27:12.838058600-07:00[America/Los_Angeles]")
public class UpdateSettingRequest {
  public static final String JSON_PROPERTY_BUCKET_I_D = "BucketID";
  private String bucketID;

  public static final String JSON_PROPERTY_BUCKET_SECRET_KEY = "BucketSecretKey";
  private String bucketSecretKey;

  public static final String JSON_PROPERTY_SETTING_TO_UPDATE = "SettingToUpdate";
  private SettingValue settingToUpdate;

  public UpdateSettingRequest() { 
  }

  public UpdateSettingRequest bucketID(String bucketID) {
    
    this.bucketID = bucketID;
    return this;
  }

   /**
   * Get bucketID
   * @return bucketID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BUCKET_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBucketID() {
    return bucketID;
  }


  @JsonProperty(JSON_PROPERTY_BUCKET_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBucketID(String bucketID) {
    this.bucketID = bucketID;
  }


  public UpdateSettingRequest bucketSecretKey(String bucketSecretKey) {
    
    this.bucketSecretKey = bucketSecretKey;
    return this;
  }

   /**
   * Get bucketSecretKey
   * @return bucketSecretKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BUCKET_SECRET_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBucketSecretKey() {
    return bucketSecretKey;
  }


  @JsonProperty(JSON_PROPERTY_BUCKET_SECRET_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBucketSecretKey(String bucketSecretKey) {
    this.bucketSecretKey = bucketSecretKey;
  }


  public UpdateSettingRequest settingToUpdate(SettingValue settingToUpdate) {
    
    this.settingToUpdate = settingToUpdate;
    return this;
  }

   /**
   * Get settingToUpdate
   * @return settingToUpdate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SETTING_TO_UPDATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SettingValue getSettingToUpdate() {
    return settingToUpdate;
  }


  @JsonProperty(JSON_PROPERTY_SETTING_TO_UPDATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSettingToUpdate(SettingValue settingToUpdate) {
    this.settingToUpdate = settingToUpdate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateSettingRequest updateSettingRequest = (UpdateSettingRequest) o;
    return Objects.equals(this.bucketID, updateSettingRequest.bucketID) &&
        Objects.equals(this.bucketSecretKey, updateSettingRequest.bucketSecretKey) &&
        Objects.equals(this.settingToUpdate, updateSettingRequest.settingToUpdate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bucketID, bucketSecretKey, settingToUpdate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSettingRequest {\n");
    sb.append("    bucketID: ").append(toIndentedString(bucketID)).append("\n");
    sb.append("    bucketSecretKey: ").append(toIndentedString(bucketSecretKey)).append("\n");
    sb.append("    settingToUpdate: ").append(toIndentedString(settingToUpdate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

