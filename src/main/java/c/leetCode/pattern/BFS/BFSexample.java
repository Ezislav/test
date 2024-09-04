package c.leetCode.pattern.BFS;


// Binary Tree BFS (Breadth-First Search)
// Этот паттерн используется для прохождения всех узлов дерева уровня за уровнем, начиная с корня и двигаясь к нижним уровням.
// BFS часто используется для задач, которые требуют обработки или вычислений для каждого уровня дерева.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Этот подход используется для задач, требующих обхода дерева уровнями, нахождения кратчайшего пути, и других задач,
// где важно обрабатывать узлы в порядке их удаления от корня.

// Класс, представляющий узел бинарного дерева
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class BFSexample {

    // Метод для уровневого обхода бинарного дерева
    public List<List<Integer>> levelOrder(TreeNode root) {

        // Список для хранения результата
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        // Очередь для хранения узлов текущего уровня
        Queue<TreeNode> queue = new LinkedList<>();
        // Добавляем корневой узел в очередь
        queue.offer(root);

        // Пока очередь не пуста
        while (!queue.isEmpty()) {

            // Определяем размер текущего уровня
            int levelSize = queue.size();

            // Список для хранения значений текущего уровня
            List<Integer> currentLevel = new ArrayList<>();

            // Обрабатываем все узлы текущего уровня
            for (int i = 0; i < levelSize; i++) {

                // Извлекаем узел из очереди и удаляем его из очереди
                TreeNode currentNode = queue.poll();
                // Добавляем значение узла в список текущего уровня
                currentLevel.add(currentNode.val);

                // Добавляем левого потомка в очередь, если он существует
                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }

                // Добавляем правого потомка в очередь, если он существует
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }

            // Добавляем текущий уровень в результат
            result.add(currentLevel);
        }

        // Возвращаем результат
        return result;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(15);
        root.right.left = new TreeNode(18);
        root.right.right = new TreeNode(7);

        BFSexample solution = new BFSexample();
        List<List<Integer>> levels = solution.levelOrder(root);
        System.out.println(levels); // Вывод: [[3], [9, 20], [15, 7]]
    }

    //         3
    //       /   \
    //      9     20
    //     /     /  \
    //    15    18   7
}