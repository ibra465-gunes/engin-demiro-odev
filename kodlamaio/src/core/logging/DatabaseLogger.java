package core.logging;

public class DatabaseLogger implements InstructorLogger,CategoryLogger,CourseLogger{
    @Override
    public void logCa(String data) {
        System.out.println("Kategori veritabanına logladı:"+data);
    }

    @Override
    public void logCo(String data) {
        System.out.println("Kurs veritabanına loglandı:"+data);
    }

    @Override
    public void logI(String data) {
        System.out.println("Eğitmen veritabanına loglandı:"+data);
    }
}
