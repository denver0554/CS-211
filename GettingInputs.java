
import java.util.Scanner;

public class GettingInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter the genre: ");
        String genre = scanner.nextLine();

        System.out.print("Enter the album: ");
        String album = scanner.nextLine();

        System.out.print("Enter the title: ");
        String title = scanner.nextLine();

        System.out.print("Enter the artist: ");
        String artist = scanner.nextLine();

        // Print the entered values
        System.out.println("\n___________________________");
        System.out.println("\nDetails of the Song");
        System.out.println("\n___________________________");
        System.out.println("Year Released: " + year);
        System.out.println("Genre: " + genre);
        System.out.println("Album: " + album);
        System.out.println("Title: " + title);
        System.out.println("Artist: " + artist);

   
        scanner.close();
    }
}
