import bussines.CategoryManager;
import bussines.CourseManager;
import bussines.InstructorManager;
import core.logging.*;
import dataAccess.HibernateDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        InstructorLogger[] loggers ={new DatabaseLogger(),new FileLogger(),new MailLogger()};
        Instructor instructor = new Instructor(1,"Engin","Demiroğ");
        InstructorManager instructorManager = new InstructorManager(new HibernateDao(),loggers);
        instructorManager.add(instructor);
        List<Category> list1 = new ArrayList<Category>();
        CategoryLogger[] loggers1 = {new DatabaseLogger(),new FileLogger(),new MailLogger()};
        Category category = new Category(1,"Yazılım");
        CategoryManager categoryManager = new CategoryManager(new HibernateDao(),list1,loggers1);
        categoryManager.add(category);
        List<Course> list2 = new ArrayList<Course>();
        CourseLogger[] loggers2 = {new DatabaseLogger(),new FileLogger(),new MailLogger()};
        Course course = new Course(1,"Java",category,10,instructor);
        CourseManager courseManager = new CourseManager(new HibernateDao(),list2,loggers2);
        courseManager.add(course);
    }
}