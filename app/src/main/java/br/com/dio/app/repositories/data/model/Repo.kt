package br.com.dio.app.repositories.data.model

import br.com.dio.app.repositories.data.model.Owner
import com.google.gson.annotations.SerializedName


data class Repo (
    val id:Long,
    val name:String,
    val owner: Owner,
    @SerializedName("stargazers_count")
    val stargazersCount: Long,
    val language:String,
    @SerializedName("html_url")
    val htmlUrl:String,
    val description:String
)