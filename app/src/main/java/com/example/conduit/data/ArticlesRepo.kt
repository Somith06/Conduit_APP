package com.example.conduit.data

import com.example.api.ConduitClient

object ArticlesRepo {

    val api = ConduitClient().api

    suspend fun gelGlobalFeed() = api.getArticles()
}