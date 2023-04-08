package com.MBTS.MovieBooking.RestApi;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class NameController {

    @PostMapping("/name")
    public String getFullName(@RequestBody Map<String, String> requestBody) {
        String firstName = requestBody.get("firstName");
        String lastName = requestBody.get("lastName");

        String fullName = firstName + " " + lastName;

        return "{\"fullName\": \"" + fullName + "\"}";
    }

}