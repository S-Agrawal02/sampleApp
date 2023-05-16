package com.example.sampleApp.classes;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResponseInfo should be used to carry metadata information about the response from the server. apiId, ver and msgId in ResponseInfo should always correspond to the same values in respective request&#39;s RequestInfo.
 */
@ApiModel(description = "ResponseInfo should be used to carry metadata information about the response from the server. apiId, ver and msgId in ResponseInfo should always correspond to the same values in respective request's RequestInfo.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-15T14:41:30.090618700+05:30[Asia/Calcutta]")

public class ResponseInfo   {
  @JsonProperty("apiId")
  private String apiId;

  @JsonProperty("ver")
  private String ver;

  @JsonProperty("ts")
  private Long ts;

  @JsonProperty("resMsgId")
  private String resMsgId;

  @JsonProperty("msgId")
  private String msgId;

  /**
   * status of request processing - to be enhanced in futuer to include INPROGRESS
   */
  public enum StatusEnum {
    SUCCESSFUL("SUCCESSFUL"),
    
    FAILED("FAILED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("status")
  private StatusEnum status;

  public ResponseInfo apiId(String apiId) {
    this.apiId = apiId;
    return this;
  }

  /**
   * unique API ID
   * @return apiId
  */
  @ApiModelProperty(required = true, value = "unique API ID")
  @NotNull

@Size(max=128) 
  public String getApiId() {
    return apiId;
  }

  public void setApiId(String apiId) {
    this.apiId = apiId;
  }

  public ResponseInfo ver(String ver) {
    this.ver = ver;
    return this;
  }

  /**
   * API version
   * @return ver
  */
  @ApiModelProperty(required = true, value = "API version")
  @NotNull

@Size(max=32) 
  public String getVer() {
    return ver;
  }

  public void setVer(String ver) {
    this.ver = ver;
  }

  public ResponseInfo ts(Long ts) {
    this.ts = ts;
    return this;
  }

  /**
   * response time in epoch
   * @return ts
  */
  @ApiModelProperty(required = true, value = "response time in epoch")
  @NotNull


  public Long getTs() {
    return ts;
  }

  public void setTs(Long ts) {
    this.ts = ts;
  }

  public ResponseInfo resMsgId(String resMsgId) {
    this.resMsgId = resMsgId;
    return this;
  }

  /**
   * unique response message id (UUID) - will usually be the correlation id from the server
   * @return resMsgId
  */
  @ApiModelProperty(value = "unique response message id (UUID) - will usually be the correlation id from the server")

@Size(max=256) 
  public String getResMsgId() {
    return resMsgId;
  }

  public void setResMsgId(String resMsgId) {
    this.resMsgId = resMsgId;
  }

  public ResponseInfo msgId(String msgId) {
    this.msgId = msgId;
    return this;
  }

  /**
   * message id of the request
   * @return msgId
  */
  @ApiModelProperty(value = "message id of the request")

@Size(max=256) 
  public String getMsgId() {
    return msgId;
  }

  public void setMsgId(String msgId) {
    this.msgId = msgId;
  }

  public ResponseInfo status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * status of request processing - to be enhanced in futuer to include INPROGRESS
   * @return status
  */
  @ApiModelProperty(required = true, value = "status of request processing - to be enhanced in futuer to include INPROGRESS")
  @NotNull


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseInfo responseInfo = (ResponseInfo) o;
    return Objects.equals(this.apiId, responseInfo.apiId) &&
        Objects.equals(this.ver, responseInfo.ver) &&
        Objects.equals(this.ts, responseInfo.ts) &&
        Objects.equals(this.resMsgId, responseInfo.resMsgId) &&
        Objects.equals(this.msgId, responseInfo.msgId) &&
        Objects.equals(this.status, responseInfo.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiId, ver, ts, resMsgId, msgId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseInfo {\n");
    
    sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
    sb.append("    ver: ").append(toIndentedString(ver)).append("\n");
    sb.append("    ts: ").append(toIndentedString(ts)).append("\n");
    sb.append("    resMsgId: ").append(toIndentedString(resMsgId)).append("\n");
    sb.append("    msgId: ").append(toIndentedString(msgId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

