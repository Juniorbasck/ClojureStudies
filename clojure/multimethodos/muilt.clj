;; Definimos uma identidade, informando
;; que teremos um `multimethod`
(defmulti fatorial identity)

;; Caso a chamada para fatorial tenha
;; como argumento `0`, então, será
;; retornado 1
(defmethod fatorial 0 [_]  1)

;; Caso contrário (:default) será
;; calculado o fatorial de forma
;; recursiva
(defmethod fatorial :default [n]
  (* n (fatorial (dec n))))

(fatorial 0) ;; 1
(fatorial 1) ;; 1
(fatorial 3) ;; 6
