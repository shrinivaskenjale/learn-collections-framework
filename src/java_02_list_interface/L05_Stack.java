package java_02_list_interface;

import java.util.Stack;

public class L05_Stack {
    public static void main(String[] args) {
        // ================
        // Create a stack
        // ================

        // Stack<Type> stack = new Stack<>();
        Stack<Integer> s = new Stack<>();

        // =========================================
        // Push elements
        // =========================================

        // push(element): Add the element at top
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        System.out.println(s);

        // =========================================
        // Access top element
        // =========================================

        // peek(): Returns element at the top of the stack without removing it.
        int topValue = s.peek();

        // Throws exception if stack is empty.

        System.out.println(topValue);

        // =========================================
        // Pop elements
        // =========================================

        // pop(): Removes element at the top and returns it
        int poppedValue = s.pop();

        // Throws exception if stack is empty.

        System.out.println(poppedValue);
        System.out.println(s);

        // =========================================
        // Useful methods
        // =========================================

        // size(): Returns size of the stack
        System.out.println(s.size());

        // empty() & isEmpty(): Check if stack is empty
        System.out.println(s.empty()); // Stack specific
        System.out.println(s.isEmpty()); // Inherited from Vector

        // search(element): Returns position of element from top
        System.out.println(s.search(3));
    }
}

/*
 * The Java collections framework has a class named Stack that provides the
 * functionality of the stack data structure.
 * 
 * The Stack class extends the Vector class.
 * 
 * In stack, elements are stored and accessed in Last In First Out manner. That
 * is, elements are added to the top of the stack and removed from the top of
 * the stack.
 * 
 * Since Stack extends the Vector class, it inherits all the methods Vector.
 * Besides these methods, the Stack class includes 5 more methods that
 * distinguish it from Vector.
 * 
 * 1. push()
 * 2. pop()
 * 3. peek()
 * 4. search()
 * 5. empty()
 * 
 * =================================
 * Use ArrayDeque Instead of Stack
 * =================================
 * 
 * The Stack class provides the direct implementation of the stack data
 * structure. However, it is recommended not to use it. Instead, use the
 * ArrayDeque class (implements the Deque interface) to implement the stack data
 * structure in Java.
 * 
 * https://stackoverflow.com/questions/12524826/why-should-i-use-deque-over-
 * stack
 */