package com.example.owner.shoppinglist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private TextView tvCheese;
    private TextView tvRice;
    private TextView tvChicken;
    private TextView tvPep;
    private TextView tvPineapple;
    private TextView tvCrab;
    private TextView tvYogurt;
    private TextView tvLobster;
    private TextView tvOrange;
    private TextView tvBroccoli;

    private int cheeseCount;
    private int chickenCount;
    private int orangeCount;
    private int crabCount;
    private int lobsterCount;
    private int riceCount;
    private int pineappleCount;
    private int yogurtCount;
    private int pepCount;
    private int broccoliCount;

    public static final int TEXT_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvCheese = findViewById(R.id.tvCheese);
        tvRice = findViewById(R.id.tvRice);
        tvBroccoli = findViewById(R.id.tvBroccoli);
        tvChicken = findViewById(R.id.tvChicken);
        tvCrab = findViewById(R.id.tvCrab);
        tvLobster = findViewById(R.id.tvLobster);
        tvOrange = findViewById(R.id.tvOrange);
        tvPep = findViewById(R.id.tvPep);
        tvPineapple = findViewById(R.id.tvPineapple);
        tvYogurt = findViewById(R.id.tvYogurt);
        if (savedInstanceState != null) {
            cheeseCount = savedInstanceState.getInt("cheese");
            chickenCount= savedInstanceState.getInt("chicken");
            orangeCount= savedInstanceState.getInt("orange");
            crabCount= savedInstanceState.getInt("crab");
            lobsterCount= savedInstanceState.getInt("lobster");
            riceCount= savedInstanceState.getInt("rice");
            pineappleCount= savedInstanceState.getInt("pineapple");
            yogurtCount= savedInstanceState.getInt("yogurt");
            pepCount= savedInstanceState.getInt("pep");
            broccoliCount= savedInstanceState.getInt("broc");

            if (cheeseCount > 0) {
                tvCheese.setText("Cheese: " + Integer.toString(cheeseCount));
            }
            if (riceCount > 0) {
                tvRice.setText("Rice: " + Integer.toString(riceCount));
            }
            if (chickenCount > 0) {
                tvChicken.setText("Chicken: " + Integer.toString(chickenCount));
            }
            if (pepCount > 0) {
                tvPep.setText("Pepperoni: " + Integer.toString(pepCount));
            }
            if (pineappleCount > 0) {
                tvPineapple.setText("Pineapple: " + Integer.toString(pineappleCount));
            }
            if (crabCount > 0) {
                tvCrab.setText("Crab: " + Integer.toString(crabCount));
            }
            if (yogurtCount > 0) {
                tvYogurt.setText("Yogurt: " + Integer.toString(yogurtCount));
            }
            if (lobsterCount > 0) {
                tvLobster.setText("Lobster: " + Integer.toString(lobsterCount));
            }
            if (orangeCount > 0) {
                tvOrange.setText("Orange: " + Integer.toString(orangeCount));
            }
            if (broccoliCount > 0) {
                tvBroccoli.setText("Broccoli: " + Integer.toString(broccoliCount));
            }
        }

    }

    public void addItem(View view) {
        Intent intent = new Intent(this, ItemsList.class);
        startActivityForResult(intent, TEXT_REQUEST);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("cheese",cheeseCount);
        outState.putInt("pep",pepCount);
        outState.putInt("rice",riceCount);
        outState.putInt("pineapple",pineappleCount);
        outState.putInt("chicken",chickenCount);
        outState.putInt("orange",orangeCount);
        outState.putInt("lobster",lobsterCount);
        outState.putInt("crab",crabCount);
        outState.putInt("broc",broccoliCount);
        outState.putInt("yogurt",yogurtCount);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == TEXT_REQUEST) {
            if (resultCode == RESULT_OK) {
                String reply = data.getStringExtra(ItemsList.EXTRA_REPLY);
                if (reply.equals("cheese")) {
                    cheeseCount++;
                } else if (reply.equals("chicken")) {
                    chickenCount++;
                } else if (reply.equals("rice")) {
                    riceCount++;
                } else if (reply.equals("broccoli")) {
                    broccoliCount++;
                } else if (reply.equals("crab")) {
                    crabCount++;
                } else if (reply.equals("lobster")) {
                    lobsterCount++;
                } else if (reply.equals("yogurt")) {
                    yogurtCount++;
                } else if (reply.equals("orange")) {
                    orangeCount++;
                } else if (reply.equals("pepperoni")) {
                    pepCount++;
                } else if (reply.equals("pineapple")) {
                    pineappleCount++;
                }
                if (cheeseCount > 0) {
                    tvCheese.setText("Cheese: " + Integer.toString(cheeseCount));
                }
                if (riceCount > 0) {
                    tvRice.setText("Rice: " + Integer.toString(riceCount));
                }
                if (chickenCount > 0) {
                    tvChicken.setText("Chicken: " + Integer.toString(chickenCount));
                }
                if (pepCount > 0) {
                    tvPep.setText("Pepperoni: " + Integer.toString(pepCount));
                }
                if (pineappleCount > 0) {
                    tvPineapple.setText("Pineapple: " + Integer.toString(pineappleCount));
                }
                if (crabCount > 0) {
                    tvCrab.setText("Crab: " + Integer.toString(crabCount));
                }
                if (yogurtCount > 0) {
                    tvYogurt.setText("Yogurt: " + Integer.toString(yogurtCount));
                }
                if (lobsterCount > 0) {
                    tvLobster.setText("Lobster: " + Integer.toString(lobsterCount));
                }
                if (orangeCount > 0) {
                    tvOrange.setText("Orange: " + Integer.toString(orangeCount));
                }
                if (broccoliCount > 0) {
                    tvBroccoli.setText("Broccoli: " + Integer.toString(broccoliCount));
                }

            }
        }
    }

}
