package com.company;

import com.company.devices.Device;

public class Phone extends Device {

    Double Screen;
    String os;

    public String toString(){
        return "producer "+producer+"model "+model+"Screen "+Screen+"os "+os;
    }

}
