package com.appsferry.adapter

/**
 * description:
 *
 * @author Floyd
 * @since  2023/5/31
 */
class AhParams {
    var appid: String? = null
    var bizUrlHost: String? = null
    var uploadUrlHost: String? = null
    var analyticsUrlHost: String? = null
    var smid: String? = null
    var cv: String? = null
    var token: String? = null
    fun withToken(token: String?): AhParams {
        this.token = token
        return this
    }
    fun withAppid(appid: String): AhParams {
        this.appid = appid
        return this
    }

    fun withSmid(smid: String): AhParams {
        this.smid = smid
        return this
    }

    fun withCv(cv: String): AhParams {
        this.cv = cv
        return this
    }
    /**
     * http
     */
    fun withHttpParams(
        bizUrlHost: String?,
        uploadUrlHost: String?,
        analyticsUrlHost: String?
    ): AhParams {
        this.bizUrlHost = bizUrlHost
        this.uploadUrlHost = uploadUrlHost
        this.analyticsUrlHost = analyticsUrlHost
        return this
    }
}