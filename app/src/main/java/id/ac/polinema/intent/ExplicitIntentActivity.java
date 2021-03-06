package id.ac.polinema.intent;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ExplicitIntentActivity extends AppCompatActivity {

    public EditText nameInput;
    public TextView outputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent);
        nameInput = findViewById(R.id.input_name);
        outputText = findViewById(R.id.text_output);
    }

    public void handleSubmit(View view) {
        outputText.setText(String.format("Hallo Bos %s, Semoga Kabarmu Baik.", nameInput.getText().toString()));
        //outputText.setText("Hallo Bos " + nameInput.getText().toString() + " Semoga Kabarmu Baik");
    }
}
