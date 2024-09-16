package test;
import movie.*;
public class movieTest {
    public static void main(String[] args) {
        movie movie = new movie();
        movieItem movieItem1= new movieItem("Deadpool1","caleb");
        movieItem movieItem2= new movieItem("Deadpool2","nzabb");
        movieItem movieItem3= new movieItem("TopGun1","Tom");
        movieItem movieItem4= new movieItem("TopGun2","Cruise");

        movie.addmovieItem(movieItem1);
        movie.addmovieItem(movieItem2);
        movie.addmovieItem(movieItem3);
        movie.addmovieItem(movieItem4);

        movieItem1.printDetails();
        movieItem2.printDetails();
        movieItem3.printDetails();
        movieItem4.printDetails();
    }

}
