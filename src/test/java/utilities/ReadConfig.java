package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
    Properties pro;
    public ReadConfig() {
        File src = new File("./Configuration/config.properties");
        try {
            FileInputStream fis = new FileInputStream(src);
            pro = new Properties();
            pro.load(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String getApplicationURL() {
        String url = pro.getProperty("baseURL");
        return url;
    }

    public String getEmail() {
        String email = pro.getProperty("email");
        return email;
    }

    public String getPassword() {
        String password = pro.getProperty("password");
        return password;
    }

    public String getChromePath() {
        String chromepath = pro.getProperty("chromepath");
        return chromepath;
    }

}
