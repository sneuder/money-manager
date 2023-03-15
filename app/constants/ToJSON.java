package constants;

import com.google.gson.Gson;
import java.nio.charset.StandardCharsets;
import java.io.InputStream;
import java.io.IOException;

public class ToJSON {
  static Gson gson = new Gson();
  
  public static String convert(Object elementToJson) {
    String json = gson.toJson(elementToJson);
    return json;
  }

  public static Object bodyJson(InputStream requestBody, Class<?> classTarget) throws IOException  {
    String requestBodyString = new String(requestBody.readAllBytes(), StandardCharsets.UTF_8);
    Object newObject = gson.fromJson(requestBodyString, classTarget);
    return newObject;
  }
}
