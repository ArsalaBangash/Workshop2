package com.arsalabangash.android.androidworkshop2.learning

fun helloWorld(): String {
    TODO("Complete the body of the function")
}

/**
 * Given a string and a non-negative int n, return a larger string that is n copies
 * of the original string.

stringTimes("Hi", 2) → "HiHi"
stringTimes("Hi", 3) → "HiHiHi"
stringTimes("Hi", 1) → "Hi"
 */
fun stringTimes(s: String, n: Int): String {
    TODO("Complete the body of the function")
}

/**
 * Given a string and an int n, return a string made of the first n characters of the string,
 * followed by the first n-1 characters of the string, and so on. You may assume that n is
 * between 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).
 *
 * repeatFront("Chocolate", 4) → "ChocChoChC"
 * repeatFront("Chocolate", 3) → "ChoChC"
 * repeatFront("Ice Cream", 2) → "IcI"
 */
fun repeatFront(s: String, n: Int): String {
    TODO("Complete the body of the function")
}

/**
 * Given three ints, a b c, one of them is small, one is medium and one is large.
 * Return true if the three values are evenly spaced, so the difference between small
 * and medium is the same as the difference between medium and large.

evenlySpaced(2, 4, 6) → true
evenlySpaced(4, 6, 2) → true
evenlySpaced(4, 6, 3) → false
 */
fun evenlySpaced(values: Triple<Int, Int, Int>): Boolean {
    TODO("Complete the body of the function")
}

/**
 * We'll say that a value is "everywhere" in an array if for every pair of adjacent elements
 * in the array, at least one of the pair is that value. Return true if the given value
 * is everywhere in the array.

isEverywhere([1, 2, 1, 3], 1) → true
isEverywhere([1, 2, 1, 3], 2) → false
isEverywhere([1, 2, 1, 3, 4], 1) → false
 */
fun isEveryWhere(a: Array<Int>, n: Int): Boolean {
    TODO("Complete the body of the function")
}

/**
 * Given an array of strings, return a HashMap<String, Boolean> where each different string
 * is a key and its value is true if that string appears 2 or more times in the array.

wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
wordMultiple(["c", "c", "c", "c"]) → {"c": true}
 */
fun wordMultiple(a: Array<String>): HashMap<String, Boolean> {
    TODO("Complete the body of the function")
}

/**
 * Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n}
 * (spaces added to show the grouping). Note that the length of the array will be 1 + 2 + 3 ... + n,
 * which is known to sum to exactly n*(n + 1)/2.

seriesUp(3) → [1, 1, 2, 1, 2, 3]
seriesUp(4) → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
seriesUp(2) → [1, 1, 2]
 */
fun seriesUp(n: Int): ArrayList<Int> {
    TODO("Complete the body of the function")
}

/**
 * We'll say that a "triple" in a string is a char appearing three times in a row.
 * Return the number of triples in the given string. The triples may overlap.

countTriple("abcXXXabc") → 1
countTriple("xxxabyyyycd") → 3
countTriple("a") → 0
 */
fun countTriple(s: String) {
    TODO("Complete the body of the function")
}

