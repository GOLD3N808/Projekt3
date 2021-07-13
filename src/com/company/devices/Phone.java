package com.company.devices;
import java.net.URL;
import java.util.List;

import com.company.devices.Device;

public class Phone extends Device {

    public static final String address = "www.jakasstrona.com";
    public static final String version = "1.0.0";
    public static final String protocol = "http";
    public String appName;


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
