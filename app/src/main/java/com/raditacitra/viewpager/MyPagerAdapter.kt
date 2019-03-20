package com.raditacitra.viewpager
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
class MyPagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm){
    // sebuah list yang menampung objek Fragment
    private val pages = listOf(
        FirstFragment(), SecondFragment(), ThirdFragment(), FourthFragment()
    )
    // menentukan fragment yang akan dibuka pada posisi tertentu
    override fun getItem(position: Int): Fragment {
        return pages[position]
    }
    override fun getCount(): Int {
        return pages.size
    }
    // judul untuk tabs
    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "About Me"
            1 -> "Galery"
            2 -> "Influencer Favourite"
            else -> "Favourite City"
        }
    }
}
