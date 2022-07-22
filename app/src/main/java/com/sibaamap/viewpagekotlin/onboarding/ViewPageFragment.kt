package com.sibaamap.viewpagekotlin.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sibaamap.viewpagekotlin.R
import com.sibaamap.viewpagekotlin.onboarding.screen.FirstScreen
import com.sibaamap.viewpagekotlin.onboarding.screen.SecondScreen
import com.sibaamap.viewpagekotlin.onboarding.screen.ThirdFragment
import kotlinx.android.synthetic.main.fragment_view_page.view.*


class ViewPageFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_view_page, container, false)

        val fragmentList = arrayListOf<Fragment>(
            FirstScreen(),
            SecondScreen(),
            ThirdFragment()

        )

        val adapter = ViewPageAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )

        view.viewpage.adapter = adapter

        return view
    }

}