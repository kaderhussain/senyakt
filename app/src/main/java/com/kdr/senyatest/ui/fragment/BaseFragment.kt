package com.kdr.senyatest.ui.fragment

import androidx.fragment.app.Fragment
import com.kdr.senyatest.MainActivity
import com.kdr.senyatest.arch.AttractionsViewModel

abstract class BaseFragment : Fragment() {

    protected val navController by lazy {
        (activity as MainActivity).navController
    }

    protected val activityViewModel: AttractionsViewModel
        get() = (activity as MainActivity).viewModel

}