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

;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn- average [a b] (/ (+ a b) 2))

(defn- abs [x] (if (> x 0) x (- x)))

(defn- improve [guess x]
  (average guess (/ x guess)))

(defn- good-enough? [guess x]
  (<= (abs (- x (square guess))) 0.001))

(defn- sqrt-iter [guess x]
  (if (good-enough? guess x)
    guess
    (sqrt-iter (improve guess x) x)))

(defn sqrt [x] (sqrt-iter 1 x))
