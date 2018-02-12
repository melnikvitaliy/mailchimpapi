package com.initflow.ecwid.maleorang.annotation


/**
 * Marks subclasses of [com.initflow.party.foreign.ecwid.maleorang.MailchimpMethod] to describe the corresponding MailChimp API method.
 */
@MustBeDocumented
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.CLASS)
annotation class Method(val version: APIVersion, val httpMethod: HttpMethod, val path: String)
