package com.example.cuamatzi.menuoverflow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //metodo para mostrar y ocultar el menú

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.esquina,menu);
        return  true;
    }

    //Asignacion de "funciones"

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id =  item.getItemId();


        if (id ==  R.id.Item1){
            Toast.makeText(this,"Opcion 1",Toast.LENGTH_SHORT).show();
        }else if (id ==  R.id.Item2){
            Toast.makeText(this,"Opcion 2",Toast.LENGTH_SHORT).show();
        }else  if (id ==  R.id.Item3){
            Toast.makeText(this,"Opcion 3",Toast.LENGTH_SHORT).show();
        }
        return  super.onOptionsItemSelected(item);
    }
}
