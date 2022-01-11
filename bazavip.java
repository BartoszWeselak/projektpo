package com.company;





public class bazavip extends baza {
    public bazavip(String imie, String nazwisko, int nrpokoj) {
        super(imie, nazwisko, nrpokoj);
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
        return  getImie()+" "+getNazwisko()+" "+getNrpokoj()+"  specjalny ";

    }

}
