package ru.arkasha.navigationcomponent

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class ListScreen : Fragment(R.layout.s_list) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        view.setOnClickListener {
            findNavController().navigate(ListScreenDirections.actionListToSupportActivity())
        }

        view.findViewById<View>(R.id.bShowDetails).setOnClickListener {
            findNavController().navigate(ListScreenDirections.actionListToDetailsScreen(1L))
        }
    }

}