/*
 * Copyright 2010-2014 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.jet.resolve;

import junit.framework.Test;
import junit.framework.TestSuite;
import org.jetbrains.jet.JetTestUtils;
import org.jetbrains.jet.test.InnerTestClasses;
import org.jetbrains.jet.test.TestMetadata;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.jet.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/resolve/additionalLazyResolve")
public class AdditionalLazyResolveDescriptorRendererTestGenerated extends AbstractAdditionalLazyResolveDescriptorRendererTest {
    public void testAllFilesPresentInAdditionalLazyResolve() throws Exception {
        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/resolve/additionalLazyResolve"), Pattern.compile("^(.+)\\.kt$"), true);
    }
    
    @TestMetadata("anonymousObjectInClassInitializer.kt")
    public void testAnonymousObjectInClassInitializer() throws Exception {
        doTest("idea/testData/resolve/additionalLazyResolve/anonymousObjectInClassInitializer.kt");
    }
    
    @TestMetadata("anonymousObjectInClassParameterInitializer.kt")
    public void testAnonymousObjectInClassParameterInitializer() throws Exception {
        doTest("idea/testData/resolve/additionalLazyResolve/anonymousObjectInClassParameterInitializer.kt");
    }
    
    @TestMetadata("localClassInClassInitializer.kt")
    public void testLocalClassInClassInitializer() throws Exception {
        doTest("idea/testData/resolve/additionalLazyResolve/localClassInClassInitializer.kt");
    }
    
    @TestMetadata("localClassInClosureInClassParameterInitializer.kt")
    public void testLocalClassInClosureInClassParameterInitializer() throws Exception {
        doTest("idea/testData/resolve/additionalLazyResolve/localClassInClosureInClassParameterInitializer.kt");
    }
    
    @TestMetadata("localObjectInClassInitializer.kt")
    public void testLocalObjectInClassInitializer() throws Exception {
        doTest("idea/testData/resolve/additionalLazyResolve/localObjectInClassInitializer.kt");
    }
    
    @TestMetadata("localObjectInClosureInClassParameterInitializer.kt")
    public void testLocalObjectInClosureInClassParameterInitializer() throws Exception {
        doTest("idea/testData/resolve/additionalLazyResolve/localObjectInClosureInClassParameterInitializer.kt");
    }
    
}
