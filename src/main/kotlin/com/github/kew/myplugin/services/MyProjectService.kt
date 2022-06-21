package com.github.kew.myplugin.services

import com.intellij.openapi.project.Project
import com.github.kew.myplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
