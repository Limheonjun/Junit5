# Junit5
springboot에 기본적으로 Junit5가 탑재



## Annotations

- @Test
	> 테스트 코드임을 알려주는 애노테이션
	> 접근지정자와 반환타입은 없어도 됨

- @BeforeAll
	> 모든 테스트 전에 딱 한번 실행
	> static void로 선언

- @AfterAll
	> 모든 테스트 후 딱 한번 실행
	> static void로 선언

- @BeforeEach
	> @Test가 붙은 코드를 실행하기 전 매번 실행
	> 접근지정자와 반환타입은 없어도 됨	
	
- @AfterEach
	> @Test가 붙은 코드를 실행한 후 매번 실행
	> 접근지정자와 반환타입은 없어도 됨	

- @Disabled
	> 해당 테스트는 무시하고 진행

- @DisplayName
	> 테스트 이름을 사용자가 정의할 수 있음
	> @DisplayName(사용자 정의)

## Assertion

- assertEquals(expected, actual)
	> 기대값과 실제값이 같은지 확인
		 
- assertNotNull(actual)
	> 값이 null이 아닌지 확인

- assertTrue(boolean)
	> 값이 true인지 확인

- assertAll(executables...)
	> 인자로 받은 테스트를 한꺼번에 확인

- assertThrows(expectedType, executable)
	> 예외 발생 확인

- assertTimeout(duration, executable)
	> 특정 시간 안에 실행이 완료되는지 확인