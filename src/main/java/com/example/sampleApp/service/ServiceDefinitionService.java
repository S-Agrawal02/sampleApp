package com.example.sampleApp.service;

import java.io.BufferedReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.sampleApp.classes.Pagination;
import com.example.sampleApp.classes.RequestInfo;
import com.example.sampleApp.classes.ResponseInfo;
import com.example.sampleApp.model.ServiceDefinitionRequest;
import com.example.sampleApp.model.ServiceDefinitionResponse;
import com.example.sampleApp.model.ServiceDefinitionSearchRequest;
import com.example.sampleApp.model.ServiceRequest;
import com.example.sampleApp.model.ServiceResponse;
import com.example.sampleApp.model.ServiceSearchRequest;
import com.example.sampleApp.config.SpringJdbcConfig;
import com.example.sampleApp.model.Address;
import com.example.sampleApp.model.Service;
import com.example.sampleApp.model.ServiceDefinition;

import java.io.InputStreamReader;

@org.springframework.stereotype.Service
public class ServiceDefinitionService implements ServiceApiDelegate {

    @Autowired
    SpringJdbcConfig springJdbcConfig;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @PostConstruct
    public void setUp() {
        jdbcTemplate = new JdbcTemplate(springJdbcConfig.mysqlDataSource());
    }

    @Override
    public ServiceDefinitionResponse serviceDefinitionV1CreatePost(ServiceDefinitionRequest serviceDefinitionRequest) {
        
        ServiceDefinitionResponse serviceDefinitionResponse = new ServiceDefinitionResponse();

        try{
            String api = getUrlContents("https://random-data-api.com/api/v2/users?size=1");            
    
            serviceDefinitionRequest.setRequestInfo(new RequestInfo());
            ServiceDefinition serviceDefinition = new ServiceDefinition();
            JSONParser parser = new JSONParser();
            JSONObject createJsonObject = (JSONObject) parser.parse(api);
            String id = createJsonObject.get("id").toString();
            serviceDefinition.setId(id);
            JSONObject addressJsonObject =  (JSONObject)createJsonObject.get("address");
            serviceDefinition.setAdditionalDetails(addressJsonObject);
            serviceDefinitionRequest.setServiceDefinition(serviceDefinition);

            Address address = new Address();
            address.setId(id);
            address.setCity(addressJsonObject.get("city").toString());
            address.setStreetName(addressJsonObject.get("street_name").toString());
            address.setStreetAddress(addressJsonObject.get("street_address").toString());
            address.setZipCode(addressJsonObject.get("zip_code").toString());
            address.setState(addressJsonObject.get("state").toString());
            address.setCountry(addressJsonObject.get("country").toString());

            String sql = "CREATE TABLE IF NOT EXISTS SERVICE_DEFINITION (" +
                "addressId int not null AUTO_INCREMENT," +
                "id varchar," +
                "city varchar," +
                "street_name varchar," +
                "street_address varchar," +
                "zip_code varchar," +
                "state varchar," +
                "country varchar )";
            jdbcTemplate.execute(sql);

            String sql2 = "INSERT INTO `SERVICE_DEFINITION`(`id`,`city`,`street_name`,`street_address`,`zip_code`,`state`,`country`) VALUES ('" +
                address.getId() + "','" +
                address.getCity() + "','" +
                address.getStreetName() + "','" +
                address.getStreetAddress() + "','" +
                address.getZipCode() + "','" +
                address.getState() + "','" +
                address.getCountry() + 
                "')";

            jdbcTemplate.execute(sql2);

            serviceDefinitionResponse.setPagination(new Pagination());
            serviceDefinitionResponse.setResponseInfo(new ResponseInfo());
            List<ServiceDefinition> serviceDefinitionList = new ArrayList<>();
            serviceDefinitionList.add(serviceDefinition);
            serviceDefinitionResponse.setServiceDefinition(serviceDefinitionList);

        } catch(Exception e){
            System.out.println("Exception : " + e);
        }   
        return serviceDefinitionResponse;
    }

    @Override
    public ServiceDefinitionResponse serviceDefinitionV1SearchPost(ServiceDefinitionSearchRequest serviceDefinitionSearchRequest) {
        
        ServiceDefinitionResponse serviceDefinitionResponse = new ServiceDefinitionResponse();
        String clientId = serviceDefinitionSearchRequest.getServiceDefinitionCriteria().getClientId();
        String sql = "SELECT * FROM SERVICE_DEFINITION WHERE id = " + clientId;
        Address serviceDefinitionObject = new Address();

        try{
            serviceDefinitionObject = jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(Address.class));
        } catch(Exception e) {
            serviceDefinitionObject =null;
        }
        
        List<ServiceDefinition> serviceDefinitionList = new ArrayList<>();

        if(serviceDefinitionObject!=null) {
            ServiceDefinition serviceDefinition = new ServiceDefinition();
            serviceDefinition.setId(serviceDefinitionObject.getId());
    
            JSONObject additionalDetails = new JSONObject();
            additionalDetails.put("city", serviceDefinitionObject.getCity());
            additionalDetails.put("street_name", serviceDefinitionObject.getStreetName());
            additionalDetails.put("street_address", serviceDefinitionObject.getStreetAddress());
            additionalDetails.put("zip_code", serviceDefinitionObject.getZipCode());
            additionalDetails.put("state", serviceDefinitionObject.getState());
            additionalDetails.put("country", serviceDefinitionObject.getCountry());
            serviceDefinition.setAdditionalDetails(additionalDetails);

            serviceDefinitionList.add(serviceDefinition);
        }
        else {
            serviceDefinitionList.add(new ServiceDefinition());
        }
        
        serviceDefinitionResponse.setServiceDefinition(serviceDefinitionList);
        serviceDefinitionResponse.setPagination(new Pagination());
        serviceDefinitionResponse.setResponseInfo(new ResponseInfo());

        return serviceDefinitionResponse;
    }

    @Override
    public ServiceResponse serviceV1CreatePost(ServiceRequest serviceRequest) {
        
        ServiceResponse serviceResponse = new ServiceResponse();

        try{
            String api = getUrlContents("https://random-data-api.com/api/v2/users?size=1");
            System.out.println("API : " + api);
            // JSONParser parser = new JSONParser();
    
            serviceRequest.setRequestInfo(new RequestInfo());
            Service service = new Service();
            JSONParser parser = new JSONParser();
            JSONObject createJsonObject = (JSONObject) parser.parse(api);
            String id = createJsonObject.get("id").toString();
            service.setId(id);
            JSONObject addressJsonObject =  (JSONObject)createJsonObject.get("address");
            service.setAdditionalDetails(addressJsonObject);
            serviceRequest.setService(service);

            Address address = new Address();
            address.setId(id);
            address.setCity(addressJsonObject.get("city").toString());
            address.setStreetName(addressJsonObject.get("street_name").toString());
            address.setStreetAddress(addressJsonObject.get("street_address").toString());
            address.setZipCode(addressJsonObject.get("zip_code").toString());
            address.setState(addressJsonObject.get("state").toString());
            address.setCountry(addressJsonObject.get("country").toString());

            String sql = "CREATE TABLE IF NOT EXISTS SERVICE (" +
                "addressId int not null AUTO_INCREMENT," +
                "id varchar," +
                "city varchar," +
                "street_name varchar," +
                "street_address varchar," +
                "zip_code varchar," +
                "state varchar," +
                "country varchar )";
            jdbcTemplate.execute(sql);

            String sql2 = "INSERT INTO `SERVICE`(`id`,`city`,`street_name`,`street_address`,`zip_code`,`state`,`country`) VALUES ('" +
                address.getId() + "','" +
                address.getCity() + "','" +
                address.getStreetName() + "','" +
                address.getStreetAddress() + "','" +
                address.getZipCode() + "','" +
                address.getState() + "','" +
                address.getCountry() + 
                "')";
            jdbcTemplate.execute(sql2);
            System.out.println("Data inserted into Service table");

            serviceResponse.setPagination(new Pagination());
            serviceResponse.setResponseInfo(new ResponseInfo());
            List<Service> serviceList = new ArrayList<>();
            serviceList.add(service);
            serviceResponse.setService(serviceList);

        } catch(Exception e){
            System.out.println("Exception : " + e);
        }
        return serviceResponse;
    }

    @Override
    public ServiceResponse serviceV1SearchPost(ServiceSearchRequest serviceSearchRequest) {
        
        jdbcTemplate = new JdbcTemplate(springJdbcConfig.mysqlDataSource());
        
        String sql = "SELECT * FROM SERVICE WHERE id = " + serviceSearchRequest.getServiceCriteria().getClientId();
        Address serviceObject = new Address();
        ServiceResponse serviceResponse = new ServiceResponse();

        try {
            serviceObject = jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(Address.class));
        } catch(Exception e){
            serviceObject = null;
        }
        
        if(serviceObject!=null) {
            Service service = new Service();
            service.setId(serviceObject.getId());

            JSONObject additionalDetails = new JSONObject();
            additionalDetails.put("city", serviceObject.getCity());
            additionalDetails.put("street_name", serviceObject.getStreetName());
            additionalDetails.put("street_address", serviceObject.getStreetAddress());
            additionalDetails.put("zip_code", serviceObject.getZipCode());
            additionalDetails.put("state", serviceObject.getState());
            additionalDetails.put("country", serviceObject.getCountry());
            service.setAdditionalDetails(additionalDetails);
            List<Service> serviceList = new ArrayList<>();
            serviceList.add(service);
            serviceResponse.setService(serviceList);
        }
        else{
            serviceResponse.setService(null);
        }
        
        serviceResponse.setPagination(new Pagination());
        serviceResponse.setResponseInfo(new ResponseInfo());

        return serviceResponse;
    }

    private String getUrlContents(String theUrl)  
    {  
        StringBuilder content = new StringBuilder();   
        try  
        {  
            URL url = new URL(theUrl); // creating a url object  
            URLConnection urlConnection = url.openConnection(); // creating a urlconnection object   
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));  
            String line;  
            while ((line = bufferedReader.readLine()) != null)  
                content.append(line + "\n");  
            bufferedReader.close();
        } catch(Exception e) {  
            e.printStackTrace();  
        }
        return content.toString();  
    }  

}