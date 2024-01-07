public class IphoneSettings {
    private static IphoneSettings instance;

    private int brightness;
    private boolean wifiEnabled;

    private IphoneSettings() {
    }

    public static IphoneSettings getInstance() {
        if (instance == null) {
            instance = new IphoneSettings();
        }
        return instance;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public int getBrightness() {
        return brightness;

    }

    public void enableWifi() {
        wifiEnabled = true;
    }

    public void disableWifi() {
        wifiEnabled = false;
    }

    public boolean isWifiEnabled() {
        return wifiEnabled;
    }
}
