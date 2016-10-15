package com.aeps.sandbox.headfirst.chapter04;

/**
 * Created by Alejandro on 10/15/2016.
 */
public abstract class Pizza {

    protected Dough dough;

    protected Sauce sauce;

    protected void prepare() {}

    protected void bake() {}

    protected void cut() {}

    protected void box() {}

    protected Dough getDough() {
        return dough;
    }

    protected Sauce getSauce() {
        return sauce;
    }

}