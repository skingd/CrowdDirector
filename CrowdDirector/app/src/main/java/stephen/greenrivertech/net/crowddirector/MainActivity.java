package stephen.greenrivertech.net.crowddirector;

import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private View currentVisible;
    ControlModel controlModel = new ControlModel();

    //Create new handler object
    Handler handler = new Handler();

    //This will be the object that is currently visible
    View currentlyVisible;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create right arrow image view
        final ImageView rightArrow = (ImageView)findViewById(R.id.right_arrow_animated);
        ((AnimationDrawable) rightArrow.getBackground()).start();
        rightArrow.setVisibility(View.INVISIBLE);

        //create left arrow image view
        final ImageView leftArrow = (ImageView)findViewById(R.id.left_arrow_animated);
        ((AnimationDrawable) leftArrow.getBackground()).start();
        leftArrow.setVisibility(View.INVISIBLE);

        //Create engage button and click listener
        final ImageButton engageButton;
        engageButton = (ImageButton)findViewById(R.id.stop);

        //Set the image button as visible by default
        currentlyVisible = engageButton;

        //engageButton click listener
        engageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Switch the visible images. This requires the left and right image view to be passed through
               currentlyVisible = controlModel.MakeRandomSelection(rightArrow, leftArrow);

                //Switch visible objects
                engageButton.setVisibility(View.INVISIBLE);
                currentlyVisible.setVisibility(View.VISIBLE);


                handler.postDelayed(new Runnable() {
                    public void run() {

                        //Remove current arrow
                        currentlyVisible.setVisibility(View.INVISIBLE);

                        //set the ImageButton to be visible again and set it as the currently visible graphic
                        engageButton.setVisibility(View.VISIBLE);
                        currentlyVisible = engageButton;

                    }
                }, 2000);
            }
        });


    }
}
