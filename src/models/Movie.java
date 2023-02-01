package models;

 public class Movie extends Category {
    private String name;
    private String director;
    private String showTime;
    private int price;

    public Movie(String mainCategory, String genre, String name, String director, String showTime, int price) {
        super(mainCategory, genre);
        this.name = name;
        this.director = director;
        this.showTime = showTime;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public String getDirector() {
        return this.director;
    }

    public String getShowTime() {
        return this.showTime;
    }

    public int getPrice() {
        return this.price;
    }

    public void getMovies(String showtime) {
        if (this.showTime.equals(showtime)) {
            System.out.println("Movie Name: " + this.name + ", Director: " + this.director + ", Show Time: " + this.showTime + ", Price: " + this.price);
        }
    }
}