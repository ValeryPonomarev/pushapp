package com.easysales.pushhandler.services;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by lord on 20.06.17.
 */

public class PushService extends FirebaseMessagingService {
    public final String TAG = "PushService";

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Log.d(TAG, String.format("message: %1", remoteMessage.getNotification().getBody()));
    }
}
