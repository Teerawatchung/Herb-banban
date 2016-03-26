package ubru.sabaipon.teerawat.apichat.herbbanban;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }   // main method

    public void ClickSignInMain(View view) {

    }

    public void ClickSignUpMain(View view) {
        startActivity(new Intent(MainActivity.this, SignUpActivity.class));
    }

    public void ClickGuest(View view) {
        startActivity(new Intent(MainActivity.this, ReadAllHerbActivity.class));
    }
}   // main class
