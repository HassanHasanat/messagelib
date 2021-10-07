package com.pillars.messagelib;

import android.content.Context;
import android.widget.Toast;

public class Show {


    public static void showMessgae(Context context,String msg){
        Toast.makeText(context,msg,Toast.LENGTH_LONG).show();
    }
}
