(if (> 1 2)
    (println "1 é maior que 2")
    (println "1 não é maior que 2"))

;; Retorno:
;;  1 não é maior que 2
;;  nil

(def a 5)

(if (< a 0)
    (println "Menor que 0")
    (if (= a 0)
        (println "Igual a 0")
        (println "Maior que 0")))

;; Retorno:
;;  Maior que 0
;;  nil


(let [a 5]
  (if (< a 0)
    (println "Menor que 0")
    (if (= a 0)
        (println "Igual a 0")
        (println "Maior que 0"))))

;; Retorno:
;;  Maior que 0
;;  nil


(if (> 1 2)
    (do
      (println "Epa, recebi seus valores!")
      (println "Pelo que parece 1 é maior que 2!"))
    (do
      (println "Epa, recebi seus valores aqui hein!")
      (println "Pelo que parece 1 não é maior que 2!")))

;; Retorno:
;;  Epa, recebi seus valores aqui hein!
;;  Pelo que parece 1 não é maior que 2!
;;  nil
