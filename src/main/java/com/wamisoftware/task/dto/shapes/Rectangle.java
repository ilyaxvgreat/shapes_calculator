package com.wamisoftware.task.dto.shapes;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;

@Getter
@RequiredArgsConstructor
public class Rectangle extends AbstractShape {

    @NotNull(message = "Please provide width for Rectangle")
    @DecimalMin(value = "0", inclusive = false, message = "width for Rectangle should be more than 0")
    private final double width;

    @NotNull(message = "Please provide height for Rectangle")
    @DecimalMin(value = "0", inclusive = false, message = "height for Rectangle should be more than 0")
    private final double height;

    @Override
    public double calculateArea() {
        return this.width * this.height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (this.height + this.width);
    }
}
