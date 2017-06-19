package com.easysales.pushhandler;

import android.app.Application;

import com.google.firebase.iid.FirebaseInstanceId;

/**
 * Created by lord on 20.06.17.
 */

public class ApplicationWrapper extends Application {

    public static String getFirebaseToket(){
        return FirebaseInstanceId.getInstance().getToken();
    }
}
