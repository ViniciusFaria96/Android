package com.example.maxapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.maxapp.R
import kotlinx.android.synthetic.main.menu_principal.*

class MenuPrincipal : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.menu_principal, container, false)
    }
    override fun onResume() {
        super.onResume()

        btn_pessoas.setOnClickListener{
            findNavController().navigate(R.id.action_menuPrincipal_to_dadosCliente)
        }

        btn_pedidos.setOnClickListener{
            findNavController().navigate(R.id.action_menuPrincipal_to_histPedidos)
        }
    }
}