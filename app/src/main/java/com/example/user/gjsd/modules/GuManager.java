package com.example.user.gjsd.modules;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

enum GU {노원구, 도봉구};

public class GuManager {
    private Map<GU, Point> Gus;


    public GuManager(){
        Gus = Collections.synchronizedMap(new HashMap<GU,Point>());

        //데이터 삽입
    }

    public String searchMarket(String key){
        //검색 쿼리 구현
        return null;
    }

    public Point getMarketPoint(GU guName){
        return Gus.get(guName);
    }

    public double getLatitude(String guName){
        return Gus.get(guName).getLatitude();
    }

    public double getLongitude(String guName){
        return Gus.get(guName).getLongitude();
    }

    class Point{
        double lat;
        double lng;

        public Point(double lat, double lng){
            this.lat = lat;
            this.lng = lng;
        }

        public double getLatitude(){
            return lat;
        }
        public double getLongitude(){
            return lng;
        }
    }
}
