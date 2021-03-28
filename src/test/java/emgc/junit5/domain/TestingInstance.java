package emgc.junit5.domain;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS) //클래스당 생성
class TestingInstance {

    Product product = new Product();

    @Test
    void test() {
        System.out.println(product); //클래스당 하나의 product를 생성했기 때문에 동일한 객체 사용
    }

    @Test
    void test2() {
        System.out.println(product); //클래스당 하나의 product를 생성했기 때문에 동일한 객체 사용
    }

}