package com.Geekster.URLHitCounter.Controller;

import com.Geekster.URLHitCounter.Service.CounterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CounterController {
    @Autowired
    CounterService counterService;
    @GetMapping("count/{username}")
    public String getHitCount(@PathVariable String username){
        return counterService.gethitcount(username);
    }

}
