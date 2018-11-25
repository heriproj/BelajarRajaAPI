package com.coba.heri.belajarrajaapi.Presenter

import com.coba.heri.belajarrajaapi.ApiRepo.ApiRepository
import com.coba.heri.belajarrajaapi.ApiRepo.RajaApi
import com.coba.heri.belajarrajaapi.Model.ProvinsiResponse
import com.google.gson.Gson
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

class ProvinsiPresenter(private val view: MainView,
                        private val apiRepository: ApiRepository,
                        private val gson: Gson) {

    fun getProvinsiList() {
        view.showLoading()
        doAsync {
            val data = gson.fromJson(apiRepository
                .doRequest(RajaApi.getProvinsi()),
                ProvinsiResponse::class.java
            )

            uiThread {
                view.hideLoading()
                view.showProvinsiList(data.data)
            }
        }
    }
}