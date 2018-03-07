package com.hdu.a15061103.test201801;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by sophiaheng on 2018/1/8.
 */

public class Note {
    private String content;
    private String date;
    private String weather;

    public Note(String contents1, String date1, String weather1) {
        content=contents1;
        date=date1;
        weather=weather1;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }






}
