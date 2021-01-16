package com.itransition.trainingprojectandroid.mvvm

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.itransition.trainingprojectandroid.R
import com.itransition.trainingprojectandroid.databinding.FragmentMvvmBinding
import kotlin.properties.ReadOnlyProperty

class MvvmFragment : Fragment() {

    private val bindingDelegate by BindingDelegate<FragmentMvvmBinding>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingDelegate.lifecycleOwner = this
        bindingDelegate.viewModel = ViewModelProvider(this).get(MvvmViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_mvvm, container, false)
    }

//    private inline fun <reified T : ViewModel> Fragment.getViewModel(
//        factory: ViewModelProvider.Factory =
//            ViewModelProvider.NewInstanceFactory()
//    ) = ViewModelProvider(this, factory).get(T::class.java)
}