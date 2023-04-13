package latihanm4;

import java.util.LinkedList;
import java.util.Queue;

public class latihanm42 {
    public void queueExample() {
        Queue queue = new LinkedList<>();
        queue.add("java");
        queue.add("dotnet");
        queue.offer("fuf");
        queue.offer("html");
        System.out.println("remove" + queue.remove());
        System.out.println("elementasi" + queue.element());
        System.out.println("poll" + queue.poll());
        System.out.println("pek" + queue.peek());

    }

    public static void main(String[] args) {
        new latihanm42().queueExample();
    }
}
