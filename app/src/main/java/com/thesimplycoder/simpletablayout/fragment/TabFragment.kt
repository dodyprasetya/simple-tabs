package com.thesimplycoder.simpletablayout.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.thesimplycoder.simpletablayout.R
import kotlinx.android.synthetic.main.fragment_tab.*

class TabFragment : Fragment() {

    companion object {

        fun newInstance(title: String): Fragment {

            // set argument
            val args = Bundle()
            args.putString("arg_title", title)

            // init fragment
            val fragment = TabFragment()
            fragment.arguments = args

            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_tab, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // get title argument
        val title = arguments?.getString("arg_title")

        // display the title to TextView
        tvTitle.text = title
    }
}