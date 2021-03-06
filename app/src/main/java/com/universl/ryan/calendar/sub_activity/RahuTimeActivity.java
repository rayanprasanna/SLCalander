package com.universl.ryan.calendar.sub_activity;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.error.AuthFailureError;
import com.android.volley.error.NetworkError;
import com.android.volley.error.NoConnectionError;
import com.android.volley.error.ParseError;
import com.android.volley.error.ServerError;
import com.android.volley.error.TimeoutError;
import com.android.volley.error.VolleyError;
import com.android.volley.request.StringRequest;
import com.universl.ryan.calendar.MainActivity;
import com.universl.ryan.calendar.R;
import com.universl.ryan.calendar.response.RahuTime;
import com.universl.ryan.calendar.utils.AppController;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class RahuTimeActivity extends AppCompatActivity {

    public final String  URL = "https://universlsoftware.com/appsadmin/appspanel/index.php/astro_rahu/feed";
    List<RahuTime> rahuTimeList;
    TextView date_month,sun_raise,sun_fall,day,night,rahu_time;
    Button today,monday,tuesday,wednesday,thursday,friday,saturday,sunday;
    String ID = null;
    RelativeLayout rahu_layout;

    @TargetApi(Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rahu_time);

        Toolbar toolbar = findViewById(R.id.search_bar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle(Html.fromHtml("<font color='#ffffff'>රාහු කාලය</font>"));
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_home);

        rahuTimeList = new ArrayList<>();

        rahu_layout = findViewById(R.id.rahu_layout);
        date_month = findViewById(R.id.date_month);
        sun_raise = findViewById(R.id.sun_raise_time);
        sun_fall = findViewById(R.id.sun_fall_time);
        day = findViewById(R.id.day);
        night = findViewById(R.id.night);
        rahu_time = findViewById(R.id.rahu_time_range);
        today = findViewById(R.id.today);
        monday = findViewById(R.id.monday);
        tuesday = findViewById(R.id.tuesday);
        wednesday = findViewById(R.id.wednesday);
        thursday = findViewById(R.id.thursday);
        friday = findViewById(R.id.friday);
        saturday = findViewById(R.id.saturday);
        sunday = findViewById(R.id.sunday);

        @SuppressLint("SimpleDateFormat") DateFormat dateFormat = new SimpleDateFormat("EEEE");
        Date date = new Date();

        if (dateFormat.format(date).equalsIgnoreCase("Monday")){
            ID = "1";
            getData("1",true);
        }else if (dateFormat.format(date).equalsIgnoreCase("Tuesday")){
            ID = "2";
            getData("2",true);
        }else if (dateFormat.format(date).equalsIgnoreCase("Wednesday")){
            ID = "3";
            getData("3",true);
        }else if (dateFormat.format(date).equalsIgnoreCase("Thursday")){
            ID = "4";
            getData("4",true);
        }else if (dateFormat.format(date).equalsIgnoreCase("Friday")){
            ID = "5";
            getData("5",true);
        }else if (dateFormat.format(date).equalsIgnoreCase("Saturday")){
            ID = "6";
            getData("6",true);
        }else if (dateFormat.format(date).equalsIgnoreCase("Sunday")){
            ID = "7";
            getData("7",true);
        }
        today.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rahu_layout.setBackgroundResource(R.drawable.day_time);
                day.setBackgroundColor(Color.parseColor("#90000000"));
                night.setBackgroundColor(Color.parseColor("#90ffffff"));
                @SuppressLint("SimpleDateFormat") DateFormat dateFormat = new SimpleDateFormat("EEEE");
                Date date = new Date();

                if (dateFormat.format(date).equalsIgnoreCase("Monday")){
                    ID = "1";
                    getData("1",true);
                }else if (dateFormat.format(date).equalsIgnoreCase("Tuesday")){
                    ID = "2";
                    getData("2",true);
                }else if (dateFormat.format(date).equalsIgnoreCase("Wednesday")){
                    ID = "3";
                    getData("3",true);
                }else if (dateFormat.format(date).equalsIgnoreCase("Thursday")){
                    ID = "4";
                    getData("4",true);
                }else if (dateFormat.format(date).equalsIgnoreCase("Friday")){
                    ID = "5";
                    getData("5",true);
                }else if (dateFormat.format(date).equalsIgnoreCase("Saturday")){
                    ID = "6";
                    getData("6",true);
                }else if (dateFormat.format(date).equalsIgnoreCase("Sunday")){
                    ID = "7";
                    getData("7",true);
                }
            }
        });
        monday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                day.setBackgroundColor(Color.parseColor("#90000000"));
                night.setBackgroundColor(Color.parseColor("#90ffffff"));
                rahu_layout.setBackgroundResource(R.drawable.day_time);
                ID = "1";
                getData("1",true);
            }
        });
        tuesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                day.setBackgroundColor(Color.parseColor("#90000000"));
                night.setBackgroundColor(Color.parseColor("#90ffffff"));
                rahu_layout.setBackgroundResource(R.drawable.day_time);
                ID = "2";
                getData("2",true);
            }
        });
        wednesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                day.setBackgroundColor(Color.parseColor("#90000000"));
                night.setBackgroundColor(Color.parseColor("#90ffffff"));
                rahu_layout.setBackgroundResource(R.drawable.day_time);
                ID = "3";
                getData("3",true);
            }
        });
        thursday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                day.setBackgroundColor(Color.parseColor("#90000000"));
                night.setBackgroundColor(Color.parseColor("#90ffffff"));
                rahu_layout.setBackgroundResource(R.drawable.day_time);
                ID = "4";
                getData("4",true);
            }
        });
        friday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                day.setBackgroundColor(Color.parseColor("#90000000"));
                night.setBackgroundColor(Color.parseColor("#90ffffff"));
                rahu_layout.setBackgroundResource(R.drawable.day_time);
                ID = "5";
                getData("5",true);
            }
        });
        saturday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                day.setBackgroundColor(Color.parseColor("#90000000"));
                night.setBackgroundColor(Color.parseColor("#90ffffff"));
                rahu_layout.setBackgroundResource(R.drawable.day_time);
                ID = "6";
                getData("6",true);
            }
        });
        sunday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                day.setBackgroundColor(Color.parseColor("#90000000"));
                night.setBackgroundColor(Color.parseColor("#90ffffff"));
                rahu_layout.setBackgroundResource(R.drawable.day_time);
                ID = "7";
                getData("7",true);
            }
        });

        day.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rahu_layout.setBackgroundResource(R.drawable.day_time);
                day.setBackgroundColor(Color.parseColor("#90000000"));
                night.setBackgroundColor(Color.parseColor("#90ffffff"));
                getData(ID,true);
            }
        });
        night.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rahu_layout.setBackgroundResource(R.drawable.night_time);
                day.setBackgroundColor(Color.parseColor("#90ffffff"));
                night.setBackgroundColor(Color.parseColor("#90000000"));
                getData(ID,false);
            }
        });
    }
    private void getData(final String id , final Boolean isDay){

        final ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Loading...");
        progressDialog.show();
        StringRequest stringRequest = new StringRequest(
                Request.Method.GET,
                URL,
                new Response.Listener<String>() {
                    @SuppressLint("SetTextI18n")
                    @Override
                    public void onResponse(String response) {
                        //Here is main response object
                        JSONObject json;
                        try {
                            json = new JSONObject(response);
                            JSONArray rahu_results = json.getJSONArray("results");

                            if(rahu_results.length ()> 0){

                                for(int countItem = 0; countItem < rahu_results.length(); countItem++){

                                    JSONObject rahuTimeObject = rahu_results.getJSONObject(countItem);

                                    RahuTime rahuTime = new RahuTime();

                                    if (rahuTimeObject.optString("id").equalsIgnoreCase(id)){
                                        rahuTime.setId(rahuTimeObject.isNull("id")?"":rahuTimeObject.optString("id"));
                                        rahuTime.setDay(rahuTimeObject.isNull("day")?"":rahuTimeObject.optString("day"));
                                        rahuTime.setDate(rahuTimeObject.isNull("date")?"":rahuTimeObject.optString("date"));
                                        rahuTime.setSun_raise_time(rahuTimeObject.isNull("sun_raise_time")?"":rahuTimeObject.optString("sun_raise_time"));
                                        rahuTime.setSun_fall_time(rahuTimeObject.isNull("sun_fall_time")?"":rahuTimeObject.optString("sun_fall_time"));
                                        rahuTime.setDay_rahu_start_time(rahuTimeObject.isNull("day_rahu_start_time")?"":rahuTimeObject.optString("day_rahu_start_time"));
                                        rahuTime.setDay_rahu_end_time(rahuTimeObject.isNull("day_rahu_end_time")?"":rahuTimeObject.optString("day_rahu_end_time"));
                                        rahuTime.setNight_rahu_start_time(rahuTimeObject.isNull("night_rahu_start_time")?"":rahuTimeObject.optString("night_rahu_start_time"));
                                        rahuTime.setNight_rahu_end_time(rahuTimeObject.isNull("night_rahu_end_time")?"":rahuTimeObject.optString("night_rahu_end_time"));
                                        rahuTime.setSuba_dishawa(rahuTimeObject.isNull("suba_dishawa")?"":rahuTimeObject.optString("suba_dishawa"));
                                        rahuTime.setMaru_dishawa(rahuTimeObject.isNull("maru_dishawa")?"":rahuTimeObject.optString("maru_dishawa"));

                                        rahuTime = new RahuTime(rahuTime.getId(),rahuTime.getDay(),rahuTime.getDate(),rahuTime.getSun_raise_time(),rahuTime.getSun_fall_time(),rahuTime.getDay_rahu_start_time(),rahuTime.getDay_rahu_end_time(),rahuTime.getNight_rahu_start_time(),rahuTime.getNight_rahu_end_time(),rahuTime.getSuba_dishawa(),rahuTime.getMaru_dishawa());

                                        rahuTimeList.clear();
                                        rahuTimeList.add(rahuTime);
                                    }
                                }

                                @SuppressLint("SimpleDateFormat") DateFormat monthFormat = new SimpleDateFormat("MMMM");
                                @SuppressLint("SimpleDateFormat") DateFormat yearFormat = new SimpleDateFormat("yyyy");

                                Date date = new Date();

                                String[] day_month_text = rahuTimeList.get(0).getDate().split("-");

                                date_month.setText(rahuTimeList.get(0).getDay() + " , " + day_month_text[2] + " " + monthFormat.format(date) + " " + yearFormat.format(date));

                                sun_raise.setText(" AM " + rahuTimeList.get(0).getSun_raise_time()); sun_fall.setText("PM " + rahuTimeList.get(0).getSun_fall_time());

                                if (isDay){
                                    rahu_time.setText("AM " + rahuTimeList.get(0).getDay_rahu_start_time() + " සිට " + " AM " + rahuTimeList.get(0).getDay_rahu_end_time());
                                }else {
                                    rahu_time.setText("PM " + rahuTimeList.get(0).getNight_rahu_start_time() + " සිට " + " PM " + rahuTimeList.get(0).getNight_rahu_end_time());
                                }

                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                            progressDialog.dismiss();
                        }
                        progressDialog.dismiss();
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // Do something when get error
                        AppController.getInstance().getRequestQueue().stop();
                        Log.e("Volley", error.toString());
                        progressDialog.dismiss();
                        if (error instanceof TimeoutError || error instanceof NoConnectionError) {
                            System.out.println("Request Type: " + "TimeoutError");
                        } else if (error instanceof AuthFailureError) {
                            System.out.println("Request Type: " + "AuthFailureError");
                        } else if (error instanceof ServerError) {
                            System.out.println("Request Type: " + "ServerError");
                        } else if (error instanceof NetworkError) {
                            System.out.println("Request Type: " + "NetworkError");
                        } else if (error instanceof ParseError) {
                            System.out.println("Request Type: " + "ParseError");
                        }
                    }
                }
        );

        // Add StringRequest to the RequestQueue
        stringRequest.setRetryPolicy(new DefaultRetryPolicy(DefaultRetryPolicy.DEFAULT_TIMEOUT_MS * 2, DefaultRetryPolicy.DEFAULT_MAX_RETRIES, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
        AppController.getInstance().getRequestQueue();
        AppController.getInstance().addToRequestQueue(stringRequest);
        deleteCache(RahuTimeActivity.this);
    }
    private static void deleteCache(Context context) {
        try {
            File dir = context.getCacheDir();
            deleteDir(dir);
        } catch (Exception e) { e.printStackTrace();}
    }

    private static boolean deleteDir(File dir) {
        if (dir != null && dir.isDirectory()) {
            String[] children = dir.list();
            for (String aChildren : children) {
                boolean success = deleteDir(new File(dir, aChildren));
                if (!success) {
                    return false;
                }
            }
            return dir.delete();
        } else if(dir!= null && dir.isFile()) {
            return dir.delete();
        } else {
            return false;
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home){
            Intent intent = new Intent(RahuTimeActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(RahuTimeActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
