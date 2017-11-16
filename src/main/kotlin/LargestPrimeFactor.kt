import common.Util.getPrimesWithSieve

class LargestPrimeFactor {
    fun findLargestPrimeFactor(num: Long): Int? {
        if (num <= 1) return -1

        val sqrt = Math.sqrt(num.toDouble()).toInt()

        var primes = getPrimesWithSieve(sqrt)
        return primes.filter { num % it == 0L }.max()
    }
}