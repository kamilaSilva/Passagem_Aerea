package passagem_aerea.android.dominando.passagem_aerea;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.io.Serializable;


public class MainActivity extends ActionBarActivity   {


   static Spinner paises;
    static Spinner estados;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        paises = (Spinner) findViewById(R.id.spinSO);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.paises , android.R.layout.simple_spinner_item);

        paises.setAdapter(adapter);

        estados = (Spinner) findViewById(R.id.spinSO);
        ArrayAdapter adapter1 = ArrayAdapter.createFromResource(this, R.array.paises , android.R.layout.simple_spinner_item);

        estados.setAdapter(adapter1);




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

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
    public final static String EXTRA_MESSAGE="br.usjt.MESSAGE";

    public void sendMessage(View view){

        Intent intent = new Intent(this, DisplayMessageActivity.class);



        startActivity(intent);



    }





}
