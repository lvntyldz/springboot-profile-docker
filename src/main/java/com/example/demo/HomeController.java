package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

@RestController
@RequestMapping("/get-info")
public class HomeController {

    @Autowired
    Environment environment;

    @Value("${fileserver.upload.url}")
    private String fileServerUrl;

    @GetMapping
    public String getEnvironmentInfo() {
        return "Hello World.";
    }

    @GetMapping("/upload")
    public String getFileServerInfo() {
        return "FileServerUploadUrl : " + fileServerUrl;
    }

    @GetMapping("/active-profile")
    public String getActiveProfile() {

        Optional<String> profiles = Arrays.stream(environment.getActiveProfiles()).findAny();

        return  profiles.get();
    }

    @GetMapping("/default-profile")
    public String getDefaultProfile() {
        Optional<String> profiles = Arrays.stream(environment.getDefaultProfiles()).findAny();
        return  profiles.get();
    }
}
