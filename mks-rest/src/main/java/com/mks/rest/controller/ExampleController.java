package com.mks.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@RequestMapping("/rest/example")
public class ExampleController {

    @RequestMapping(method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public ExampleResponse getExample() {
         return new ExampleResponse();
    }

}

class ExampleResponse {

    private String message = "This is example response message";

    String getMessage() {
        return message;
    }

    void setMessage(String message) {
        this.message = message;
    }
}