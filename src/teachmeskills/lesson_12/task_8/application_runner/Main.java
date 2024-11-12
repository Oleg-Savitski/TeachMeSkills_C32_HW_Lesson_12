package teachmeskills.lesson_12.task_8.application_runner;

import teachmeskills.lesson_12.task_8.components.SetOfWords;

import java.util.List;

/** Имея два слова (начало и конец) и словарь, найдите длину кратчайшей
 * последовательности преобразований от начала до конца, при которой за один раз
 * можно изменить только одну букву.
 * И каждое промежуточное слово должно существовать в словаре.
 * Например, учитывая:
 * старт = "hit"
 * конец = "cog"
 * dict = ["hot", "dot", "dog", "lot", "log"]
 * Одно кратчайшее преобразование — это «hit» -> «hot» -> «dot» -> «dog» -> «cog»,
 * программа должна вернуть длину 5.
 */

public class Main {
    public static void main(String[] args) {
            SetOfWords solver = new SetOfWords();
            List<String> wordList = List.of("hot", "dot", "dog", "cog", "lot", "log"); // работает только с добавлением "cog"
            int steps = solver.findSteps("hit", "cog", wordList);

            System.out.println("Minimum number of steps: " + steps);
        }
}