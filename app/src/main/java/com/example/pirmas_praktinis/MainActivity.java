package com.example.pirmas_praktinis;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.graphics.Color; // Reikalinga norint keisti spalvą

public class MainActivity extends AppCompatActivity {

    // Deklaruojame elementus
    private TextView textView;
    private Button button1;
    private Button button2; // Antras mygtukas

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Naudojame išdėstymą iš activity_main.xml
        setContentView(R.layout.activity_main);

        // 1. Surandame XML elementus pagal jų ID
        textView = findViewById(R.id.textView);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2); // Surandame antrą mygtuką

        // 2. Nustatome paspaudimo įvykio klausytoją (PIRMAS MYGTUKAS: KEIČIA TEKSTĄ)
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pakeičiame TextView tekstą, kai mygtukas paspaudžiamas
                textView.setText("Tekstas pakeistas sėkmingai po mygtuko paspaudimo!");
            }
        });

        // 3. Nustatome paspaudimo įvykio klausytoją (ANTRAS MYGTUKAS: KEIČIA SPALVĄ)
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pakeičiame TextView teksto spalvą į raudoną
                textView.setTextColor(Color.RED);
            }
        });
    }
}
