class EvenFibonacci {
    fun findEvenFib(num: Int): Int {
        var fib = mutableListOf(1,2)
        while (fib.last() < num) {
            fib.add(fib.last() + fib[fib.lastIndex - 1])
        }

        return fib.filter { it % 2 == 0 }.sum()
    }
}