package com.example.ken.gravitate.Event;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.ken.gravitate.R;

public class CreatedRequestDetails extends AppCompatActivity {

    // UI variables
    TextView mEarliestTime;
    TextView mLatestTime;
    TextView mAirport;
    TextView mFlightTime;
    TextView mPickupAddress;
    TextView mDate;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.created_request_details);
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Ride Request Details");
        toolbar.setNavigationIcon(R.drawable.system_icon_back);
        // Setting toolbar back button behavior
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onSupportNavigateUp();
            }
        });
        setSupportActionBar(toolbar);
        // Getting information passed in from the last activity
        String earliestTime = getIntent().getStringExtra("earliestTime");
        String latestTime = getIntent().getStringExtra("latestTime");
        String airport = getIntent().getStringExtra("airportCode");
        String flightTime = getIntent().getStringExtra("flightTime");
        String pickupAddress = getIntent().getStringExtra("pickupAddress");
        String date = getIntent().getStringExtra("date");

        // Getting UI elements
        mEarliestTime = findViewById(R.id.earlyArrivalTime);
        mLatestTime = findViewById(R.id.latestArrivalTime);
        mAirport = findViewById(R.id.airportName);
        mFlightTime = findViewById(R.id.flightTime);
        mPickupAddress = findViewById(R.id.pickupAddress);
        mDate = findViewById(R.id.Date);

        // Setting information for the user to use
        mEarliestTime.setText(earliestTime);
        mLatestTime.setText(latestTime);
        mAirport.setText(airport);
        mFlightTime.setText(flightTime);
        mPickupAddress.setText(pickupAddress);
        mDate.setText(date);

        // Show the toolbar back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }
    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem)
    {
        switch (menuItem.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), ScheduledEvents.class);
        startActivity(intent);
        super.onBackPressed();
    }
}
