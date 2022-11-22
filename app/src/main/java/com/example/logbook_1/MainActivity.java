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
    Button Forward_button, Backward_button;
    int i ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imgView);
        // ListImg => addImage.xml
        imageList = getResources().getStringArray(R.array.listImg);
        Picasso.get().load(imageList[i]).into(imageView);
        Forward_button = findViewById(R.id.Forward_button);
        Forward_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i ++ ;
                if(i == imageList.length){

                    i = imageList.length -1;
                    //i = 0;
                    Picasso.get().load(imageList[i]).into(imageView);

                }else{
                    Picasso.get().load(imageList[i]).into(imageView);
                }
            }
        });

        Backward_button = findViewById(R.id.Backward_button);
        Backward_button.setOnClickListener(new View.OnClickListener() {
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