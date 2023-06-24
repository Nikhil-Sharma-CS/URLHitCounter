package org.example.URLHitCounter.Configuration;

import org.example.URLHitCounter.Model.Hit;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
public class BeanManager {

    @Bean("Not User")
    public Integer initializer()
    {
        return 1;
    }

    @Bean("User")
    public Map<String, Integer> userInitializer()
    {
        return new HashMap<>();
    }
}
