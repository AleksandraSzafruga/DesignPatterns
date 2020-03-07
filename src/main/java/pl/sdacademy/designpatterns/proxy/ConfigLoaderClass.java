package pl.sdacademy.designpatterns.proxy;

import java.util.Random;

public class ConfigLoaderClass implements ConfigLoader {

    private String configuration;
    private String serverUrl;

    public ConfigLoaderClass(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    @Override
    public String load() {
        System.out.println("Getting configuration from "+ serverUrl);
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
        }
        configuration = "Config value from server url: " + new Random().nextInt();
        return configuration;
    }
}
