import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Шиншилла");
        animals.add("Крокодил");
        animals.add("Лев");
        animals.add("Медведь");
        animals.add("Слон");
        for (String animal: animals) {
            System.out.println("Сегодня в зоопарке можно увидеть кормления " + animal + " животных:");
        }
        System.out.println("Расписание кормлений:");
        System.out.println("В 9:00 - " + animals.get(1));
        System.out.println("В 10:00 - " + animals.get(4));
        System.out.println("В 9:00 - " + animals.get(0));
        System.out.println("В 9:00 - " + animals.get(2));
        System.out.println("В 9:00 - " + animals.get(3));

    }
}
