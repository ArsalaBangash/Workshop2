package com.arsalabangash.android.androidworkshop2.ui


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.arsalabangash.android.androidworkshop2.R



class WorkContactsFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_work_contacts, container, false)
    }

    companion object {
        fun newInstance(): WorkContactsFragment {
            return WorkContactsFragment()
        }
    }

}// Required empty public constructor
