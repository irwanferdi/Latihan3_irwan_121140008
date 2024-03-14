package com.example.latihan3pam
import DialogExample
import FragmentTest
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.latihan3pam.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.textView.text = "Hello, View Binding!"
        binding.button1.setOnClickListener {
            Log.d("MainActivity", "Button clicked")
            val dialog = DialogExample(this)
            dialog.show()
            val fragment = FragmentTest()
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit()
        }
    }
}
