(ns chapter1.core)

(defn square [a] (* a a))

(defn sumOfSquares [a b c] (+ (square a) (square b) (square c)))

(defn leastNum [a b] (if (< a b) a b))

(defn leastOfThree [a b c] (leastNum a (leastNum b c)))

(defn sumSquareLargerTwo [a b c]
  "takes three numbers and returns sum of squares of larger two`"
  (- (sumOfSquares a b c) (square (leastOfThree a b c))))

;;;;;;;;;;;;;;;;;;;;;;;;

(defn a-plus-abs-b [a b]
  "Sum a and |b|"
  ((if (> b 0) + -) a b))

;;;;;;;;;;;;;;;;;;;;;;;;;

(defn p [] p)

(defn test-x [x y]
  (if (= x 0)
    0
    y))

(load "sqrt")
(load "pascal")
