import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class JunitHelloWorldTest {

    private  JunitHelloWorld junitHelloWorld;
    @BeforeAll
    public static void beforeClass(){
        System.out.println("Before - I am only Called once!!");
    }

    @BeforeEach
    void ObjectSetup(){
        System.out.println("In Before Each...");
        junitHelloWorld=new JunitHelloWorld();

    }

    @Test
    void helloworld() {
        //JunitHelloWorld junitHelloWorld=new JunitHelloWorld();
        System.out.println(junitHelloWorld.helloworld());

    }

    @Test
    void world() {
       // JunitHelloWorld junitHelloWorld=new JunitHelloWorld();
        System.out.println(junitHelloWorld.world("java"));

    }

    @AfterEach
    void tearDown() {
        System.out.println("In After Each...........");
    }

    @AfterAll
    public static void afterClass(){

        System.out.println("After ****- I am only Called once!!");
    }
}