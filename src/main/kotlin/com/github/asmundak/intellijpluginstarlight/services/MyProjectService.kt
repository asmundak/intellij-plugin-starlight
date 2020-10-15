package com.github.asmundak.intellijpluginstarlight.services

import com.intellij.openapi.project.Project
import com.github.asmundak.intellijpluginstarlight.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
