package com.example.moviles1.ui.Peliculas

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.moviles1.R

class Peliculas : Fragment() {

    companion object {
        fun newInstance() = Peliculas()
    }

    private lateinit var viewModel: PeliculasViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.peliculas_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(PeliculasViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
