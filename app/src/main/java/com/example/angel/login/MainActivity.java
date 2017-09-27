package com.example.angel.login;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    private EditText nameId;
    private EditText passId;
    private Button buttonId;
    private TextView answerId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameId = (EditText) findViewById(R.id.nameId);
        passId = (EditText) findViewById(R.id.passId);
        buttonId = (Button) findViewById(R.id.buttonId);
        answerId = (TextView) findViewById(R.id.answerId);

        buttonId.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(nameId.getText().toString().equals("admin") && passId.getText().toString().equals("admin")){
        answerId.setText("Correct");
            //correcct password
        }else{
            answerId.setText("Wrong");
            //wrong password
        }
    }
}
