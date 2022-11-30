package ru.myitschool.lab23

import android.os.Bundle
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import ru.myitschool.lab23.databinding.ActivityMainBinding
import java.nio.file.Files.find

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(getLayoutInflater())
        setContentView(binding.root)


        val mainTexts = findViewById<TextView>(R.id.main_text)
        mainTexts.setText(R.string.main_text)
        val container: ViewGroup = findViewById(R.id.outer_layout)
        val views = container.childCount
//        Toast.makeText(this, "landscape", Toast.LENGTH_LONG).show();
        Toast.makeText(this,"$views",Toast.LENGTH_LONG).show()

//        ViewGroup root = (ViewGroup) findViewById(android.R.id.coordinatorLayout)
//        int contentChildrenCount = root.getChildCount()
    }
}