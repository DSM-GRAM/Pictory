package com.gram.pictory.Fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gram.pictory.Adapter.FeedRvAdapter
import com.gram.pictory.Model.FeedModel
import com.gram.pictory.R
import kotlinx.android.synthetic.main.fragment_feed.*
import org.jetbrains.anko.support.v4.find

class FeedFragment: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view = inflater.inflate(R.layout.fragment_feed, container, false)
        feed_recyclerview.layoutManager = LinearLayoutManager(activity)
        feed_recyclerview.adapter = FeedRvAdapter(arrayListOf(FeedModel("fsdfsd", "sfgsf", 10, 20, "안녕")))
        return view
    }

}