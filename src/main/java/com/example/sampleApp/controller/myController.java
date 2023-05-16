// package com.example.sampleApp.controller;
// import org.springframework.web.bind.annotation.RestController;

// import com.example.sampleApp.service.ServiceApi;
// import com.example.sampleApp.service.ServiceApiDelegate;
// import com.example.sampleApp.classes.*;

// import io.swagger.annotations.ApiOperation;

// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// import java.net.*;
// import java.io.*;
// import org.json.simple.JSONObject;
// import org.json.simple.parser.JSONParser;
// import org.json.simple.parser.ParseException;
// import com.example.sampleApp.classes.ErrorRes;
// import com.example.sampleApp.classes.ServiceCriteria;
// import com.example.sampleApp.model.*;
// import com.example.sampleApp.model.ServiceDefinitionCriteria;
// import com.example.sampleApp.model.ServiceDefinitionRequest;
// import com.example.sampleApp.model.ServiceDefinitionResponse;
// import com.example.sampleApp.model.ServiceDefinitionSearchRequest;
// import com.example.sampleApp.model.ServiceRequest;
// import com.example.sampleApp.model.ServiceResponse;
// import com.example.sampleApp.model.ServiceSearchRequest;

// import io.swagger.annotations.*;
// import org.springframework.http.ResponseEntity;
// import org.springframework.validation.annotation.Validated;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.ResponseBody;
// import org.springframework.web.bind.annotation.RestController;

// import java.io.IOException;

// import javax.validation.Valid;

// @javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-15T14:07:18.485373500+05:30[Asia/Calcutta]")

// @Validated
// @Api(value = "service", description = "the service API")
// @RestController
// public class myController implements ServiceApi {

//     @Override
//     @ApiOperation(value = "", nickname = "createServiceDefinition", notes = "", response = ServiceDefinitionResponse.class, tags={ "My Controller Class", })
//     @PostMapping("/createServiceDefinition")
//     public ServiceDefinitionResponse createServiceDefinition() {
//         ServiceDefinitionRequest serviceDefinitionRequest = new ServiceDefinitionRequest();
//         ServiceDefinitionResponse response = getDelegate().serviceDefinitionV1CreatePost(serviceDefinitionRequest);
//         return response;
//     }

//     @Override
//     @ApiOperation(value = "", nickname = "searchServiceDefinition", notes = "", response = ServiceDefinitionResponse.class, tags={ "My Controller Class", })
//     @GetMapping("/searchServiceDefinition")
//     public ServiceDefinitionResponse searchServiceDefinition(@RequestParam(value = "id", defaultValue = "101") String id) {
//       ServiceDefinitionSearchRequest serviceDefinitionSearchRequest = new ServiceDefinitionSearchRequest();
//       ServiceDefinitionCriteria serviceDefinitionCriteria = new ServiceDefinitionCriteria();
//       serviceDefinitionCriteria.setClientId(id);
//       serviceDefinitionSearchRequest.setServiceDefinitionCriteria(serviceDefinitionCriteria);
//       ServiceDefinitionResponse response = getDelegate().serviceDefinitionV1SearchPost(serviceDefinitionSearchRequest);

//       return response;
//     }

//     /**
//      * POST /service/definition/v1/_create
//      *
//      * @param serviceDefinitionRequest  (optional)
//      * @return Request accepted. (status code 202)
//      *         or Invalid input. (status code 400)
//      */
//     @Override
//     @ApiOperation(value = "", nickname = "serviceDefinitionV1CreatePost", notes = "", response = ServiceDefinitionResponse.class, tags={ "Service Definition", })
//     @RequestMapping(value = "/service/definition/v1/_create",method = RequestMethod.POST)
//     public ServiceDefinitionResponse serviceDefinitionV1CreatePost(@ApiParam(value = "")  @Valid @RequestBody(required = false) ServiceDefinitionRequest serviceDefinitionRequest) {
//         return getDelegate().serviceDefinitionV1CreatePost(serviceDefinitionRequest);
//     }

//     /**
//      * POST /service/definition/v1/_search
//      *
//      * @param serviceDefinitionSearchRequest  (optional)
//      * @return Request accepted. (status code 202)
//      *         or Invalid input. (status code 400)
//      */
//     @Override
//     @ApiOperation(value = "", nickname = "serviceDefinitionV1SearchPost", notes = "", response = ServiceDefinitionResponse.class, tags={ "Service Definition", })
//     @RequestMapping(value = "/service/definition/v1/_search", method = RequestMethod.POST)
//     @ResponseBody
//     public ServiceDefinitionResponse serviceDefinitionV1SearchPost(@RequestBody ServiceDefinitionSearchRequest serviceDefinitionSearchRequest) {
//         serviceDefinitionSearchRequest.setServiceDefinitionCriteria(new ServiceDefinitionCriteria());
//         serviceDefinitionSearchRequest.getServiceDefinitionCriteria().setClientId("3689");
//         return getDelegate().serviceDefinitionV1SearchPost(serviceDefinitionSearchRequest);
//     }

// // ----------------------------------------------------------
//     /**
//      * POST /service/v1/_create
//      *
//      * @param serviceRequest  (optional)
//      * @return Request accepted. (status code 202)
//      *         or Invalid input. (status code 400)
//      */
//     @Override
//     @ApiOperation(value = "", nickname = "serviceV1CreatePost", notes = "", response = ServiceResponse.class, tags={ "Service", })
//     @RequestMapping(value = "/service/v1/_create", method = RequestMethod.POST)
//     public ServiceResponse serviceV1CreatePost(@ApiParam(value = "")  @Valid @RequestBody(required = false) ServiceRequest serviceRequest) {
//         return getDelegate().serviceV1CreatePost(serviceRequest);
//     }
    
//     /**
//      * POST /service/v1/_search
//      *
//      * @param serviceSearchRequest  (optional)
//      * @return Request accepted. (status code 202)
//      *         or Invalid input. (status code 400)
//      */
//     @Override
//     @ApiOperation(value = "", nickname = "serviceV1SearchPost", notes = "", response = ServiceResponse.class, tags={ "Service", })
//     @RequestMapping(value = "/service/v1/_search", method = RequestMethod.POST)
//     public ServiceResponse serviceV1SearchPost(@ApiParam(value = ""  )  @Valid @RequestBody(required = false) ServiceSearchRequest serviceSearchRequest) {
//         serviceSearchRequest.setServiceCriteria(new ServiceCriteria());;
//         serviceSearchRequest.getServiceCriteria().setClientId("2245");
//         return getDelegate().serviceV1SearchPost(serviceSearchRequest);
//     }
// }