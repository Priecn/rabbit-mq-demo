package com.rabbitmq.rabbitmqdemo;

import lombok.*;

import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SimpleMessage implements Serializable {

    private String name;
    private String description;
}
