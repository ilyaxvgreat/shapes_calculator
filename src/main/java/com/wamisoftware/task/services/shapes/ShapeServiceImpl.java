package com.wamisoftware.task.services.shapes;

import com.wamisoftware.task.dto.shapes.Shape;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ShapeServiceImpl implements ShapeService {

    @Override
    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    @Override
    public double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }
}
