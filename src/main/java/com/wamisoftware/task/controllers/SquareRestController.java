package com.wamisoftware.task.controllers;

import com.wamisoftware.task.decorators.ShapeDecorator;
import com.wamisoftware.task.dto.request.ShapeRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Validated
@RestController
@RequestMapping
@RequiredArgsConstructor
public class SquareRestController {

    private final ShapeDecorator shapeDecorator;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> calculateShape(@RequestBody @Valid ShapeRequestDto shapeRequest) {
        return ResponseEntity.ok(
                shapeDecorator.calculateShape(shapeRequest));
    }
}
