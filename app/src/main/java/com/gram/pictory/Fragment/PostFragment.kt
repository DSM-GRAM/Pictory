package com.gram.pictory.Fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gram.pictory.R
import kotlinx.android.synthetic.main.snippet_top_gallerytoolbar.*

class PostFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view = inflater.inflate(R.layout.fragment_post, container, false)
        tvNext.setOnClickListener {

        }
        return view
    }
}