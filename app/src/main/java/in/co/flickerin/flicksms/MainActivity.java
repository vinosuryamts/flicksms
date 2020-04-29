package in.co.flickerin.flicksms;

import androidx.appcompat.app.AppCompatActivity;
import in.co.flickerin.flicksms.cutomcodes.SetDynamicFonts;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
