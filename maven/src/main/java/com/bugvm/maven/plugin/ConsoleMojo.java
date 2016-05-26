/*
 * Copyright (C) 2015 RoboVM AB.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bugvm.maven.plugin;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.ResolutionScope;
import com.bugvm.compiler.AppCompiler;
import com.bugvm.compiler.config.Arch;
import com.bugvm.compiler.config.Config;
import com.bugvm.compiler.config.OS;
import com.bugvm.compiler.target.ConsoleTarget;
import com.bugvm.compiler.target.LaunchParameters;

/**
 * Compiles your application and runs it as a console application on the current
 * host.
 */
@Mojo(name = "console", defaultPhase = LifecyclePhase.PACKAGE,
        requiresDependencyResolution = ResolutionScope.COMPILE_PLUS_RUNTIME)
public class ConsoleMojo extends AbstractBugVMMojo {

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {

        try {

            Arch arch = Arch.getDefaultArch();
            if (super.arch != null) {
                arch = Arch.valueOf(super.arch);
            }

            AppCompiler compiler = build(OS.getDefaultOS(), arch, ConsoleTarget.TYPE);
            Config config = compiler.getConfig();
            LaunchParameters launchParameters = config.getTarget()
                    .createLaunchParameters();
            compiler.launch(launchParameters);

        } catch (Throwable t) {
            throw new MojoExecutionException("Failed to launch console application", t);
        }
    }
}
