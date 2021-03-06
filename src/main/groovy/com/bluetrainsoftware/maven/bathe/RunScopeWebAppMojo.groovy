package com.bluetrainsoftware.maven.bathe

import org.apache.maven.plugins.annotations.LifecyclePhase
import org.apache.maven.plugins.annotations.Mojo
import org.apache.maven.plugins.annotations.ResolutionScope

/**
 * Runs the app with run level dependencies
 *
 * @author: Richard Vowles - https://plus.google.com/+RichardVowles
 */
@Mojo(name = "run", requiresProject = true, requiresDependencyResolution = ResolutionScope.COMPILE_PLUS_RUNTIME, defaultPhase = LifecyclePhase.NONE)
class RunScopeWebAppMojo extends BaseWebAppMojo {
}
