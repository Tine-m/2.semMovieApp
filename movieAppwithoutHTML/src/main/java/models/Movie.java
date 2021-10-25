package models;

public class Movie {

    private int ID; // PK in database
    private String title;
    private int year;
    private int length;
    private String subject;
    private int popularity;
    private boolean awards;

    //OLD ONE
    public Movie(int year, int length, String title, String subject, int popularity, String awards) {
        this.year = year;
        this.length = length;
        this.title = title;
        this.subject = subject;
        this.popularity = popularity;
        if (awards.equals("Yes")) {
            this.awards = true;
        }
        else this.awards = false;
    }

    //DB based
    public Movie(int id, String title, int year, int length, String subject, int popularity, String awards) {
        this.ID = id;
        this.title = title;
        this.year = year;
        this.length = length;
        this.subject = subject;
        this.popularity = popularity;
        if (awards.equals("Yes")) {
            this.awards = true;
        }
        else this.awards = false;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", length=" + length +
                ", subject='" + subject + '\'' +
                ", popularity=" + popularity +
                ", awards=" + awards +
                '}';
    }
}
