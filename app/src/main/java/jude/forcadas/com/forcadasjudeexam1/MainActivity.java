package jude.forcadas.com.forcadasjudeexam1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent Magicator = new Intent(this, JudeicatorCustomService.class);
        startService(Magicator);
    }

    public void Magic(View Virtual){
        Intent Shift, Designator;

        if(Virtual.getId() == R.id.nextButton){
            Shift = new Intent(this, ActivityTwo.class);
            startActivity(Shift);
        }

        else if(Virtual.getId() == R.id.mapButton){
            Shift = new Intent(Intent.ACTION_VIEW);
            Shift.setData(Uri.parse("geo:14.610075, 120.991915"));
            Designator = Intent.createChooser(Shift, "Designate Application");
            startActivity(Designator);
        }
    }
}
