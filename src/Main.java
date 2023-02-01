import models.MainCategory;
import models.Category;
import models.User;
import models.Seat;
import models.Movie;
import models.Ticket;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Seat> seats = new ArrayList<>();
        seats.add(new Seat(1, 2));
        seats.add(new Seat(1, 3));

        User user = new User("John Doe", "johndoe@email.com");
        Movie movie = new Movie("Sofa", "Action", "The Avengers", "Joss Whedon", "7 PM", 20);

        Ticket ticket = new Ticket(seats, user, movie);

        ticket = new Ticket(seats, user, movie);
        ticket.getInfo();
        ticket.getTickets();

        movie.getMovies("7 PM");
    }
}
