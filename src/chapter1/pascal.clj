(in-ns 'chapter1.core)

(defn pascal [n] (take n (iterate (concat [1] #(map + % (rest %)) [1]) [1])))
