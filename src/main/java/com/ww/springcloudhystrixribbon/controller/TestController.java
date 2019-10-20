package com.ww.springcloudhystrixribbon.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class TestController {
    @RequestMapping("/test")
    public List<Map<String, Object>> test() {
        List<Map<String, Object>> result = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Map<String, Object> data = new HashMap<>();
            data.put("id", i + 1);
            data.put("name", "test name" + i);
            data.put("age", 20 + i);
            result.add(data);
        }
        return result;
    }

    @RequestMapping("/testMerge")
    public List<Map<String, Object>> testMerge(Long[] ids) {
        System.out.println(Thread.currentThread().getName() + "-------------" + Arrays.asList(ids));
        List<Map<String, Object>> result = new ArrayList<>();
        for (Long id : ids) {
            Map<String, Object> data = new HashMap<>();
            data.put("id:", id);
            data.put("name:", "test name" + id);
            data.put("age", 20 + id);
            result.add(data);
        }
        return result;

    }

}
