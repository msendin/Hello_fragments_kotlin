package udl.eps.demos.hello_fragments_kotlin

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.Fragment
import androidx.fragment.app.ListFragment
import java.util.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ListFrag.newInstance] factory method to
 * create an instance of this fragment.
 */
class ListFrag : ListFragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onViewCreated(v: View, savedInstanceState: Bundle?) {
        super.onViewCreated(v, savedInstanceState)
        val values =
            arrayOf("Enterprise", "Star Trek", "Next Generation", "Deep Space 9", "Voyager")
        val adapter = ArrayAdapter(requireActivity(), android.R.layout.simple_list_item_1, values)
        listAdapter = adapter
    }

    override fun onListItemClick(l: ListView, v: View, position: Int, id: Long) {
        val item = Objects.requireNonNull(listAdapter)?.getItem(position) as String
        val frag =
            requireActivity().supportFragmentManager.findFragmentById(R.id.frag_capt) as DetailFrag?
        frag?.showText(getCapt(item))
    }

    private fun getCapt(ship: String): String {
        if (ship.lowercase(Locale.getDefault()).contains("enterprise")) {
            return "Johnathan Archer"
        }
        if (ship.lowercase(Locale.getDefault()).contains("star trek")) {
            return "James T. Kirk"
        }
        if (ship.lowercase(Locale.getDefault()).contains("next generation")) {
            return "Jean-Luc Picard"
        }
        if (ship.lowercase(Locale.getDefault()).contains("deep space 9")) {
            return "Benjamin Sisko"
        }
        return if (ship.lowercase(Locale.getDefault()).contains("voyager")) {
            "Kathryn Janeway"
        } else "???"
    }

}