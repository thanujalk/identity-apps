package org.wso2.identity.apps.test.utils;

/**
 * Test Utils
 */
public class TestUtils {

    private static final TestUtils INSTANCE = new TestUtils();

    private TestUtils() {

    }

    /**
     *  Get instance
     * @return instance
     */
    public static TestUtils getInstance() {

        return INSTANCE;
    }
}
