package com.asanwatch.measure_sk;
import java.io.IOException;
import java.net.Socket;


public class SharedObjects {

    public static String address = "172.30.1.60";
    public static int port = 5001;
    public static String deviceId = DeviceInfoUtil.getDeviceBrand()+" "+DeviceInfoUtil.getDeviceId(MainActivity.ApplicationContext());
    public static boolean isWake = true;
    public static Socket socket = null;

}
