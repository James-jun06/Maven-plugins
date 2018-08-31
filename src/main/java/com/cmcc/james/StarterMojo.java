package com.cmcc.james;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.util.List;

/**
 * Project:  starter-maven-plugin
 * File Created by James on 2018/8/30
 *
 * Copyright 2018 CMCC Corporation Limited.
 * All rights reserved.
 */
@Mojo(name = "starter", defaultPhase = LifecyclePhase.PACKAGE)
public class StarterMojo extends AbstractMojo {
    @Parameter
    private String msg;
    @Parameter
    private List<String> params;

    @Parameter
    private String currentPath;

    @Parameter(property = "args")
    private String args;
    public void execute() throws MojoExecutionException, MojoFailureException {
        System.out.println("This is starter plugin!");
        System.out.println("msg="+msg);
        System.out.println("paramList=" + params);
        System.out.println("args=" + args);
        System.out.println("currentPath=" + currentPath);
        System.out.println("path="+System.getProperty("user.dir"));
    }
}
