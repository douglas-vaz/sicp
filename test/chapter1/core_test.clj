(ns chapter1.core-test
  (:use midje.sweet)
  (:use [chapter1.core]))

(facts "Excercise 1.1"
  (fact "should return square of numbers"
    (square 5) => 25)
  (fact "should sum the squares of numbers"
    (sumOfSquares 2 3 4) => 29)
  (fact "should find least among two numbers"
    (leastNum 2 3) => 2)
  (fact "should find least of three numbers"
    (leastOfThree 1 2 3) => 1)
  (fact "should sum the squares of the larger two numners"
    (sumSquareLargerTwo 1 2 3) => 13))

(fact "should add 'a' and absolute value of 'b'"
  (a-plus-abs-b 1 -9) => 10)

(fact "should return 0"
  (test-x 0 (p)) => 0)
