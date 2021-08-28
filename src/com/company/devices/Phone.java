package com.company.devices;
import java.net.URL;
import java.util.List;
import java.util.stream.IntStream;
import java.util.Arrays;
import com.company.Human;

import com.company.devices.Device;

public class Phone extends Device {

    public Double ScreenSize;
    public String os;
    public String appName;
    public static final String serverAddress = "www.jakasstrona.com";
    public static final String version = "1.0.0";
    public static final String protocol = "http";
    /*public Application[] aplikacje;
    public int numerAplikacji = 0;*/

    public static String appNames[] = {"App Store ", "Booking ", "Shazam" };

    public Phone(String producer, String model, int yearOfProduction, Double ScreenSize, String os)
    {
        this.producer = producer;
        this. model = model;
        this.yearOfProduction = yearOfProduction;
        this.ScreenSize = ScreenSize;
        this.os = os;
    }

   /* public Phone()
    {
        aplikacje = new Application[12];
    }

    public boolean czyJuzZainstalowana(String nazwaAplikacji)
    {
        return Arrays.asList(aplikacje).stream().filter(o -> o.nazwa.equals(nazwaAplikacji)).findFirst().isPresent();
    }*/

  /*  public int iloscAplikacji();
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
    }*/





   /* public String toString(){
        return "producer "+producer+"model "+model+"Year of production:"+yearOfProduction+"Screen"+ScreenSize+"os "+os;
    }*/

    public void TurnOn()
    {
        System.out.println("Phone turning on");
    }



    public void installAnnApp(String appName)
    {
        System.out.println(appName);

    }
    public void installAnnApp(String appName, String version)
    {
        System.out.println("Nazwa aplikacji: "+ appName + " wersja: " + version);

    }
    public void installAnnApp(String appName, String version, String serverAddress)
    {
        System.out.println("Nazwa aplikacji: "+ appName + " wersja: " + version + " adres serwera: " + serverAddress);

    }
    public void installAnnApp(String appNames[])
    {
        System.out.println(appNames);

    }
    public void installAnnApp(URL urlAppObject)
    {

    }





}
