public class IphoneSettings {
    private static IphoneSettings instance;

    private int brightness;
    private boolean wifiEnabled;

    public static IphoneSettings getInstance() {
        if (instance == null) {
            instance = new IphoneSettings();
        }
        return instance;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
        System.out.println("brightness level is " + brightness);
    }

    public int getBrightness() {
        return brightness;

    }

    public void enableWifi() {
        wifiEnabled = true;
        System.out.println("wifi is enabled:" + wifiEnabled);
    }

    public void disableWifi() {
        wifiEnabled = false;
        System.out.println("wifi is enabled:" + wifiEnabled);
    }

}
