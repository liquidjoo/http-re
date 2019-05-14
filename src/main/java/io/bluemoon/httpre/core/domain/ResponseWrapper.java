package io.bluemoon.httpre.core.domain;

import lombok.Data;

@Data
public class ResponseWrapper {
    private String header;
    private String body;
}
