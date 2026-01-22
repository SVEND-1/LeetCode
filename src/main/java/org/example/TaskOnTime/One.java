package org.example.TaskOnTime;

import java.util.*;

public class One {
    //Время на выполнения 3 первый задач 30 минут
    //Итоговое потраченное время на 3 первые задачи 12 минут 19 секунд
    //Время на выполнения 4 задачи 15 минут
    //Итоговое потраченное время на 4 задачу 7 минут 17 секунд
    //Время на выполнения 5 задачи 10 минут
    //Итоговое потраченное время на 5 задачу 2 минуты 36 секунд без оптимизации поиска ,а с бинарным поиском 7 минут 59 секунд
    //Время на выполнения 6 задачи 45 минут
    //Итоговое потраченное время
    //Время на выполнения 7 задачи 30 минут
    //Итоговое потраченное время
    //Время на выполнения 8 задачи 20 минут
    //Итоговое потраченное время
    //Время на выполнения 9 задачи 10 минут
    //Итоговое потраченное время 3 минуты 50 секунд
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
        task8();
//        task9();
    }

    private static void task1(){
        //Даны два целых числа A и B.
        //Найдите их сумму.
        //
        //Входные данные:
        //Первая строка содержит число A.
        //Вторая строка содержит число B.
        //
        //Ограничения:
        //-10^9 ≤ A, B ≤ 10^9
        //
        //Выходные данные:
        //Выведите одно число — сумму A и B.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
    }

    private static void task2(){
        //Дан массив из N целых чисел.
        //Посчитайте количество четных чисел в массиве.
        //
        //Входные данные:
        //Первая строка содержит число N (1 ≤ N ≤ 10^5).
        //Вторая строка содержит N целых чисел через пробел.
        //
        //Ограничения:
        //-10^9 ≤ числа ≤ 10^9
        //
        //Выходные данные:
        //Выведите одно число — количество четных чисел.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] chet = new int[N];
        for (int i = 0; i < N; i++) {
            chet[i] = sc.nextInt();
        }
        int countChet = (int) Arrays.stream(chet).filter(i -> i % 2 == 0).count();
        System.out.println(countChet);
    }

    private static void task3(){
        //Дана строка s, содержащая только символы:
        //'(', ')', '{', '}', '[', ']'
        //
        //Определите, является ли строка валидной скобочной последовательностью.
        //
        //Входные данные:
        //Строка s (1 ≤ длина ≤ 10^4).
        //
        //Выходные данные:
        //YES или NO
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if(currentChar == '{' || currentChar == '(' || currentChar == '['){
                stack.push(currentChar);
            }
            else {
                if(stack.isEmpty()){
                    System.out.println("NO");
                    return;
                }

                char topChar = stack.pop();
                if((topChar == '{' && currentChar != '}') ||
                        (topChar == '(' && currentChar != ')') ||
                        (topChar == '[' && currentChar != ']')){
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");
    }

    private static void task4(){//Посмотреть
        //Дан массив целых чисел nums.
        //Найдите непрерывный подмассив с максимальной суммой
        //и верните эту сумму.
        //
        //Входные данные:
        //Первая строка содержит число N (1 ≤ N ≤ 10^5).
        //Вторая строка содержит N целых чисел через пробел.
        //
        //Ограничения:
        //-10^4 ≤ числа ≤ 10^4
        //
        //Выходные данные:
        //Выведите максимальную сумму подмассива.
        // Вход:
        //9
        //-2 1 -3 4 -1 2 1 -5 4
        //
        //Выход:
        //6
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }

        //O(n^2)
        int max = nums[0];
        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = i; j < N; j++) {
                sum += nums[j];
                if(max < sum){
                    max = sum;
                }
            }
        }
        System.out.println(max);

        //O(n)
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 0; i < nums.length; i++) {
            currentSum = Math.max(nums[i],currentSum + nums[i]);
            maxSum = Math.max(maxSum,currentSum);
        }
        System.out.println(maxSum);
    }

    private static void task5(){

        //Дан отсортированный по возрастанию массив целых чисел
        //и число target. Найдите индекс target в массиве.
        //Если target отсутствует, верните -1.
        //
        //Входные данные:
        //Первая строка содержит число N (1 ≤ N ≤ 10^5).
        //Вторая строка содержит N целых чисел через пробел
        //(отсортированы по возрастанию).
        //Третья строка содержит число target.
        //
        //Ограничения:
        //-10^9 ≤ числа ≤ 10^9
        //
        //Выходные данные:
        //Выведите индекс target (0-based) или -1.
        //Вход:
        //6
        //1 3 5 7 9 11
        //7
        //
        //Выход:
        //3
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        int left = 0;
        int right = N - 1;
        while (right >= left){
            int middle = (left + right) / 2;

            if(nums[middle] == target){
                System.out.println(middle);
                return;
            }
            else if(nums[middle] < target){
                left = middle + 1;
            }
            else {
                right = middle - 1;
            }
        }

        System.out.println(-1);
    }

    private static void task6(){
        //Дан лабиринт N x M клеток:
        //- 0 — свободная клетка
        //- 1 — стена
        //- Начало: (0, 0)
        //- Выход: (N-1, M-1)
        //
        //Найдите длину кратчайшего пути из начала в конец.
        //Можно двигаться вверх, вниз, влево, вправо.
        //Если пути нет, выведите -1.
        //
        //Входные данные:
        //Первая строка содержит N и M (1 ≤ N, M ≤ 1000).
        //Следующие N строк содержат M чисел 0 или 1.
        //
        //Выходные данные:
        //Длина кратчайшего пути или -1.

    }

    private static void task7(){
        //Дано N предметов, каждый имеет вес w[i] и стоимость v[i].
        //И рюкзак вместимостью W.
        //Найдите максимальную стоимость предметов, которые можно
        //положить в рюкзак, не превышая его вместимость.
        //
        //Входные данные:
        //Первая строка содержит N и W (1 ≤ N ≤ 100, 1 ≤ W ≤ 10^4).
        //Следующие N строк содержат w[i] и v[i] через пробел.
        //
        //Ограничения:
        //1 ≤ w[i] ≤ W
        //1 ≤ v[i] ≤ 10^4
        //
        //Выходные данные:
        //Максимальная стоимость.
        //Вход:
        //4 5
        //2 3
        //3 4
        //4 5
        //5 6
        //
        //Выход:
        //7
    }

    private static void task8(){
        //Дан массив интервалов intervals, где intervals[i] = [start_i, end_i].
        //Объедините все пересекающиеся интервалы и верните массив
        //непересекающихся интервалов, покрывающий все интервалы во входе.
        //
        //Входные данные:
        //Первая строка содержит N (1 ≤ N ≤ 10^4).
        //Следующие N строк содержат start_i и end_i через пробел.
        //
        //Ограничения:
        //0 ≤ start_i ≤ end_i ≤ 10^4
        //
        //Выходные данные:
        //Выведите объединенные интервалы, каждый на новой строке.
        //Вход:
        //4
        //1 3
        //2 6
        //8 10
        //15 18
        //
        //Выход:
        //1 6
        //8 10
        //15 18
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] intervals = new int[N][2];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2; j++) {
                intervals[i][j] = sc.nextInt();
            }
        }

        Arrays.sort(intervals,(i1,i2) -> i1[0] - i2[0]);
        List<Integer[]> merge = new ArrayList<>();
        int[] prev = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            int[] current = intervals[i];
            if(current[0] <= prev[1]){
                prev[1] = Math.max(prev[1],current[1]);
            }
            else{
                merge.add(new Integer[]{prev[0],prev[1]});
                prev = current;
            }
        }
        merge.add(new Integer[]{prev[0],prev[1]});

        int[][] result = new int[merge.size()][2];
        int i = 0;
        for (Integer[] integers : merge) {
           result[i][0] = integers[0];
           result[i][1] = integers[1];
           i++;
        }

    }

    private static void task9(){
        //Написать сортировку массива
        //Входные данные строка N количество элементов массива
        //строка nums[i]
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            boolean check = false;
            for (int j = 0; j < N - 1; j++) {
                if(nums[j] > nums[j + 1]) {
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                    check = true;
                }
            }
            if(check){
                break;
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.println(nums[i]);
        }
    }
}
