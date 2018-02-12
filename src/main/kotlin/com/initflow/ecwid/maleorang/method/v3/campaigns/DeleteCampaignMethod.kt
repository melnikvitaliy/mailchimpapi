package com.initflow.ecwid.maleorang.method.v3.campaigns

import com.initflow.ecwid.maleorang.MailchimpMethod
import com.initflow.ecwid.maleorang.MailchimpObject
import com.initflow.ecwid.maleorang.annotation.APIVersion
import com.initflow.ecwid.maleorang.annotation.HttpMethod
import com.initflow.ecwid.maleorang.annotation.Method
import com.initflow.ecwid.maleorang.annotation.PathParam

/**
 * [Remove a campaign from your MailChimp account](https://developer.mailchimp.com/documentation/mailchimp/reference/campaigns/#delete-delete_campaigns_campaign_id)
 */
@Method(httpMethod = HttpMethod.DELETE, version = APIVersion.v3_0, path = "/campaigns/{campaign_id}")
class DeleteCampaignMethod(
        @JvmField
        @PathParam
        val campaign_id: String
) : MailchimpMethod<MailchimpObject>()
