package com.napa.foodstorechallengechapter3.presentation.fragmenthome.adapter

import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.napa.foodstorechallengechapter3.model.Menu
import com.napa.foodstorechallengechapter3.core.ViewHolderBinder
import com.napa.foodstorechallengechapter3.databinding.ItemGridMenuBinding
import com.napa.foodstorechallengechapter3.databinding.ItemLinearMenuBinding


private fun Double.formatCurrency(currencySymbol: String): String {
    val formattedAmount = String.format("%, .0f").replace(",",".")
    return "$currencySymbol $formattedAmount"
}

class LinearMenuItemViewHolder(
    private val binding : ItemLinearMenuBinding,
    private val onClickListener : (Menu) -> Unit
) : RecyclerView.ViewHolder(binding.root),ViewHolderBinder<Menu>{
    override fun bind(item: Menu) {
        binding.ivMenu.load(item.img){
            crossfade(true)
        }
        binding.tvMenuName.text = item.name
        binding.tvPriceMenu.text = item.price.formatCurrency("Rp. ")
        binding.root.setOnClickListener{
            onClickListener.invoke(item)
        }
    }
}

class GridMenuItemViewHolder(
    private val binding : ItemGridMenuBinding,
    private val onClickListener : (Menu) -> Unit
) : RecyclerView.ViewHolder(binding.root),ViewHolderBinder<Menu>{
    override fun bind(item: Menu) {
        binding.ivMenu.load(item.img){
            crossfade(true)
        }
        binding.tvMenuName.text = item.name
        binding.tvPriceMenu.text = item.price.formatCurrency("Rp. ")
        binding.root.setOnClickListener{
            onClickListener.invoke(item)
        }
    }
}