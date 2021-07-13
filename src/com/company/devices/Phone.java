package com.company.devices;
import java.net.URL;
import java.util.List;
import java.util.stream.IntStream;
import java.util.Arrays;
import com.company.Human;

import com.company.devices.Device;

public class Phone extends Device {

    public static final String address = "www.jakasstrona.com";
    public static final String version = "1.0.0";
    public static final String protocol = "http";
    public String appName;
    public Application[] aplikacje;
    public int numerAplikacji = 0;

    public Phone()
    {
        aplikacje = new Application[12];
    }

    public boolean czyJuzZainstalowana(String nazwaAplikacji)
    {
        return Arrays.asList(aplikacje).stream().filter(o -> o.nazwa.equals(nazwaAplikacji)).findFirst().isPresent();
    }

    public int iloscAplikacji();
    {
        return aplikacje.length;
    }

    public void wypiszAplikacje()
    {
        for (int i = 0; i < aplikacje.length -1; i++) {
            if (this.aplikacje[i]!=null)
            {
                System.out.print("Nazwa : " + this.aplikacje[i].nazwa);
            }}
    }

    public void installAnnApp(Application aplikacja, Human buyer)
    {
        if (buyer.cash >= aplikacja.price)
        {
            aplikacje[numerAplikacji]= aplikacja;
            numerAplikacji++;
            System.out.println("zainstalowano");
            buyer.cash -= aplikacja.price;
        }

        System.out.println("Nie mozna zainstalowac");
    }



    public Double ScreenSize;
    public String os;

    public String toString(){
        return "producer "+producer+"model "+model+"Year of production:"+yearOfProduction+"Screen"+ScreenSize+"os "+os;
    }

    public void TurnOn()
    {
        System.out.println("Phone turning on");
    }



    public void installAnnApp(String appName)
    {

    }
    public void installAnnApp(String appName, String version)
    {

    }
    public void installAnnApp(String appName, String version, String serverAddress)
    {

    }
    public void installAnnApp(URL urlAppObject)
    {

    }
    public void installAnnApp(List<String> appNames)
    {

    }




}
