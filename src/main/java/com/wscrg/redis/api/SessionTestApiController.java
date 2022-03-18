package com.wscrg.redis.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
public class SessionTestApiController {

    @GetMapping("/")
    public String root(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.setAttribute("name", "jiyong");
        return "ok";
    }
}
