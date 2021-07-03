package ru.arkasha.navigationcomponent.login

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import ru.arkasha.navigationcomponent.MainScreenDirections
import ru.arkasha.navigationcomponent.R

class CodeLoginScreen : Fragment(R.layout.s_login_code) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        view.findViewById<View>(R.id.bShowGlobal).setOnClickListener {
            findNavController().navigate(MainScreenDirections.actionGlobalGlobalScreen())
        }
    }

}