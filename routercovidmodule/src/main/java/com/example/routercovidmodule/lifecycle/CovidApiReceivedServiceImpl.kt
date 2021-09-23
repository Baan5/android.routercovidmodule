package com.example.routercovidmodule.lifecycle

import au.com.carsales.basemodule.context
import com.example.covidapiservicemodule.data.model.CovidModel
import com.example.covidapiservicemodule.service.ICovidApiReceivedService
import com.example.routercovidmodule.getCovidApiService

class CovidApiReceivedServiceImpl: ICovidApiReceivedService {
    override suspend fun getData(date: String): CovidModel? {
        return context!!.getCovidApiService()?.getTotalReportService(date)
    }
}