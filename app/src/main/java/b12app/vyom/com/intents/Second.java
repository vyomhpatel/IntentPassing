package b12app.vyom.com.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ScrollView;
import android.widget.TextView;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ScrollView sv = findViewById(R.id.sv1);
        TextView tvShow = findViewById(R.id.tvShow);
        Intent i = getIntent();
        tvShow.setText(i.getStringExtra("MSG").toString());;

    }
}
