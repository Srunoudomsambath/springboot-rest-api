package kh.edu.istad.firstspringwebmvc.service.impl;

import kh.edu.istad.firstspringwebmvc.domain.Course;
import kh.edu.istad.firstspringwebmvc.dto.CourseResponse;
import kh.edu.istad.firstspringwebmvc.repository.CourseRepository;
import kh.edu.istad.firstspringwebmvc.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;

    @Override
    public List<CourseResponse> getCourses(Boolean status){
        List<Course> filteredCourses = courseRepository.getCourses().stream()
                .filter(course -> course.getStatus().equals(status))
                .toList();
        //Map data from domain model to dto
        List<CourseResponse> courseResponseList = filteredCourses
                .stream()
                .map(course -> CourseResponse.builder()
                        .id(course.getId())
                        .code(course.getCode())
                        .title(course.getTitle())
                        .price(course.getPrice())
                        .status(course.getStatus())
                        .build())
                .toList();
        return courseResponseList;
    }

    @Override
    public List<CourseResponse> getCourses(Boolean status, String title) {
        return courseRepository.getCourses().stream()
                .filter(course -> status == null || course.getStatus().equals(status))
                .filter(course -> title == null || course.getTitle().toLowerCase().contains(title.toLowerCase()))
                .map(course -> CourseResponse.builder()
                        .id(course.getId())
                        .code(course.getCode())
                        .title(course.getTitle())
                        .price(course.getPrice())
                        .status(course.getStatus())
                        .build())
                .toList();
    }

    @Override
    public CourseResponse getCourseByCode(String code) {
        Course course = courseRepository.getCourses().stream()
                .filter(course1 -> course1.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElseThrow(()-> new RuntimeException("Course not found with code: " + code));
        return CourseResponse.builder()
                .id(course.getId())
                .code(course.getCode())
                .title(course.getTitle())
                .price(course.getPrice())
                .status(course.getStatus())
                .build();
    }

    @Override
    public CourseResponse getCourseById(String id) {
        Course course = courseRepository.getCourses().stream()
                .filter(course1 -> course1.getId().equalsIgnoreCase(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Course not found with id: " + id));
        return CourseResponse.builder()
                .id(course.getId())
                .code(course.getCode())
                .title(course.getTitle())
                .price(course.getPrice())
                .status(course.getStatus())
                .build();

    }
}
