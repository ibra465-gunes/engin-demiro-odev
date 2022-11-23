package bussines;

import core.logging.CategoryLogger;
import dataAccess.CategoryDao;
import entities.Category;

import java.util.List;

public class CategoryManager {
    private CategoryDao categoryDao;
    private List<Category> dbcategory;
    private CategoryLogger[] loggers;

    public CategoryManager(CategoryDao categoryDao, List<Category> dbcategory, CategoryLogger[] loggers) {
        this.categoryDao = categoryDao;
        this.dbcategory = dbcategory;
        this.loggers = loggers;
    }

    public void add(Category category) throws Exception {
        for(Category c : dbcategory){
            if(c.getName()== category.getName()){
                throw new Exception("Kategori ismi aynı olamaz");
            }
        }
        categoryDao.add(category);
        for(CategoryLogger log : loggers){
            log.logCa(category.getName());
        }
    }
}
