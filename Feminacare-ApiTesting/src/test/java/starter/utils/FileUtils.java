package starter.utils;

import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileUtils {
    public static JSONObject getUserAdmin() {
        try {
            String filePath = "src/test/resources/sample/userAdmin.json";

            String content = new String(Files.readAllBytes(Paths.get(filePath)));

            return new JSONObject(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static JSONObject getUserKonselor() {
        try {
            String filePath = "src/test/resources/sample/userAdmin.json";

            String content = new String(Files.readAllBytes(Paths.get(filePath)));

            return new JSONObject(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

