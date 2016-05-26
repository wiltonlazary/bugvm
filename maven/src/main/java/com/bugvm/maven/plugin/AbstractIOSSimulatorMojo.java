/*
 * Copyright (C) 2013 RoboVM AB.
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
import org.apache.maven.plugins.annotations.Parameter;
import com.bugvm.compiler.AppCompiler;
import com.bugvm.compiler.config.Arch;
import com.bugvm.compiler.config.Config;
import com.bugvm.compiler.config.OS;
import com.bugvm.compiler.target.ios.DeviceType;
import com.bugvm.compiler.target.ios.DeviceType.DeviceFamily;
import com.bugvm.compiler.target.ios.IOSSimulatorLaunchParameters;
import com.bugvm.compiler.target.ios.IOSTarget;

public abstract class AbstractIOSSimulatorMojo extends AbstractBugVMMojo {

    private DeviceFamily deviceFamily;

    /**
     * The iOS SDK version to use when choosing the simulator (e.g. "8.0"). Defaults to the newest
     * SDK version.
     */
    @Parameter(property="bugvm.iosSimSdk")
    protected String sdk;

    /**
     * The identifier of the simulator device to use (e.g. "iPhone-5s", "iPad-Retina"). Run {@code
     * ios-sim showdevicetypes} for a full list.
     */
    @Parameter(property="bugvm.iosDeviceName")
    protected String deviceName;

    protected AbstractIOSSimulatorMojo(DeviceFamily deviceFamily) {
        this.deviceFamily = deviceFamily;
    }

    public void execute() throws MojoExecutionException, MojoFailureException {
        try {
            Arch arch = Arch.x86_64;
            if (super.arch != null && super.arch.equals(Arch.x86.toString())) {
                arch = Arch.x86;
            }
            
            AppCompiler compiler = build(OS.ios, arch, IOSTarget.TYPE);
            Config config = compiler.getConfig();
            IOSSimulatorLaunchParameters launchParameters = (IOSSimulatorLaunchParameters)
                config.getTarget().createLaunchParameters();

            // select the device based on the (optional) SDK version and (optional) device type
            DeviceType deviceType = DeviceType.getBestDeviceType(
                    arch, deviceFamily, deviceName, sdk);
            launchParameters.setDeviceType(deviceType);
            compiler.launch(launchParameters);

        } catch (Throwable t) {
            throw new MojoExecutionException("Failed to launch IOS Simulator", t);
        }
    }
}
