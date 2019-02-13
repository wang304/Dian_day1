package day1.bawei.com.dian_day1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class MainActivity extends AppCompatActivity {

    private String path="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         new Thread(new Runnable() {
             @Override
             public void run() {
                 String data=getData();
                 Log.i("data:", "run: "+data);
             }
         }).start();
    }

    private String getData() {
        try {
            URL url = new URL(path);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }


}
