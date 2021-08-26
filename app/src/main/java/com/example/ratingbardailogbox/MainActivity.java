package com.example.ratingbardailogbox;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.hsalf.smilerating.SmileRating;

public class MainActivity extends AppCompatActivity {
    //SmileRating smileRating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         SmileRating smileRating = (SmileRating) findViewById(R.id.smile_rating);
         SmileRating smileRating1 = (SmileRating) findViewById(R.id.smile_rating1);

        smileRating.setOnSmileySelectionListener(new SmileRating.OnSmileySelectionListener() {
            @Override
            public void onSmileySelected(int smiley, boolean reselected) {

                switch (smiley){
                    case SmileRating.BAD:
                        Toast.makeText(MainActivity.this, "BAD", Toast.LENGTH_SHORT).show();
                         break;

                    case SmileRating.GOOD:
                        Toast.makeText(MainActivity.this, "GOOD", Toast.LENGTH_SHORT).show();
                        break;

                    case SmileRating.GREAT:
                        Toast.makeText(MainActivity.this, "GREAT", Toast.LENGTH_SHORT).show();
                        break;

                    case SmileRating.OKAY:
                        Toast.makeText(MainActivity.this, "OKAY", Toast.LENGTH_SHORT).show();
                        break;

                    case SmileRating.TERRIBLE:
                        Toast.makeText(MainActivity.this, "TERRIBLE", Toast.LENGTH_SHORT).show();
                        break;
                }

            }
        });


        smileRating1.setOnSmileySelectionListener(new SmileRating.OnSmileySelectionListener() {
            @Override
            public void onSmileySelected(int smiley, boolean reselected) {

                switch (smiley){
                    case SmileRating.BAD:
                        Toast.makeText(MainActivity.this, "BAD", Toast.LENGTH_SHORT).show();
                        break;

                    case SmileRating.GOOD:
                        Toast.makeText(MainActivity.this, "GOOD", Toast.LENGTH_SHORT).show();
                        break;

                    case SmileRating.GREAT:
                        Toast.makeText(MainActivity.this, "GREAT", Toast.LENGTH_SHORT).show();
                        break;

                    case SmileRating.OKAY:
                        Toast.makeText(MainActivity.this, "OKAY", Toast.LENGTH_SHORT).show();
                        break;

                    case SmileRating.TERRIBLE:
                        Toast.makeText(MainActivity.this, "TERRIBLE", Toast.LENGTH_SHORT).show();
                        break;
                }

            }
        });



    }


    public void exitforDailog(View view){
        AlertDialog.Builder alertDailog= new AlertDialog.Builder(this);
        alertDailog.setTitle("For Exit");
        alertDailog.setIcon(R.drawable.exit);
        alertDailog.setMessage("Do you want to Exit....");
        alertDailog.setCancelable(true);


        alertDailog.setPositiveButton("yes ", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        alertDailog.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Toast.makeText(MainActivity.this, "NO", Toast.LENGTH_SHORT).show();
            }
        });

        alertDailog.setNeutralButton("CANCLE", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Toast.makeText(MainActivity.this, "CANClE", Toast.LENGTH_SHORT).show();
            }
        });

        AlertDialog alertDialog= alertDailog.create();
        alertDailog.show();


    }
}