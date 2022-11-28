package id.usk.lfg;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;


public class LfgActivity extends AppCompatActivity {
    EditText isikreatinin, isiberat, isiusia;
    RadioGroup jenis;
    float gfr;
    String result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lfg);

        Button submit = (Button) findViewById(R.id.button);

        //action bar
        ActionBar actionBar;
        actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("LFG");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.blue)));
    }

    public void detectNow(View view) {
        jenis = findViewById(R.id.jk);
        int selectedJenis = jenis.getCheckedRadioButtonId();
        Log.d(TAG, "detectNow: " + selectedJenis);

        int laki = 2131230857;
        int perempuan = 2131230832;

        isikreatinin = findViewById(R.id.isiKreatinin);
        isiberat = findViewById(R.id.isiBerat);
        isiusia = findViewById(R.id.isiUmur);

        float kreatinin = Float.parseFloat(isikreatinin.getText().toString());
        float berat = Float.parseFloat(isiberat.getText().toString());
        float usia = Float.parseFloat(isiusia.getText().toString());


        if (selectedJenis == laki) {
            gfr = (float) (((140 - usia) * berat) / (72 * kreatinin));
        } else {
            gfr = (float) (((140 - usia) * berat * 0.85) / (72 * kreatinin));
        }

        if ( gfr >= 90 ) {
            result = "normal atau ada kerusakan ginjal tanpa gangguan fungsi ginjal";
        } else if ( gfr >= 60 && gfr <= 89 ) {
            result = "kerusakan ginjal dengan gangguan fungsi ginjal ringan";
        } else if (gfr >= 45 && gfr <=59) {
            result = " gangguan fungsi ginjal ringan sampai sedang";
        } else if (gfr >= 30 && gfr <=44) {
            result = " gangguan fungsi ginjal sedang sampai berat ";
        } else if (gfr >= 15 && gfr <=29) {
            result = "gangguan fungsi ginjal berat";
        } else {
            result = "gagal ginjal yang membutuhkan cuci darah atau transplantasi ginjal";
        }

        TextView logHasil = (TextView) findViewById(R.id.logHasil);
        logHasil.setText("Hasil GFR anda adalah: " + gfr + ".\n Kondisi ginjal: " + result);
    }
}