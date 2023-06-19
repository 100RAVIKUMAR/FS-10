package com.Geekster.GeeksterTest.Service;

import com.Geekster.GeeksterTest.Models.Rectangle;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

@Controller
public class areacalculator {

    @Bean
    public Rectangle object(){
        return new Rectangle();
    }
}
