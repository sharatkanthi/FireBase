package com.example.sharatkanthi.firebasedemo;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by sharat.kanthi on 10/30/2017.
 */

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService
{
    public static final String REG_TOKEN = "REG_TOKEN";
    @Override
    public void onTokenRefresh()
    {
        String recent_token = FirebaseInstanceId.getInstance().getToken();
        Log.d(REG_TOKEN,recent_token);
    }
}
