package com.universl.ryan.calendar.sub_activity;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.universl.ryan.calendar.MainActivity;
import com.universl.ryan.calendar.R;

import java.util.Objects;

public class AwuruduCharitraActivity extends AppCompatActivity {

    Button new_moon,wash,new_year,good_time,cook_time,eat_time,hair_oil,work_time,planting_time;

    @TargetApi(Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_awurudu_charitra);

        Toolbar toolbar = findViewById(R.id.search_bar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color='#ffffff'>අවුරුදු සිරිත් විරිත්</font>"));
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_home);

        new_moon = findViewById(R.id.new_moon_time);
        wash = findViewById(R.id.wash_time);
        new_year = findViewById(R.id.new_year_time);
        good_time = findViewById(R.id.good_);
        cook_time = findViewById(R.id.cook_);
        eat_time = findViewById(R.id.eat_);
        hair_oil = findViewById(R.id.hair_oil_time);
        work_time = findViewById(R.id.work_);
        planting_time = findViewById(R.id.planting_);

        new_moon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AwuruduCharitraActivity.this,DisplayAwuruduCharitraActivity.class);
                intent.putExtra("charitra",new_moon.getText().toString());
                startActivity(intent);
                finish();
            }
        });
        wash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AwuruduCharitraActivity.this,DisplayAwuruduCharitraActivity.class);
                intent.putExtra("charitra",wash.getText().toString());
                startActivity(intent);
                finish();
            }
        });
        new_year.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AwuruduCharitraActivity.this,DisplayAwuruduCharitraActivity.class);
                intent.putExtra("charitra",new_year.getText().toString());
                startActivity(intent);
                finish();
            }
        });
        good_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AwuruduCharitraActivity.this,DisplayAwuruduCharitraActivity.class);
                intent.putExtra("charitra",good_time.getText().toString());
                startActivity(intent);
                finish();
            }
        });
        cook_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AwuruduCharitraActivity.this,DisplayAwuruduCharitraActivity.class);
                intent.putExtra("charitra",cook_time.getText().toString());
                startActivity(intent);
                finish();
            }
        });
        eat_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AwuruduCharitraActivity.this,DisplayAwuruduCharitraActivity.class);
                intent.putExtra("charitra",eat_time.getText().toString());
                startActivity(intent);
                finish();
            }
        });
        hair_oil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AwuruduCharitraActivity.this,DisplayAwuruduCharitraActivity.class);
                intent.putExtra("charitra",hair_oil.getText().toString());
                startActivity(intent);
                finish();
            }
        });
        work_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AwuruduCharitraActivity.this,DisplayAwuruduCharitraActivity.class);
                intent.putExtra("charitra",work_time.getText().toString());
                startActivity(intent);
                finish();
            }
        });
        planting_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AwuruduCharitraActivity.this,DisplayAwuruduCharitraActivity.class);
                intent.putExtra("charitra",planting_time.getText().toString());
                startActivity(intent);
                finish();
            }
        });
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home){
            Intent intent = new Intent(AwuruduCharitraActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(AwuruduCharitraActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
