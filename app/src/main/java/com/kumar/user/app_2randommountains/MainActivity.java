package com.kumar.user.app_2randommountains;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView= (TextView) findViewById(R.id.textView);
        button= (Button) findViewById(R.id.button);
        final String[] mountains={"Everst","Kelimenjaro","kamet","Trivor","k12","Ultar","mana"};
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random=new Random();
                int randomnum=random.nextInt(mountains.length);
                textView.setText(mountains[randomnum]);
            }
        });
    }
}
