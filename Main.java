import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Libro> library = new ArrayList<>();

    
        Libro book1 = new Libro("50 sombras de gray", "e.l jame", 2011);
        Libro book2 = new Libro("naruto", "masashi kisimoto", 1999);
        Libro book3 = new Libro("dragon ball z", "akira toriyama", 1989);
        library.add(book1);
        library.add(book2);
        library.add(book3);

        
        System.out.println("\n--- add a new book");
        System.out.print("title: ");
        String title = sc.nextLine();
        System.out.print("author: ");
        String author = sc.nextLine();
        System.out.print("year: ");
        int year = sc.nextInt();

        Libro userBook = new Libro(title, author, year);
        library.add(userBook);

    
        System.out.println("\n--- library books ");
        for (Libro b : library) {
            b.showInfo();
        }

        sc.close();
    }
}
