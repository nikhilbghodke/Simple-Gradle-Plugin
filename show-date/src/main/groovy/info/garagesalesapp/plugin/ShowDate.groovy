package info.garagesalesapp.plugin

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class ShowDate extends DefaultTask {

    String dateMessage = 'Current date: '

    @TaskAction
    def showDate() {
        println ""
        println dateMessage + new Date()
        println ""
    }
}