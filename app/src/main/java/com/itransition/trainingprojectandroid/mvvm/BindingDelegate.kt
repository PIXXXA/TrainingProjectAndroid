package com.itransition.trainingprojectandroid.mvvm

import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

class BindingDelegate<T : ViewDataBinding>() : ReadOnlyProperty<Fragment, T> {

    private var binding: T? = null

    override fun getValue(thisRef: Fragment, property: KProperty<*>): T {
        return binding ?: DataBindingUtil.bind<T>(thisRef.requireView())
            .also { dataBinding -> binding = dataBinding }!!
    }

}