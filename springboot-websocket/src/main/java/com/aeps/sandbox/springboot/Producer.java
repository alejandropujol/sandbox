package com.aeps.sandbox.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Alejandro on 10/28/2016.
 */
@Component
public class Producer {

    private static final SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    @Autowired
    private SimpMessagingTemplate template;

    public void sendMessage(String topic, String message) {
        StringBuilder builder = new StringBuilder();

        builder.append("[");
        builder.append(dateFormatter.format(new Date()));
        builder.append("] ");
        builder.append(message);

        template.convertAndSend("/topic/" + topic, builder.toString());
    }

}