package ru.arkasha.navigationcomponent.login

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import ru.arkasha.navigationcomponent.R

class EmailLoginScreen : Fragment(R.layout.s_login_email) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        view.findViewById<View>(R.id.bSend).setOnClickListener {
            findNavController().navigate(EmailLoginScreenDirections.actionEmailLoginScreenToCodeLoginScreen())
        }
    }

}