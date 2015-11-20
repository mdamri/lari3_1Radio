package com.app.ppt.yousoft.radiotn;

//benammarrouaa

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public int foo()
    {
        int i=0;
        for(int j=0;j<5; j++)
        {
            i=i+j;
        }
        return i;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    //abidi zohra
    private void ListeStationRadio()
    {TextView1.Text = "Radio Sfax ";
     TextView2.Text =" depuis le 8 décembre 1961 ; diffusant dans le Centre et le Sud-Est en arabe/" +
                     "Sfax 106.6 MHz, Ghrayba 106.6, Mahress 88.5, Skhira 89.0, Ksour Essef 100.2, Tarza 100.8";
     ImageView.src="C:\\Users\\dell\\AndroidStudioProjects\\image.jpg";
     Button.Text="Play";
    }
//abidi zohra12

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
