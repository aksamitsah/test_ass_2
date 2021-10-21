package me.aksamitsah.test_asc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MainActivity extends AppCompatActivity {

    Button add, history;
    EditText firstname,lastname,contact, address;
    Map<String, String[]> data;
    public static final String KEY = "RANDOM";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstname = findViewById(R.id.firstname);
        lastname = findViewById(R.id.lastname);
        contact = findViewById(R.id.contact);
        address = findViewById(R.id.address);

        add = findViewById(R.id.add);
        history = findViewById(R.id.history);

        add.setOnClickListener(v -> {

            String firstname1 = firstname.getText().toString().trim();
            String lastname1 = lastname.getText().toString().trim();
            String contact1 = contact.getText().toString().trim();
            String address1 = address.getText().toString().trim();

            if(!firstname1.isEmpty() && !lastname1.isEmpty() && !contact1.isEmpty() && !address1.isEmpty())
            {
                addValue(firstname1,lastname1,contact1,address1);
            }
            else
            {
                Toast.makeText(this, "fill all", Toast.LENGTH_SHORT).show();
            }

        });

        history.setOnClickListener(v -> {
            Intent i = new Intent(this,History.class);
            i.putExtra(KEY, (Parcelable) data);
            startActivity(i);

        });
    }

    private void addValue(String firstname1, String lastname1, String contact1, String address1) {

        data = new HashMap<>();
        data.put(firstname1,new String[] {lastname1,contact1,address1});
        Toast.makeText(this, "Data Added", Toast.LENGTH_SHORT).show();
    }
}