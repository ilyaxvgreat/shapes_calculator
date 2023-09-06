package com.wamisoftware.task.dto.shapes;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;

@Getter
@AllArgsConstructor
public class Triangle extends AbstractShape {

    @NotNull(message = "Please provide side for Triangle")
    @DecimalMin(value = "0", inclusive = false, message = "side for Triangle should be more than 0")
    private final double side;

    @NotNull(message = "Please provide height value to side for Triangle")
    @DecimalMin(value = "0", inclusive = false, message = "height for Triangle should be more than 0")
    private final double height;

    @Override
    public double calculateArea() {
        return 0.5 * this.side * height;
    }

    @Override
    public double calculatePerimeter() {
        double b = Math.sqrt(Math.pow(this.side, 2) - Math.pow(this.height, 2));
        double c = Math.sqrt(Math.pow(this.side, 2) - Math.pow(this.height, 2));
        return this.side + b + c;
    }
}
