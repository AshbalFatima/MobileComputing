package com.example.sqlcrud;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name,dep,year;
    Button insert,view,update,delete;
    DBHelper db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        name=findViewById(R.id.item1);
        dep=findViewById(R.id.item2);
        year=findViewById(R.id.item3);


        insert=findViewById(R.id.button);
        view=findViewById(R.id.button4);
        delete=findViewById(R.id.button3);
        update=findViewById(R.id.button2);

        db=new DBHelper(this);

        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String enteredName=name.getText().toString();
                String enteredDep=dep.getText().toString();
                String enteredYear=year.getText().toString();

                Boolean InsertData=db.InsertData(enteredName,enteredDep,enteredYear);
                if(InsertData==true)
                    Toast.makeText(MainActivity.this,"Insertion Completed",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this,"Entry exists",Toast.LENGTH_SHORT).show();

            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String enteredName=name.getText().toString();

                Boolean deleteData=db.DeleteData(enteredName);
                if(deleteData==true)
                    Toast.makeText(MainActivity.this,"Deletion Completed",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this,"Deletion Failed",Toast.LENGTH_SHORT).show();

            }
        });


        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String enteredName=name.getText().toString();
                String enteredDep=dep.getText().toString();
                String enteredYear=year.getText().toString();

                Boolean updateData=db.UpdateData(enteredName,enteredDep,enteredYear);
                if(updateData==true)
                    Toast.makeText(MainActivity.this,"Updation Completed",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this,"Updation Failed",Toast.LENGTH_SHORT).show();
            }
        });


        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor storedData=db.getData();
                if(storedData.getCount()==0)
                {
                    Toast.makeText(MainActivity.this,"No Available Data",Toast.LENGTH_SHORT).show();
                    return;
                }

                StringBuffer data=new StringBuffer();
                while(storedData.moveToNext())
                {
                    data.append("Name: "+storedData.getString(0)+"\n");
                    data.append("Department: "+storedData.getString(1)+"\n");
                    data.append("Year: "+storedData.getString(2)+"\n\n");
                }

                AlertDialog.Builder popUp=new AlertDialog.Builder(MainActivity.this);
                popUp.setTitle("Students Entered");
                popUp.setCancelable(true);
                popUp.setMessage(data.toString());
                popUp.show();

            }
        });
    }
}