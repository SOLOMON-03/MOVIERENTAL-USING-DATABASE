package Movie;
import java.util.*;
public class MovieRental {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose Insert or Get");
        String selection=scanner.nextLine();
        System.out.println("Choose a Genre");
        System.out.println("Comedy");
        System.out.println("Thriller");
        System.out.println("Romance");
        System.out.println("Sci-fi");
        System.out.println("Adventure");
        System.out.println("Animated");
        String choice=scanner.nextLine().toLowerCase(Locale.ROOT);
        String movie;
        String director,genre;
        int year,quantity,sno;
        double imdb;
        int price;
        String name;
        ComedyMovie comedyMovie= new ComedyMovie();
        ThrillerMovie thrillerMovie = new ThrillerMovie();
        RomanceMovie romanceMovie = new RomanceMovie();
        ScienceFictionMovie scienceFictionMovie = new ScienceFictionMovie();
        AdventureMovie adventureMovie = new AdventureMovie();
        AnimatedMovie animatedMovie = new AnimatedMovie();
        if(selection.equals("Insert")){
            switch (choice){
                case "comedy":
                    System.out.println("Sno:");
                    sno = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Movie Name:");
                    movie = scanner.nextLine();
                    System.out.println("Director Name:");
                    director = scanner.nextLine();
                    System.out.println("Year:");
                    year = scanner.nextInt();
                    System.out.println("Imdb:");
                    imdb = scanner.nextDouble();
                    System.out.println("Price:");
                    price = scanner.nextInt();
                    System.out.println("Quantity:");
                    quantity = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Genre:");
                    genre = scanner.nextLine();
                    comedyMovie= new ComedyMovie(sno,movie,director,year,imdb, price,quantity,genre);
                    comedyMovie.DBconnection(selection,choice);
                case "thriller":
                    System.out.println("Sno:");
                    sno = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Movie Name:");
                    movie = scanner.nextLine();
                    System.out.println("Director Name:");
                    director = scanner.nextLine();
                    System.out.println("Year:");
                    year = scanner.nextInt();
                    System.out.println("Imdb:");
                    imdb = scanner.nextDouble();
                    System.out.println("Price:");
                    price = scanner.nextInt();
                    System.out.println("Quantity:");
                    quantity = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Genre:");
                    genre = scanner.nextLine();
                    thrillerMovie = new ThrillerMovie(sno,movie,director,year,imdb,price,quantity,genre);
                    thrillerMovie.DBconnection(selection,choice);
                    break;
                case "romance":
                    System.out.println("Sno:");
                    sno = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Movie Name:");
                    movie = scanner.nextLine();
                    System.out.println("Director Name:");
                    director = scanner.nextLine();
                    System.out.println("Year:");
                    year = scanner.nextInt();
                    System.out.println("Imdb:");
                    imdb = scanner.nextDouble();
                    System.out.println("Price:");
                    price = scanner.nextInt();
                    System.out.println("Quantity:");
                    quantity = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Genre:");
                    genre = scanner.nextLine();
                    romanceMovie = new RomanceMovie(sno,movie,director,year,imdb,price,quantity,genre);
                    romanceMovie.DBconnection(selection,choice);
                    break;
                case "sci-fi":
                    System.out.println("Sno:");
                    sno = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Movie Name:");
                    movie = scanner.nextLine();
                    System.out.println("Director Name:");
                    director = scanner.nextLine();
                    System.out.println("Year:");
                    year = scanner.nextInt();
                    System.out.println("Imdb:");
                    imdb = scanner.nextDouble();
                    System.out.println("Price:");
                    price = scanner.nextInt();
                    System.out.println("Quantity:");
                    quantity = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Genre:");
                    genre = scanner.nextLine();
                    scienceFictionMovie = new ScienceFictionMovie(sno,movie,director,year,imdb,price,quantity,genre);
                    scienceFictionMovie.DBconnection(selection,choice);
                    break;
                case "adventure":
                    System.out.println("Sno:");
                    sno = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Movie Name:");
                    movie = scanner.nextLine();
                    System.out.println("Director Name:");
                    director = scanner.nextLine();
                    System.out.println("Year:");
                    year = scanner.nextInt();
                    System.out.println("Imdb:");
                    imdb = scanner.nextDouble();
                    System.out.println("Price:");
                    price = scanner.nextInt();
                    System.out.println("Quantity:");
                    quantity = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Genre:");
                    genre = scanner.nextLine();
                    adventureMovie = new AdventureMovie(sno,movie,director,year,imdb,price,quantity,genre);
                    adventureMovie.DBconnection(selection,choice);
                    break;
                case "animated":
                    System.out.println("Sno:");
                    sno = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Movie Name:");
                    movie = scanner.nextLine();
                    System.out.println("Director Name:");
                    director = scanner.nextLine();
                    System.out.println("Year:");
                    year = scanner.nextInt();
                    System.out.println("Imdb:");
                    imdb = scanner.nextDouble();
                    System.out.println("Price:");
                    price = scanner.nextInt();
                    System.out.println("Quantity:");
                    quantity = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Genre:");
                    genre = scanner.nextLine();
                    animatedMovie = new AnimatedMovie(sno,movie,director,year,imdb,price,quantity,genre);
                    animatedMovie.DBconnection(selection,choice);
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
        else {
            switch(choice) {
                case "comedy":
                    comedyMovie.DBconnection(selection,choice);
                    break;
                case "thriller":
                    thrillerMovie.DBconnection(selection,choice);
                    break;
                case "romance":
                    romanceMovie.DBconnection(selection,choice);
                    break;
                case "sci-fi":
                    scienceFictionMovie.DBconnection(selection,choice);
                    break;
                case "adventure":
                    adventureMovie.DBconnection(selection,choice);
                    break;
                case "animated":
                    animatedMovie.DBconnection(selection,choice);
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}