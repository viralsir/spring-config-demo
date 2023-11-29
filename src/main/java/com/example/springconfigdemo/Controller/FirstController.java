package com.example.springconfigdemo.Controller;

import com.example.springconfigdemo.DbDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class FirstController {


    @Value(" hello from static msg")
    public String staticmsg;

//    @Value("${app.greeting}")
//    public String greetingmsg;
//
//    @Value("${my.values}")
//    public List<String> listvalues;

//    @Value("#{${db.values}}")
//    public Map<String,String> dbvalues;

    @Autowired
    public DbDetails dbDetails;

    @RequestMapping("/Hello")
    public String greetings(){

        //return greetingmsg + staticmsg + listvalues + dbvalues ;
        return dbDetails.getServer()+" "+dbDetails.getHost()+" "+dbDetails.getPort();
    }

}
