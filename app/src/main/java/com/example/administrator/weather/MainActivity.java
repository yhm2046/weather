package com.example.administrator.weather;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG="MainActivity:tag";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        run tes
      /**  String info = WeatherUtil.GetWeatherData("天津");
        System.out.println("1.预测结果：" + info);                    // 全部天气数据，含预测
        WeatherInfo weatherinfo = WeatherUtil.GetWeather(info);
        System.out.println("2.今天天气：" + weatherinfo.toString());  // 当天天气数据
        **/
        new Thread(networkTask).start();

    }//end oncreate
    Runnable networkTask=new Runnable() {
        @Override
        public void run() {
            String str="http://www.weather.com.cn/data/sk/101010100.html";
            String jsonStr=WeatherUtil.GetJsonString(str);
            Log.i(TAG,"json------------->"+jsonStr);
        }
    };//end networkTask
}
