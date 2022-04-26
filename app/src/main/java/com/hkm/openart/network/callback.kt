package com.hkm.openart.network

interface Callback<T> {

    fun onSuccess(Result: T?)

    fun onFail(exception: Exception)
}