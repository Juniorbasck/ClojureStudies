(loop [i 1]
  (when (<= i 10)
    (println i)
    (recur (inc i))))

;; inc incimenta no valor de i
