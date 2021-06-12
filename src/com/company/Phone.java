package com.company;

import com.company.devices.Device;

public class Phone extends Device {

    public Double ScreenSize;
    public String os;

    public String toString(){
        return "producer "+producer+"model "+model+"Screen "+ScreenSize+"os "+os;
    }

    public Phone(String producer, String model, String yearOfproduction){
        super(producer, model, yearOfproduction);
    }

    public void turnOn(){
        System.out.println("wcisnij przycik");
        System.out.println("wcisnij przycik");
        System.out.println("wcisnij przycik");
        System.out.println("wcisnij przycik");
        System.out.println("wcisnij przycik");
        System.out.println("wcisnij przycik");
    }


}
