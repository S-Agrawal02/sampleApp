package com.example.sampleApp.service;

import com.example.sampleApp.model.ServiceDefinitionCriteria;
import com.example.sampleApp.model.ServiceDefinitionRequest;
import com.example.sampleApp.model.ServiceDefinitionResponse;
import com.example.sampleApp.model.ServiceDefinitionSearchRequest;
import com.example.sampleApp.model.ServiceRequest;
import com.example.sampleApp.model.ServiceResponse;
import com.example.sampleApp.model.ServiceSearchRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;

/**
 * A delegate to be called by the {@link ServiceApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-15T14:07:18.485373500+05:30[Asia/Calcutta]")

public interface ServiceApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    default ServiceDefinitionResponse serviceDefinitionV1CreatePost(ServiceDefinitionRequest serviceDefinitionRequest){
        return new ServiceDefinitionService().serviceDefinitionV1CreatePost(serviceDefinitionRequest);
    }
   
    /**
     * POST /service/definition/v1/_search
     *
     * @param serviceDefinitionSearchRequest  (optional)
     * @return Request accepted. (status code 202)
     *         or Invalid input. (status code 400)
     * @see ServiceApi#serviceDefinitionV1SearchPost
     */
    default ServiceDefinitionResponse serviceDefinitionV1SearchPost(ServiceDefinitionSearchRequest serviceDefinitionSearchRequest) {
        return new ServiceDefinitionService().serviceDefinitionV1SearchPost(serviceDefinitionSearchRequest);
    }

    /**
     * POST /service/v1/_create
     *
     * @param serviceRequest  (optional)
     * @return Request accepted. (status code 202)
     *         or Invalid input. (status code 400)
     * @see ServiceApi#serviceV1CreatePost
     */
    default ServiceResponse serviceV1CreatePost(ServiceRequest serviceRequest) {
        return new ServiceDefinitionService().serviceV1CreatePost(serviceRequest);
    }

    /**
     * POST /service/v1/_search
     *
     * @param serviceSearchRequest  (optional)
     * @return Request accepted. (status code 202)
     *         or Invalid input. (status code 400)
     * @see ServiceApi#serviceV1SearchPost
     */
    default ServiceResponse serviceV1SearchPost(ServiceSearchRequest serviceSearchRequest) {
        return new ServiceDefinitionService().serviceV1SearchPost(serviceSearchRequest);
    }

}
