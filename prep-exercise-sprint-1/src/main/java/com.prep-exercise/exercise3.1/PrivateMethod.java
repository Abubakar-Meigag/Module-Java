

public class PrivateMethod {
        private static String greetUser (String name){
            return "Hello, " + name + "!";
        }

        public static void main(String[] args) {
            System.out.println(greetUser("Alice"));
        }
}

/*

to print out the greetUesr method i need to make it
static otherwise is throws error
"PrivateMethod.java:9: error: non-static method greetUser(String)
cannot be referenced from a static context"

more explanation:
main is static it belongs to the class itself, not to any object.
greetUser was non-static, it belongs to an instance (an object created from the class).
A static context doesn't have an instance, so it can't reach into instance methods.
Java throws that error to tell you: "I don't know which object's greetUser you mean."
By making greetUser also static, it belongs to the class too, so main can call it directly without needing an object.

The rule to remember:
If I want to call a method from main without creating an object,
that method must be static.

*/