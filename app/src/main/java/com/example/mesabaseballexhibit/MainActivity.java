package com.example.mesabaseballexhibit;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Ensure this matches your XML filename

        // Find buttons by ID
        Button triviaButton = findViewById(R.id.triviaChallengeButton);
        Button playersButton = findViewById(R.id.iconicPlayersButton);
        Button teamsButton = findViewById(R.id.iconicTeamsButton);
        Button highlightsButton = findViewById(R.id.historicalHighlightsButton);

        // Set listeners to navigate to respective activities
        triviaButton.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, TriviaActivity.class)));
        playersButton.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, PlayerListActivity.class)));
        teamsButton.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, TeamListActivity.class)));
        highlightsButton.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, HistoricalHighlightsActivity.class)));
    }
}
