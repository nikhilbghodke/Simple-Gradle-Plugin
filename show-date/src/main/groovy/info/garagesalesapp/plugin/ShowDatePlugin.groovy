package info.garagesalesapp.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Created by jamesharmon on 5/3/17.
 */
class ShowDatePlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.task('showDate', type: ShowDate)
    }
}

