# ProjectEuler
My solutions to Project Euler Problems found on https://projecteuler.net/ written in Kotlin. 

Website https://kotlinlang.org/

Docs https://kotlinlang.org/docs/reference/server-overview.html 

common package contains Util which has functions that do a specific generic task like getting a list of primes or checking if a string is a palindrome.
The classes located in the src.main.kotlin directory handle most of the problem specific code.

Tests have been set up to test both the Util and problems' code. Not extensively checking for edge cases, mainly checking for correct solution to the problem!

To try these solutions without setting up Kotlin on your machine try https://try.kotlinlang.org/ 

1. Paste the function(s) underneath `fun main(){  }` 

2. Call the function within the `main` method and printing it.

(You can copy paste this straight into https://try.kotlinlang.org/ and it will work)

Example: 
```
/**
 * We declare a package-level function main which returns Unit and takes
 * an Array of strings as a parameter. Note that semicolons are optional.
 */

fun main(args: Array<String>) {
    println(findLargestPrimeFactor(600851475143))
}

fun findLargestPrimeFactor(num: Long): Int? {
    if (num <= 1) return -1

    val sqrt = Math.sqrt(num.toDouble()).toInt()

    var primes = getPrimesWithSieve(sqrt)
    return primes.filter { num % it == 0L }.max()
}

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
```
