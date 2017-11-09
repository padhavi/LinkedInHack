package hk.ust.cse.comp107x.linkedinhack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CompanyDetails extends AppCompatActivity {
    private Button CSubmitDetails;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company_details);


        CSubmitDetails=(Button)findViewById(R.id.Csubmitbutton);

        CSubmitDetails.setOnClickListener(new View.OnClickListener() {




            @Override
            public void onClick(View v) {
                Intent i = new Intent(CompanyDetails.this,CompanyAccount.class);
                startActivity(i);

            }
        });
    }
}
