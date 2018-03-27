// Decompiled by DJ v3.12.12.101 Copyright 2016 Atanas Neshkov  Date: 3/20/2018 9:27:01 AM
// Home Page: http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   User.java
package drivers;


public class User
{

    public User() {
    }

    public User(String email, String parola)
    {
        Email = email;
        Parola = parola;
        cos = new Cos();
    }

    public String getEmail()
    {
        return Email;
    }

    public void setEmail(String email)
    {
        Email = email;
    }

    public String getParola()
    {
        return Parola;
    }

    public void setParola(String parola)
    {
        Parola = parola;
    }

    public Cos getCos()
    {
        return cos;
    }

    public void setCos(Cos cos)
    {
        this.cos = cos;
    }

    public void AdaugaProdus(Cos cos1, Produs produs)
    {
    }

    public void ScoateProdus(Cos cos1, Produs produs)
    {
    }

    public void Plateste(Cos cos1)
    {
    }

    private String Email;
    private String Parola;
    private Cos cos;
}