package org.zigmoi.test.testspringmvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Zigmoi-Code on 3/2/2015.
 */


@Controller
public class ControllerTwo {

    @RequestMapping(value = "/hello2", method = RequestMethod.POST)
    public void serve(HttpServletRequest req, HttpServletResponse res) {

    }
}