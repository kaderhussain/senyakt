package com.kdr.senyatest.ui.fragment

import androidx.fragment.app.Fragment
import com.kdr.senyatest.MainActivity

abstract class BaseFragment : Fragment() {

    protected val navController by lazy {
        (activity as MainActivity).navController
    }

}