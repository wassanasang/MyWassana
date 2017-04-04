package stech.sangsoontorn.wassana.mywassana;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //  Explicit เพื่อประกาศตัวแปร
    //  Access(public private) Type ผint str dub bul)   Name
    private EditText userEditText,passwordEditText;
    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initial View คือการผูกตัวแหร กับ View ที่ อยู่ที่ Activity
        initialView();


    }   //Main Method

    private void initialView() {
        userEditText= (EditText) findViewById(R.id.edtUser);
        passwordEditText = (EditText) findViewById(R.id.edtPassword);
        textView = (TextView) findViewById(R.id.txtRegister);
        button = (Button) findViewById(R.id.btnLogin);
    }
}   //Main Class นี่คือ คลาสหลัก
