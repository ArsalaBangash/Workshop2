package com.arsalabangash.android.androidworkshop2.ui


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.Toast
import com.arsalabangash.android.androidworkshop2.R
import kotlinx.android.synthetic.main.fragment_add_contact.view.*


class AddContactFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        return inflater!!.inflate(R.layout.fragment_add_contact, container, false)
    }

    companion object {
        fun newInstance(): AddContactFragment {
            return AddContactFragment()
        }
    }
}
