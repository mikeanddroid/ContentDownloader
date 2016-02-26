package com.mike.givemewingzz.contentdownloader.content;

import com.mike.givemewingzz.contentdownloader.utils.ContentDownloaderRegistry;

/**
 * Created by GiveMeWingzz on 2/26/2016.
 */
public class ContentDownloader {

    private static ContentDownloader INSTANCE = null;
    private static String TAG = ContentDownloader.class.getSimpleName();
    private static boolean firstThread = true;

    protected ContentDownloader() {
    }

    public synchronized static ContentDownloader getInstance(String classname) {
        return (ContentDownloader) ContentDownloaderRegistry.REGISTRY.getInstance(classname);
    }

}
