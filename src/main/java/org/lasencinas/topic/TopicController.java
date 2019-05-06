package org.lasencinas.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService = null;

    @RequestMapping(path="/topic")
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }
}
