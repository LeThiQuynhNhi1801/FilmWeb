package film.api.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;


public class FileProperties {

    /**
     * Folder location for storing files
     */
    private String location = "Media";

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}