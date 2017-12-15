package com.service.qiaopr.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-12-15T06:43:00.780Z")

@RestSchema(schemaId = "qiaopr")
@RequestMapping(path = "/qiaopr", produces = MediaType.APPLICATION_JSON)
public class QiaoprImpl {

    @Autowired
    private QiaoprDelegate userQiaoprDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userQiaoprDelegate.helloworld(name);
    }

}
