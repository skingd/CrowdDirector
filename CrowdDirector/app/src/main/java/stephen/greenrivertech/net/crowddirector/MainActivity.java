package stephen.greenrivertech.net.crowddirector;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView rightArrow = (ImageView)findViewById(R.id.right_arrow_animated);
        ((AnimationDrawable) rightArrow.getBackground()).start();
    }
}
