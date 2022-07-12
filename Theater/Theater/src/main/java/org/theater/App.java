package org.theater;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.theater.dao.TheaterDao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        TheaterDao theater = context.getBean("TheaterManagement",TheaterDao.class);

        Movie movie = (Movie) context.getBean("Movie");

          // INSERT
//        movie.setMovieName("Fast and Furious");
//        movie.setMovieGenre("Action");
//        //LocalDateTime time = LocalDateTime.of(2021, Month.NOVEMBER, 3, 17, 00);
//        LocalDate date = LocalDate.of(2021, 11, 4);
//        LocalTime time = LocalTime.of(11, 30);
//        LocalDateTime datetime = LocalDateTime.of(date,time);
//        movie.setMovieTime(datetime);
//        movie.setMoviePrice(300);
//        int result = theater.addMovie(movie);
//        System.out.println(result);

          // DELETE
//        movie.setMovieName("Matrix");
//        int result = theater.deleteMovie(movie);
//        System.out.println(result);

        // UPDATE
//        movie.setMovieName("Fast and Furious 9");
//        movie.setMovieGenre("Action");
//        //LocalDateTime time = LocalDateTime.of(2021, Month.NOVEMBER, 3, 17, 00);
//        LocalDate date = LocalDate.of(2021, 11, 4);
//        LocalTime time = LocalTime.of(11, 40);
//        LocalDateTime datetime = LocalDateTime.of(date,time);
//        movie.setMovieTime(datetime);
//        movie.setMoviePrice(200);
//        movie.setMovieId(4);
//        int result = theater.updateMovie(movie);
//        System.out.println(result);

        // Select only 1 row
//        movie.setMovieId(2);
//        Movie m = theater.viewMovieDetails(movie);
//        System.out.println(m);

//      All rows
//        List<Movie> ml = theater.viewAllMovieDetails();
//        for(Movie s : ml)
//        {
//            System.out.println(s);
//        }

        Scanner s = new Scanner(System.in);
        boolean f = true;

        while (f)
        {
            System.out.println("-------------------Theatre Management--------------------");
            System.out.println("");
            System.out.println("Press 1 to view all movies");
            System.out.println("Press 2 to enter a new movie");
            System.out.println("Press 3 to delete movie");
            System.out.println("Press 4 to update movie details");
            System.out.println("Press 5 to view one movie from id");

            System.out.print("Enter your choice : ");
            char op = s.next().trim().charAt(0);

            switch (op)
            {
                case '1': {
                    List<Movie> ml = theater.viewAllMovieDetails();
                    for (Movie a : ml) {
                        System.out.println(a);
                    }
                    break;

                }

                case '2': {

                    System.out.println("Enter movie id");
                    int mid = s.nextInt();
                    movie.setMovieId(mid);

                    System.out.print("Enter movie name : ");
                    s.nextLine();
                    String mname = s.nextLine();
                    movie.setMovieName(mname);

                    System.out.print("Enter movie genre : ");
                    String mgenre = s.nextLine();
                    movie.setMovieGenre(mgenre);

                    System.out.print("Enter movie month : ");
                    int mmonth = s.nextInt();

                    System.out.print("Enter movie date : ");
                    int mdate = s.nextInt();

                    //LocalDateTime time = LocalDateTime.of(2021, Month.NOVEMBER, 3, 17, 00);
                    LocalDate date = LocalDate.of(2021, mmonth, mdate);

                    System.out.print("Enter movie hour : ");
                    int mhour = s.nextInt();

                    System.out.print("Enter movie minute : ");
                    int mmins = s.nextInt();
                    LocalTime time = LocalTime.of(mhour, mmins);

                    LocalDateTime datetime = LocalDateTime.of(date, time);
                    movie.setMovieTime(datetime);

                    System.out.print("Enter movie price : ");
                    int mprice = s.nextInt();
                    movie.setMoviePrice(mprice);

                    int result = theater.addMovie(movie);
                    if (result > 0)
                        System.out.println("Movie added!");
                    else
                        System.out.println("Error in adding movie! Please try again!");

                    break;

                }

                case '3': {
                    System.out.println("Enter movie name to be deleted : ");
                    s.nextLine();
                    String name = s.nextLine();

                    movie.setMovieName(name);
                    int result = theater.deleteMovie(movie);
                    if (result > 0)
                        System.out.println("Movie deleted!");
                    else
                        System.out.println("Error in deleting movie! Please try again!");

                    break;
                }

                case '4': {

                    System.out.print("Type the id of the movie you want to change : ");
                    int mid = s.nextInt();

                    System.out.print("Change movie id : ");
                    int newid = s.nextInt();
                    movie.setMovieId(newid);

                    System.out.print("Change movie name : ");
                    s.nextLine();
                    String mname = s.nextLine();
                    movie.setMovieName(mname);

                    System.out.print("Change movie genre : ");
                    String mgenre = s.nextLine();
                    movie.setMovieGenre(mgenre);

                    System.out.print("Change movie month : ");
                    int mmonth = s.nextInt();

                    System.out.print("Change movie date : ");
                    int mdate = s.nextInt();

                    //LocalDateTime time = LocalDateTime.of(2021, Month.NOVEMBER, 3, 17, 00);
                    LocalDate date = LocalDate.of(2021, mmonth, mdate);

                    System.out.print("Change movie hour : ");
                    int mhour = s.nextInt();

                    System.out.print("Change movie minute : ");
                    int mmins = s.nextInt();
                    LocalTime time = LocalTime.of(mhour, mmins);

                    LocalDateTime datetime = LocalDateTime.of(date, time);
                    movie.setMovieTime(datetime);

                    System.out.print("Change movie price : ");
                    int mprice = s.nextInt();
                    movie.setMoviePrice(mprice);

                    int result = theater.updateMovie(movie,mid);
                    if (result > 0)
                        System.out.println("Movie updated!");
                    else
                        System.out.println("Error in updating movie! Please try again!");

                    break;

                }

                case '5': {
                    System.out.println("Enter movie id : ");
                    s.nextLine();
                    int mid = s.nextInt();
                    movie.setMovieId(mid);
                    Movie m = theater.viewMovieDetails(movie);
                    System.out.println(m);

                }
            }

            System.out.print("Do you want to continue? Type Yes or No : ");
            String ans = s.next();
            if(ans.equals("Yes"))
                System.out.println("");
            else
                f=false;
        }

    }
}
