package pt.ipt.dama.fragmentstwo

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import pt.ipt.dama.fragmentstwo.fragments.FragmentOne
import pt.ipt.dama.fragmentstwo.fragments.FragmentThree
import pt.ipt.dama.fragmentstwo.fragments.FragmentTwo

/**
 * this class is used to inject fragemnts on activity
 */
class MyNewPagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

    /**
     * Specify the number of framents that yout are goind to use
     */
    override fun getItemCount(): Int {
        return 3
    }

    /**
     * return a new instance of a fragment
     */
    override fun createFragment(position: Int): Fragment {
        return when(position){

            0-> FragmentOne()
            1-> FragmentTwo()
            2-> FragmentThree()

            else -> FragmentOne()
        }
    }

}