package kh.edu.istad.firstspringwebmvc.dto;


import lombok.Builder;

@Builder
public record CreateCourseRequeset(
        String code,
        String title,
        double price
) {

}
