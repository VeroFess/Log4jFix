package com.binklac.log4j2fix;

import java.lang.instrument.Instrumentation;

public class Log4j2FixAgent {
    public static void premain(String agentArgs, Instrumentation instrumentation){
        System.out.println("Waiting for class4j classes to load.");
        instrumentation.addTransformer(new Log4jClassTransformer());
    }
}
