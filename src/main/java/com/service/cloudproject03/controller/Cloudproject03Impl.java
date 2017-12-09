package com.service.cloudproject03.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-12-09T14:48:08.811Z")

@RestSchema(schemaId = "cloudproject03")
@RequestMapping(path = "/cloudproject03", produces = MediaType.APPLICATION_JSON)
public class Cloudproject03Impl {

    @Autowired
    private Cloudproject03Delegate userCloudproject03Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userCloudproject03Delegate.helloworld(name);
    }

}
