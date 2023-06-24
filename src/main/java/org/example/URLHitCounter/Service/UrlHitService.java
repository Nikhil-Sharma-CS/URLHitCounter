package org.example.URLHitCounter.Service;

import org.example.URLHitCounter.Model.Hit;
import org.example.URLHitCounter.Repository.HitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UrlHitService {

    @Autowired
    HitRepo hitRepo;
    public Integer getHitCount() {      //This will simply return hit counter
        return hitRepo.getHit();
    }

    public String getUserHitCount(String username) {    //This will return hit counter with username
        Map<String, Integer> userMap = hitRepo.getUserMap();
        Integer value=1;
        if(userMap.containsKey(username))
        {
            value += userMap.get(username);
            userMap.put(username, value);
        }
        else
        {
            userMap.put(username, value);
        }
            return "username: " + username + " | " +"hitcount: " + value;
    }
}
