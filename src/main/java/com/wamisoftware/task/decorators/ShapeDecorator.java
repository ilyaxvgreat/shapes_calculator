package com.wamisoftware.task.decorators;

import com.wamisoftware.task.dto.request.ShapeRequestDto;
import com.wamisoftware.task.dto.response.ShapeResponseDto;
import com.wamisoftware.task.dto.shapes.Shape;
import com.wamisoftware.task.services.shapes.ShapeFactory;
import com.wamisoftware.task.services.shapes.ShapeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ShapeDecorator {
    private final ShapeService shapeService;
    private final ShapeFactory shapeFactory;

    public ShapeResponseDto calculateShape(ShapeRequestDto shapeRequestDto) {
        Shape shape = shapeFactory.createShape(shapeRequestDto);
        double area = shapeService.calculateArea(shape);
        double perimeter = shapeService.calculatePerimeter(shape);
        return new ShapeResponseDto(area, perimeter);
    }
}
