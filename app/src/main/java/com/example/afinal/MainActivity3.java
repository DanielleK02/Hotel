package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.text.BreakIterator;
import java.text.DateFormat;
import java.util.Calendar;

public class MainActivity3<string> extends AppCompatActivity {
    int intBeds;
    string userName;
    Button button3;
    private TextView reservation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        final EditText name = (EditText) findViewById(R.id.txtInput);
        final EditText beds = (EditText) findViewById(R.id.txtBeds);
        final SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
        reservation = (TextView) findViewById(R.id.txtReservation);
        userName = (string) name.getText();
        intBeds = Integer.parseInt(beds.getText().toString());
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("key1", (String) userName);
        editor.putInt("key2", intBeds);

        button3 = (Button) findViewById(R.id.btnDate);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new DatePickerDialog(MainActivity3.this, d, c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH)).show();

            }
        });
    }

    Calendar c = Calendar.getInstance();
    DateFormat fmtDate = DateFormat.getDateInstance();
    DatePickerDialog.OnDateSetListener d = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

            c.set(Calendar.YEAR, year);
            c.set(Calendar.MONTH, monthOfYear);
            c.set(Calendar.DAY_OF_MONTH, dayOfMonth);
            reservation.setText("Your reservation is set for" + fmtDate.format(c.getTime()));
        }
    };
}