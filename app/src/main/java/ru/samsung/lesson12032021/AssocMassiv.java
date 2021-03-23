package ru.samsung.lesson12032021;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;


public class AssocMassiv extends Activity {
    EditText edit_map;
    TextView text_map;
    Button btn_put;
    Map<Integer, User> map = new HashMap<Integer, User>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        edit_map = findViewById(R.id.edit_map);
        text_map = findViewById(R.id.text_map);
        btn_put = findViewById(R.id.btn_put);

        map.put(1,new User("User1",2000));
        map.put(2,new User("User1",2000));

        btn_put.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                map.put((int) (Math.random() * 100),new User((char)(65+(int) (Math.random() * 5))+"User"+(int) (Math.random() * 2), (int) (Math.random() * 2000)));
                text_map.setText(map.toString());
            }
        });


    }
}
