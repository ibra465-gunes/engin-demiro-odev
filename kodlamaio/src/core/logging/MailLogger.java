package core.logging;

public class MailLogger implements InstructorLogger,CourseLogger,CategoryLogger{
    @Override
    public void logCa(String data) {
        System.out.println("Kategori mail ile logladı:"+data);
    }

    @Override
    public void logCo(String data) {
        System.out.println("Kurs mail ile loglandı:"+data);
    }

    @Override
    public void logI(String data) {
        System.out.println("Eğitmen mail ile loglandı:"+data);
    }
}
