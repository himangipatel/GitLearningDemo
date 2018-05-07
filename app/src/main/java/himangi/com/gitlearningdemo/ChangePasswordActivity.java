package himangi.com.gitlearningdemo;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Darshna Desai on 7/5/18.
 */

public class ChangePasswordActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);
        initHimangi();
        initDarshna();
    }

    private void initDarshna() {

        initHimangi();
    }

    private void initHimangi() {

    }
}
