package com.initflow.ecwid.maleorang.method.v3.file

import com.google.gson.annotations.SerializedName
import com.initflow.ecwid.maleorang.MailchimpObject
import com.initflow.ecwid.maleorang.annotation.Field

class FileInfo : MailchimpObject() {

    @JvmField
    @Field
    var id: Int? = null

    @JvmField
    @Field
    var folder_id: Int? = null

    @JvmField
    @Field
    var type:Type? = null

    @JvmField
    @Field
    var name:String? = null

    @JvmField
    @Field
    var full_size_url:String? = null

    @JvmField
    @Field
    var thumbnail_url:String? = null

    @JvmField
    @Field
    var size:Int? = null

    @JvmField
    @Field
    var created_at:String? = null

    @JvmField
    @Field
    var created_by:String? = null

    @JvmField
    @Field
    var width:Int? = null

    @JvmField
    @Field
    var height:Int? = null

    enum class Type {
        @SerializedName("image")
        IMAGE,
        @SerializedName("file")
        FILE
    }

}
