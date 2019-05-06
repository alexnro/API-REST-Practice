package org.lasencinas.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping(path="/topic")
    public List<Topic> getAllTopics() {
        return Arrays.asList(
                new Topic("Spring", "Spring Frameword", "Spring Framework Description"),
                new Topic("java", "Core Java", "Core Java Description"),
                new Topic("javascript", "JavaScript", "JavaScript Description")
        );
    }
}
