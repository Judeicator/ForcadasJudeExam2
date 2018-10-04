package jude.forcadas.com.forcadasjudeexam1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
    }

    public void Magic(View Virtual){
        Intent Shift;

        if(Virtual.getId() == R.id.previousButton){
            Shift = new Intent(this, MainActivity.class);
            startActivity(Shift);
        }
    }
}
