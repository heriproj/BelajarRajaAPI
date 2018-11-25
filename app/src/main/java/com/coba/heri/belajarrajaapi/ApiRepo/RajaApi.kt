package com.coba.heri.belajarrajaapi.ApiRepo

import android.net.Uri
import com.coba.heri.belajarrajaapi.BuildConfig

object RajaApi {
    //fun getProvinsi(league: String?): String {
    fun getProvinsi(): String {
        //return BuildConfig.BASE_URL + "MeP7c5ne${BuildConfig.RAJA_API_KEY}" + "/m/wilayah/provinsi" //+ league
        return Uri.parse(BuildConfig.BASE_URL + BuildConfig.RAJA_API_KEY).buildUpon()
            //.appendPath(BuildConfig.RAJA_API_KEY)
            .appendPath("m")
            .appendPath("wilayah")
            .appendPath("provinsi")

            //.appendQueryParameter("l", league)
            .build()
            .toString()
    }
}