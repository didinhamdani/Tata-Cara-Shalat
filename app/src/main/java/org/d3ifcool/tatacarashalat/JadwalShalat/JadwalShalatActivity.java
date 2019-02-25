package org.d3ifcool.tatacarashalat.JadwalShalat;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonObjectRequest;

import org.d3ifcool.tatacarashalat.R;
import org.json.JSONException;
import org.json.JSONObject;

public class JadwalShalatActivity extends AppCompatActivity {

    String tag_json_obj = "json_obj_req";
    String url;

    ProgressDialog pDialog;
    private static final String TAG ="tag";

    TextView mFajrTV, mDzuhurTV, mAsharTV, mMaqribTV, mIsyaTV, mLocationTV, mDateTV;

    EditText mSearchET;
    Button mSearchBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jadwal_shalat);


        mFajrTV = findViewById(R.id.fjar);
        mDzuhurTV = findViewById(R.id.dzuhur);
        mAsharTV = findViewById(R.id.ashar);
        mMaqribTV = findViewById(R.id.maqrib);
        mIsyaTV = findViewById(R.id.isya);
        mLocationTV = findViewById(R.id.location);
        mDateTV = findViewById(R.id.date);
        mSearchET = findViewById(R.id.searchet);
        mSearchBtn = findViewById(R.id.searchBtn);


        mSearchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mLocation =  mSearchET.getText().toString().trim();

                if (mLocation.isEmpty()){
                    Toast.makeText(JadwalShalatActivity.this, "Masukan Lokasi ANda", Toast.LENGTH_SHORT).show();
                }else{

                    url = "http://muslimsalat.com/"+mLocation+".json?key=2a1024c8607803a775b9b70e81987c5f";
                    searchLocation();
                }
            }
        });

    }

    private void searchLocation() {

        pDialog = new ProgressDialog(this);
        pDialog.setMessage("Loading...");
        pDialog.show();

        JsonObjectRequest jsonObjReq = new JsonObjectRequest(Request.Method.GET,
                url, null,
                new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {
                        //Get data json
                        try {

                            String country = response.get("country").toString();
                            String state = response.get("state").toString();
                            String city = response.get("city").toString();
                            String location = country +",  "+ state +",  "+city;

                            //get date
                            String date = response.getJSONArray("items").getJSONObject(0).get("date_for").toString();

                            String mFajr = response.getJSONArray("items").getJSONObject(0).get("fajr").toString();
                            String mDzuhur = response.getJSONArray("items").getJSONObject(0).get("dhuhr").toString();
                            String mAshar = response.getJSONArray("items").getJSONObject(0).get("asr").toString();
                            String mMaqrib = response.getJSONArray("items").getJSONObject(0).get("maghrib").toString();
                            String mIsya = response.getJSONArray("items").getJSONObject(0).get("isha").toString();

                            mFajrTV.setText(mFajr);
                            mDzuhurTV.setText(mDzuhur);
                            mAsharTV.setText(mAshar);
                            mMaqribTV.setText(mMaqrib);
                            mIsyaTV.setText(mIsya);

                            mLocationTV.setText(location);
                            mDateTV.setText(date);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        pDialog.hide();
                    }
                }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                VolleyLog.d(TAG, "Error: " + error.getMessage());
                // hide the progress dialog
                pDialog.hide();
            }
        });

// Adding request to request queue
        AppController.getInstance().addToRequestQueue(jsonObjReq, tag_json_obj);
    }
}
