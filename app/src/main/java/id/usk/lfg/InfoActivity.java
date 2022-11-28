package id.usk.lfg;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import java.util.Arrays;
import java.util.List;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.blue)));

        ActionBar actionBar;
        //untuk membuat title informasi di action bar
        actionBar = getSupportActionBar();assert actionBar != null;
        actionBar.setTitle("Information");
    }
}