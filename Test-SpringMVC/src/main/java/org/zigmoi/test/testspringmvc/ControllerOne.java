package org.zigmoi.test.testspringmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Zigmoi-Code on 3/2/2015.
 */


@Controller
public class ControllerOne {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String serve() {

        return "login";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String serve2() {

        return "login";
    }
}
