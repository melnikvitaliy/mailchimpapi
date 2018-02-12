package com.initflow.ecwid.maleorang.method.v3.file

import com.initflow.ecwid.maleorang.MailchimpMethod
import com.initflow.ecwid.maleorang.annotation.*

sealed class EditFileMethod : MailchimpMethod<FileInfo>() {

    @Method(httpMethod = HttpMethod.POST, version = APIVersion.v3_0, path = "/file-manager/files")
    class Create() : EditFileMethod()

    @Method(httpMethod = HttpMethod.PATCH, version = APIVersion.v3_0, path = "/file-manager/files/{file_id}")
    class Update(
        @JvmField
        @PathParam
        val file_id: String
    ) : EditFileMethod()

    @JvmField
    @Field
    var folder_id:Int? = null

    @JvmField
    @Field
    var name:String? = null

    @JvmField
    @Field
    var file_data:String? = null

}
