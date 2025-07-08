package kh.edu.istad.firstspringwebmvc.controller;


import kh.edu.istad.firstspringwebmvc.dto.CourseResponse;
import kh.edu.istad.firstspringwebmvc.dto.CreateCourseRequeset;
import kh.edu.istad.firstspringwebmvc.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//serialize json/xml body
@RestController
@RequestMapping("/api/v1/courses")
@RequiredArgsConstructor
public class CourseController {

    private final CourseService courseService;


    @GetMapping()
    public List<CourseResponse> getCourses(@RequestParam(required = false,defaultValue = "false")Boolean status ) {
        return courseService.getCourses(status);
    }

    @GetMapping("/title")
    public List<CourseResponse> getCoursesStatusTitle(@RequestParam(required = false)Boolean status,
                                                      @RequestParam(required=false)String title) {
        return  courseService.getCourses(status,title);
    }

    @GetMapping("/code/{code}")
    CourseResponse getCourseByCode(@PathVariable String code){
        return courseService.getCourseByCode(code);
    }

    @GetMapping("/id/{id}")
    CourseResponse getCourseById(@PathVariable String id){
        return courseService.getCourseById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)//Set status to 201
    @PostMapping
    public CourseResponse createCourse(@RequestBody CreateCourseRequeset createCourseRequest){
        return  courseService.createCourse(createCourseRequest);
    }

    @DeleteMapping("/code/{code}")
    @ResponseStatus(HttpStatus.NO_CONTENT)// 204 No Content
    public void deleteCourseByCode(@PathVariable String code){
        courseService.deleteCourseByCode(code);
    }

    //ResponseEntity<?> let us custom something on method
//    public ResponseEntity<?> getCourses(@RequestParam(required = false , defaultValue = "true")boolean getStatus ) {
//      List<CourseResponse> courseResponsesList = courseService.getCourses(getStatus);
//      return ResponseEntity.ok(courseResponsesList);
//    }

}
