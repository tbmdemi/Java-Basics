import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class TestAPI {
    public static void test(String word) throws IOException {
        String url_str = "https://api.dictionaryapi.dev/api/v2/entries/en/" + word;
        URL url = new URL(url_str);

        HttpURLConnection connect = (HttpURLConnection) url.openConnection();
        connect.setRequestMethod("GET");

        int code = connect.getResponseCode();

        if (code == HttpURLConnection.HTTP_OK) {
            BufferedReader br = new BufferedReader(new InputStreamReader(connect.getInputStream()));
            String line;
            StringBuilder res = new StringBuilder();

            while ((line = br.readLine()) != null) {
                res.append(line);
            }
            br.close();

            System.out.println(res.toString());
        } else {
            System.out.println(code);
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String enter = sc.nextLine();

        TestAPI.test(enter);
    }
}
