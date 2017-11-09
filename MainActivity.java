package hk.ust.cse.comp107x.linkedinhack;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button CompanysignIn,UsersignIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CompanysignIn=(Button)findViewById(R.id.companyLogin);
        UsersignIn=(Button)findViewById(R.id.UserLogin);

        CompanysignIn.setOnClickListener(new View.OnClickListener() {




            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,CompanyLogin.class);
                startActivity(i);

            }
        });

        UsersignIn.setOnClickListener(new View.OnClickListener() {




            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,UserLogin.class);
                startActivity(i);

            }
        });

    }
}
