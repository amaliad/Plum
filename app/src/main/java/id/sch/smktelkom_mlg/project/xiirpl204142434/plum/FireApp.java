package id.sch.smktelkom_mlg.project.xiirpl204142434.plum;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by Ryan Farrel on 20/11/2016.
 */
public class FireApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
