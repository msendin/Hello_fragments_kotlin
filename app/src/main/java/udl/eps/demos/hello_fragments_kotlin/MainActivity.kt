package udl.eps.demos.hello_fragments_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import udl.eps.demos.hello_fragments_kotlin.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}


