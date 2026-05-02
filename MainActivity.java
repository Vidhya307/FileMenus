package com.example.menuapp;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
public class MainActivity extends AppCompatActivity {
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
// Setup Toolbar
Toolbar toolbar = findViewById(R.id.toolbar);
setSupportActionBar(toolbar);
}
// Create Menu
@Override
public boolean onCreateOptionsMenu(Menu menu) {
getMenuInflater().inflate(R.menu.menu_main, menu);
return true;
}
// Handle Menu Clicks
@Override
public boolean onOptionsItemSelected(MenuItem item) {
if (item.getItemId() == R.id.menu_new) {
Toast.makeText(this, "New Clicked", Toast.LENGTH_SHORT).show();
return true;
}
if (item.getItemId() == R.id.menu_open) {
Toast.makeText(this, "Open Clicked", Toast.LENGTH_SHORT).show();
return true;
}
return super.onOptionsItemSelected(item);
}
}

Explain this line by line
