## Assignment 2

Made by Amanda Juhl Hansen

### 1 - Reflections

#### 1.1 Computer Mouse

Identify the types of testing you would perform on a computer mouse, to
make sure that it is of the highest quality.

#### 1.2 Catastrophic failure

Find a story where a software system defect had a bad outcome. Describe
what happened. Can you identify a test that would have prevented it?

### 2 - Two katas

Complete the following using TDD. Remember the TDD mantra

#### 2.1 String utility

Use TDD to create a string utility with the following methods:

##### Reverse string (aBc -> cBa)
##### Capitalize string (aBc -> ABC)
##### Lowercase string (aBc -> abc)

#### 2.2 Bowling game kata

Complete the Bowling Game Kata using TDD.

### 3 - Investigation of tools

#### 3.1 JUnit 5

Investigate JUnit 5 (Jupiter). Explain the following, and how they are useful.

##### @Tag

- This annotation is used to declare tags for filtering tests, either at the class or method level. The @Tag annotation is useful when creating a test pack with selected tests.

##### @Disabled

- The @Disabled annotation is used to disable or skip tests at class or method level. When declared at class level, all @test methods are skipped. When @Disabled is declared at method level, only the annotated method is disabled.

##### @RepeatedTest

- This annotation is used to repeat a test a specified number of times simply by annotating a method with @RepeatedTest and specifying the total number of repetitions desired. Each invocation of a repeated test behaves like the execution of a regular @Test method.

##### @BeforeEach, @AfterEach

- The @BeforeEach annotation denotes that the annotated method should be executed before each test method.
- The @AfterEach annotation denotes that the annotated method should be executed after each test method. For example, if the tests need to reset a property after each test, the method can be annotateted with @AfterEach for that task. 

##### @BeforeAll, @AfterAll

- The @BeforeAll annotation executes a method before all tests. This is typically used to initialize various things for the tests.
- The @AfterAll annotation is used to execute the annotated method, only after all tests have been executed. This annotation is used to tear down or terminate all processes at the end of all tests.

##### @DisplayName

- Test classes and test methods can declare custom display names that will be displayed by test runners and test reports when @DisplayName annotation is being used.

##### @Nested
##### assumeFalse, assumeTrue

#### 3.2 Mocking frameworks

Investigate mocking frameworks for your preferred language. Choose at least
two frameworks, and answer the questions.

##### What are their similarities?
##### What are their differences?
##### Which one would you prefer, if any, and why?
 
