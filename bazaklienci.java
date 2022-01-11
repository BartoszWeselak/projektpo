package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class bazaklienci extends baza
{



    List<Object> lista_klient;

 public bazaklienci(String imie,String nazwisko,int nrpokoj) {
        super(imie,nazwisko,nrpokoj);

    }

    public bazaklienci(){
        lista_klient=new ArrayList<>();

    }




    public void add(bazaklienci klients){
        lista_klient.add(klients);
    }

    @Override
    public void setNrpokoj(int nrpokoju) {
        super.setNrpokoj(nrpokoju);
    }

    @Override
    public String getImie() {
        return super.getImie();
    }

    @Override
    public void setImie(String imie) {
        super.setImie(imie);
    }

    @Override
    public String getNazwisko() {
        return super.getNazwisko();
    }

    @Override
    public void setNazwisko(String nazwisko) {
        super.setNazwisko(nazwisko);
    }

    @Override
    public int getNrpokoj() {
        return super.getNrpokoj();
    }
    @Override
    public  String toString(){
        return  getImie()+" "+getNazwisko()+" "+getNrpokoj()+"  normalny ";

    }
}
