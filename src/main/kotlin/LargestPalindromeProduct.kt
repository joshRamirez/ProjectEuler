import common.Util.isPalindrome

class LargestPalindromeProduct {
    fun findLargestPalindromeProduct(digits: Int): Int {
        var lowerBoundArray = Array(digits, { 0 })
        lowerBoundArray[0] = 1
        var lowerBound = lowerBoundArray.joinToString("").toInt()
        var upperBound = Array(digits, { 9 }).joinToString("").toInt()
        var max = -1

        for (i in upperBound downTo lowerBound) {
            for (j in upperBound downTo i) {
                if (isPalindrome((i * j).toString())) {
                    if (max < i * j) max = i * j
                }
            }
        }

        return max
    }
}