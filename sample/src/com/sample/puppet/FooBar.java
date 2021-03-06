package com.sample.puppet;

public class FooBar {
    private Foo foo;
    private Bar bar;

    //required
    public FooBar() {
    }

    public FooBar(Foo foo, Bar bar) {
        this.foo = foo;
        this.bar = bar;
    }

    public Foo getFoo() {
        return foo;
    }

    public void setFoo(Foo foo) {
        this.foo = foo;
    }

    public Bar getBar() {
        return bar;
    }

    public void setBar(Bar bar) {
        this.bar = bar;
    }

    @Override
    public String toString() {
        return "FooBar{" +
                "foo=" + foo +
                ", bar=" + bar +
                '}';
    }
}
