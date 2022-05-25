package com.example.besmartonlinelearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Learning extends AppCompatActivity implements View.OnClickListener{
    Button a;
    Button b;
    Button c;
    Button d;
    Button e;
    Button f;
    Button g;
    Button h;
    Button i;
    Button j;
    Button k;
    Button l;
    Button m;
    Button n;
    Button o;
    Button p;
    Button q;
    Button r;
    Button s;
    Button t;
    Button u;
    Button v;
    Button w;
    Button x;
    Button y;
    Button z;
    private static final String TAG="ActivityLearn";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a=findViewById(R.id.button);
        b=findViewById(R.id.button4);
        c=findViewById(R.id.button2);
        d=findViewById(R.id.button3);
        e=findViewById(R.id.button5);
        f=findViewById(R.id.button6);
        g=findViewById(R.id.button7);
        h=findViewById(R.id.button8);
        i=findViewById(R.id.button9);
        j=findViewById(R.id.button10);
        k=findViewById(R.id.button11);
        l=findViewById(R.id.button13);
        m=findViewById(R.id.button12);
        n=findViewById(R.id.button14);
        o=findViewById(R.id.button15);
        p=findViewById(R.id.button16);
        q=findViewById(R.id.button17);
        r=findViewById(R.id.button18);
        s=findViewById(R.id.button19);
        t=findViewById(R.id.button20);
        u=findViewById(R.id.button21);
        v=findViewById(R.id.button22);
        w=findViewById(R.id.button23);
        x=findViewById(R.id.button24);
        y=findViewById(R.id.button25);
        z=findViewById(R.id.button26);
        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        d.setOnClickListener(this);
        e.setOnClickListener(this);
        f.setOnClickListener(this);
        g.setOnClickListener(this);
        h.setOnClickListener(this);
        i.setOnClickListener(this);
        j.setOnClickListener(this);
        k.setOnClickListener(this);
        l.setOnClickListener(this);
        m.setOnClickListener(this);
        n.setOnClickListener(this);
        o.setOnClickListener(this);
        p.setOnClickListener(this);
        q.setOnClickListener(this);
        r.setOnClickListener(this);
        s.setOnClickListener(this);
        t.setOnClickListener(this);
        u.setOnClickListener(this);
        v.setOnClickListener(this);
        w.setOnClickListener(this);
        x.setOnClickListener(this);
        y.setOnClickListener(this);
        z.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent itt=new Intent(Learning.this , Alphabets.class);
        switch (view.getId())
        {
            case R.id.button:
                itt.putExtra("input","a");
                break;
            case R.id.button4:
                itt.putExtra("input","b");
                break;
            case R.id.button2:
                itt.putExtra("input","c");
                break;
            case R.id.button3:
                itt.putExtra("input","d");
                break;
            case R.id.button5:
                itt.putExtra("input","e");
                break;
            case R.id.button6:
                itt.putExtra("input","f");
                break;
            case R.id.button7:
                itt.putExtra("input","g");
                break;
            case R.id.button8:
                itt.putExtra("input","h");
                break;
            case R.id.button9:
                itt.putExtra("input","i");
                break;
            case R.id.button10:
                itt.putExtra("input","j");
                break;
            case R.id.button11:
                itt.putExtra("input","k");
                break;
            case R.id.button13:
                itt.putExtra("input","l");
                break;
            case R.id.button12:
                itt.putExtra("input","m");
                break;
            case R.id.button14:
                itt.putExtra("input","n");
                break;
            case R.id.button15:
                itt.putExtra("input","o");
                break;
            case R.id.button16:
                itt.putExtra("input","p");
                break;
            case R.id.button17:
                itt.putExtra("input","q");
                break;
            case R.id.button18:
                itt.putExtra("input","r");
                break;
            case R.id.button19:
                itt.putExtra("input","s");
                break;
            case R.id.button20:
                itt.putExtra("input","t");
                break;
            case R.id.button21:
                itt.putExtra("input","u");
                break;
            case R.id.button22:
                itt.putExtra("input","v");
                break;
            case R.id.button23:
                itt.putExtra("input","w");
                break;
            case R.id.button24:
                itt.putExtra("input","x");
                break;
            case R.id.button25:
                itt.putExtra("input","y");
                break;
            default:
                itt.putExtra("input","z");
        }
        startActivity(itt);
    }
    @Override

    protected void onStart(){
        super.onStart();
        Log.d(TAG, " onStart Learn");
    }

    @Override

    protected void onResume(){
        super.onResume();
        Log.d(TAG, " onResume Learn");
    }

    @Override

    protected void onPause(){
        super.onPause();
        Log.d(TAG, " onPause Learn");
    }

    @Override

    protected void onStop(){
        super.onStop();
        Log.d(TAG, " onStop Learn");
    }

    @Override

    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG, " onDestroy Learn");
    }

    @Override

    protected void onRestart(){
        super.onRestart();
        Log.d(TAG, " onRestart Learn");
    }
}