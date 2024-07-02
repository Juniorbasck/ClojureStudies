(defn infinitos-2 [primeiro & args]
  (println "O primeiro argumento foi " primeiro "\nOs demais são: " args))

(infinitos-2 1 2 3 4)

;; Resultado:
;;  O primeiro argumento foi  1 
;;  Os demais são:  (2 3 4)
;;  nil
