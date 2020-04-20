package com.podowd.privatemethodtest;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class MyObjectTest {

    @Test
    void getString_PrivateMethod() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = MyObject.class.getDeclaredMethod("getUpperCaseString", String.class);
        method.setAccessible(true);
        assertEquals("TEST", method.invoke(new MyObject(), "test"));
        assertEquals("ABC", method.invoke(new MyObject(), "abc"));
    }
}