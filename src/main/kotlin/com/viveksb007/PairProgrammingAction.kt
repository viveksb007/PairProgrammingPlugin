package com.viveksb007

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.Messages
import com.intellij.openapi.vfs.VirtualFileManager

class PairProgrammingAction : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        val project = e.project
        project?.messageBus?.connect()?.subscribe(VirtualFileManager.VFS_CHANGES, FileChangeListener())
        Messages.showMessageDialog(
            project,
            "I will allow to create collaborating session",
            "Pair Programming Plugin", Messages.getInformationIcon()
        )
    }

}