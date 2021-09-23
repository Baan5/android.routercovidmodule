package com.example.routercovidmodule.lifecycle

import android.app.Application
import au.com.carsales.basemodule.router.BaseModuleLifeCycle
import au.com.carsales.basemodule.router.IModuleConfig
import com.example.covidapiservicemodule.service.CovidApiServiceImpl
import com.example.covidapiservicemodule.service.ICovidApiReceivedService
import com.example.covidapiservicemodule.service.ICovidApiService

class CovidApiServiceLifeCycle(application: Application): BaseModuleLifeCycle(application){

    override fun onCreate(config: IModuleConfig) {
        config.registerService(ICovidApiService::class.java, CovidApiServiceImpl::class.java)
        config.registerService(ICovidApiReceivedService::class.java, CovidApiReceivedServiceImpl::class.java)
    }

}