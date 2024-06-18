package com.awesomeproject.nativemodule.MyNativeModulePackage;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class MyNativeModule extends ReactContextBaseJavaModule {

    private static ReactApplicationContext reactContext;

    MyNativeModule(ReactApplicationContext context) {
        super(context);
        reactContext = context;
    }

    @Override
    public String getName() {
        return "MyNativeModule";
    }

    @ReactMethod
    public void getString(Callback callback) {
        String myString = "Hello from Native Module";
        callback.invoke(myString);
    }
}
