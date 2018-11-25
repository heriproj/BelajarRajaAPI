package com.coba.heri.belajarrajaapi.Presenter

import com.coba.heri.belajarrajaapi.Model.Provinsi

interface MainView {
    fun showLoading()
    fun hideLoading()
    fun showProvinsiList(data: List<Provinsi>)
}