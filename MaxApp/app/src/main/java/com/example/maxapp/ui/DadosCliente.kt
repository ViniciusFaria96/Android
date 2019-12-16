package com.example.maxapp.ui

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment

import com.example.maxapp.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class DadosCliente : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_dados_cliente, container, false)
    }
}