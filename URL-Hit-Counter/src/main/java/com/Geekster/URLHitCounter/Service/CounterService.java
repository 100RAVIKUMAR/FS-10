package com.Geekster.URLHitCounter.Service;

import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class CounterService {
    private HashMap<String,Integer>map;
    public CounterService(){
        map=new HashMap<>();
        System.out.print("hashmap created");
    }
    public String gethitcount(String username) {
        if(username!=null){
            map.put(username,map.getOrDefault(username,0)+1);
            return "username :"+username+",count :"+map.get(username);
        }
        return "unsupported username!!!!";
    }
}
