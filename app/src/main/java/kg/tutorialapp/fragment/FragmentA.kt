package kg.tutorialapp.fragment

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_a.*

class FragmentA: Fragment(R.layout.fragment_a) {

    private lateinit var listener: FragmentAListener

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val textFromArgument = arguments?.getString("String")

        tv_text.text = textFromArgument

        button2.setOnClickListener {
            listener.ShowToast()
        }

    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        if (context is FragmentAListener) listener = context
    }

    companion object{
        const val  TAG = "A"
    }
}