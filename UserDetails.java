package hk.ust.cse.comp107x.linkedinhack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserDetails extends AppCompatActivity {
    private Button USubmitDetails;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_details);
        USubmitDetails=(Button)findViewById(R.id.Usubmitbutton);


        USubmitDetails.setOnClickListener(new View.OnClickListener() {




            @Override
            public void onClick(View v) {
                Intent i = new Intent(UserDetails.this,UserAccount.class);
                startActivity(i);

            }
        });
    }
}
