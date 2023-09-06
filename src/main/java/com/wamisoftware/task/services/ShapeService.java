package com.wamisoftware.task.services;

import com.wamisoftware.task.dto.shapes.Shape;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

@Validated
public interface ShapeService {

    double calculateArea(@Valid Shape shape);

    double calculatePerimeter(@Valid Shape shape);

}
