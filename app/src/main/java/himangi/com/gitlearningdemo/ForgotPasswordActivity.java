package himangi.com.gitlearningdemo;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class ForgotPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Log.i("Git Checkout", "ForgotPasswordActivity");

            }
        }, 3000);

        Log.i("Git Checkout", "ForgotPasswordActivity");
    }
}
