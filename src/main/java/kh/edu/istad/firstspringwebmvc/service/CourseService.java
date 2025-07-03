package kh.edu.istad.firstspringwebmvc.service;

import kh.edu.istad.firstspringwebmvc.domain.Course;
import kh.edu.istad.firstspringwebmvc.dto.CourseResponse;

import java.util.List;

public interface CourseService {
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

}
