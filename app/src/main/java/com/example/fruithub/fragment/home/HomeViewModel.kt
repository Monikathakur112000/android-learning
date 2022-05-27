package com.example.fruithub.fragment.home


import androidx.lifecycle.ViewModel
import com.example.fruithub.R

import com.example.fruithub.data.HomeFragmentDataClass


class HomeViewModel:ViewModel(){


    var list = mutableListOf<HomeFragmentDataClass>()


    fun addItem() {
        list.add( HomeFragmentDataClass(R.string.honeyLimeCombo,
            R.drawable.honey_limbo_combo_image,
            R.string.comboAmount)
            )
        list.add(
            HomeFragmentDataClass(R.string.berryCombo,
                R.drawable.berry_mango_combo_image,
                R.string.comboAmount)
        )
        list.add(
            HomeFragmentDataClass(R.string.quinoaFruitSalad,
            R.drawable.quinoa_fruit_salad,
            R.string.amount)
        )
        list.add(
            HomeFragmentDataClass( R.string.tropicalFruitSalad,
                R.drawable.tropical_fruit_salad,
                R.string.amount)
        )

    }


}






