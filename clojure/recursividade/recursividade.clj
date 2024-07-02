(defn contar [n]
  (println n)
  (if (pos? (dec n))
    (contar (dec n))))

(contar 10)
