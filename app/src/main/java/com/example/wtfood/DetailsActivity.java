package com.example.wtfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.wtfood.model.Restaurant;
import com.example.wtfood.model.Type;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.Set;

public class DetailsActivity extends AppCompatActivity {
    TextView detailText;
    TextView addressText;
    TextView numText;
    TextView priceText;
    TextView ratingText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        // get the information and show
        Intent intent = getIntent();
        String restaurantJSON = getIntent().getStringExtra("Restaurant");
        Restaurant restaurant = new Gson().fromJson(restaurantJSON, Restaurant.class);

        detailText = (TextView) findViewById(R.id.detailText);
        addressText = (TextView) findViewById(R.id.addressText);
        numText = (TextView) findViewById(R.id.numText);
        priceText = (TextView) findViewById(R.id.priceText);
        ratingText = (TextView) findViewById(R.id.ratingText);

        detailText.setText(restaurant.getName());
        addressText.setText("Address: " + restaurant.getAddress());
        numText.setText("Call us: " + restaurant.getPhone());
        priceText.setText("Price : " + restaurant.getPrice());
        ratingText.setText("Ratings : " + restaurant.getRating());

        // set the ImageView

        ImageView image1 = (ImageView) findViewById(R.id.image1);
        int imageResource = 0;
        if (restaurant.getType() == Type.americanFood) {
            imageResource = getResources().getIdentifier("@drawable/pubfood", null, this.getPackageName());
        }
        if (restaurant.getType() == Type.chineseFood) {
            imageResource = getResources().getIdentifier("@drawable/chinese", null, this.getPackageName());
        }
        if (restaurant.getType() == Type.japaneseFood) {
            imageResource = getResources().getIdentifier("@drawable/japanese", null, this.getPackageName());
        }
        if (restaurant.getType() == Type.indianFood) {
            imageResource = getResources().getIdentifier("@drawable/indian", null, this.getPackageName());
        }
        if (restaurant.getType() == Type.malaysianFood) {
            imageResource = getResources().getIdentifier("@drawable/malaysian", null, this.getPackageName());
        }
        if (restaurant.getType() == Type.thaiFood) {
            imageResource = getResources().getIdentifier("@drawable/thai", null, this.getPackageName());
        }
        if (restaurant.getType() == Type.frenchFood) {
            imageResource = getResources().getIdentifier("@drawable/finedining", null, this.getPackageName());
        }
        if (restaurant.getType() == Type.italianFood) {
            imageResource = getResources().getIdentifier("@drawable/italian", null, this.getPackageName());
        }
        if (restaurant.getType() == Type.koreanFood) {
            imageResource = getResources().getIdentifier("@drawable/korean", null, this.getPackageName());
        }
        if (restaurant.getType() == Type.mexicanFood) {
            imageResource = getResources().getIdentifier("@drawable/mexico", null, this.getPackageName());
        }
        if (restaurant.getType() == Type.turkishFood) {
            imageResource = getResources().getIdentifier("@drawable/turkey", null, this.getPackageName());
        }
        image1.setImageResource(imageResource);
    }

}
