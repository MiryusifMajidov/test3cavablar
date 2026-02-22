void main() throws ExecutionException, InterruptedException {
   /* List<Integer> nums = List.of(3, 10, 15, 20, 7, 8);
    Tapşırıq:
•	Tək ədədləri filter et
•	Hər birini 3-ə vur (map)
•	Azalan sıraya görə sort et
•	Nəticəni yeni List kimi qaytar

    List<String> names = List.of("Ali", "Aysel", "Murad", "Nigar", "Amin");
    Tapşırıq:
•	Adları ilk hərfinə görə qrupla (groupingBy)
•	Hər qrupda neçə element olduğunu hesabla
•	Nəticə tipi belə olsun:
    Map<Character, Long>


•	ExecutorService ilə fixed thread pool yarat (3 thread)
•	1-dən 5-ə qədər ədədlərin kvadratını hesablayan Callable task-lar yaz
•	Future vasitəsilə nəticələri götür və çap et
•	Pool-u düzgün shutdown et


    24. Stream API — Çox Sadə Tapşırıq
    Aşağıdakı list verilir:
    List<Integer> nums = List.of(1, 2, 3, 4, 5);
    Tapşırıq:
•	Stream istifadə et
•	Yalnız cüt ədədləri seç (filter)
•	Hər birini 2-ə vur (map)
•	Nəticəni List<Integer> kimi qaytar

    List<Integer> verilir:
    List<Integer> numbers = List.of(1,2,3,4,5,6);
    Tapşırıq:
•	ExecutorService istifadə edərək hər elementi paralel olaraq faktorial hesabla
•	Nəticələri Stream ilə sum() et
•	Yekun cəmi qaytar*/


    //task 1
    List<Integer> nums = List.of(3, 10, 15, 20, 7, 8);
    List<Integer> result = nums.stream().filter(n->n%2!=0).map(n->n*3).sorted((a,b)->b-a).toList();
    System.out.println("Task 1 "+result);


    //task2
    List<String> names = List.of("Ali", "Aysel", "Murad", "Nigar", "Amin");
    Map<Character, Long> result2 = names.stream().collect(Collectors.groupingBy(name->name.charAt(0),Collectors.counting()));
    System.out.println("Task 2 "+result2);

    //task 3
    ExecutorService executorService = Executors.newFixedThreadPool(3);

    for (int i = 0; i < 5; i++) {
        final int number = i;

        Callable<Integer> task = ()-> {
            return number * number;
        };
        Future<Integer> future = executorService.submit(task);

        System.out.println(future.get());


    }
    executorService.shutdown();
 //

    //task4

    List<Integer> nums4 = List.of(1, 2, 3, 4, 5);
    List<Integer> result4 = nums4.stream().filter(n->n%2==0).map(n->n*2).toList();
    System.out.println("Task 4 "+result4);

    //task5
    List<Integer> numbers = List.of(1,2,3,4,5,6);


    ExecutorService executorService1 = Executors.newFixedThreadPool(3);

    List<Future<Long>> futures = numbers.stream().map(n->executorService1.submit(()->getFactorial(n))).toList();

    long sum = futures.stream().map(n-> {
        try {
            return n.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }).mapToLong(Long::longValue).sum();
    executorService1.shutdown();
    System.out.println("Task 5 "+sum);

}
public static long getFactorial(int n){
    long result = 1;
    for (int i = 1; i < n; i++) {
        result *= i;
    }
    return result;
}

