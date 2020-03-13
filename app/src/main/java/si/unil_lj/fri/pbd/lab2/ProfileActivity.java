package si.unil_lj.fri.pbd.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ProfileActivity extends AppCompatActivity {

    Button button1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Intent intent = getIntent();
        String fullName = intent.getStringExtra("EXTRA_NAME");
        TextView textview2 = (TextView)findViewById(R.id.edit_name);
        textview2.setText(fullName);
        button1 = (Button)findViewById(R.id.msgButton);

        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Context context = getApplicationContext();
                EditText editMsg = (EditText) findViewById(R.id.edit_msg);
                String msg = editMsg.getText().toString();
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(context, msg, duration);
                toast.show();
            }
        });

    }
}
