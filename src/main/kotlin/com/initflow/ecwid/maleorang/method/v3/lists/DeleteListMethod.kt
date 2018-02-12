package com.initflow.ecwid.maleorang.method.v3.lists

import com.initflow.ecwid.maleorang.MailchimpMethod
import com.initflow.ecwid.maleorang.MailchimpObject
import com.initflow.ecwid.maleorang.annotation.APIVersion
import com.initflow.ecwid.maleorang.annotation.HttpMethod
import com.initflow.ecwid.maleorang.annotation.Method
import com.initflow.ecwid.maleorang.annotation.PathParam

/**
 * [Delete a list from your MailChimp account](https://developer.mailchimp.com/documentation/mailchimp/reference/lists/#delete-delete_lists_list_id)
 */
@Method(httpMethod = HttpMethod.DELETE, version = APIVersion.v3_0, path = "/lists/{list_id}")
class DeleteListMethod(
        @JvmField
        @PathParam
        val list_id: String
) : MailchimpMethod<MailchimpObject>()
