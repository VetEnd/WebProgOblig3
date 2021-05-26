package com.example.demo;

public class biletter {
    private String film;
    private int antall;
    private String fnavn;
    private String enavn;
    private String tlfnr;
    private String epost;

    public biletter(String film, int antall, String fnavn, String enavn, String epost) {
        this.film = film;
        this.antall = antall;
        this.fnavn = fnavn;
        this.enavn = enavn;
        this.epost = epost;
    }

    public biletter(){ }


    public String getFilm() {
        return film;
    }
    public void setFilm(String film) {
        this.film = film;
    }


    public int getAntall() {
        return antall;
    }
    public void setAntall(int antall) {
        this.antall = antall;
    }


    public String getfnavn() {
        return fnavn;
    }
    public void setFnavn(String fnavn) {
        this.fnavn = fnavn;
    }


    public String getEnavn() {
        return enavn;
    }
    public void setEnavn(String enavn) {
        this.enavn = enavn;
    }


    public String getTlfnr(){
        return tlfnr;
    }
    public void setTlfnr(String tlfnr) {
        this.tlfnr = tlfnr;
    }


    public String getEpost() {
        return epost;
    }
    public void setEpost(String epost) {
        this.epost = epost;
    }
}
