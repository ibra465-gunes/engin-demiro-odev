package bussines;

import core.logging.CourseLogger;
import dataAccess.CourseDao;
import entities.Course;
import java.util.List;

public class CourseManager {
    private CourseDao courseDao;
    private List<Course> dbCourses;
    private CourseLogger[] loggers;

    public CourseManager(CourseDao courseDao, List<Course> dbCourses, CourseLogger[] loggers) {
        this.courseDao = courseDao;
        this.dbCourses = dbCourses;
        this.loggers = loggers;
    }

    public void add(Course course) throws Exception {
        if(course.getUnitPrice()<0){
            throw new Exception("Kurs fiyatı 0'dan büyük olmalı.");
        }
        for(Course c : dbCourses){
            if(c.getName()==course.getName()){
                throw new Exception("Kurs ismi tekrar edemez");
            }
        }
        courseDao.add(course);
        for(CourseLogger log : loggers){
            log.logCo(course.getName());
        }
    }
}
