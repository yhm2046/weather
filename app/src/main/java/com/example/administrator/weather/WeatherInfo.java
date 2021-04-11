package com.example.administrator.weather;

/**
 * ————————————————
 *     版权声明：本文为CSDN博主「IT无知君」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
 *     原文链接：https://blog.csdn.net/weixin_44259720/article/details/104768288
 */
public class WeatherInfo {
    private String date;        //时间
    private String week;        //星期
    private String lunar;       //农历时间
    private String cityname;    //城市名
    private String weather;     //天气
    private String temp;        //当前温度
    private String highTemp;    //最低温度
    private String lowTemp;     //当前温度
    private String tips;        //小提示

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getLunar() {
        return lunar;
    }

    public void setLunar(String lunar) {
        this.lunar = lunar;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getHighTemp() {
        return highTemp;
    }

    public void setHighTemp(String highTemp) {
        this.highTemp = highTemp;
    }

    public String getLowTemp() {
        return lowTemp;
    }

    public void setLowTemp(String lowTemp) {
        this.lowTemp = lowTemp;
    }

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips;
    }
}

