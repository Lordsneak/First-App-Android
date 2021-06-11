package ma.saficity.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText pnom;
    private EditText nom;
    private EditText age;
    private Button add;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pnom = findViewById(R.id.pnom);
        nom = findViewById(R.id.nom);
        age = findViewById(R.id.age);
        add = findViewById(R.id.add);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String mypnom = pnom.getText().toString();
                String mynom = nom.getText().toString();
                String myage = age.getText().toString();

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("keypnom", mypnom);
                intent.putExtra("keynom", mynom);
                intent.putExtra("keyage", myage);
                startActivity(intent);

            }
        });
    }
}