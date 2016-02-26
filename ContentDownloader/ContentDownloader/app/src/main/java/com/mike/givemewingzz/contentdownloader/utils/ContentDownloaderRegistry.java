package com.mike.givemewingzz.contentdownloader.utils;

import java.util.HashMap;

/**
 * Created by GiveMeWingzz on 2/26/2016.
 */
public class ContentDownloaderRegistry {

    public static ContentDownloaderRegistry REGISTRY = new ContentDownloaderRegistry();
    private static HashMap map = new HashMap();
    private static final String TAG = ContentDownloaderRegistry.class.getSimpleName();

    protected ContentDownloaderRegistry() {
    }

    public static synchronized Object getInstance(String className) {

        Object singleTon = map.get(className);
        if (singleTon != null) {
            return singleTon;
        }

        try {

            singleTon = Class.forName(className).newInstance();
            ContentDownloaderUtils.printLog(TAG, "Singleton Created " + singleTon);

        } catch (ClassNotFoundException cnf) {
            ContentDownloaderUtils.printLog(TAG, "Couldn't find class " + className);
        } catch (InstantiationException ie) {
            ContentDownloaderUtils.printLog(TAG, "Couldn't instantiate an object of type " +
                    className);
        } catch (IllegalAccessException iae) {
            ContentDownloaderUtils.printLog(TAG, "Couldn't access class " + className);
        }

        map.put(className, singleTon);

        return singleTon;

    }

}
