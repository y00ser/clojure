(defn summ [param1]
  (println "Param1 is " param1)
  (loop [ summ 0 x param1]                                  ;we have this so we loop back not to the beginning of func
    (if (pos? x)
      (recur  (+ summ x) (dec x))                           ;tail pos
      summ)                                                 ;tail pos
    ))

(defn summWithoutLoop [param1 param2]
  (if (pos? param2)
    (recur (+ param1 param2) (dec param2))                  ; this is a tail position
    param1))                                                ;this is also a tail position

(defn recurWithWhen [param1, param2]
  "This still not working"
    (when (pos? param2)
      (recur (+ param1 param2) (dec param2)))   ; this is still inside when
  )

(defn forLoop1 [param1]
  (for [x (range param1)] [x x]))

(defn iterateOnSequence [sequence]
  (doseq [[x y] sequence]                                   ; this sequence is list of pair like (1 1) (2 2)
    (println (+ x y))))

;(println (summ 10))
;(println (summWithoutLoop 0 10))
;(println (recurWithWhen 0 10))
;(println (forLoop1 5))
(iterateOnSequence (forLoop1 5))