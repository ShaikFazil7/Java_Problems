interface SmartDevice
{
    abstract void connectWifi();

    public default void deviceStatus()
    {
        System.out.println("Smart device is ready");
    }
}

class SmartTV implements SmartDevice
{
    public void connectWifi()
    {
        System.out.println("Smart TV connected to WiFi");
    }
}

class SmartWatch implements SmartDevice
{
    public void connectWifi()
    {
        System.out.println("Smart Watch connected to WiFi");
    }
}

public class D2T28 {
    public static void main(String[] args)
    {
        SmartDevice sd = new SmartTV();
        SmartDevice sw = new SmartWatch();
        sd.connectWifi();
        sd.deviceStatus();

        sw.connectWifi();
        sw.deviceStatus();
        

    }
}
