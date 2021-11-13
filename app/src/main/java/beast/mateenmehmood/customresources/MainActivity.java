package beast.mateenmehmood.customresources;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    AppCompatButton darkEqualButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        darkEqualButton = findViewById(R.id.dark_equal_btn);
        darkEqualButton.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, "Changing to light mode", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, MainActivityDark.class);
            startActivity(intent);
        });
    }
}