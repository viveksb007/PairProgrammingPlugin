package com.viveksb007

import com.intellij.openapi.vfs.newvfs.BulkFileListener
import com.intellij.openapi.vfs.newvfs.events.VFileEvent
import java.io.BufferedReader

class FileChangeListener : BulkFileListener {

    override fun before(events: MutableList<out VFileEvent>) {
        events.forEach {
            val content = it.file!!.inputStream.bufferedReader().use(BufferedReader::readText)
            println("Before content $content")
        }
    }

    override fun after(events: MutableList<out VFileEvent>) {
        events.forEach {
            val content = it.file!!.inputStream.bufferedReader().use(BufferedReader::readText)
            println("After content $content")
        }
    }

}