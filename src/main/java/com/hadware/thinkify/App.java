package com.hadware.thinkify;

import com.thinkify.rfid.ThinkifyReader;

import gnu.io.CommPortIdentifier;

import java.util.HashSet;

import com.thinkify.rfid.SerialManager;

public class App 
{
    public static void main( String[] args )
    {
        App app = new App();
        app.initializeReader();
    }

    void initializeReader() {
        String system = System.getProperty("user.dir");
        System.out.println(system);
        ThinkifyReader reader = new ThinkifyReader(null);
        SerialManager manager = new SerialManager();
        try {
            manager.open();
        } catch (Exception e) {
            e.printStackTrace();
            HashSet<CommPortIdentifier> baudrate = SerialManager.getAvailableSerialPorts();
            System.out.println(baudrate);
        }
    }
}
