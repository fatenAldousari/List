import java.util.ArrayList;

// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

class Main {
  public static void main(final String[] args) {

    List<String> movies = new ArrayList<>();
    movies.add("harry potter");
    movies.add("harry potter 2");
    movies.add("harry potter 3");

    movies.add("love story TS");
    movies.add("love story 2 TS");
    movies.add("love story3");
    movies.add("hunger games");
    movies.add("hunger games 2");
    movies.add("hunger games 3");

    movies.remove(0);
    movies.remove(4);
    for (String movie : movies) {
      System.out.println(movie);
    }

  }

  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
}