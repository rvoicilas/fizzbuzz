(ns fizzbuzz.fizzbuzz)

(defn fizzbuzz [number]
  (let [divisible-by-3 (= 0 (rem number 3))
        divisible-by-5 (= 0 (rem number 5))
        divisible-by-15 (and divisible-by-3 divisible-by-5)]
    (cond
     divisible-by-15 :fizzbuzz
     divisible-by-3 :fizz
     divisible-by-5 :buzz
     :default number)))

(defn fizzbuzz-on-first-n-numbers [n]
  (map fizzbuzz (range 1 (inc n))))