package com.mike.givemewingzz.contentdownloader.content;

import com.mike.givemewingzz.contentdownloader.utils.ContentDownloaderRegistry;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by GiveMeWingzz on 2/26/2016.
 */
public class ContentDownloader {

    private static String TAG = ContentDownloader.class.getSimpleName();
    private static Map<Object, Object> queryMap = new LinkedHashMap<>();
    public String testInit;

    protected ContentDownloader() {
    }

    public synchronized static ContentDownloader getInstance(String classname) {
        return (ContentDownloader) ContentDownloaderRegistry.REGISTRY.getInstance(classname);
    }

    public static void setBaseURL(String baseURL) {

    }

    public static void addQueryParams(Object key, Object value) {
        queryMap.put(key, value);
    }

    private Map<Object, Object> getQueryMap(){

        if (queryMap.isEmpty()){
            return new HashMap<>();
        }

        return queryMap;

    }

    public void build() {

    }

}
