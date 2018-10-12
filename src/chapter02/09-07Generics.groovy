ArrayList<Integer> integers = new ArrayList<Integer>()
integers.add(1)
integers.add(2.0)
integers.add('a')
integers.add('Hello')
println 'List populated:'
for (it in integers)
    print("$it ")
//        List populated:
//        1 2.0 a Hello
//        Process finished with exit code 0

println "\b"

integers = []
integers << 1
integers << 2.0
integers << 'a'
integers << 'Hello'
println integers