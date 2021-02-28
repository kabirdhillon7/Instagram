package com.example.instagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;


public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("zt6C8Ze5ILqeVuKuwez0vimzPiO7aOXPsmUysDOG")
                .clientKey("buMwnUXluqVgeNxjlgJfyxOBKiQt3t2LU7LmvBZM")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
