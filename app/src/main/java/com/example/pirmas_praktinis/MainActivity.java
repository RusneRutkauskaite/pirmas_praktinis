package com.example.pirmas_praktinis;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Deklaruojame elementus, kad galėtume juos naudoti
    private TextView textView;
    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Naudojame išdėstymą iš activity_main.xml
        setContentView(R.layout.activity_main);

        // 1. Surandame XML elementus pagal jų ID
        textView = findViewById(R.id.textView);
        button1 = findViewById(R.id.button1);

        // 2. Nustatome paspaudimo įvykio klausytoją mygtukui
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 3. Pakeičiame TextView tekstą, kai mygtukas paspaudžiamas
                textView.setText("Tekstas pakeistas sėkmingai");
            }
        });
    }
}
