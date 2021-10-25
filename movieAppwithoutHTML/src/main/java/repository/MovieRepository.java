package repository;

import models.Movie;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MovieRepository {

    public Movie findFirstMovie() {
        Movie movie = null;
        try {
            Connection con = DBManager.getConnection();
            String SQL = "SELECT * FROM movies";

            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                movie = new Movie(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getString(7));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return movie;
    }

    // Search retrieves all matches, including search by substring
    public List<Movie> findMoviesByTitle(String title) {
        ArrayList<Movie> movies = new ArrayList<>();
        try {
            Connection con = DBManager.getConnection();
            String SQL = "SELECT * FROM movies WHERE title like ?";

            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, "%" + title + "%");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                movies.add(new Movie(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getString(7)
                ));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return movies;
    }

    public List<Movie> findAllMovies() {

        ArrayList<Movie> movies = new ArrayList<>();
        try {
            Connection con = DBManager.getConnection();
            String SQL = "SELECT * FROM movies";

            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                movies.add(new Movie(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getString(7)
                ));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return movies;
    }
}
