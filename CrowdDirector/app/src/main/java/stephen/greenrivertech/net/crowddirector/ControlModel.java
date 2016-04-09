package stephen.greenrivertech.net.crowddirector;

import android.view.View;
import android.widget.ImageView;

import java.util.Random;

/**
 * Created by Stephen on 4/7/2016.
 */
public class ControlModel {

    //create new randomizer object
    Random rand = new Random();


    /**
     * Constructor
     */
    public ControlModel(){

    }


    /**
     * Randomly determine which image to switch next
     * @param right
     * @param left
     * @return
     */
    public ImageView MakeRandomSelection(ImageView right, ImageView left){
        if(rand.nextInt(101) >= 50){
            return right;
        }
        return left;
    }



}
