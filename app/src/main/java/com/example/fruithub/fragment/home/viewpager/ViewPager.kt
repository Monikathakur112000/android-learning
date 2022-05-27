package com.example.fruithub.fragment.home.viewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.fruithub.fragment.home.tabfragment.HottestTab


class ViewPager(supportFragmentManager: FragmentManager, lifecycle: Lifecycle) :
FragmentStateAdapter(supportFragmentManager, lifecycle) {

    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            1 -> HottestTab()
            2 -> HottestTab()
            else -> {
             HottestTab()
            }

        }
    }



}



/*
class ViewPager(fm: FragmentManager) :
    FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        var fragment: Fragment? = null
        if (position == 0) {
            fragment = HottestTab()
        } else if (position == 1) {
            fragment = PopularTab()
        }
        return fragment
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getPageTitle(position: Int): CharSequence? {
        var title: String? = null
        if (position == 0) {
            title = "Tab-1"
        } else if (position == 1) {
            title = "Tab-2"
        }
        return title
    }
}
*/
