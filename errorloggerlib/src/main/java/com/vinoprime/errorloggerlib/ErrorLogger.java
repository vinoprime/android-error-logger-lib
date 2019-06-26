package com.vinoprime.errorloggerlib;

import android.util.Log;

import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;

public class ErrorLogger {

    private static final String TAG = "ErrorLogger";

    private final static Object lock = new Object();

    public static void displayOnLogcat(String fromTAG, Exception e) {
        synchronized (lock) {
            Log.i(TAG + "-FromTag--> " + fromTAG, e.getMessage());

        }
    }

    public synchronized static void displayOnLogcat(String fromTAG, IOException e) {
        synchronized (lock) {
            Log.i(TAG + "-FromTag--> " + fromTAG, e.getMessage());
        }
    }

    public synchronized static void displayOnLogcat(String fromTAG, XmlPullParserException e) {
        synchronized (lock) {
            Log.i(TAG + "-FromTag--> " + fromTAG, e.getMessage());
        }
    }

    public synchronized static void displayOnLogcat(String fromTAG, NullPointerException e) {
        synchronized (lock) {
            Log.i(TAG + "-FromTag--> " + fromTAG, e.getMessage());
        }
    }

    public synchronized static void displayOnLogcat(String fromTAG, ArithmeticException e) {
        synchronized (lock) {
            Log.i(TAG + "-FromTag--> " + fromTAG, e.getMessage());
        }
    }
}
