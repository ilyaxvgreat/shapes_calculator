package com.wamisoftware.task.dto.shapes;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;

@Getter
@RequiredArgsConstructor
public class Square extends AbstractShape {

    @NotNull(message = "Please provide side for Square")
    @DecimalMin(value = "0", inclusive = false, message = "side for Square should be more than 0")
    private final Double side;

    @Override
    public double calculateArea() {
        return Math.pow(side, 2);
    }

    @Override
    public double calculatePerimeter() {
        return this.side * 4;
    }
}
