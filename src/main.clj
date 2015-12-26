(defn xors [max-x max-y]  (for [x (range max-x) y (range max-y) ] [x y (bit-xor x y)] ))
(def frame (java.awt.Frame.))
(.setVisible frame true)
(def gfx (.getGraphics frame))

(.setColor gfx (java.awt.Color. 255 128 0))
(.fillRect gfx 100 150 75 50)

(defn calc [x y f]
  (for [a (range x) b (range y)]
    [a b (rem (f a b) 256) ]))

(defn draw [x y f]
  (.setSize frame (java.awt.Dimension. x y))
  (doseq [[x y v] (calc x y f)]
    (.setColor gfx (java.awt.Color. v v v))
    (.fillRect gfx x y 1 1)))


(draw 1024 768 bit-or)