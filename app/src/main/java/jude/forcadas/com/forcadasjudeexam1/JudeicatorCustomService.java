package jude.forcadas.com.forcadasjudeexam1;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

public class JudeicatorCustomService extends IntentService{
    public JudeicatorCustomService() {
        super("JudeicatorCustomService");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.d("JUDEICATOR", "J U D E I C A TO R _ S E R V I C E _ I S _ R U N N I N G");
    }
}
