package core.logging;

public class FileLogger implements InstructorLogger,CategoryLogger,CourseLogger{
    @Override
    public void logCa(String data) {
        System.out.println("Kategori dosyaya logladı:"+data);
    }

    @Override
    public void logCo(String data) {
        System.out.println("Kurs dosyaya loglandı:"+data);
    }

    @Override
    public void logI(String data) {
        System.out.println("Eğitmen dosyaya loglandı:"+data);
    }
}
