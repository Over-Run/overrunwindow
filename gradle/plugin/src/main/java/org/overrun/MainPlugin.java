package org.overrun;

import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.jetbrains.annotations.NotNull;

public class MainPlugin implements Plugin<Project> {
    @Override
    public void apply(@NotNull Project target) {
        System.out.printf("load plugin version%s%n\n", target.getVersion());
        target.getExtensions().add("win32", Win32.class);
//        Win32 path = (Win32) target.getExtensions().getByName("path");
    }
}
