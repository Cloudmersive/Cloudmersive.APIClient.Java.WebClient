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
 * Request to enumerate settings
 */
@ApiModel(description = "Request to enumerate settings")
@JsonPropertyOrder({
  ListSettingsRequest.JSON_PROPERTY_BUCKET_I_D,
  ListSettingsRequest.JSON_PROPERTY_BUCKET_SECRET_KEY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:18:15.810531700-07:00[America/Los_Angeles]")
public class ListSettingsRequest {
  public static final String JSON_PROPERTY_BUCKET_I_D = "BucketID";
  private String bucketID;

  public static final String JSON_PROPERTY_BUCKET_SECRET_KEY = "BucketSecretKey";
  private String bucketSecretKey;

  public ListSettingsRequest() { 
  }

  public ListSettingsRequest bucketID(String bucketID) {
    
    this.bucketID = bucketID;
    return this;
  }

   /**
   * BucketID of the bucket to enumerate the settings of; you can create a bucket by navigating to account.cloudmersive.com, clicking on Settings &amp;gt; API Configuration &amp;gt; Create Bucket
   * @return bucketID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "BucketID of the bucket to enumerate the settings of; you can create a bucket by navigating to account.cloudmersive.com, clicking on Settings &gt; API Configuration &gt; Create Bucket")
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


  public ListSettingsRequest bucketSecretKey(String bucketSecretKey) {
    
    this.bucketSecretKey = bucketSecretKey;
    return this;
  }

   /**
   * SecretKey of the bucket enumerate the settings of; you can create a bucket by navigating to account.cloudmersive.com, clicking on Settings &amp;gt; API Configuration &amp;gt; Create Bucket
   * @return bucketSecretKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SecretKey of the bucket enumerate the settings of; you can create a bucket by navigating to account.cloudmersive.com, clicking on Settings &gt; API Configuration &gt; Create Bucket")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListSettingsRequest listSettingsRequest = (ListSettingsRequest) o;
    return Objects.equals(this.bucketID, listSettingsRequest.bucketID) &&
        Objects.equals(this.bucketSecretKey, listSettingsRequest.bucketSecretKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bucketID, bucketSecretKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListSettingsRequest {\n");
    sb.append("    bucketID: ").append(toIndentedString(bucketID)).append("\n");
    sb.append("    bucketSecretKey: ").append(toIndentedString(bucketSecretKey)).append("\n");
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

