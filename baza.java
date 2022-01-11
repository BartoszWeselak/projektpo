package com.company;

import com.sun.tools.javac.Main;

import java.sql.Connection;
import java.sql.Statement;

public class baza  {

     private  int nrpokoj;
    private String imie;
    private String nazwisko;

    public baza(String imie,String nazwisko,int nrpokoj){
        this.nrpokoj=nrpokoj;
        this.nazwisko=nazwisko;
        this.imie=imie;

    }
    public baza(){

    }

    public void setNrpokoj(int nrpokoju){
        this.nrpokoj=nrpokoju;

    }
    public int getNrpokoj(){
        return this.nrpokoj;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String toString(){
        return imie +" "+nazwisko+" "+nrpokoj;
    }
}
