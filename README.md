# Assignment 2

Made by Amanda Juhl Hansen

## 1 - Reflections

### 1.1 Computer Mouse

<i>Identify the types of testing you would perform on a computer mouse, to make sure that it is of the highest quality.</i>

#### Unit Testing
- This is dont to test that all parts of the computer mouse individually works as expected. 

#### Functionality Testing
- This is done to test every click function that the computer mouse has. 

#### Performance Testing 
- This is done to test the speed, meaning how quick the computer mouse reacts on a movement. 

#### Stress Testing 
- This is done by doing activity that tests beyond normal operational capacity to test the results of the computer mouse. Acivities like brining it in a bagpack that contains other things.

#### Integration Testing 
- This is done to ensure that the entire and integrated computer mouse meets the set of requirements. 

### 1.2 Catastrophic failure

<i>Find a story where a software system defect had a bad outcome. Describe what happened. Can you identify a test that would have prevented it?</i>

#### Story about CareFusion's Alaris Pump

[This story](https://www.fiercebiotech.com/medical-devices/carefusion-runs-into-more-deadly-trouble-infusion-pump) is an article about the CareFusion Alaris Pump, which is designed to automatically deliver fluids and medicine to hospital patients. In 2015 this device had a software error that caused the pump to delay infusion. 

- This product relies very much on performance of the software, therefore it makes sense to do a thorough <b>Performance Test</b> that examines the speed, stability, reliability, scalability, and resource usage of the software under a specified workload. 

## 2 - Two katas

<i>Complete the following using TDD. Remember the TDD mantra</i>

### 2.1 String utility

Use TDD to create a string utility with the following methods:

#### Reverse string (aBc -> cBa) and Capitalize string (aBc -> ABC) and Lowercase string (aBc -> abc)

- Link to [testfile](https://github.com/amandajuhl95/AssignmentTwo-Test/blob/master/src/test/java/KatasTest.java)
- Link to [methods](https://github.com/amandajuhl95/AssignmentTwo-Test/blob/master/src/main/java/Katas.java)

### 2.2 Bowling game kata

##### Complete the Bowling Game Kata using TDD.

- Link to [testfile](https://github.com/amandajuhl95/AssignmentTwo-Test/blob/master/src/test/java/BowlingGameTest.java)
- Link to [methods](https://github.com/amandajuhl95/AssignmentTwo-Test/blob/master/src/main/java/bowlingGame/Game.java)

## 3 - Investigation of tools

### 3.1 JUnit 5

<i>Explain the following, and how they are useful.</i>

#### @Tag

- This annotation is used to declare tags for filtering tests, either at the class or method level. The @Tag annotation is useful when creating a test pack with selected tests.

#### @Disabled

- This annotation is used to disable or skip tests at class or method level. When declared at class level, all @test methods are skipped. When @Disabled is declared at method level, only the annotated method is disabled.

#### @RepeatedTest

- This annotation is used to repeat a test a specified number of times simply by annotating a method with @RepeatedTest and specifying the total number of repetitions desired. Each invocation of a repeated test behaves like the execution of a regular @Test method.

#### @BeforeEach, @AfterEach

- The @BeforeEach annotation denotes that the annotated method should be executed before each test method.
- The @AfterEach annotation denotes that the annotated method should be executed after each test method. For example, if the tests need to reset a property after each test, the method can be annotateted with @AfterEach for that task. 

#### @BeforeAll, @AfterAll

- The @BeforeAll annotation executes a method before all tests. This is typically used to initialize various things for the tests.
- The @AfterAll annotation is used to execute the annotated method, only after all tests have been executed. This annotation is used to tear down or terminate all processes at the end of all tests.

#### @DisplayName

- This annotation is used to declare custom display names on test classes and test methods, that will then be displayed by test runners and test reports.

#### @Nested

- This annotation allows to group  several tests classes together, that is testing the same functionality. 

#### assumeFalse, assumeTrue

- These are used to support conditional test execution based on assumptions. Assumptions are typically used whenever it does not make sense to continue execution of a given test method. In test report, these test will be marked as passed.
- assumeTrue() validates the given assumption to true and if assumption is true – test proceed, otherwise test execution is aborted.
- assumeFalse() validates the given assumption to false and if assumption is false – test proceed, otherwise test execution is aborted. 

### 3.2 Mocking frameworks

<i>Choose at least two mocking frameworks, and answer the questions.</i>

I have choosen to compare Mockito and EasyMock which is two mocking frameworks used within Java. 

#### What are their similarities?

- Mockito and EasyMock are both open-source, Java-based mocking framework used in unit testing. They are also easily configured with annotations to help defining mocks and the object-under-test, with runners to make mock injection easier.

#### What are their differences?

- Where Mockito differs from EasyMock is in the way it deals with expectations. In EasyMock the expectations have to be recorded. Mockito does not do require that. Instead it's possible to verify mock invocation verifications (of your choosing) AFTER the test is executed.

#### Which one would you prefer, if any, and why?

- I find it difficult to prefer one above the other, as I have very limited knowledge and little experience with both mocking frameworks. I see that Mockito have gotten a lot of recognition and seems to have a lot of support, which is very important as a newly educated developer.
 
