package com.kevinpotgieter.web.controllers;

import com.kevinpotgieter.web.domain.SampleHelloClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * Created by IntelliJ IDEA.
 * User: kevinpotgieter
 * Date: 19/04/2012
 * Time: 08:20
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class SampleController {

    @Resource
    private SampleHelloClass sampleHelloClass;


    @RequestMapping(value = "/example.html", method = RequestMethod.GET)
    public String getPrimaryContextString(Model model){
        model.addAttribute("beanValue",sampleHelloClass.getHelloString());

        return "index";

    }

}
