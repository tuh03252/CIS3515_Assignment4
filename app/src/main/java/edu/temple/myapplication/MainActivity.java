package edu.temple.myapplication;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.Spinner;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    GridView gridview;
    String[] names = {"Atacama","Gobi","Mohave","Patagonian","Sahara"};
    int[] images = {R.drawable.atacama, R.drawable.gobi, R.drawable.mohave, R.drawable.patagonian, R.drawable.sahara};
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Assignment 4: Selection");
        gridview = findViewById(R.id.gridView);
        CustomAdapter customAdapter = new CustomAdapter(names,images,this);
        gridview.setAdapter(customAdapter);
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                String selectedName = names[i];
                int selectedImage = images[i];
                startActivity(new Intent(MainActivity.this,DisplayActivity.class).putExtra("name",selectedName).putExtra("image",selectedImage));
            }

        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
    {
        String text = parent.getItemAtPosition(position).toString();
        if(!text.equals("Select One"))
        {
            openDisplayActivity(text);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent)
    {

    }

    public void openDisplayActivity(String text)
    {
        Intent intent = new Intent(this, DisplayActivity.class);
        intent.putExtra("key", text);
        startActivity(intent);
    }
}