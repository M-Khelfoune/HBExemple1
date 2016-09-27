package com.kmourad.hb_exemple;

import android.util.Log;

import java.io.IOException;

/**
 * Created by Human Booster on 26/09/2016.
 */

public class IOExceptionIntervalle extends IOException {
    public IOExceptionIntervalle(String message){
        super(message);
        Log.e("", message);
    }

    public IOExceptionIntervalle(String message, Throwable cause){
        super(message, cause);
    }


}
