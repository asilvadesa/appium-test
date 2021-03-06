package br.com.asilva.appium.pageobjects;

import io.appium.java_client.AppiumDriver;

public abstract class PageObjectBase {

    protected final AppiumDriver driver;

    protected PageObjectBase(AppiumDriver driver) {
        this.driver = driver;
    }

    public abstract void buscaElementos();
}
