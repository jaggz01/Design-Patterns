package com.jaggz01.proxy.design;

import java.awt.geom.Area;
import java.util.Arrays;
import java.util.List;

public class ProxyRealInternet implements Internet{
    private Internet internet;
    List<String> bannedSites;

    public ProxyRealInternet() {
        internet = new RealInternet();
        bannedSites = Arrays.asList(new String[] {"abc.com", "def.com", "ghi.com", "jkl.com"});
    }


    @Override
    public void connectToInternet(String address) {
        if(bannedSites.contains(address)) {
            System.out.println("Access Denied");
        } else {
            internet.connectToInternet(address);
        }

    }
}
