/*
 * imageapi
 * Image Recognition and Processing APIs let you use Machine Learning to recognize and process images, and also perform useful image modification operations.
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
import com.cloudmersive.client.gac.model.FacePoint;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Location of one face in an image
 */
@ApiModel(description = "Location of one face in an image")
@JsonPropertyOrder({
  FaceWithLandmarks.JSON_PROPERTY_LEFT_X,
  FaceWithLandmarks.JSON_PROPERTY_TOP_Y,
  FaceWithLandmarks.JSON_PROPERTY_RIGHT_X,
  FaceWithLandmarks.JSON_PROPERTY_BOTTOM_Y,
  FaceWithLandmarks.JSON_PROPERTY_LEFT_EYEBROW,
  FaceWithLandmarks.JSON_PROPERTY_RIGHT_EYEBROW,
  FaceWithLandmarks.JSON_PROPERTY_LEFT_EYE,
  FaceWithLandmarks.JSON_PROPERTY_RIGHT_EYE,
  FaceWithLandmarks.JSON_PROPERTY_BOTTOM_AND_SIDES_OF_FACE,
  FaceWithLandmarks.JSON_PROPERTY_NOSE_BRIDGE,
  FaceWithLandmarks.JSON_PROPERTY_NOSE_BOTTOM,
  FaceWithLandmarks.JSON_PROPERTY_LIPS_INNER_OUTLINE,
  FaceWithLandmarks.JSON_PROPERTY_LIPS_OUTER_OUTLINE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-02T23:26:57.968804100-07:00[America/Los_Angeles]")
public class FaceWithLandmarks {
  public static final String JSON_PROPERTY_LEFT_X = "LeftX";
  private Integer leftX;

  public static final String JSON_PROPERTY_TOP_Y = "TopY";
  private Integer topY;

  public static final String JSON_PROPERTY_RIGHT_X = "RightX";
  private Integer rightX;

  public static final String JSON_PROPERTY_BOTTOM_Y = "BottomY";
  private Integer bottomY;

  public static final String JSON_PROPERTY_LEFT_EYEBROW = "LeftEyebrow";
  private List<FacePoint> leftEyebrow = null;

  public static final String JSON_PROPERTY_RIGHT_EYEBROW = "RightEyebrow";
  private List<FacePoint> rightEyebrow = null;

  public static final String JSON_PROPERTY_LEFT_EYE = "LeftEye";
  private List<FacePoint> leftEye = null;

  public static final String JSON_PROPERTY_RIGHT_EYE = "RightEye";
  private List<FacePoint> rightEye = null;

  public static final String JSON_PROPERTY_BOTTOM_AND_SIDES_OF_FACE = "BottomAndSidesOfFace";
  private List<FacePoint> bottomAndSidesOfFace = null;

  public static final String JSON_PROPERTY_NOSE_BRIDGE = "NoseBridge";
  private List<FacePoint> noseBridge = null;

  public static final String JSON_PROPERTY_NOSE_BOTTOM = "NoseBottom";
  private List<FacePoint> noseBottom = null;

  public static final String JSON_PROPERTY_LIPS_INNER_OUTLINE = "LipsInnerOutline";
  private List<FacePoint> lipsInnerOutline = null;

  public static final String JSON_PROPERTY_LIPS_OUTER_OUTLINE = "LipsOuterOutline";
  private List<FacePoint> lipsOuterOutline = null;

  public FaceWithLandmarks() { 
  }

  public FaceWithLandmarks leftX(Integer leftX) {
    
    this.leftX = leftX;
    return this;
  }

   /**
   * X coordinate of the left side of the face
   * @return leftX
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "X coordinate of the left side of the face")
  @JsonProperty(JSON_PROPERTY_LEFT_X)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLeftX() {
    return leftX;
  }


  @JsonProperty(JSON_PROPERTY_LEFT_X)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLeftX(Integer leftX) {
    this.leftX = leftX;
  }


  public FaceWithLandmarks topY(Integer topY) {
    
    this.topY = topY;
    return this;
  }

   /**
   * Y coordinate of the top side of the face
   * @return topY
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Y coordinate of the top side of the face")
  @JsonProperty(JSON_PROPERTY_TOP_Y)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTopY() {
    return topY;
  }


  @JsonProperty(JSON_PROPERTY_TOP_Y)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTopY(Integer topY) {
    this.topY = topY;
  }


  public FaceWithLandmarks rightX(Integer rightX) {
    
    this.rightX = rightX;
    return this;
  }

   /**
   * X coordinate of the right side of the face
   * @return rightX
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "X coordinate of the right side of the face")
  @JsonProperty(JSON_PROPERTY_RIGHT_X)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRightX() {
    return rightX;
  }


  @JsonProperty(JSON_PROPERTY_RIGHT_X)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRightX(Integer rightX) {
    this.rightX = rightX;
  }


  public FaceWithLandmarks bottomY(Integer bottomY) {
    
    this.bottomY = bottomY;
    return this;
  }

   /**
   * Y coordinate of the bottom side of the face
   * @return bottomY
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Y coordinate of the bottom side of the face")
  @JsonProperty(JSON_PROPERTY_BOTTOM_Y)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBottomY() {
    return bottomY;
  }


  @JsonProperty(JSON_PROPERTY_BOTTOM_Y)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBottomY(Integer bottomY) {
    this.bottomY = bottomY;
  }


  public FaceWithLandmarks leftEyebrow(List<FacePoint> leftEyebrow) {
    
    this.leftEyebrow = leftEyebrow;
    return this;
  }

  public FaceWithLandmarks addLeftEyebrowItem(FacePoint leftEyebrowItem) {
    if (this.leftEyebrow == null) {
      this.leftEyebrow = new ArrayList<>();
    }
    this.leftEyebrow.add(leftEyebrowItem);
    return this;
  }

   /**
   * Point locations of the left eyebrow (the eyebrow cloesest to the left side of the picture)
   * @return leftEyebrow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Point locations of the left eyebrow (the eyebrow cloesest to the left side of the picture)")
  @JsonProperty(JSON_PROPERTY_LEFT_EYEBROW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<FacePoint> getLeftEyebrow() {
    return leftEyebrow;
  }


  @JsonProperty(JSON_PROPERTY_LEFT_EYEBROW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLeftEyebrow(List<FacePoint> leftEyebrow) {
    this.leftEyebrow = leftEyebrow;
  }


  public FaceWithLandmarks rightEyebrow(List<FacePoint> rightEyebrow) {
    
    this.rightEyebrow = rightEyebrow;
    return this;
  }

  public FaceWithLandmarks addRightEyebrowItem(FacePoint rightEyebrowItem) {
    if (this.rightEyebrow == null) {
      this.rightEyebrow = new ArrayList<>();
    }
    this.rightEyebrow.add(rightEyebrowItem);
    return this;
  }

   /**
   * Point locations of the right eyebrow (the eyebrow cloesest to the right side of the picture)
   * @return rightEyebrow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Point locations of the right eyebrow (the eyebrow cloesest to the right side of the picture)")
  @JsonProperty(JSON_PROPERTY_RIGHT_EYEBROW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<FacePoint> getRightEyebrow() {
    return rightEyebrow;
  }


  @JsonProperty(JSON_PROPERTY_RIGHT_EYEBROW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRightEyebrow(List<FacePoint> rightEyebrow) {
    this.rightEyebrow = rightEyebrow;
  }


  public FaceWithLandmarks leftEye(List<FacePoint> leftEye) {
    
    this.leftEye = leftEye;
    return this;
  }

  public FaceWithLandmarks addLeftEyeItem(FacePoint leftEyeItem) {
    if (this.leftEye == null) {
      this.leftEye = new ArrayList<>();
    }
    this.leftEye.add(leftEyeItem);
    return this;
  }

   /**
   * Point locations of the left eye (the eye closest to the left side of the picture)
   * @return leftEye
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Point locations of the left eye (the eye closest to the left side of the picture)")
  @JsonProperty(JSON_PROPERTY_LEFT_EYE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<FacePoint> getLeftEye() {
    return leftEye;
  }


  @JsonProperty(JSON_PROPERTY_LEFT_EYE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLeftEye(List<FacePoint> leftEye) {
    this.leftEye = leftEye;
  }


  public FaceWithLandmarks rightEye(List<FacePoint> rightEye) {
    
    this.rightEye = rightEye;
    return this;
  }

  public FaceWithLandmarks addRightEyeItem(FacePoint rightEyeItem) {
    if (this.rightEye == null) {
      this.rightEye = new ArrayList<>();
    }
    this.rightEye.add(rightEyeItem);
    return this;
  }

   /**
   * Point locations of the right eye (the eye closest to the right side of the picture)
   * @return rightEye
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Point locations of the right eye (the eye closest to the right side of the picture)")
  @JsonProperty(JSON_PROPERTY_RIGHT_EYE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<FacePoint> getRightEye() {
    return rightEye;
  }


  @JsonProperty(JSON_PROPERTY_RIGHT_EYE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRightEye(List<FacePoint> rightEye) {
    this.rightEye = rightEye;
  }


  public FaceWithLandmarks bottomAndSidesOfFace(List<FacePoint> bottomAndSidesOfFace) {
    
    this.bottomAndSidesOfFace = bottomAndSidesOfFace;
    return this;
  }

  public FaceWithLandmarks addBottomAndSidesOfFaceItem(FacePoint bottomAndSidesOfFaceItem) {
    if (this.bottomAndSidesOfFace == null) {
      this.bottomAndSidesOfFace = new ArrayList<>();
    }
    this.bottomAndSidesOfFace.add(bottomAndSidesOfFaceItem);
    return this;
  }

   /**
   * Point locations of the bottom and sides of the face (cheeks and chin)
   * @return bottomAndSidesOfFace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Point locations of the bottom and sides of the face (cheeks and chin)")
  @JsonProperty(JSON_PROPERTY_BOTTOM_AND_SIDES_OF_FACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<FacePoint> getBottomAndSidesOfFace() {
    return bottomAndSidesOfFace;
  }


  @JsonProperty(JSON_PROPERTY_BOTTOM_AND_SIDES_OF_FACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBottomAndSidesOfFace(List<FacePoint> bottomAndSidesOfFace) {
    this.bottomAndSidesOfFace = bottomAndSidesOfFace;
  }


  public FaceWithLandmarks noseBridge(List<FacePoint> noseBridge) {
    
    this.noseBridge = noseBridge;
    return this;
  }

  public FaceWithLandmarks addNoseBridgeItem(FacePoint noseBridgeItem) {
    if (this.noseBridge == null) {
      this.noseBridge = new ArrayList<>();
    }
    this.noseBridge.add(noseBridgeItem);
    return this;
  }

   /**
   * Point locations of the nose bridge (the vertical portion of the nose)
   * @return noseBridge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Point locations of the nose bridge (the vertical portion of the nose)")
  @JsonProperty(JSON_PROPERTY_NOSE_BRIDGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<FacePoint> getNoseBridge() {
    return noseBridge;
  }


  @JsonProperty(JSON_PROPERTY_NOSE_BRIDGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNoseBridge(List<FacePoint> noseBridge) {
    this.noseBridge = noseBridge;
  }


  public FaceWithLandmarks noseBottom(List<FacePoint> noseBottom) {
    
    this.noseBottom = noseBottom;
    return this;
  }

  public FaceWithLandmarks addNoseBottomItem(FacePoint noseBottomItem) {
    if (this.noseBottom == null) {
      this.noseBottom = new ArrayList<>();
    }
    this.noseBottom.add(noseBottomItem);
    return this;
  }

   /**
   * Point locations of the bottom (nostrils) of the nose
   * @return noseBottom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Point locations of the bottom (nostrils) of the nose")
  @JsonProperty(JSON_PROPERTY_NOSE_BOTTOM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<FacePoint> getNoseBottom() {
    return noseBottom;
  }


  @JsonProperty(JSON_PROPERTY_NOSE_BOTTOM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNoseBottom(List<FacePoint> noseBottom) {
    this.noseBottom = noseBottom;
  }


  public FaceWithLandmarks lipsInnerOutline(List<FacePoint> lipsInnerOutline) {
    
    this.lipsInnerOutline = lipsInnerOutline;
    return this;
  }

  public FaceWithLandmarks addLipsInnerOutlineItem(FacePoint lipsInnerOutlineItem) {
    if (this.lipsInnerOutline == null) {
      this.lipsInnerOutline = new ArrayList<>();
    }
    this.lipsInnerOutline.add(lipsInnerOutlineItem);
    return this;
  }

   /**
   * Point locations of the inner outline of the lips
   * @return lipsInnerOutline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Point locations of the inner outline of the lips")
  @JsonProperty(JSON_PROPERTY_LIPS_INNER_OUTLINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<FacePoint> getLipsInnerOutline() {
    return lipsInnerOutline;
  }


  @JsonProperty(JSON_PROPERTY_LIPS_INNER_OUTLINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLipsInnerOutline(List<FacePoint> lipsInnerOutline) {
    this.lipsInnerOutline = lipsInnerOutline;
  }


  public FaceWithLandmarks lipsOuterOutline(List<FacePoint> lipsOuterOutline) {
    
    this.lipsOuterOutline = lipsOuterOutline;
    return this;
  }

  public FaceWithLandmarks addLipsOuterOutlineItem(FacePoint lipsOuterOutlineItem) {
    if (this.lipsOuterOutline == null) {
      this.lipsOuterOutline = new ArrayList<>();
    }
    this.lipsOuterOutline.add(lipsOuterOutlineItem);
    return this;
  }

   /**
   * Point locations of the outer outline of the lips
   * @return lipsOuterOutline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Point locations of the outer outline of the lips")
  @JsonProperty(JSON_PROPERTY_LIPS_OUTER_OUTLINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<FacePoint> getLipsOuterOutline() {
    return lipsOuterOutline;
  }


  @JsonProperty(JSON_PROPERTY_LIPS_OUTER_OUTLINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLipsOuterOutline(List<FacePoint> lipsOuterOutline) {
    this.lipsOuterOutline = lipsOuterOutline;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FaceWithLandmarks faceWithLandmarks = (FaceWithLandmarks) o;
    return Objects.equals(this.leftX, faceWithLandmarks.leftX) &&
        Objects.equals(this.topY, faceWithLandmarks.topY) &&
        Objects.equals(this.rightX, faceWithLandmarks.rightX) &&
        Objects.equals(this.bottomY, faceWithLandmarks.bottomY) &&
        Objects.equals(this.leftEyebrow, faceWithLandmarks.leftEyebrow) &&
        Objects.equals(this.rightEyebrow, faceWithLandmarks.rightEyebrow) &&
        Objects.equals(this.leftEye, faceWithLandmarks.leftEye) &&
        Objects.equals(this.rightEye, faceWithLandmarks.rightEye) &&
        Objects.equals(this.bottomAndSidesOfFace, faceWithLandmarks.bottomAndSidesOfFace) &&
        Objects.equals(this.noseBridge, faceWithLandmarks.noseBridge) &&
        Objects.equals(this.noseBottom, faceWithLandmarks.noseBottom) &&
        Objects.equals(this.lipsInnerOutline, faceWithLandmarks.lipsInnerOutline) &&
        Objects.equals(this.lipsOuterOutline, faceWithLandmarks.lipsOuterOutline);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leftX, topY, rightX, bottomY, leftEyebrow, rightEyebrow, leftEye, rightEye, bottomAndSidesOfFace, noseBridge, noseBottom, lipsInnerOutline, lipsOuterOutline);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaceWithLandmarks {\n");
    sb.append("    leftX: ").append(toIndentedString(leftX)).append("\n");
    sb.append("    topY: ").append(toIndentedString(topY)).append("\n");
    sb.append("    rightX: ").append(toIndentedString(rightX)).append("\n");
    sb.append("    bottomY: ").append(toIndentedString(bottomY)).append("\n");
    sb.append("    leftEyebrow: ").append(toIndentedString(leftEyebrow)).append("\n");
    sb.append("    rightEyebrow: ").append(toIndentedString(rightEyebrow)).append("\n");
    sb.append("    leftEye: ").append(toIndentedString(leftEye)).append("\n");
    sb.append("    rightEye: ").append(toIndentedString(rightEye)).append("\n");
    sb.append("    bottomAndSidesOfFace: ").append(toIndentedString(bottomAndSidesOfFace)).append("\n");
    sb.append("    noseBridge: ").append(toIndentedString(noseBridge)).append("\n");
    sb.append("    noseBottom: ").append(toIndentedString(noseBottom)).append("\n");
    sb.append("    lipsInnerOutline: ").append(toIndentedString(lipsInnerOutline)).append("\n");
    sb.append("    lipsOuterOutline: ").append(toIndentedString(lipsOuterOutline)).append("\n");
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
