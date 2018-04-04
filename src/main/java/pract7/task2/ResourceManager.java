package pract7.task2;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceManager {
    private static ResourceManager resourceManager;
    private ResourceBundle resourceBundle;
    private final String resourceName = "locale.text";

    private ResourceManager() {
        resourceBundle = ResourceBundle.getBundle(resourceName, Locale.getDefault());
    }

    public static ResourceManager getInstance() {
        if (resourceManager == null)
            resourceManager = new ResourceManager();
        return resourceManager;
    }

    public void changeResource(Locale locale){
        resourceBundle = ResourceBundle.getBundle(resourceName, locale);
    }

    public String getString(String key) {
        return resourceBundle.getString(key);
    }
}
