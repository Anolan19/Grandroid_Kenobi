package com.example.adam.old_person_helper;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * Created by adam on 10/21/17.
 */

public class Phone extends AppCompatActivity implements OnClickListener{


    @Override
    public void onClick(View v) {
        launchDialer("1");
    }


    // Launch the dialer

    public void launchDialer(String number){
        String numberToDial = "tel:"+number;
        startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(numberToDial)));
    }


}

