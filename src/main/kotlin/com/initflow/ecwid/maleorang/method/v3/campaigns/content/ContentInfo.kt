package com.initflow.ecwid.maleorang.method.v3.campaigns.content

import com.initflow.ecwid.maleorang.MailchimpObject
import com.initflow.ecwid.maleorang.annotation.Field

class ContentInfo : MailchimpObject() {

    @JvmField
    @Field
    var variate_contents: VariateContents? = null

    class VariateContents : MailchimpObject() {

        @JvmField
        @Field
        var content_label: String? = null

        @JvmField
        @Field
        var plain_text: String? = null

        @JvmField
        @Field
        var html: String? = null

    }

    @JvmField
    @Field
    var plain_text: String? = null

    @JvmField
    @Field
    var html: String? = null

}
