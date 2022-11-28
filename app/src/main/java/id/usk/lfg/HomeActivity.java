package id.usk.lfg;

import static android.bluetooth.BluetoothClass.Service.INFORMATION;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.blue)));

    }


    public void info(View view) {
        Intent intent = new Intent(HomeActivity.this, InfoActivity.class);
        startActivity(intent);
    }

    public void LFG(View view) {
        Intent intent = new Intent(HomeActivity.this, LfgActivity.class);
        startActivity(intent);
    }
}