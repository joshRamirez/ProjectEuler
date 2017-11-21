import common.Util.getPrimeFactorFrequency
import common.Util.getPrimeFactors
import common.Util.getPrimes

class SmallestMultiple {
    fun getSmallestMultiple(num: Int): Int {
        val primeLists = (2..num).map { getPrimeFactors(it) }
        val primeMaps = primeLists.map { getPrimeFactorFrequency(it) }
        var primeMap = mutableMapOf<Int, Int>()

        for (map in primeMaps) {
            for (prime in map) {
                if (primeMap.containsKey(prime.key)) {
                    if (primeMap[prime.key]!! < prime.value) {
                        primeMap[prime.key] = prime.value
                    }
                } else {
                    primeMap.put(prime.key, prime.value)
                }
            }
        }

        var smallestMultiple = 1

        for (primeFrequency in primeMap) {
            for (i in 1..primeFrequency.value) {
                smallestMultiple *= primeFrequency.key
            }
        }

        return smallestMultiple
    }
}