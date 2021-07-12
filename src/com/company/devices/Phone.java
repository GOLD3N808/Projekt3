package com.company.devices;

import com.company.devices.Device;

public class Phone extends Device {



    public Double ScreenSize;
    public String os;

    public String toString(){
        return "producer "+producer+"model "+model+"Year of production:"+yearOfProduction+"Screen"+ScreenSize+"os "+os;
    }

    public void TurnOn()
    {
        System.out.println("Phone turning on");
    }






}
