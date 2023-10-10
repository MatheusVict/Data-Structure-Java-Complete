package io.matheusvictor.dataStructure.stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.add("matheus");
        stack.add("henrique");
        stack.add("victor");
        stack.add("oi");

        System.out.println(stack.get());
        stack.remove();
        System.out.println(stack.get());
    }
}
