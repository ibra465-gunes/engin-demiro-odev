package entities;

public class Course {
    private int id;
    private String name;
    private Category categoryName;
    private int unitPrice;
    private Instructor instructorName;

    public Course(int id, String name, Category categoryName, int unitPrice, Instructor instructorName) {
        this.id = id;
        this.name = name;
        this.categoryName = categoryName;
        this.unitPrice = unitPrice;
        this.instructorName = instructorName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(Category categoryName) {
        this.categoryName = categoryName;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Instructor getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(Instructor instructorName) {
        this.instructorName = instructorName;
    }
}
