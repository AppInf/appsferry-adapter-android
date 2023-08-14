package com.appsferry.adapter

import com.appsferry.core.CoreComponent
import com.appsferry.core.CoreParams
import com.appsferry.core.parameters.Parameters
import com.appsferry.core.parameters.appid
import com.appsferry.core.parameters.cv
import com.appsferry.core.parameters.smid

object AdapterSDK {
    @JvmStatic
    fun initSdk(params: AhParams) {
        params.appid?.let {
            Parameters.getInstance().appid = it
        }
        params.cv?.let {
            Parameters.getInstance().cv = it
        }
        params.smid?.let {
            Parameters.getInstance().smid = it
        }
        // core
        CoreComponent.setParams(
            CoreParams().withHttpParams(
                params.bizUrlHost,
                params.uploadUrlHost,
                params.analyticsUrlHost
            )
        )
    }
}