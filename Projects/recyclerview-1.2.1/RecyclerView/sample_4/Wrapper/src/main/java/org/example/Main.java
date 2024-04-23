package org.example;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Make sure this layout contains a RecyclerView

        List<String> data = new ArrayList<>();

        // Populate your data
        data.add("Item 1");
        data.add("Item 2");
        data.add("Item 3");

        RecyclerView recyclerView = findViewById(R.id.recycler_view); // Make sure the RecyclerView in your activity_main.xml has this ID
        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        MyAdapter mAdapter = new MyAdapter(data);
        recyclerView.setAdapter(mAdapter);
    }
}