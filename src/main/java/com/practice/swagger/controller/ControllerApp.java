package com.practice.swagger.controller;

import com.practice.swagger.model.Entity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "ControllerApp", description = "Including apis for test goal")
@RestController
public class ControllerApp {

    @ApiOperation(value = "getEntity", tags = "Entity", response = Entity.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success test"),
            @ApiResponse(code = 401, message = "not authorized! test"),
            @ApiResponse(code = 403, message = "forbidden!!! test"),
            @ApiResponse(code = 404, message = "not found!!! test")
    })
    @GetMapping("/entity")
    public Entity getEntity() {
        Entity entity = new Entity();
        entity.setKey("Key Swagger");
        entity.setValue("Value Swagger");
        return entity;
    }

}
