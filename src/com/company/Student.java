package com.company;
import java.util.Objects;

public class Student implements Comparable<Student>{
    private String imie;
    private String nazwisko;
    private double sredniaOcen;
    private int indeks;

    public Student(String imie, String nazwisko, double sredniaOcen, int indeks)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.sredniaOcen = sredniaOcen;
        this.indeks = indeks;
    }
    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }


    public double getSredniaOcen() {
        return sredniaOcen;
    }

    public int getIndeks() {
        return indeks;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setSredniaOcen(double sredniaOcen) {
        this.sredniaOcen = sredniaOcen;
    }

    public void setIndeks(int indeks) {
        this.indeks = indeks;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return indeks == student.indeks && Objects.equals(imie, student.imie) && Objects.equals(nazwisko, student.nazwisko);
    }
    @Override
    public int compareTo(Student o) {
        {
            if(!this.imie.equals(o.imie)) return -1;
            else if(!this.nazwisko.equals(o.nazwisko)) return -1;
            else if(!(this.indeks == o.indeks)) return -1;
            else if(!(this.indeks == o.sredniaOcen)) return -1;
            else return 0;
        }
    }
    @Override
    public String toString() {
        return "Student{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", sredniaOcen=" + sredniaOcen +
                ", indeks=" + indeks +
                '}';
    }
    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko, indeks);
    }
}
