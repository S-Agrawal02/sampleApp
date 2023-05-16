package com.example.sampleApp.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The object will contain all the search parameters for Service Definition.
 */
@ApiModel(description = "The object will contain all the search parameters for Service Definition.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-15T14:41:30.090618700+05:30[Asia/Calcutta]")

public class ServiceDefinitionCriteria   {
  @JsonProperty("tenantId")
  private String tenantId;

  @JsonProperty("ids")
  @Valid
  private List<String> ids = null;

  @JsonProperty("code")
  @Valid
  private List<String> code = null;

  @JsonProperty("clientId")
  private String clientId;

  public ServiceDefinitionCriteria tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Tenant Identifier
   * @return tenantId
  */
  @ApiModelProperty(example = "pb.amritsar", required = true, value = "Tenant Identifier")
  @NotNull

@Size(min=2,max=64) 
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public ServiceDefinitionCriteria ids(List<String> ids) {
    this.ids = ids;
    return this;
  }

  public ServiceDefinitionCriteria addIdsItem(String idsItem) {
    if (this.ids == null) {
      this.ids = new ArrayList<>();
    }
    this.ids.add(idsItem);
    return this;
  }

  /**
   * Search by service definition ids
   * @return ids
  */
  @ApiModelProperty(value = "Search by service definition ids")


  public List<String> getIds() {
    return ids;
  }

  public void setIds(List<String> ids) {
    this.ids = ids;
  }

  public ServiceDefinitionCriteria code(List<String> code) {
    this.code = code;
    return this;
  }

  public ServiceDefinitionCriteria addCodeItem(String codeItem) {
    if (this.code == null) {
      this.code = new ArrayList<>();
    }
    this.code.add(codeItem);
    return this;
  }

  /**
   * Search by service definition code
   * @return code
  */
  @ApiModelProperty(value = "Search by service definition code")


  public List<String> getCode() {
    return code;
  }

  public void setCode(List<String> code) {
    this.code = code;
  }

  public ServiceDefinitionCriteria clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * Client Id
   * @return clientId
  */
  @ApiModelProperty(value = "Client Id")

@Size(min=2,max=64) 
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceDefinitionCriteria serviceDefinitionCriteria = (ServiceDefinitionCriteria) o;
    return Objects.equals(this.tenantId, serviceDefinitionCriteria.tenantId) &&
        Objects.equals(this.ids, serviceDefinitionCriteria.ids) &&
        Objects.equals(this.code, serviceDefinitionCriteria.code) &&
        Objects.equals(this.clientId, serviceDefinitionCriteria.clientId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, ids, code, clientId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceDefinitionCriteria {\n");
    
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
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

