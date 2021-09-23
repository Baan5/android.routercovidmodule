package com.example.routercovidmodule

import android.content.Context
import au.com.carsales.basemodule.router.Router
import com.example.covidapiservicemodule.service.ICovidApiService

var covidApiService: ICovidApiService? = null

fun Context.getCovidApiService(): ICovidApiService? {
    if (covidApiService == null){
        covidApiService = Router.getService(ICovidApiService::class.java)
    }
    return covidApiService
}