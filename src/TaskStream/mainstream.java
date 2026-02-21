import TaskStream.Employee;

void main() {
    List<Integer> numbers = List.of(1,2,41,52,60,3,41);
    List<String> names = List.of("java","stream","Alice","Andrew","api");

    List<String> data = Arrays.asList("A",null,"B",null,"C");
    List<List<String>> list = List.of(
         List.of("A","B"),
         List.of("C","D")
    );

    List<Employee> employees  = List.of(
            new Employee("elsen",2100),
            new Employee("yusif",2000),
            new Employee("elvin",2400),
            new Employee("nuru",2900));

    List<Integer> evens = numbers.stream().filter(n -> n%2==0).toList();
    System.out.println("Task1 - "+evens);

    List<String> upperNames = names.stream().map(String::toUpperCase).toList();
    System.out.println("Task2 - "+upperNames);

    List<Integer> countOfGreatNum = numbers.stream().filter(n->n>10).toList();
    System.out.println("Task3 - "+ countOfGreatNum);

    List<String> onlyNotNull = data.stream().filter(Objects::nonNull).toList();
    System.out.println("Task4 - "+onlyNotNull);

    List<String> nameWithFirstA = names.stream().filter(s->s.startsWith("A")).toList();
    System.out.println("Task5 - "+nameWithFirstA);

    List<Integer> squaredSorted = numbers.stream().map(n->n*n).sorted().toList();
    System.out.println("Task6 - "+squaredSorted);

    int sumEvenNum = numbers.stream().filter(n->n%2==0).mapToInt(n->n).sum();
    System.out.println("Task7 - "+sumEvenNum);

    Map<String, Integer> map = names.stream().collect(Collectors.toMap(n->n, String::length));
    System.out.println("Task8 - "+map);

    Optional<Integer> max = numbers.stream().max(Integer::compareTo);
    System.out.println("Task9 - "+max);

    Map<Integer, List<String>> grouped = names.stream().collect(Collectors.groupingBy(String::length));
    System.out.println("Task10 - "+grouped);

    Map<Boolean, List<Integer>> parts = numbers.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
    System.out.println("Task11 - "+parts);

    Set<Integer> seen = new HashSet<>();
    Set<Integer> duplicates = numbers.stream()
         .filter(n -> !seen.add(n))
         .collect(Collectors.toSet());

    System.out.println("Task12 - "+duplicates);

    List<String> flat = list.stream().flatMap(Collection::stream).toList();
    System.out.println("Task13 - "+flat);

    List<Employee> employeeList = employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).toList();
    System.out.println("Task14 - "+employeeList);

    double avg = employees.stream().collect(Collectors.averagingDouble(Employee::getSalary));
    System.out.println("Task15 - "+avg);

//Task16
    names.stream().forEach(System.out::println);

    List<Integer> gt5 = numbers.stream().filter(n -> n > 5).toList();
    System.out.println("Task17 - "+gt5);

    List<Integer> doubled = numbers.stream().map(n -> n * 2).toList();
    System.out.println("Task18 - "+doubled);

    List<Integer> lengths = names.stream().map(String::length).toList();
    System.out.println("Task19 - "+lengths);


    boolean anyEven = numbers.stream().anyMatch(n -> n % 2 == 0);

    System.out.println("Task20 - "+anyEven);

    boolean allPositive = numbers.stream().allMatch(n -> n > 0);
    System.out.println("Task21 - "+allPositive);


    boolean noneNegative = numbers.stream().noneMatch(n -> n < 0);
    System.out.println("Task22 - "+noneNegative);

    List<String> sorted = names.stream().sorted().toList();
    System.out.println("Task23 - "+sorted);

    List<Integer> desc = numbers.stream().sorted(Comparator.reverseOrder()).toList();
    System.out.println("Task24 - "+desc);

    Optional<Integer> min = numbers.stream().min(Integer::compareTo);
    System.out.println("Task25 - "+min);

    Optional<String> first = names.stream().findFirst();
    System.out.println("Task26 - "+first);

    List<Integer> afterSkip = numbers.stream().skip(2).toList();
    System.out.println("Task27 - "+afterSkip);

    List<Integer> first3 = numbers.stream().limit(3).toList();
    System.out.println("Task28 - "+first3);


    List<Integer> distinct = numbers.stream().distinct().toList();
    System.out.println("Task29 - "+distinct);


    List<String> asStrings = numbers.stream().map(String::valueOf).toList();
    System.out.println("Task30 - "+asStrings);

    String joined = names.stream()
            .collect(Collectors.joining(","));
    System.out.println("Task31 - "+joined);


    int sum = numbers.stream()
            .mapToInt(Integer::intValue)
            .sum();
    System.out.println("Task32 - "+sum);


    long total = names.stream().count();
    System.out.println("Task33 - "+total);

    boolean isEmpty = !names.stream().findAny().isPresent();
    System.out.println("Task34 - "+isEmpty);

    Set<String> set = names.stream()
            .collect(Collectors.toSet());
    System.out.println("Task35 - "+set);


}