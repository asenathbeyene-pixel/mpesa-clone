package com.example.mpesaclone;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class BankActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank);

        findViewById(R.id.btnBack).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Spinner bankSpinner = findViewById(R.id.bankSpinner);
        ArrayList<String> banks = new ArrayList<>();
        banks.add("Select bank");
        banks.add("Commercial Bank of Ethiopia (CBE)");
        banks.add("Awash Bank");
        banks.add("Dashen Bank");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, banks);
        bankSpinner.setAdapter(adapter);
    }
}
