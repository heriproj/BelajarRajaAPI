package com.coba.heri.belajarrajaapi.Model

import com.google.gson.annotations.SerializedName

data class Provinsi(
    @SerializedName("id")
    var provId: String? = null,

    @SerializedName("name")
    var provName: String? = null
)