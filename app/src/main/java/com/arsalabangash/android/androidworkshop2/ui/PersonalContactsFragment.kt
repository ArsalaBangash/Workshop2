package com.arsalabangash.android.androidworkshop2.ui


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.arsalabangash.android.androidworkshop2.R


/**
 * A simple [Fragment] subclass.
 */
class PersonalContactsFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_personal_contacts, container, false)
    }

    companion object {
        fun newInstance(): PersonalContactsFragment {
            return PersonalContactsFragment()
        }
    }

}// Required empty public constructor
