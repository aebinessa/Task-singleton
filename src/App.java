public class App {
    public static void main(String[] args) throws Exception {

        IphoneSettings settings = IphoneSettings.getInstance();
        settings.disableWifi();
        settings.enableWifi();
        settings.setBrightness(100);
        settings.getBrightness();
    }
}
