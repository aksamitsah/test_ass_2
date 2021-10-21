package me.aksamitsah.test_asc;

import static me.aksamitsah.test_asc.MainActivity.KEY;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import me.aksamitsah.test_asc.adapter.DisplayStudentAdapter;

public class History extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        Intent intent = getIntent();
        Map<String, String[]> data = (Map<String, String[]>) intent.getSerializableExtra(KEY);


        RecyclerView recyclerView = findViewById(R.id.recycleHistory);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        DisplayStudentAdapter adapter = new DisplayStudentAdapter(sortData(data));
        recyclerView.setAdapter(adapter);
    }

    private TreeMap<String, String[]> sortData(Map<String, String[]> data) {

        TreeMap<String, String[]> sorted = new TreeMap<>();
        sorted.putAll(data);

        return sorted;
    }


}