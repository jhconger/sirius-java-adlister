package bean;

import java.util.ArrayList;
import java.util.List;

public class BeanTest {
    public static void main(String[] args) {

        Album testAlbum = new Album(1, "Test Artist", "Test Title", 1999, 21F, "Test Genre");
        System.out.println(testAlbum.getName());
        Author testAuthor = new Author();
        testAuthor.setFirstName("Test");
        testAuthor.setLastName("Test");
        testAuthor.setId(7);

        Quote testQuote1 = new Quote(1, "Random quote 01", testAuthor);
        Quote testQuote2 = new Quote(2, "Random quote 02", new Author(1,"Testy", "Testerson"));

        List<Quote> quotes = new ArrayList<>();
        quotes.add(testQuote1);
        quotes.add(testQuote2);

        for (Quote quote: quotes) {

            System.out.println(quote.getContent());
            System.out.println("~ " + quote.getAuthor().getLastName() + ", " + quote.getAuthor().getFirstName());
        }

    }

}