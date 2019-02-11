package com.example.owner.shoppinglist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ItemsList extends AppCompatActivity {

    public static final String EXTRA_REPLY =
            "com.example.android.shoppinglist.extra.REPLY";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items_list);
    }

    public void returnReply(View view) {
        Intent replyIntent = new Intent();
        String reply = "";
        switch (view.getId()){
            case R.id.imgBtnCheese:
                reply = "cheese";
                break;
            case R.id.imgBtnChicken:
                reply="chicken";
                break;
            case R.id.imgBtnRice:
                reply="rice";
                break;
            case R.id.imageBroccoli:
                reply="broccoli";
                break;
            case R.id.imageCrab:
                reply="crab";
                break;
            case R.id.imageLobster:
                reply="lobster";
                break;
            case R.id.imageOrange:
                reply="orange";
                break;
            case R.id.imagePepperoni:
                reply="pepperoni";
                break;
            case R.id.imagePineapple:
                reply="pineapple";
                break;
            case R.id.imageYogurt:
                reply="yogurt";
                break;
        }
        replyIntent.putExtra(EXTRA_REPLY,reply);
        setResult(RESULT_OK,replyIntent);
        finish();

    }
}
