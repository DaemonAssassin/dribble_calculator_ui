package beast.mateenmehmood.customresources;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivityDark extends AppCompatActivity {
    AppCompatButton lightEqualButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dark);

        lightEqualButton = findViewById(R.id.light_equal_btn);
        lightEqualButton.setOnClickListener(v -> {
            Toast.makeText(MainActivityDark.this, "Changing to dark mode", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivityDark.this, MainActivity.class);
            startActivity(intent);
        });
    }
}