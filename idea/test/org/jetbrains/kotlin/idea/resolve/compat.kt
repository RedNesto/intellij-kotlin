/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.resolve

import com.intellij.mock.MockProject
import com.intellij.pom.PomModel
import org.jetbrains.kotlin.idea.caches.trackers.KotlinCodeBlockModificationListener

internal fun unregisterKotlinCodeBlockModificationListener(project: MockProject) {
    val picoContainer = project.picoContainer
    picoContainer.unregisterComponent(KotlinCodeBlockModificationListener::class.java)
    picoContainer.unregisterComponent(PomModel::class.java)
}