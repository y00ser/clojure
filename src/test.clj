(defn iter [coll rv]
  (if (seq coll)
      (recur (rest coll) (into rv [[(first coll) (first coll)]]))
    rv )
  )

(defn flatline [coll]
  (cond
    (map? coll) (seq coll)
    (set? coll) (flatline (seq coll))
    :else (iter coll ())))

(println (= '([:a :b] [:c :d]) (flatline {:a :b :c :d})))
(println (= '([1 1] [2 2] [3 3]) (flatline '(1 2 3))))
(println (flatline #{1 2 3}))

(println (iter '(1 2 3) ()) )
