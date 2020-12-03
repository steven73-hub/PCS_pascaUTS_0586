package com.example.TugasPascaUts_PCS_0586;

public class Movie {


    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public Movie(String tittle, String year, String image, String overview) {
        this.tittle = tittle;
        this.year = year;
        this.image = image;
        this.overview = overview;
    }

    private String tittle;
    private String year;
    private String image;
    private String overview;

}
