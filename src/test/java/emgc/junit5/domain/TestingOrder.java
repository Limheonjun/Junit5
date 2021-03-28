package emgc.junit5.domain;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class TestingOrder {
    @Test
    @Order(2)
    @DisplayName("첫번째 테스트")
    void test1() {

    }

    @Test
    @Order(1)
    @DisplayName("두번째 테스트")
    void test2() {

    }

}