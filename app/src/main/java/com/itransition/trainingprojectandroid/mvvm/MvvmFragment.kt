package com.itransition.trainingprojectandroid.mvvm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.itransition.trainingprojectandroid.R
import com.itransition.trainingprojectandroid.databinding.FragmentMvvmBinding

class MvvmFragment : Fragment() {

    lateinit var viewModel: MvvmViewModel
    private val bindingDelegate by BindingDelegate<FragmentMvvmBinding>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingDelegate.lifecycleOwner = this
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(this).get(MvvmViewModel::class.java)
        return inflater.inflate(R.layout.fragment_mvvm, container, false)
    }
}