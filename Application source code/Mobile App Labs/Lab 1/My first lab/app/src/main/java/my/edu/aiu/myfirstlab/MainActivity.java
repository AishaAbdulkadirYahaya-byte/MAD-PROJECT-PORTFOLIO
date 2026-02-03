package my.edu.aiu.myfirstlab;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private TextView labelWelcome;
    private EditText editNameBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        labelWelcome = (TextView) findViewById(R.id.lblWelcome);
        Button buttonSubmit = (Button) findViewById(R.id.Btnsubmit);
        editNameBox = (EditText) findViewById(R.id.editName);


        labelWelcome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                labelWelcome.setText("Albukhary International University");
            }
        });

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Name = editNameBox.getText().toString().trim();
                Toast message = Toast.makeText(getBaseContext(), "welcome," + Name, Toast.LENGTH_LONG);
                message.show();
            }
        });





    }
}