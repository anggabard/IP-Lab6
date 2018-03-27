// Decompiled by DJ v3.12.12.101 Copyright 2016 Atanas Neshkov  Date: 3/20/2018 9:26:57 AM
// Home Page: http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   Aplicatie.java

import java.util.ArrayList;
import java.util.Vector;

public class Aplicatie
{

    public Aplicatie()
    {
    }

    public Aplicatie getIstance()
    {
        if(instance == null)
            instance = new Aplicatie();
        return instance;
    }

    public void AdaugaUser(User user1, BazaDeDate bazadedate)
    {
    }

    public void LogIn(User user1, BazaDeDate bazadedate)
    {
    }

    public void EliminaProdus(Produs produs1, BazaDeDate bazadedate)
    {
    }

    public Produs Search(String numeProdus, BazaDeDate bd)
    {
        return new Produs();
    }

    public void AdaugaProdus(Produs produs1, BazaDeDate bazadedate)
    {
    }

    public void scoateUser(User user, BazaDeDate bazadedate)
    {
    }

    ArrayList<Produs> sortare(ArrayList<Produs> list){
        Produs aux;
        for(int i = 0; i < list.size(); i++){
            for(int j = i + 1; j < list.size(); j++){
                if(list.get(i).getPret() > list.get(j).getPret()){
                    aux = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,aux);
                }
            }
        }
        return list;
    }

    public Aplicatie instance;
    public Vector myBazaDeDate;
    public Vector myUser;
}