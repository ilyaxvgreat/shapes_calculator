package com.wamisoftware.task.dto.shapes;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;

@Getter
@RequiredArgsConstructor
public class Circle extends AbstractShape {

    @NotNull(message = "Please provide radius for Circle")
    @DecimalMin(value = "0", inclusive = false, message = "radius for Circle should be more than 0")
    private final Double radius;

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * this.radius;
    }
}
