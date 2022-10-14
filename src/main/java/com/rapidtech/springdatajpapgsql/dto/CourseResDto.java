package com.rapidtech.springdatajpapgsql.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CourseResDto {
    private Long id;
    private String title;
    private int modules;
    private double fee;
}
