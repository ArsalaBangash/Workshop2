package com.arsalabangash.android.androidworkshop2.ui

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.arsalabangash.android.androidworkshop2.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        var currentFragment: Fragment? = null
        var personalContactsFragment: Fragment? = null
        var addContactFragment: Fragment? = null
        var workContactsFragment: Fragment? = null

        when (item.itemId) {
            R.id.navigation_add -> {
                if (addContactFragment == null) {
                    addContactFragment = AddContactFragment.newInstance()
                }
                currentFragment = addContactFragment
            }
            R.id.navigation_personal -> {
                if (personalContactsFragment == null) {
                    personalContactsFragment = PersonalContactsFragment.newInstance()
                }
                currentFragment = personalContactsFragment
            }
            R.id.navigation_work -> {
                if (workContactsFragment == null) {
                    workContactsFragment = WorkContactsFragment.newInstance()
                }
                currentFragment = workContactsFragment
            }
        }
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragmentContainer, currentFragment)
        transaction.commit()
        return@OnNavigationItemSelectedListener true
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        mOnNavigationItemSelectedListener.onNavigationItemSelected(navigation.menu.getItem(0))
    }
}
