package org.example.URLHitCounter.Repository;

import org.example.URLHitCounter.Model.Hit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class HitRepo {

    @Autowired

    private Integer hits;

    @Autowired

    private Map<String, Integer> userMap;
    public Integer getHit()
    {
        return hits++;
    }

    public Map<String, Integer> getUserMap()
    {
        return userMap;
    }
}
