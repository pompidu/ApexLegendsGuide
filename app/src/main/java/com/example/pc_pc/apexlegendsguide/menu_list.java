package com.example.pc_pc.apexlegendsguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class menu_list extends AppCompatActivity {

    private TextView consumables;
    private TextView equipment;
    private LinearLayout syringe;
    private LinearLayout medkit;
    private LinearLayout shieldcell;
    private LinearLayout shieldbattery;
    private LinearLayout ultAcc;
    private LinearLayout helmet1, helmet2, helmet3, helmet4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_list);

        //Build views/layouts
        consumables = findViewById(R.id.consumable_menu);
        equipment = findViewById(R.id.equipment_menu);
        syringe = findViewById(R.id.syringe_layout);
        medkit = findViewById(R.id.medkit_layout);
        shieldcell = findViewById(R.id.shieldcell_layout);
        shieldbattery = findViewById(R.id.shieldbattery_layout);
        ultAcc = findViewById(R.id.Ult_acc_layout);
        helmet1 = findViewById(R.id.helmet_layout);
        helmet2 = findViewById(R.id.helmet2_layout);
        helmet3 = findViewById(R.id.helmet3_layout);
        helmet4 = findViewById(R.id.helmet4_layout);


        //Onclick view for consumable
        consumables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearVisibility(syringe);
                linearVisibility(medkit);
                linearVisibility(shieldcell);
                linearVisibility(shieldbattery);
                linearVisibility(ultAcc);
            }
        });

        //Onclick view for equipment
        equipment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearVisibility(helmet1);
                linearVisibility(helmet2);
                linearVisibility(helmet3);
                linearVisibility(helmet4);
            }
        });

    }

    public void Visibility(TextView txtView){
        if (txtView.getVisibility() == View.GONE){
            txtView.setVisibility(View.VISIBLE);
        }
        else{
            txtView.setVisibility(View.GONE);
        }
    }
    //
    public void linearVisibility(LinearLayout linLayout){
        if (linLayout.getVisibility() == View.GONE){
            linLayout.setVisibility(View.VISIBLE);
        }
        else{
            linLayout.setVisibility(View.GONE);
        }
    }
}
