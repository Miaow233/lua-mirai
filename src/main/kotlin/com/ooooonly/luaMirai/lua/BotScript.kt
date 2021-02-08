package com.ooooonly.luaMirai.lua

@Suppress("unused")
interface BotScript {
    fun create() = onCreate()
    fun onCreate() {}

    fun stop() = onStop()
    fun onStop() {}

    fun destroy() = onDestroy()
    fun onDestroy() {}

    fun load() = onLoad()
    fun onLoad() {}

    fun reload() = onReload()

    fun onReload() {
        onStop()
        onLoad()
    }

    fun getInfo(): Info? = null

    data class Info(
        var name: String = "",
        var version: String = "",
        var author: String = "",
        var description: String = "",
        var usage: String = "",
        var file: String = ""
    )
}

