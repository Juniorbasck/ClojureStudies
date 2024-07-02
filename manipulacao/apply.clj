(apply max [1 2 3 4 5]) ;; 5

(max 1 2 3 4 5) ;; 5

;; Função não é aplicada corretamente
;; porque o vetor é visto como um
;; único parâmetro!

(max [1 2 3 4 5]) ;; [1 2 3 4 5]
