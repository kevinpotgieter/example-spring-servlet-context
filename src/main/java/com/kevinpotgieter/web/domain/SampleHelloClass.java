package com.kevinpotgieter.web.domain;

import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: kevinpotgieter
 * Date: 23/04/2012
 * Time: 08:37
 * To change this template use File | Settings | File Templates.
 */
@Component
public class SampleHelloClass {

    private String helloString;

    public SampleHelloClass(String helloString) {
        this.helloString = helloString;
    }

    public String getHelloString() {
        return helloString;
    }

    public void setHelloString(String helloString) {
        this.helloString = helloString;
    }
}
