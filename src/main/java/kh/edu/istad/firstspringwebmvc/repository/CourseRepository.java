package kh.edu.istad.firstspringwebmvc.repository;

import kh.edu.istad.firstspringwebmvc.domain.Course;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
@Getter
@Setter
public class CourseRepository {
    private List<Course> courses;
    public CourseRepository() {
        courses = new ArrayList<>();
        courses.add(Course.builder()
                .id(UUID.randomUUID().toString())
                .code("ISTAD-001")
                .title("Spring Framework")
                .price(100.00)
                .status(true)
                .build());
        courses.add(Course.builder()
                .id(UUID.randomUUID().toString())
                .code("ISTAD-002")
                .title("Next js")
                .price(200.00)
                .status(false)
                .build());
        courses.add(Course.builder()
                .id(UUID.randomUUID().toString())
                .code("ISTAD-003")
                .title("Spring Boot")
                .price(23.00)
                .status(true)
                .build());
        courses.add(Course.builder()
                .id(UUID.randomUUID().toString())
                .code("ISTAD-004")
                .title("Spring Web MVC")
                .price(50.00)
                .status(false)
                .build());


    }
}
