package dataAccess;

import entities.Category;
import entities.Course;
import entities.Instructor;

public class JdbcDao implements CourseDao,InstructorDao,CategoryDao{
    @Override
    public void add(Category category) {
        System.out.println("Kategori Jdbc ile veritabanına eklendi. ");
    }

    @Override
    public void add(Course course) {
        System.out.println("Kurs Jdbc ile veritabanına eklendi.");
    }

    @Override
    public void add(Instructor instructor) {
        System.out.println("Eğitmen Jdbc ile veritabanına eklendi.");
    }
}
