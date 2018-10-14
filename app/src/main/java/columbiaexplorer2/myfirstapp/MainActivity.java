package columbiaexplorer2.myfirstapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

import columbiaexplorer.myfirstapp.Main2Activity;


public class MainActivity extends Activity
{
    Button button1,button2;
    EditText username,password;

    TextView tx1;
    int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTheme(R.style.splashScreenTheme);

        button1 = (Button)findViewById(R.id.button1);
        username = (EditText)findViewById(R.id.editText);
        password = (EditText)findViewById(R.id.editText2);

        button2 = (Button)findViewById(R.id.button2);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Main2Activity.class);
                if(username.getText().toString().equals("chrmead") &&
                        password.getText().toString().equals("Christi@n20"))
                {
                    startActivity(i);
                }

                else
                    {
                    Toast.makeText(getApplicationContext(),
                            "Wrong Username or Password",Toast.LENGTH_SHORT).show();

                    }
                }

        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        }
        );
    }


    }

