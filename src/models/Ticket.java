package models;
import java.util.ArrayList;

public class Ticket {
    ArrayList<Seat> seats;
    User user;
    Movie movie;

    public Ticket(ArrayList<Seat> seats, User user, Movie movie) {
        this.seats = seats;
        this.user = user;
        this.movie = movie;


    public void getInfo() {
        System.out.println("Main Category: " +movie.getMainCategory());
        System.out.println("Movie: " + movie.getName());
        System.out.println("Time: "+movie.getShowTime());
        System.out.println("Price: "+movie.getPrice());
        System.out.println("User: "+movie.getName());
    }

    public void getTickets(){
            System.out.println("Seats");
            for(Seat seat : seats){
                System.out.println("Row: " + seat.getRow());
            }

        }




    }
}

