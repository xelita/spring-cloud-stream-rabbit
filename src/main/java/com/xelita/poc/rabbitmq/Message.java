package com.xelita.poc.rabbitmq;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Message {

    private String id;
    private String content;
}
