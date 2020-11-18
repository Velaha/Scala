package com.td.recursion

object Sum {

  def closedForm(n: Long): Long = (n * (n + 1)) / 2;

  def recursive(n: Long): Long =
    if (n == 0) n
    else n + recursive(n - 1)

  def tailrecursive(n: Long): Long = {
    @annotation.tailrec
    def helper(n: Long, acc: Long): Long =
      if (n == 0) acc
      else helper(n - 1, acc + n)

    helper(n, 0)
  }

}
