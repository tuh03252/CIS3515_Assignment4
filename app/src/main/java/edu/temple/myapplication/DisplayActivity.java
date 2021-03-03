package edu.temple.myapplication;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.ImageView;
import android.widget.Spinner;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

public class DisplayActivity extends AppCompatActivity{

    TextView textView;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        setTitle("Assignment 4: Display");
        textView = (TextView) findViewById(R.id.textView);
        imageView = (ImageView) findViewById(R.id.imageView);
        Intent intent = getIntent();
        String text = intent.getStringExtra("key");
        textView.setText(text);
        if(text.equalsIgnoreCase("atacama"))
        {
            imageView.setImageResource(R.drawable.atacama);
        }
        if(text.equalsIgnoreCase("Gobi"))
        {
            imageView.setImageResource(R.drawable.gobi);
        }
        if(text.equalsIgnoreCase("mohave"))
        {
            imageView.setImageResource(R.drawable.mohave);
        }
        if(text.equalsIgnoreCase("Patagonian"))
        {
            imageView.setImageResource(R.drawable.patagonian);
        }
        if(text.equalsIgnoreCase("sahara"))
        {
            imageView.setImageResource(R.drawable.sahara);
        }
    }


}