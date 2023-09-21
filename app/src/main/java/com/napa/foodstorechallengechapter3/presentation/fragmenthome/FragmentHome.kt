package com.napa.foodstorechallengechapter3.presentation.fragmenthome

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.napa.foodstorechallengechapter3.R
import androidx.recyclerview.widget.GridLayoutManager
import com.napa.foodstorechallengechapter3.data.MenuDataSource
import com.napa.foodstorechallengechapter3.data.MenuDataSourceImpl
import com.napa.foodstorechallengechapter3.databinding.FragmentHomeBinding
import com.napa.foodstorechallengechapter3.model.Menu
import com.napa.foodstorechallengechapter3.presentation.fragmenthome.adapter.AdapterLayoutMode
import com.napa.foodstorechallengechapter3.presentation.fragmenthome.adapter.MenuListAdapter

class FragmentHome : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    private val datasource: MenuDataSource by lazy {
        MenuDataSourceImpl()
    }

    private val adapter: MenuListAdapter by lazy {
        MenuListAdapter(AdapterLayoutMode.LINEAR) {menu: Menu ->
            navigateToDetail(menu)
        }
    }

    private fun navigateToDetail(menu: Menu) {
        findNavController().navigate(
            FragmentHomeDirections.actionFragmentHomeToFragmentDetail(menu)
        )

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupList()
        setupSwitch()
    }

    private fun setupList() {
        val span = if(adapter.adapterLayoutMode == AdapterLayoutMode.LINEAR) 1 else 2
        binding.rvMenu.apply {
            layoutManager = GridLayoutManager(requireContext(),span)
            adapter = this@FragmentHome.adapter
        }
        adapter.submitData(datasource.getMenus())
    }

    private fun setupSwitch() {
        binding.switchListGrid.setOnCheckedChangeListener { _, isChecked ->
            (binding.rvMenu.layoutManager as GridLayoutManager).spanCount = if (isChecked) 2 else 1
            adapter.adapterLayoutMode = if(isChecked) AdapterLayoutMode.GRID else AdapterLayoutMode.LINEAR
            adapter.refreshList()
        }
    }

}