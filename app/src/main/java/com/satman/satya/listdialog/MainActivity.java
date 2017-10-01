package com.satman.satya.listdialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button blist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        blist = (Button)findViewById(R.id.blist);
        blist.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Make your selection");
        builder.setItems(R.array.spinner_docs, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int item) {
                // Do something with the selection
                //  mDoneButton.setText(items[item]);

                Toast.makeText(getApplicationContext(),item + "\n"+ getResources().getStringArray(R.array.spinner_docs)[item],Toast.LENGTH_SHORT).show();

            }
        });
        AlertDialog alert = builder.create();
        alert.show();


    }
}
