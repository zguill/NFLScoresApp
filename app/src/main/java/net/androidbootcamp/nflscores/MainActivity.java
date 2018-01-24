package net.androidbootcamp.nflscores;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Array;

public class MainActivity extends AppCompatActivity {
    Spinner spinner, spinner2;
    ArrayAdapter<CharSequence> adapter;
    TextView textView4, textView5;
    String NFC_TEAMS;
    Button button1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner=(Spinner) findViewById(R.id.spinner);
        textView4=(TextView)findViewById(R.id.textView5);
        adapter=ArrayAdapter.createFromResource(this, R.array.NFC_TEAMS, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner2=(Spinner) findViewById(R.id.spinner2);
        textView5=(TextView)findViewById(R.id.textView5);
        adapter= ArrayAdapter.createFromResource(this, R.array.AFC_TEAMS, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {





            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        button1=(Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if ((spinner.getSelectedItem().toString().equals("Seattle")) && (spinner2.getSelectedItem().toString().equals("Houston")))
                {

                    textView5.setText("SEATTLE        7     10    0     3     20\nHOUSTON        3     7     7     0     17");

                }
                else if
                    ((spinner.getSelectedItem().toString().equals("Seattle")) && (spinner2.getSelectedItem().toString().equals("Jacksonville")))
                {

                    textView5.setText("SEATTLE        0     7     3     3     13\nJACKSONVILLE   7    10     0     2     19");
                }
                else if
                        ((spinner.getSelectedItem().toString().equals("Seattle")) && (spinner2.getSelectedItem().toString().equals("Indianapolis")))
                {

                    textView5.setText("SEATTLE AND INDIANAPOLIS DID NOT PLAY");
                }
                else if
                        ((spinner.getSelectedItem().toString().equals("Seattle")) && (spinner2.getSelectedItem().toString().equals("Tennessee")))
                {

                    textView5.setText("SEATTLE        10     10    3     7     30\nTENNESSEE       7     0     0     3     10");
                }
                else if
                 ((spinner.getSelectedItem().toString().equals("San Fransisco")) && (spinner2.getSelectedItem().toString().equals("Houston")))
                {

                    textView5.setText("SAN FRANSISCO  10    10    0     6     26\nHOUSTON        9     7     3     6     25");

                }
                else if
                        ((spinner.getSelectedItem().toString().equals("San Fransisco")) && (spinner2.getSelectedItem().toString().equals("Jacksonville")))
                {

                    textView5.setText("SAN FRANSISCO  10    10    0     6     26\nJACKSONVILLE   3     9     3     3     18");

                }
                else if
                        ((spinner.getSelectedItem().toString().equals("San Fransisco")) && (spinner2.getSelectedItem().toString().equals("Tennessee")))
                {

                    textView5.setText("SAN FRANSISCO AND TENNESSEE DID NOT PLAY");

                }
                else if
                        ((spinner.getSelectedItem().toString().equals("San Fransisco")) && (spinner2.getSelectedItem().toString().equals("Indianapolis")))
                {

                    textView5.setText("SAN FRANSISCO  10    10    0     6     26\nINDIANAPOLIS   9     7     3     6     25");

                }
                else if
                        ((spinner.getSelectedItem().toString().equals("Arizona")) && (spinner2.getSelectedItem().toString().equals("Houston")))
                {

                    textView5.setText("ARIZONA        6    6      0     2     14\nHOUSTON        3     3     3     0     9");

                }
                else if
                        ((spinner.getSelectedItem().toString().equals("Arizona")) && (spinner2.getSelectedItem().toString().equals("Jacksonville")))
                {

                    textView5.setText("ARIZONA AND JACKSONVILLE DID NOT PLAY");

                }
                else if
                        ((spinner.getSelectedItem().toString().equals("Arizona")) && (spinner2.getSelectedItem().toString().equals("Tennessee")))
                {

                    textView5.setText("ARIZONA AND TENNESSEE DID NOT PLAY");

                }
                else if
                        ((spinner.getSelectedItem().toString().equals("Arizona")) && (spinner2.getSelectedItem().toString().equals("Indianapolis")))
                {

                    textView5.setText("ARIZONA        14    0     0     21    35\nINDIANAPOLIS   9     3     3     6     21");

                }
                else if
                        ((spinner.getSelectedItem().toString().equals("Los Angeles")) && (spinner2.getSelectedItem().toString().equals("Houston")))
                {

                    textView5.setText("LOS ANGELES AND HOUSTON DID NOT PLAY");

                }
                else if
                        ((spinner.getSelectedItem().toString().equals("Los Angeles")) && (spinner2.getSelectedItem().toString().equals("Jacksonville")))
                {

                    textView5.setText("LOS ANGELES AND JACKSONVILLE DID NOT PLAY");

                }
                else if
                        ((spinner.getSelectedItem().toString().equals("Los Angeles")) && (spinner2.getSelectedItem().toString().equals("Tennessee")))
                {

                    textView5.setText("LOS ANGELES    10    10    7    0    27\nTENNESSEE      12    7    0    14    33");

                }
                else if
                        ((spinner.getSelectedItem().toString().equals("Los Angeles")) && (spinner2.getSelectedItem().toString().equals("Indianapolis")))
                {

                    textView5.setText("LOS ANGELES    10    10    0     6     26\nINDIANAPOLIS   9     7     3     6     25");

                }
            }
        });
    }
}