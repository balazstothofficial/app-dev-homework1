package lecture.solution

/**
 * # Functions
 * Probably the most important topic in this lecture.
 * We start by looking at top-level functions.
 *
 * ## Tasks:
 * - Write a top-level function `math`, which takes two [Int]s and returns an [Int]s.
 *  Use and understand the +, -, *, /, and % operators to calculate something.
 *  Return the result using the `return` keyword.
 *  Call it with two values and print its result.
 * - Write a top-level function `formula`, which takes two booleans and returns a boolean.
 *  The second argument should have a default value.
 *  Use and understand the &&, ||, and ! operators to combine the parameters somehow.
 *  Return the result without using the `return` keyword.
 *  Call it with one values as named argument and print its result.
 *
 * ## Resources:
 * - [Functions](https://kotlinlang.org/docs/functions.html)
 * - [Parameters with default values](https://kotlinlang.org/docs/functions.html#parameters-with-default-values)
 * - [Named arguments](https://kotlinlang.org/docs/functions.html#named-arguments)
 * - [Single expression functions](https://kotlinlang.org/docs/functions.html#single-expression-functions)
 */
fun main() {
    val result = math(1, 2)
    println(result)

    val truth = formula(a = false)
    println(truth)
}

// Needs an explicit return type
fun math(x: Int, y: Int): Int {
    return x + y - x * y / x % x
}

fun formula(a: Boolean, b: Boolean = true) = a && b || !a
