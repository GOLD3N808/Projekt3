package com.company;
import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Phone;
import com.company.devices.*;
import com.company.devices.Diesel;
import com.company.devices.Electric;
import com.company.devices.Application;


public class Main {

        public static void main(String[] args) {


                FarmAnimal PinkPretty = new FarmAnimal("cat");
                Pet LittleMonster = new Pet("mouse");

                PinkPretty.feed();
                PinkPretty.feed(10);
                LittleMonster.feed();
                LittleMonster.feed(1);

                PinkPretty.beEaten();




                /*LPG saab1 = new LPG("saab", "900", "blue", 2005, 23000.0);
                Diesel Opel1 = new Diesel("Opel", "Omega", "black", 2011, 3000.0);
                Electric Opel2 = new Electric("Opel", "Astra", "green", 2020, 23000.5);
                saab1.refuel();
                Opel1.refuel();
                Opel2.refuel();

                Human seller = new Human();
                Human buyer = new Human();
                buyer.cash = 255.0;
                Car saab2 = new LPG("saab", "900", "blue", 2005, 23000.0);
                buyer.garage[0] = saab2;
                saab2.sell(seller, buyer, 5555.0);

                System.out.println("Czy doszlo miedzy nimi do transakcji ? : " + saab2.czyAsprzedalB(seller, buyer));
                System.out.println("Czy auto mialo wlasciciela ? : " + saab2.czyMialWlasciciela());
                Human osoba= new Human();
                osoba.cash = 102.0;
                Application aplikacja = new Application();
                aplikacja.price = 523.56;
                aplikacja.nazwa = "justup";
                aplikacja.wersja = "2.2.3";
                Phone HTC = new Phone();
                HTC.installAnnApp(aplikacja, osoba);
                System.out.println("Czy juz ma taka aplikacje? : " + HTC.czyJuzZainstalowana("justup"));
                System.out.println("Ilosc aplikacji: " + HTC.iloscAplikacji());
                HTC.wypiszAplikacje();*/

        }
}