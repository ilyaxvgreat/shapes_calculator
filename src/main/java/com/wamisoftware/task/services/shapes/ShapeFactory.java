package com.wamisoftware.task.services.shapes;

import com.wamisoftware.task.dto.request.ShapeRequestDto;
import com.wamisoftware.task.dto.shapes.Circle;
import com.wamisoftware.task.dto.shapes.Rectangle;
import com.wamisoftware.task.dto.shapes.Shape;
import com.wamisoftware.task.dto.shapes.Square;
import com.wamisoftware.task.dto.shapes.Triangle;
import com.wamisoftware.task.enums.Shapes;
import org.springframework.stereotype.Service;

import java.util.Arrays;

import static com.wamisoftware.task.util.Shapes.CIRCLE;
import static com.wamisoftware.task.util.Shapes.RECTANGLE;
import static com.wamisoftware.task.util.Shapes.SQUARE;
import static com.wamisoftware.task.util.Shapes.TRIANGLE;

@Service
public class ShapeFactory {
    public Shape createShape(ShapeRequestDto shapeRequest) {
        String shapeType = shapeRequest.getShapeType().toLowerCase();
        return switch (shapeType) {
            case SQUARE -> new Square(shapeRequest.getSide());
            case RECTANGLE -> new Rectangle(shapeRequest.getWidth(), shapeRequest.getHeight());
            case TRIANGLE -> new Triangle(shapeRequest.getSide(), shapeRequest.getHeight());
            case CIRCLE -> new Circle(shapeRequest.getRadius());
            default -> throw new IllegalArgumentException("Unsupported shape type: " + shapeType + ". Please use next shapeType:" + Arrays.toString(Shapes.values()));
        };
    }
}
