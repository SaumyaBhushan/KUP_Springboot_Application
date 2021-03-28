package com.knoldus.springbootapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@RestController
public class RunningCurrentDateController {
    /**
     *
     * @return Running, {current Time} in hh:mm:ss pattern
     */
    @GetMapping("/status")
    public String showRunning() {
        LocalTime localTime = LocalTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss");
        return "Running, {" + localTime.format(dtf) + "}";
    }

}
