package com.initflow.ecwid.maleorang.method.v3.lists.members

import com.initflow.ecwid.maleorang.MailchimpMethod
import com.initflow.ecwid.maleorang.MailchimpObject
import com.initflow.ecwid.maleorang.annotation.APIVersion
import com.initflow.ecwid.maleorang.annotation.HttpMethod
import com.initflow.ecwid.maleorang.annotation.Method
import com.initflow.ecwid.maleorang.annotation.PathParam

/**
 * [Remove a list member](http://developer.mailchimp.com/documentation/mailchimp/reference/lists/members/#delete-delete_lists_list_id_members_subscriber_hash)
 */
@Method(httpMethod = HttpMethod.DELETE, version = APIVersion.v3_0, path = "/batches/{batch_id}")
class DeleteBatchMethod(
        @JvmField
        @PathParam
        val batch_id: String
) : MailchimpMethod<MailchimpObject>()
