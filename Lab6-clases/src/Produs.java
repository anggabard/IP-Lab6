// Decompiled by DJ v3.12.12.101 Copyright 2016 Atanas Neshkov  Date: 3/20/2018 9:27:00 AM
// Home Page: http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   Produs.java


public class Produs
{

    public Produs(Integer pret, String nume) {
        this.Nume = nume;
        this.Pret = pret;
    }

    public Produs(){
    }

    public void constructor()
    {
    }

    public void setPret(Integer integer)
    {
        this.Pret = integer;
    }

    public int getPret()
    {
        return Pret;
    }

    public String getName()
    {
        return Nume;
    }

    public void setName(String s)
    {
        this.Nume = s;
    }

    private boolean reducere(int procent){
        this.setPret(this.getPret() - (this.getPret() * procent / 100));
        return true;
    }

    private Integer Pret;
    private String Nume;

    public boolean exists() {
        return true;
    }
}