package udl.eps.demos.hello_fragments_kotlin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
//import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
//import udl.eps.demos.hello_fragments_kotlin.databinding.FragmentDetailBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [DetailFrag.newInstance] factory method to
 * create an instance of this fragment.
 */
class DetailFrag : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.detail_fragment, container, false)

        //val binding = DataBindingUtil.inflate<DetailFragmentBinding>(inflater,
           // R.layout.detail_fragment,container,false)
        //return binding.root
    }

    fun showText(item: String?) {
        val view = requireView().findViewById<TextView>(R.id.captain)
        view.text = item
    }

}