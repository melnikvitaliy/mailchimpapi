package com.initflow.ecwid.maleorang.method.v3.lists

import com.initflow.ecwid.maleorang.MailchimpObject
import com.initflow.ecwid.maleorang.annotation.Field

/**
 * Created by apocheau on 26/08/16.
 */
class ContactInfo : MailchimpObject() {

    @JvmField
    @Field
    var company: String? = null

    @JvmField
    @Field
    var address1: String? = null

    @JvmField
    @Field
    var address2: String? = null

    @JvmField
    @Field
    var city: String? = null

    @JvmField
    @Field
    var state: String? = null

    @JvmField
    @Field
    var zip: String? = null

    @JvmField
    @Field
    var country: String? = null

    @JvmField
    @Field
    var phone: String? = null
}
