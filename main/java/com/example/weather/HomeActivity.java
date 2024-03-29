package com.example.weather;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import static com.example.weather.WeatherParser.parseXML;

public class HomeActivity extends AppCompatActivity {

    TextView h_rev;
    ImageView i_rev;

    TextView maxTemp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);

        EdgeToEdge.enable(this);

        // Manipulation des variables de retour
        maxTemp = findViewById(R.id.maxTemp);
        h_rev = findViewById(R.id.hrv);
        h_rev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        i_rev = findViewById(R.id.irv);
        i_rev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intE = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(intE);
            }
        });

        // Fin de la manipulation du retour

        // Attribution des valeurs récupérées à notre interface

        // Récupération des données de prévisions météorologiques
        String xmlData = "https://weather-broker-cdn.api.bbci.co.uk/en/forecast/rss/3day/2643123";
        WeatherForecast forecast = parseXML(xmlData);
        String locat = forecast.getLocationLink();

        // Affichage des informations dans l'interface utilisateur
        maxTemp.setText("Max :" + locat);

        // Fin de l'attribution des valeurs récupérées à notre interface

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.home), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
