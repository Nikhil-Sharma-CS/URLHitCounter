package org.example.URLHitCounter.Controller;

import org.example.URLHitCounter.Service.UrlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/visitor-count-app")
public class UrlHitController {

    @Autowired
    public UrlHitService urlHitService;
    @GetMapping("count")        //This returns hit counter
    public String getHitCount() {
        return "Visitors: " + urlHitService.getHitCount();
    }

    @GetMapping("count/username/{username}")    //This returns hit counter with username
    public String getUserHitCount(@PathVariable String username)
    {
        return urlHitService.getUserHitCount(username);
    }
}
