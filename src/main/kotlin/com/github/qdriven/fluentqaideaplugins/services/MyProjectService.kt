package com.github.qdriven.fluentqaideaplugins.services

import com.intellij.openapi.project.Project
import com.github.qdriven.fluentqaideaplugins.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
