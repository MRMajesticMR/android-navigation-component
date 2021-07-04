package ru.arkasha.navigationcomponent

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs

class DetailsScreen : Fragment(R.layout.s_details) {

    private val args: DetailsScreenArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        view.findViewById<TextView>(R.id.tvTextDetails)?.text = "Details ${args.userId}"
    }

}