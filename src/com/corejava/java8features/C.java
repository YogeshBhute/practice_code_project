package com.corejava.java8features;

// You can't inherit any functional interface to another functional interface.
// Because it breaks the law of functional interface has exactly one abstract method.

public interface C extends A, B {

	void drawOneSomething();
}
