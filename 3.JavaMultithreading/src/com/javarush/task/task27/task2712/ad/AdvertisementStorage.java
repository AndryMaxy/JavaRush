package com.javarush.task.task27.task2712.ad;

import java.util.ArrayList;
import java.util.List;

public class AdvertisementStorage {
    private static AdvertisementStorage instance;
    private final List<Advertisement> videos = new ArrayList<Advertisement>();

    private AdvertisementStorage(){
        Object someContent = new Object();
        add(new Advertisement(someContent,"First video",5000,100,3*60));
        add(new Advertisement(someContent,"Second video",100,10,15*60));
        add(new Advertisement(someContent,"Third video",4000,2,10*60));

    }

    public static AdvertisementStorage getInstance() {
        if (instance == null) {
            return instance = new AdvertisementStorage();
        } else return instance;
    }

    public List<Advertisement> list(){
        return videos;
    }

    public void add(Advertisement advertisement) {
        videos.add(advertisement);
    }


}
