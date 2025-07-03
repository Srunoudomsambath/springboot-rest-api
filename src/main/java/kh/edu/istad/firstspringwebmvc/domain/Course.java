package kh.edu.istad.firstspringwebmvc.domain;

import lombok.*;

@Builder
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Course {
    private String id;
    private Boolean status;
    private String code;
    private String title;
    private double price;

}
