package com.example.sampleApp.model;

import java.util.Objects;
import com.example.sampleApp.classes.Pagination;
import com.example.sampleApp.classes.RequestInfo;
import com.example.sampleApp.classes.ServiceCriteria;

public class ServiceSearchRequest {

    private RequestInfo requestInfo;
    private ServiceCriteria serviceCriteria;
    private Pagination pagination;

    public ServiceSearchRequest requestInfo(RequestInfo requestInfo) {
      this.requestInfo = requestInfo;
      return this;
    }

    public RequestInfo getRequestInfo() {
      return requestInfo;
    }

    public void setRequestInfo(RequestInfo requestInfo) {
      this.requestInfo = requestInfo;
    }

    public ServiceSearchRequest serviceCriteria(ServiceCriteria serviceCriteria) {
      this.serviceCriteria = serviceCriteria;
      return this;
    }

    public ServiceCriteria getServiceCriteria() {
      return serviceCriteria;
    }

    public void setServiceCriteria(ServiceCriteria serviceCriteria) {
      this.serviceCriteria = serviceCriteria;
    }

    public ServiceSearchRequest pagination(Pagination pagination) {
      this.pagination = pagination;
      return this;
    }

    public Pagination getPagination() {
      return pagination;
    }

    public void setPagination(Pagination pagination) {
      this.pagination = pagination;
    }

    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      ServiceSearchRequest serviceSearchRequest = (ServiceSearchRequest) o;
      return Objects.equals(this.requestInfo, serviceSearchRequest.requestInfo) &&
          Objects.equals(this.serviceCriteria, serviceSearchRequest.serviceCriteria) &&
          Objects.equals(this.pagination, serviceSearchRequest.pagination);
    }

    @Override
    public int hashCode() {
      return Objects.hash(requestInfo, serviceCriteria, pagination);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ServiceSearchRequest {\n");
      
      sb.append("    requestInfo: ").append(toIndentedString(requestInfo)).append("\n");
      sb.append("    serviceCriteria: ").append(toIndentedString(serviceCriteria)).append("\n");
      sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
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

