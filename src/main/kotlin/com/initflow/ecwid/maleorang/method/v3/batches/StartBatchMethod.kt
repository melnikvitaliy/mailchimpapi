package com.initflow.ecwid.maleorang.method.v3.batches

import com.initflow.ecwid.maleorang.annotation.Field
import com.initflow.ecwid.maleorang.MailchimpMethod
import com.initflow.ecwid.maleorang.MailchimpMethodInfo
import com.initflow.ecwid.maleorang.MailchimpObject
import com.initflow.ecwid.maleorang.annotation.APIVersion
import com.initflow.ecwid.maleorang.annotation.HttpMethod
import com.initflow.ecwid.maleorang.annotation.Method


/**
 * [Start a batch operation](http://developer.mailchimp.com/documentation/mailchimp/reference/batches/#create-post_batches)
 */
@Method(httpMethod = HttpMethod.POST, version = APIVersion.v3_0, path = "/batches")
class StartBatchMethod(operations: List<MailchimpMethod<*>>) : MailchimpMethod<BatchStatus>() {

    class Operation internal constructor(info: MailchimpMethodInfo): MailchimpObject() {
        @JvmField
        @Field
        val method = info.httpMethod.name

        @JvmField
        @Field
        val path = info.buildPath()

        @JvmField
        @Field
        val params = info.queryStringParams

        @JvmField
        @Field
        val body = info.requestBody

        @JvmField
        @Field
        var operation_id: String? = null
    }

    @JvmField
    @Field
    val operations = operations.map { Operation(MailchimpMethodInfo(it)) }
}
