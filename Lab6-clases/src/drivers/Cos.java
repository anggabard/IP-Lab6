// Decompiled by DJ v3.12.12.101 Copyright 2016 Atanas Neshkov  Date: 3/20/2018 9:26:58 AM
// Home Page: http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   Cos.java
package drivers;

import java.util.ArrayList;
import java.util.Vector;

public class Cos
{

    public Cos()
    {
    }

    public ArrayList<Produs> getProduse()
    {
        return this.Produse;
    }

    public void setProduse(ArrayList<Produs> produse)
    {
        this.Produse = produse;
    }

    public boolean adaugaProdus(Produs produs) {
        if(produs.exists()){
            Produse.add(produs);
            return true;
        }
        else{
            return false;
        }

    }

    double sumaCos(){
        double total = 0;
        for(Produs produs: Produse){
            total+= produs.getPret();
        }
        return total;
    }


    public Produs getProdus(String nume){
        for(Produs produs:Produse){
            if(produs.getName().compareTo(nume) == 0){
                return produs;
            }
        }
        return null;
    }
    private ArrayList<Produs> Produse;
}