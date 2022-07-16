package Models;

import Exceptions.NewStudentExceptions;

import java.util.Arrays;

public class Student {
    private int id;
    private String emri;
    private String mbiemri;
    private String vendlindja;
    private String fakulteti;
    private String drejtimi;
    private double notaMesatare;
    private String[] lendet;

    public Student(int id, String emri, String mbiemri, String vendlindja, String fakulteti, String drejtimi, double notaMesatare, String[] lendet) throws NewStudentExceptions {
        this.id = id;

        this.emri = emri;

        this.mbiemri = mbiemri;

        this.vendlindja = vendlindja;
        this.fakulteti = fakulteti;
        this.drejtimi = drejtimi;
        this.notaMesatare = notaMesatare;
        this.lendet = Arrays.copyOf(lendet,lendet.length);
    }
    public Student(Student source){
        this.emri =source.emri;
        this.mbiemri = source.mbiemri;
        this.id = source.id;
        this.notaMesatare = source.notaMesatare;
        this.drejtimi = source.drejtimi;
        this.fakulteti = source.fakulteti;
        this.lendet = source.lendet;
        this.vendlindja = source.vendlindja;
    }



    public int getId() {
        return id;
    }

    public String getEmri() {
        return emri;
    }

    public String getMbiemri() {
        return mbiemri;
    }

    public String getVendlindja() {
        return vendlindja;
    }

    public String getFakulteti() {
        return fakulteti;
    }

    public String getDrejtimi() {
        return drejtimi;
    }

    public double getNotaMesatare() {
        return notaMesatare;
    }

    public void setId(int id) throws NewStudentExceptions {
        if(this.id <0 && this.id ==0) throw new NewStudentExceptions("ID nuk mund te jete negative ose e zbrazet",id);
        this.id = id;
    }

    public void setEmri(String emri) throws NewStudentExceptions {

        this.emri = emri;
    }

    public void setMbiemri(String mbiemri) throws NewStudentExceptions {

        this.mbiemri = mbiemri;
    }

    public void setVendlindja(String vendlindja) throws NewStudentExceptions {

        this.vendlindja = vendlindja;
    }

    public void setFakulteti(String fakulteti) throws NewStudentExceptions {

        this.fakulteti = fakulteti;
    }

    public void setDrejtimi(String drejtimi) throws NewStudentExceptions {


        this.drejtimi = drejtimi;
    }

    public void setNotaMesatare(double notaMesatare) {


        this.notaMesatare = notaMesatare;
    }

    public String[] getLendet() {
        return Arrays.copyOf(this.lendet, this.lendet.length);
    }

    public void setLendet(String[] lendet) {
        this.lendet = Arrays.copyOf(lendet,lendet.length);
    }


    @Override
    public String toString() {
        return   "Informatat personale te studentit: "+ "\n"
                +"ID: "+id+"\n"+
                "Emri: "+emri+"\n"+
                "Mbiemri: "+mbiemri+"\n"+
                "Vendlindja: "+vendlindja+"\n"+
                "Fakulteti: "+fakulteti+"\n"+
                "Drejtimi: "+drejtimi+"\n"+
                "Nota Mesatare: "+notaMesatare+"\n"+
                "Lendet: "+Arrays.toString(lendet)+". ";

    }
}
