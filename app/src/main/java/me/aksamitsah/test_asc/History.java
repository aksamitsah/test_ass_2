package me.aksamitsah.test_asc;

import static me.aksamitsah.test_asc.MainActivity.KEY;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import me.aksamitsah.test_asc.adapter.DisplayStudentAdapter;

public class History extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        Intent intent = getIntent();
        ArrayList<Student> data = intent.getParcelableArrayListExtra(KEY);

        RecyclerView recyclerView = findViewById(R.id.recycleHistory);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        DisplayStudentAdapter adapter = new DisplayStudentAdapter(data);
        recyclerView.setAdapter(adapter);
    }

}