package ma.saficity.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView text_prnom;
    private TextView text_nom;
    private TextView text_age;

    public MainActivity2() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        text_prnom = findViewById(R.id.text_prnom);
        text_nom = findViewById(R.id.text_nom);
        text_age = findViewById(R.id.text_age);

        String mypnom = getIntent().getStringExtra("keypnom");
        String mynom = getIntent().getStringExtra("keynom");
        String myage = getIntent().getStringExtra("keyage");

        text_prnom.setText(mypnom);
        text_nom.setText(mynom);
        text_age.setText(myage);



    }
}