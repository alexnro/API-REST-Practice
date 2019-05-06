package org.lasencinas.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

    @RequestMapping(path="/topic")
    public String getAllTopics() {
        return "All Topics";
    }
}
