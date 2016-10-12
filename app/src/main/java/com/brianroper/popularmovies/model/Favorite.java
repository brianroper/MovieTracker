package com.brianroper.popularmovies.model;

import io.realm.RealmObject;

/**
 * Created by brianroper on 10/10/16.
 */
public class Favorite extends RealmObject{
    private String title;
    private String releaseData;
    private String rating;
    private String overview;
    private String review;
    private byte[] poster;

    public Favorite() {}

    public Favorite(String title,
                    String releaseDate,
                    String rating,
                    String overview,
                    String review ,
                    byte[] poster){

        this.title = title;
        this.releaseData = releaseDate;
        this.rating = rating;
        this.overview = overview;
        this.review = review;
        this.poster = poster;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        title = title;
    }

    public String getReleaseDate() {
        return releaseData;
    }

    public void setReleaseDate(String releaseDate) {
        releaseDate = releaseDate;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        rating = rating;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        overview = overview;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        review = review;
    }

    public byte[] getPoster() {
        return poster;
    }

    public void setPoster(byte[] poster) {
        poster = poster;
    }
}