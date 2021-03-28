package emgc.junit5.domain;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class RepeatTest {
    @Test
    @DisplayName("RepeatedTest 반복")
    @RepeatedTest(value=3, name="{displayName}, {currentRepetition}/{totalRepetition}")
    void test(RepetitionInfo r) {
        System.out.println(r.getCurrentRepetition());
    }

    @Test
    @DisplayName("Parameterized 테스트")
    @ParameterizedTest(name = "{index} {displayName} message = {0}")
    @ValueSource(strings = {"날씨가", "많이", "더워지고", "있네요."})
    void test2(String message) {
        System.out.println(message);
    }


}