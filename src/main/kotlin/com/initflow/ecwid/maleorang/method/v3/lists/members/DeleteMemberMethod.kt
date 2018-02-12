package com.initflow.ecwid.maleorang.method.v3.lists.members

import com.initflow.ecwid.maleorang.MailchimpMethod
import com.initflow.ecwid.maleorang.MailchimpObject
import com.initflow.ecwid.maleorang.annotation.APIVersion
import com.initflow.ecwid.maleorang.annotation.HttpMethod
import com.initflow.ecwid.maleorang.annotation.Method
import com.initflow.ecwid.maleorang.annotation.PathParam
import org.apache.commons.codec.digest.DigestUtils

/**
 * [Remove a list member](http://developer.mailchimp.com/documentation/mailchimp/reference/lists/members/#delete-delete_lists_list_id_members_subscriber_hash)
 */
@Method(httpMethod = HttpMethod.DELETE, version = APIVersion.v3_0, path = "/lists/{list_id}/members/{subscriber_hash}")
class DeleteMemberMethod(
        @JvmField
        @PathParam
        val list_id: String,

        email: String
) : MailchimpMethod<MailchimpObject>() {
        @JvmField
        @PathParam
        val subscriber_hash: String = DigestUtils.md5Hex(email.toLowerCase())
}
