package com.initflow.ecwid.maleorang.method.v3.campaigns.content

import com.initflow.ecwid.maleorang.MailchimpMethod
import com.initflow.ecwid.maleorang.annotation.*

/**
 * [Get the the HTML and plain-text content for a campaign](https://developer.mailchimp.com/documentation/mailchimp/reference/campaigns/content/#read-get_campaigns_campaign_id_content)
 */
@Method(httpMethod = HttpMethod.GET, version = APIVersion.v3_0, path = "/campaigns/{campaign_id}/content")
class GetCampaignContentMethod(@JvmField @PathParam val campaign_id: String) : MailchimpMethod<ContentInfo>() {

    @JvmField
    @QueryStringParam
    var fields: String? = null

    @JvmField
    @QueryStringParam
    var exclude_fields: String? = null

}
