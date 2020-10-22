package core;

import io.cucumber.java.Before;

import java.io.IOException;
import java.net.MalformedURLException;

public class Hooks {

    @Before("@android, ~@web")
    public void beforeAndroidTestsRun() throws IOException {}
    @Before("@web, ~@android")
    public void beforeWebTestsRun() throws MalformedURLException {}
}