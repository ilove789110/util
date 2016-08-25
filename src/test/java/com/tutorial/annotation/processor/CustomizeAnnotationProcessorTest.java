package com.tutorial.annotation.processor;

import com.tutorial.annotation.CustomizeAnnotation;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by WilliamsLiu on 16/8/25.
 */
public class CustomizeAnnotationProcessorTest {

    @CustomizeAnnotation("lalala")
    public class CustomizeAnnotationUser {
    }

    @Test
    public void testProcessorCustomizeAnnotation() {
        CustomizeAnnotationProcessor.processorCustomizeAnnotation(CustomizeAnnotationUser.class);
    }


}