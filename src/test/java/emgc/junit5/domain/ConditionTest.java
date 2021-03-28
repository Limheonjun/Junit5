package emgc.junit5.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

class ConditionTest {

    @Test
    @DisplayName("조건에 따른 테스트 assume")
    void condition() {
        assertAll(
                () -> {
                    assumeTrue(System.getProperty("os.name").startsWith("Windows"));
                    assertEquals(1,1);
                },
                () -> {
                    assumeTrue(System.getProperty("os.name").startsWith("Windows"));
                    assertEquals(2,2);
                }

        );
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    @DisplayName("조건에 따른 테스트 Enabled - 윈도우인 경우만 실행")
    void condition2() {
        assertEquals(1,1);
    }

    @Test
    @EnabledOnOs(OS.MAC)
    @DisplayName("조건에 따른 테스트 Enabled - 맥인 경우만 실행")
    void condition3() {
        assertEquals(1,1);
    }
}
