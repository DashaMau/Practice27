import java.util.PriorityQueue;

class PriorityQueueExample {
    static class Element implements Comparable<Element> {
        int priority;
        String value;

        Element(int priority, String value) {
            this.priority = priority;
            this.value = value;
        }

        @Override
        public int compareTo(Element other) {
            return Integer.compare(this.priority, other.priority);
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Element> priorityQueue = new PriorityQueue<>();


        priorityQueue.add(new Element(5, "Задание 5"));
        priorityQueue.add(new Element(1, "Задание 1"));
        priorityQueue.add(new Element(3, "Задание 3"));
        priorityQueue.add(new Element(4, "Задание 4"));
        priorityQueue.add(new Element(2, "Задание 2"));
        priorityQueue.add(new Element(10, "Задание 10"));
        priorityQueue.add(new Element(6, "Задание 6"));
        priorityQueue.add(new Element(9, "Задание 9"));
        priorityQueue.add(new Element(8, "Задание 8"));
        priorityQueue.add(new Element(7, "Задание 7"));


        System.out.println("Извлечение элементов из очереди с приоритетом:");
        for (int i = 0; i < 5; i++) {
            Element element = priorityQueue.poll();
            if (element != null) {
                System.out.println("Приоритет: " + element.priority + ", Значение: " + element.value);
            }
        }
    }
}

