package com.coba.heri.belajarrajaapi

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import com.coba.heri.belajarrajaapi.ApiRepo.ApiRepository
import com.coba.heri.belajarrajaapi.Model.Provinsi
import com.coba.heri.belajarrajaapi.Presenter.MainView
import com.coba.heri.belajarrajaapi.Presenter.ProvinsiPresenter
import com.coba.heri.belajarrajaapi.util.invisible
import com.coba.heri.belajarrajaapi.util.visible
import com.google.gson.Gson
import org.jetbrains.anko.*
import java.nio.file.Files.size
import java.nio.file.Files.size
import java.util.ArrayList


class MainActivity : AppCompatActivity(), MainView {

    private var provinsi: MutableList<Provinsi> = mutableListOf()
    //private val nextmach : List<Provinsi>
    var provs: MutableList<String> = arrayListOf()
    private lateinit var presenter: ProvinsiPresenter
    private lateinit var spinner: Spinner
    private lateinit var progressBar: ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        linearLayout {
            lparams (width = matchParent, height = wrapContent)
            orientation = LinearLayout.VERTICAL
            topPadding = dip(16)
            leftPadding = dip(16)
            rightPadding = dip(16)

            spinner = spinner ()

          /*  swipeRefresh = swipeRefreshLayout {
                setColorSchemeResources(colorAccent,
                    android.R.color.holo_green_light,
                    android.R.color.holo_orange_light,
                    android.R.color.holo_red_light)
*/
                relativeLayout{
                    lparams (width = matchParent, height = wrapContent)

                   /* listTeam = recyclerView {
                        lparams (width = matchParent, height = wrapContent)
                        layoutManager = LinearLayoutManager(context)
                    }*/

                    progressBar = progressBar {
                    }.lparams{
                        centerHorizontally()
                    }
                }
            //}

        }

        val request = ApiRepository()
        val gson = Gson()
        presenter = ProvinsiPresenter(this, request, gson)
        presenter.getProvinsiList()


        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                toast("Anda Memilih Kota "+ provinsi.get(position).provName +" dengan id :" + provinsi.get(position).provId)
            }
            override fun onNothingSelected(parent: AdapterView<*>) {}
        }


    }

    override fun showLoading() {
        progressBar.visible()
    }

    override fun hideLoading() {
        progressBar.invisible()
    }

    override fun showProvinsiList(data: List<Provinsi>) {
        provinsi.clear()
        provinsi.add(0, Provinsi("0", ""))
        provinsi.addAll(data)
        provs.add(0, getString(R.string.txt_please_slct));
        for (i in 0 until data.size) {
            //provs.add(data.get(i).provName.toString())
            provs.add(data.get(i).provName.toString())
        }
        /*println("Data Provinsi Raja ApI :" + data)
        Log.e("Data Provinsi:", data.toString())
        Log.e("Data Provinsi:", provinsi.toString())
        */
        val spinnerItems = provs
        Log.e("Data Spinner : ", spinnerItems.toString())
        val spinnerAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, spinnerItems)
        spinner.adapter = spinnerAdapter


    }
}


