package ru.arkasha.navigationcomponent

import android.os.Bundle
import android.view.View
import androidx.fragment.app.DialogFragment
import androidx.navigation.fragment.findNavController

class AppDialogFragment : DialogFragment(R.layout.df_app) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        view.findViewById<View>(R.id.button).setOnClickListener {
            findNavController().navigate(AppDialogFragmentDirections.actionAppDialogFragmentToList())
        }
    }


}