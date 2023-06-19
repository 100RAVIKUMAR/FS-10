package com.Geekster.GeeksterTest.Controller;

import com.Geekster.GeeksterTest.Models.Rectangle;
import com.Geekster.GeeksterTest.Models.Square;
import com.Geekster.GeeksterTest.Service.areacalculator;
import org.geekster.Main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AreaController {
    @Autowired
    Square square;
    @Autowired
    areacalculator areacalculator;

    @GetMapping("/area")
    public int sqareArea(){
        String []brgs=new String[1];
        int area=square.squarearea();
        String str="Square Area is "+area;
        brgs[0]=str;
        Main.main(brgs);
        return area;
    }
    @GetMapping("/Rarea")
    public int arearect(){
        String []brgs=new String[1];
        Rectangle Rect=areacalculator.object();
        int area=Rect.area();
        String str="Rectangle Area is "+Rect.area();
        brgs[0]=str;
        Main.main(brgs);
        return area;
    }
}
