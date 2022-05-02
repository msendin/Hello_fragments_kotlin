package udl.eps.demos.hello_fragments_kotlin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.fragment.app.Fragment
import udl.eps.demos.hello_fragments_kotlin.databinding.DetailFragmentBinding

class DetailFrag : Fragment() {
    private lateinit var binding: DetailFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DetailFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    fun showText(item: String?) {
        binding.captain.text = item
    }
}