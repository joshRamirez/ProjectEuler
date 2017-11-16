package common

object Util {
    fun getPrimesWithSieve(UpperLimit: Int): List<Int> {
        val numsToUpperLimit = Array(UpperLimit, { true })
        numsToUpperLimit[0] = false
        numsToUpperLimit[1] = false

        for (i in 2 until Math.sqrt(UpperLimit.toDouble()).toInt()) {
            if (numsToUpperLimit[i]) {
                for (j in i * i until UpperLimit step i) {
                    numsToUpperLimit[j] = false
                }
            }
        }

        var primes = mutableListOf<Int>()
        for (i in 0 until numsToUpperLimit.size) {
            if (numsToUpperLimit[i]) {
                primes.add(i)
            }
        }

        return primes
    }

    fun getPrimes(sqrt: Int): List<Int> {
        var primes = mutableListOf(2)

        outer@ for (i in 3 until sqrt) {
            for (prime in primes) {
                if (i % prime == 0) {
                    continue@outer
                }
            }

            primes.add(i)
        }

        return primes
    }

    fun isPalindrome(input: String): Boolean {
        if (input.length == 1) {
            return true
        } else if (input.length == 2) {
            if (input[0] == input[1]) return true
        } else {
            if (input[0] == input.last()) {
                return isPalindrome(input.substring(1, input.length - 1))
            }
        }

        return false
    }
}