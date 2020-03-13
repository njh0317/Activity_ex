package si.unil_lj.fri.pbd.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }

    public void registerUser(View view)
    {
        EditText t = (EditText)findViewById(R.id.edit_name);
        if ( t.getText().toString().length() == 0 ) {
            t.setError("Error");
        }
        else {
            Intent intent = new Intent(this, ProfileActivity.class);
            intent.putExtra("EXTRA_NAME", t.getText().toString());
            startActivity(intent);
        }



    }

}

