package com.cloudbrains.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
@RequestMapping(value = "/cloudbrains")
public class CloudbrainsController {
private static final Logger log = LoggerFactory.getLogger(CloudbrainsController.class);

    @RequestMapping(value="/getEmployeeDetails",method = RequestMethod.GET)
    public String getEmployeeDetails(@RequestHeader (required = false,name = "origin",defaultValue = "standard") String origin) throws UnknownHostException {
        log.info("Inside getEmployeeDetails Method");
        return "Employee Details Working with IP " + InetAddress.getLocalHost().getHostAddress() + " and origin is "+origin;
    }
    @RequestMapping(value="/healthcheck",method = RequestMethod.GET)
    public String gethealthCheck() {
        log.info("Inside Health Check Method");
        return "Working fine with Code "+ HttpStatus.OK;
    }
}
