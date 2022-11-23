package bussines;

import core.logging.InstructorLogger;
import dataAccess.InstructorDao;
import entities.Instructor;

public class InstructorManager {
    private InstructorDao instructorDao;
    private InstructorLogger[] loggers;

    public InstructorManager(InstructorDao instructorDao, InstructorLogger[] loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }

    public void add(Instructor instructor){
        instructorDao.add(instructor);
        for(InstructorLogger log : loggers){
            log.logI(instructor.getFirstName()+" "+instructor.getLastName());
        }
    }

}
