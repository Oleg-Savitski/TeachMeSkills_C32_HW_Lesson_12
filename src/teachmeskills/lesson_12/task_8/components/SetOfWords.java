package teachmeskills.lesson_12.task_8.components;

import java.util.*;

public class SetOfWords {
    public int findSteps(String startWord, String targetWord, List<String> wordList) {
        Set<String> words = new HashSet<>(wordList);

        if (!words.contains(targetWord)) {
            return 0;
        }

        Queue<String> queue = new LinkedList<>();
        queue.add(startWord);
        int steps = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String currentWord = queue.poll();
                if (currentWord.equals(targetWord)) {
                    return steps;
                }

                for (int j = 0; j < currentWord.length(); j++) {
                    for (char c = 'a'; c <= 'z'; c++) {
                        if (c != currentWord.charAt(j)) {
                            String newWord = currentWord.substring(0, j) + c + currentWord.substring(j + 1);
                            if (words.contains(newWord)) {
                                queue.add(newWord);
                                words.remove(newWord);
                            }
                        }
                    }
                }
            }
            steps++;
        }

        return 0;
    }
}