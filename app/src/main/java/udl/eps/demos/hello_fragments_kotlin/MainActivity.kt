package udl.eps.demos.hello_fragments_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import udl.eps.demos.hello_fragments_kotlin.databinding.ActivityMainBinding
import udl.eps.demos.hello_fragments_kotlin.databinding.DetailFragmentBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //val frag = childFragmentManager.findFragmentById(binding.frag_capt.id) as Fragment

        //setContentView(R.layout.activity_main)
    }
}