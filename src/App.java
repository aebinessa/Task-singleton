public class App {
    public static void main(String[] args) throws Exception {

        IphoneSettings settings = IphoneSettings.getInstance();
        settings.disableWifi();
        settings.enableWifi();
        settings.disableWifi();

        settings.setBrightness(100);
        settings.getBrightness();
        System.out.println("brightness level is " + settings.getBrightness());
        System.out.println("wifi is enabled:" + settings.isWifiEnabled());

    }
}
