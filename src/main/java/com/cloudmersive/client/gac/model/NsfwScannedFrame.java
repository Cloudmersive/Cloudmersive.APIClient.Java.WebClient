/*
 * videoapi
 * The video APIs help you convert, encode, and transcode videos.
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
 * An individual frame scanned for NSFW content
 */
@ApiModel(description = "An individual frame scanned for NSFW content")
@JsonPropertyOrder({
  NsfwScannedFrame.JSON_PROPERTY_FRAME_NUMBER,
  NsfwScannedFrame.JSON_PROPERTY_TIME_STAMP,
  NsfwScannedFrame.JSON_PROPERTY_CONTENT,
  NsfwScannedFrame.JSON_PROPERTY_CLASSIFICATION_RESULT,
  NsfwScannedFrame.JSON_PROPERTY_SCORE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:16:51.413353-07:00[America/Los_Angeles]")
public class NsfwScannedFrame {
  public static final String JSON_PROPERTY_FRAME_NUMBER = "FrameNumber";
  private Integer frameNumber;

  public static final String JSON_PROPERTY_TIME_STAMP = "TimeStamp";
  private String timeStamp;

  public static final String JSON_PROPERTY_CONTENT = "Content";
  private byte[] content;

  public static final String JSON_PROPERTY_CLASSIFICATION_RESULT = "ClassificationResult";
  private String classificationResult;

  public static final String JSON_PROPERTY_SCORE = "Score";
  private Double score;

  public NsfwScannedFrame() { 
  }

  public NsfwScannedFrame frameNumber(Integer frameNumber) {
    
    this.frameNumber = frameNumber;
    return this;
  }

   /**
   * The number of the current frame
   * @return frameNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of the current frame")
  @JsonProperty(JSON_PROPERTY_FRAME_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFrameNumber() {
    return frameNumber;
  }


  @JsonProperty(JSON_PROPERTY_FRAME_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFrameNumber(Integer frameNumber) {
    this.frameNumber = frameNumber;
  }


  public NsfwScannedFrame timeStamp(String timeStamp) {
    
    this.timeStamp = timeStamp;
    return this;
  }

   /**
   * The playback time of the current frame
   * @return timeStamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The playback time of the current frame")
  @JsonProperty(JSON_PROPERTY_TIME_STAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimeStamp() {
    return timeStamp;
  }


  @JsonProperty(JSON_PROPERTY_TIME_STAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeStamp(String timeStamp) {
    this.timeStamp = timeStamp;
  }


  public NsfwScannedFrame content(byte[] content) {
    
    this.content = content;
    return this;
  }

   /**
   * The still frame in PNG format as a byte array
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The still frame in PNG format as a byte array")
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public byte[] getContent() {
    return content;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContent(byte[] content) {
    this.content = content;
  }


  public NsfwScannedFrame classificationResult(String classificationResult) {
    
    this.classificationResult = classificationResult;
    return this;
  }

   /**
   * The NSFW classification of the still frame
   * @return classificationResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The NSFW classification of the still frame")
  @JsonProperty(JSON_PROPERTY_CLASSIFICATION_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClassificationResult() {
    return classificationResult;
  }


  @JsonProperty(JSON_PROPERTY_CLASSIFICATION_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClassificationResult(String classificationResult) {
    this.classificationResult = classificationResult;
  }


  public NsfwScannedFrame score(Double score) {
    
    this.score = score;
    return this;
  }

   /**
   * The NSFW score of the current frame
   * @return score
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The NSFW score of the current frame")
  @JsonProperty(JSON_PROPERTY_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getScore() {
    return score;
  }


  @JsonProperty(JSON_PROPERTY_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScore(Double score) {
    this.score = score;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NsfwScannedFrame nsfwScannedFrame = (NsfwScannedFrame) o;
    return Objects.equals(this.frameNumber, nsfwScannedFrame.frameNumber) &&
        Objects.equals(this.timeStamp, nsfwScannedFrame.timeStamp) &&
        Arrays.equals(this.content, nsfwScannedFrame.content) &&
        Objects.equals(this.classificationResult, nsfwScannedFrame.classificationResult) &&
        Objects.equals(this.score, nsfwScannedFrame.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frameNumber, timeStamp, Arrays.hashCode(content), classificationResult, score);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NsfwScannedFrame {\n");
    sb.append("    frameNumber: ").append(toIndentedString(frameNumber)).append("\n");
    sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    classificationResult: ").append(toIndentedString(classificationResult)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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

