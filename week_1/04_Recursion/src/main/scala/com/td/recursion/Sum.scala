package com.td.recursion

object Sum {

    def closedForm(n: Long): Long = (n * (n + 1)) / 2;

    def recursive(n: Long): Long = if (n == 0) 0 else n + recursive(n - 1)

    def tailrecursive(n: Long): Long = {
        def helper(n : Long, acc : Long): Long = {
            if (n == 0) acc
            else helper(n - 1, n + acc)
        }
        helper(n, 0)
    }

}
