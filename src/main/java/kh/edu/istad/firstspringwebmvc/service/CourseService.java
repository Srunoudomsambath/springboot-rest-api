package kh.edu.istad.firstspringwebmvc.service;

import kh.edu.istad.firstspringwebmvc.domain.Course;
import kh.edu.istad.firstspringwebmvc.dto.CourseResponse;
import kh.edu.istad.firstspringwebmvc.dto.CreateCourseRequeset;

import java.util.List;

public interface CourseService {

    //return type
    //data ( parameter)
    //use for ?

    /**
     * បង្កើតទិន្នន៍យវគ្គសិក្សា
     *
     * @param createCourseRequest
     * @return CourseResponse
     */
    CourseResponse createCourse(CreateCourseRequeset createCourseRequest);
    /**
     *  ទាញយកព័ត៍មានវគ្គសិក្សាទាំងអស់
     * @return List<CourseResponse>
     * @author Srun Oudomsambath
     * return type courseresponse & response status
     */
    List<CourseResponse> getCourses(Boolean status);
    List<CourseResponse> getCourses(Boolean status, String title);
    CourseResponse getCourseByCode(String code);
    CourseResponse getCourseById(String id);
    void deleteCourseByCode(String code);


}
