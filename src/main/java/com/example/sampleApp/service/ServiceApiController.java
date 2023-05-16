package com.example.sampleApp.service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-15T14:07:18.485373500+05:30[Asia/Calcutta]")

@Controller
// @RequestMapping("${openapi.serviceRequest.base-path:}")
public class ServiceApiController implements ServiceApi {

    private final ServiceApiDelegate delegate;

    public ServiceApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) ServiceApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new ServiceApiDelegate() {});
    }

    @Override
    public ServiceApiDelegate getDelegate() {
        return delegate;
    }

}
