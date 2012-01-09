(ns fizzbuzz.test.fizzbuzz_spec
  (:use [fizzbuzz.fizzbuzz])
  (:use [clojure.test]))

(deftest fizzbuzz-divisible-by-5-and-3
  (is (= :fizzbuzz (fizzbuzz 15)))
  (is (= :fizzbuzz (fizzbuzz 60))))

(deftest fizzbuzz-divisible-by-3
  (is (= :fizz (fizzbuzz 3)))
  (is (= :fizz (fizzbuzz 12))))

(deftest fizzbuzz-divisible-by-5
  (is (= :buzz (fizzbuzz 5)))
  (is (= :buzz (fizzbuzz 20))))

(deftest fizzbuzz-numbers
  (is (= 4 (fizzbuzz 4)))
  (is (= 16 (fizzbuzz 16))))