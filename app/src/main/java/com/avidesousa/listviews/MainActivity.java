package com.avidesousa.listviews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lsyALumno=findViewById(R.id.lsdAlumno);

        String misalumnos[]=new String[]{"Elia","Rodrigo","Sergio","Marcos","Alvaro"};

        ArrayAdapter<String> miAdaptador=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_multiple_choice,misalumnos);

        lsyALumno.setAdapter(miAdaptador);
        lsyALumno.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //TextView t=(TextView) view;
                //String nombre=t.getText().toString();
                //String nombre =misalumnos[position];

                SparseBooleanArray checkd=lsyALumno.getCheckedItemPositions();
                if(checkd!=null){
                    for(int i=0; i<checkd.size();i++){
                        Log.d("Ribera del tajo",lsyALumno.getItemAtPosition(checkd.keyAt(1)).toString());
                    }
                }


            }
        });
    }
}