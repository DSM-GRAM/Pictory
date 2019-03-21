package com.gram.pictory.Activity

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import com.gram.pictory.Fragment.FeedFragment
import com.gram.pictory.Fragment.MypageFragment
import com.gram.pictory.Fragment.PostFragment
import com.gram.pictory.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().run {
            replace(R.id.main_framelayout, FeedFragment())
            commit()
        }
        mainNaviView.setOnNavigationItemSelectedListener(navigationItemSelectedListener)

    }

    private val navigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        val transaction = supportFragmentManager.beginTransaction()
        when (item.itemId) {
            R.id.menu_feed -> {
                transaction.replace(R.id.main_framelayout, FeedFragment())
                transaction.commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.menu_post -> {
                transaction.replace(R.id.main_framelayout, PostFragment())
                transaction.commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.menu_mypage -> {
                transaction.replace(R.id.main_framelayout, MypageFragment())
                transaction.commit()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }
}
