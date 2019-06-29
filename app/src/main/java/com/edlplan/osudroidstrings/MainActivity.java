package com.edlplan.osudroidstrings;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editText = findViewById(R.id.resId);
        final TextView textView = findViewById(R.id.info);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Class klass = R.string.class;
                try {
                    if (klass.getDeclaredField(s.toString()) != null) {
                        int id = klass.getDeclaredField(s.toString()).getInt(null);
                        textView.setText(id);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("edit " + s);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }
}
