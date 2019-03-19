package com.gram.pictory.Activity.Activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import com.gram.pictory.Activity.Fragment.FeedFragment
import com.gram.pictory.Activity.Fragment.MypageFragment
import com.gram.pictory.Activity.Fragment.PostFragment
import com.gram.pictory.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.main_navigation_menu, menu)
    }

    override fun onContextItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            R.id.menu_feed -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.main_framelayout, FeedFragment())
                    .commit()
            }
            R.id.menu_post -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.main_framelayout, PostFragment())
                    .commit()
            }
            R.id.menu_mypage -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.main_framelayout, MypageFragment())
                    .commit()
            }
        }

        return super.onContextItemSelected(item)
    }
}
