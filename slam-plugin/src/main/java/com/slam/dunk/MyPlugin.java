package com.slam.dunk;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * @Author: zerongliu
 * @Date: 4/6/20 12:48
 * @Description:
 */
@Mojo(name = "log") // target method
public class MyPlugin extends AbstractMojo {
    /**
     * parameter
     */
    @Parameter(property = "log.name", defaultValue = "Peter")
    private Object name;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info("hello " + name + ",deploy to your local repository");
    }
}
