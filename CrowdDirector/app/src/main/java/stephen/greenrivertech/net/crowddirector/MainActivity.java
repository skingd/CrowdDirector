package stephen.greenrivertech.net.crowddirector;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageButton engageButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        engageButton = (ImageButton)findViewById(R.id.stop);

        engageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        ImageView rightArrow = (ImageView)findViewById(R.id.right_arrow_animated);
        ((AnimationDrawable) rightArrow.getBackground()).start();
        rightArrow.setVisibility(View.INVISIBLE);


        ImageView leftArrow = (ImageView)findViewById(R.id.left_arrow_animated);
        ((AnimationDrawable) leftArrow.getBackground()).start();
        leftArrow.setVisibility(View.INVISIBLE);
    }
}
