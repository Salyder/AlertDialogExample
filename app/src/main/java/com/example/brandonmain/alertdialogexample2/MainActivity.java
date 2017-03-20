package com.example.brandonmain.alertdialogexample2;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button alertButton;
    private TextView alertTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alertButton = (Button) findViewById(R.id.AlertButton);
        alertTextView = (TextView) findViewById(R.id.AlertTextView);

        alertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

                builder.setCancelable(true);
                builder.setTitle("This is an Alert Dialog's Title");
                builder.setMessage("This is an Alert Dialog's Message");

                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        alertTextView.setVisibility(View.VISIBLE);
                    }
                });
                builder.show();
            }
        });
    }
}
