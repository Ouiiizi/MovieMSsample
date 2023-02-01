
package models;
import java.util.ArrayList;
public class Category extends MainCategory {
    private String genre;

    public Category(String mainCategory, String genre) {
        super(mainCategory);
        this.genre = genre;
    }

    public String getGenre() {
        return this.genre;
    }
}