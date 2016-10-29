package com.aeps.sandbox.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Alejandro on 10/28/2016.
 */
@RestController
public class WebSocketController {

    @Autowired
    protected Producer producer;

    @RequestMapping("/send/{topic}")
    public String sender(@PathVariable String topic, @RequestParam String message) {
        producer.sendMessage(topic, message);
        return "Message Sent";
    }

}