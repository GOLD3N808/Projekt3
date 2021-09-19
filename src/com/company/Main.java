package com.company;
import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Phone;
import com.company.devices.*;
import com.company.devices.Diesel;
import com.company.devices.Electric;
import com.company.devices.LPG;
import com.company.devices.Application;


public class Main {

        public static void main(String[] args) {


              /*  FarmAnimal PinkPretty = new FarmAnimal("cat");
                Pet LittleMonster = new Pet("mouse");

                PinkPretty.feed();
                PinkPretty.feed(10);
                LittleMonster.feed();
                LittleMonster.feed(1);

                PinkPretty.beEaten();*/

                //Human seller = new Human();
                //Human buyer = new Human();
                //Human gosc = new Human();

                Human seller = new Human(2);
                Human buyer = new Human(3);

                Car saab = new LPG("rgsg","ffff", 1995,"black",344.0, 3343.0, seller);
                //gosc.getCar(1);
                //gosc.setCar(saab, 1);
                //buyer.getCar(1);
                //buyer.setCar(saab, 1);
                //gosc.carsValue(345.7);

                seller.salary = 3000.0;
                seller.getCar(1);
                seller.setCar(saab, 1);

                buyer.cash = 3000.0;
                seller.cash = 2000.0;
               // buyer.garage[0] = saab;
                saab.sell(seller, buyer, 3343.0);
                //saab.czyAsprzedalB(seller, buyer);
               // saab.czyPosiadalWlasiciela(buyer);
                //saab.numberTransakcji();
               // saab.sprawdzIloscTransakcji();











               /* LPG saab1 = new LPG("saab", "900", "blue", 2005, 23000.0);
                Diesel Opel1 = new Diesel("Opel", "Omega", "black", 2011, 3000.0);
                Electric Opel2 = new Electric("Opel", "Astra", "green", 2020, 23000.5);
                saab1.refuel();
                Opel1.refuel();
                Opel2.refuel();*/

               /* Human seller = new Human();
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


               /* Phone HTC = new Phone("HTC","X32", 2017,200.39, "windows");
                String version = Phone.version;
                String serverAddress = Phone.serverAddress;
                String appNames[] = Phone.appNames;

                HTC.installAnnApp("JUSTUP");
                HTC.installAnnApp("JUSTUP", version);
                HTC.installAnnApp("JUSTUP", version, serverAddress);
                HTC.installAnnApp(appNames);*/



        }
}