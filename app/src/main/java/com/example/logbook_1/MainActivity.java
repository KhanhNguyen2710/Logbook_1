package com.example.logbook_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    String[] imageList;
    Button Next_button, Prev_button;

    int i ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imgView);
        Next_button = findViewById(R.id.Next_button);
        Prev_button = findViewById(R.id.Prev_button);

        // ListImg => addImage.xml
        imageList = getResources().getStringArray(R.array.listImg);


        Picasso.get().load(imageList[i]).into(imageView);
        Next_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i ++ ;

                if(i == imageList.length){

                    i = imageList.length -1 ;
                    //i = 0; lap
                    Picasso.get().load(imageList[i]).into(imageView);

                }else{
                    Picasso.get().load(imageList[i]).into(imageView);
                }
            }
        });

        Prev_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i --;
                if(i < 0){
                   // i = imageList.length -1; lap
                    i = 0;
                    Picasso.get().load(imageList[i]).into(imageView);
                }else{
                    Picasso.get().load(imageList[i]).into(imageView);
                }
            }
        });


    }


}