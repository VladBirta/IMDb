package ro.fasttrackit.project.IMDB.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Action {
    @Id
    @GeneratedValue
    private int id;

    private String imagine;
    private String descriere;
    private String titlu;
    private double rating;

    public Action(String imagine, String descriere, String titlu, double rating) {
        this.imagine = imagine;
        this.descriere = descriere;
        this.titlu = titlu;
        this.rating = rating;
    }

    public Action(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImagine() {
        return imagine;
    }

    public void setImagine(String imagine) {
        this.imagine = imagine;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
