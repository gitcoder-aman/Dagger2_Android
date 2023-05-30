package com.tech.dagger2_android;

public final class BuildConfig {
    public static final boolean DEBUG;

    static {
        Boolean.parseBoolean("true");
        DEBUG = true;
    }

    public static final String APPLICATION_ID = "com.tech.dagger2_android";
    public static final String BUILD_TYPE = "debug";
    public static final String FLAVOR = "";
    public static final int VERSION_CODE = 1;
    public static final String VERSION_NAME = "1.0";
}
