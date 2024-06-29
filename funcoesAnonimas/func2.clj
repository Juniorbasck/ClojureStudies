(defn multiplicar [multiplicar-por]
  (fn [n]
    (* n multiplicar-por)))

(def dobrando
  (multiplicar 2))

(dobrando 2) ;; 4

(def triplicando
  (multiplicar 3))

(triplicando 4) ;; 12
