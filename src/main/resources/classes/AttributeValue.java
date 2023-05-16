package com.example.model;

import java.util.Objects;
import com.example.model.AuditDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Hold the attribute details as object.
 */
@ApiModel(description = "Hold the attribute details as object.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-15T14:41:30.090618700+05:30[Asia/Calcutta]")

public class AttributeValue   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("attributeCode")
  private String attributeCode;

  @JsonProperty("value")
  private Object value;

  @JsonProperty("auditDetails")
  private AuditDetails auditDetails;

  @JsonProperty("additionalDetails")
  private Object additionalDetails;

  public AttributeValue id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the record
   * @return id
  */
  @ApiModelProperty(readOnly = true, value = "Unique identifier of the record")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AttributeValue attributeCode(String attributeCode) {
    this.attributeCode = attributeCode;
    return this;
  }

  /**
   * Unique code of attribute from attributedefinition
   * @return attributeCode
  */
  @ApiModelProperty(required = true, value = "Unique code of attribute from attributedefinition")
  @NotNull


  public String getAttributeCode() {
    return attributeCode;
  }

  public void setAttributeCode(String attributeCode) {
    this.attributeCode = attributeCode;
  }

  public AttributeValue value(Object value) {
    this.value = value;
    return this;
  }

  /**
   * values we can pass if field type is selected as('singlevaluelist','multivaluelist'). 
   * @return value
  */
  @ApiModelProperty(required = true, value = "values we can pass if field type is selected as('singlevaluelist','multivaluelist'). ")
  @NotNull

  @Valid

  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }

  public AttributeValue auditDetails(AuditDetails auditDetails) {
    this.auditDetails = auditDetails;
    return this;
  }

  /**
   * Get auditDetails
   * @return auditDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public AuditDetails getAuditDetails() {
    return auditDetails;
  }

  public void setAuditDetails(AuditDetails auditDetails) {
    this.auditDetails = auditDetails;
  }

  public AttributeValue additionalDetails(Object additionalDetails) {
    this.additionalDetails = additionalDetails;
    return this;
  }

  /**
   * Any additional key-value pair to be stored with the service.
   * @return additionalDetails
  */
  @ApiModelProperty(value = "Any additional key-value pair to be stored with the service.")

  @Valid

  public Object getAdditionalDetails() {
    return additionalDetails;
  }

  public void setAdditionalDetails(Object additionalDetails) {
    this.additionalDetails = additionalDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttributeValue attributeValue = (AttributeValue) o;
    return Objects.equals(this.id, attributeValue.id) &&
        Objects.equals(this.attributeCode, attributeValue.attributeCode) &&
        Objects.equals(this.value, attributeValue.value) &&
        Objects.equals(this.auditDetails, attributeValue.auditDetails) &&
        Objects.equals(this.additionalDetails, attributeValue.additionalDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, attributeCode, value, auditDetails, additionalDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttributeValue {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    attributeCode: ").append(toIndentedString(attributeCode)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    auditDetails: ").append(toIndentedString(auditDetails)).append("\n");
    sb.append("    additionalDetails: ").append(toIndentedString(additionalDetails)).append("\n");
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

