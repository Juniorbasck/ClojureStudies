(let [n 10]
  (cond
    (> n 0) (println "O número é positivo!")
    (< n 0) (println "O número é negativo!")
    :else (println "Ok, o número não é positivo nem negativo...")))

;; Resultado:
;;  O número é positivo!
;;  nil
