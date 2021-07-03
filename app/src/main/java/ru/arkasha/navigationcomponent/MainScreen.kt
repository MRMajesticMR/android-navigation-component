package ru.arkasha.navigationcomponent

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class MainScreen : Fragment(R.layout.s_main) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        view.setOnClickListener {
            findNavController().navigate(MainScreenDirections.actionMainToAppDialogFragment())
        }

        view.findViewById<View>(R.id.bLogin).setOnClickListener {
            findNavController().navigate(MainScreenDirections.actionMainToEmailLoginScreen())
        }

        view.findViewById<View>(R.id.bGlobal).setOnClickListener {
            findNavController().navigate(MainScreenDirections.actionGlobalGlobalScreen())
        }
    }

}