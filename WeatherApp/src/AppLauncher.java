import javax.swing.*;

// Launcher class to start the Weather App GUI
public class AppLauncher {
    public static void main(String[] args) {
        // Use SwingUtilities.invokeLater to run the GUI on the event dispatch thread
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new WeatherAppGUI().setVisible(true);

//                System.out.println(WeatherApp.getLocationData("Tokyo"));
//                System.out.println(WeatherApp.getCurrentTime());
            }
        });
    }
}
