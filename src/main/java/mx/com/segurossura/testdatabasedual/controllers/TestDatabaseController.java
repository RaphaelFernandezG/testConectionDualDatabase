package mx.com.segurossura.testdatabasedual.controllers;

import mx.com.segurossura.testdatabasedual.services.TestService;
import mx.com.segurossura.testdatabasedual.structurecollections.PolicyStructure;
import mx.com.segurossura.testdatabasedual.structurecollections.UsersStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestDatabaseController {

    @Autowired
    TestService testService;

    @GetMapping(path = "/policies",produces = {MediaType.APPLICATION_JSON_VALUE })
    public PolicyStructure testPolicy(){
        return testService.testPolicy();
    }

    @GetMapping(path = "/users",produces = {MediaType.APPLICATION_JSON_VALUE })
    public UsersStructure testUsers(){
        return testService.testUsers();
    }




}
