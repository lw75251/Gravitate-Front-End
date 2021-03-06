package com.example.ken.gravitate.Utils;

import android.content.Context;
import com.google.firebase.auth.FirebaseAuth;

// Class that gets the firebase authentication instance
public class AuthSingleton {

        private static FirebaseAuth mAuthInstance;

        private AuthSingleton() {
        }

        public static synchronized FirebaseAuth getInstance() {
            if (mAuthInstance == null) {
                mAuthInstance = FirebaseAuth.getInstance();
            }
            return mAuthInstance;
        }

        public FirebaseAuth getRequestQueue() {
            return mAuthInstance;
        }



}
