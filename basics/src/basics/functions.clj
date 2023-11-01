(ns basics.functions (:gen-class))

;; def defines a value increment, an anonymous func that increments the value by 1
(def increment-one (fn [x] (+ x 1)))

(defn increment-one-to-three
  []
  (map increment-one [1 2 3]))

;; #() <- anonymous function and % is ONE argument
;(#(println "anonymous func" %) "jajaj")

; result: hello Rafael are u feeling Happy ?
(#(println "hello" %1 "are u feeling" %2 "?") "Rafael" "Happy")

(def pet-types {`:cat` 7, `:dog` 5, `:fish` 10})

(defn calculate-pet-age
  "return age in human years"
  [pet-age pet-name]
  (* pet-age (get pet-types pet-name)))

(println (calculate-pet-age 2 'cat))

(defn -main
  "description"
  []
  (println "my name is rafael")
  (println "i love clojure")
  (+ 2 5)
  (println (increment-one-to-three)))

