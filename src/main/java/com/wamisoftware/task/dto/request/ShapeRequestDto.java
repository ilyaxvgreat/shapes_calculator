package com.wamisoftware.task.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShapeRequestDto {

    private String shapeType;
    private Double side;
    private Double width;
    private Double height;
    private Double radius;

}
