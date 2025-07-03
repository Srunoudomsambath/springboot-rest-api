package kh.edu.istad.firstspringwebmvc.dto;


import lombok.*;

//Data Transfer Object
//1.Request DTO
//2.Response DTO
@Builder
public record CourseResponse(
        String id,
         String code,
        String title,
         double price,
        boolean status


) {
}
