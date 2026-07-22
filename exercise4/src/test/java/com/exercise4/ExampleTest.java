public class ExampleTest {

    @BeforeEach
    public void setup() {
        System.out.println("setting up test data");
    ...
    }

    @Test
    public void testExample1() {
        System.out.println("running test case 1");
    ...
    }
    @AfterAll
    public void closeConnections() {
        System.out.println("closing connections");
    ...
    }

    @BeforeAll
    public void createConnections() {
        System.out.println("creating connections");
    ...
    }
}

/*
— What is the correct order?
Answer:C) creating connections, setting up test data, running test case 1, closing connections

How many times does each message appear when testExample2 is added?
the message will appear in this order:
creating connections
setting up test data - @BeforeEach runs before each tes
running test case 1
setting up test data - @BeforeEach runs before each tes
running test case 2
closing connections


 */