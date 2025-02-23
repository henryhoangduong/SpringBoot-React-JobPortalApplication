package com.jobportal.backend.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "sequence")
public class Sequence {
    @Id
    private String id;
    private Long seq;

}
