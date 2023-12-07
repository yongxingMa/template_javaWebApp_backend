// COMMENT
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import com.google.gson.Gson;

public class HttpRequestHandler {
  
  private OkHttpClient client;
  private Gson gson;
  
  public HttpRequestHandler() {
    client = new OkHttpClient();
    gson = new Gson();
  }
  
  public void sendPostRequest(String url, Object data) {
    // Convert data to JSON
    String json = gson.toJson(data);
    
    // Create request body
    RequestBody body = RequestBody.create(json, MediaType.parse("application/json"));
    
    // Create request
    Request request = new Request.Builder()
      .url(url)
      .post(body)
      .build();
    
    // Send request
    try (Response response = client.newCall(request).execute()) {
      // Handle response
      // ...
    } catch (IOException e) {
      // Handle exception
      // ...
    }
  }
  
  public void sendGetRequest(String url) {
    // Create request
    Request request = new Request.Builder()
      .url(url)
      .get()
      .build();
    
    // Send request
    try (Response response = client.newCall(request).execute()) {
      // Handle response
      // ...
    } catch (IOException e) {
      // Handle exception
      // ...
    }
  }
}
