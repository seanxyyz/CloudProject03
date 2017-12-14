package com.service.crxtest01.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-12-14T16:09:00.644Z")

@RestSchema(schemaId = "crxtest01")
@RequestMapping(path = "/crxtest01", produces = MediaType.APPLICATION_JSON)
public class Crxtest01Impl {

    @Autowired
    private Crxtest01Delegate userCrxtest01Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userCrxtest01Delegate.helloworld(name);
    }

}
