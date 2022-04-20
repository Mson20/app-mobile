package fr.sam.splashscreenfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import fr.sam.splashscreenfinal.MainActivity;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        // rediriger vers la page principale "MainActivity" après 3 secondes.
        Runnable runnable= new Runnable() {
            @Override
            public void run() {
                // demarrer une page
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        };

        // handler post delayed
        new Handler().postDelayed(runnable, 3000);
    }
}