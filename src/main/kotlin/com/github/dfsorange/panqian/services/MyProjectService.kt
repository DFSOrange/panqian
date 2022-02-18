package com.github.dfsorange.panqian.services

import com.intellij.openapi.project.Project
import com.github.dfsorange.panqian.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
