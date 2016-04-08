package stephen.greenrivertech.net.crowddirector;

import android.view.View;
import android.widget.ImageView;

/**
 * Created by Stephen on 4/7/2016.
 */
public class ControlModel {

    public ControlModel(){

    }

    public void SwitchVisability(View currentVisible, View nextVisible){

        //Set the current view object to invisible
        currentVisible.setVisibility(View.INVISIBLE);

        //Activate the next view object
        nextVisible.setVisibility(View.VISIBLE);
    }

}
