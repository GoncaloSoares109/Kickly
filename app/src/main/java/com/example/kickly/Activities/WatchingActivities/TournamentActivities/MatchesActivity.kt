package com.example.kickly.Activities.WatchingActivities.TournamentActivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kickly.R

class MatchesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_matches)
        title = getString(R.string.matches).capitalize()
    }
}
