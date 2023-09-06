package com.wamisoftware.task.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ErrorResponse {
    private String message;
    private int statusCode;
    private String httpStatus;
}
