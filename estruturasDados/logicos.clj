(= 1 true) ;; false

(= 1 1) ;; true

(= true true) ;; true

(= 1 2) ;; false

(= 1 1 1) ;; true

(= 1 1 2) ;; false

(< 1 2) ;; true

(<= 1 2) ;; true

(> 1 2) ;; false

(>= 1 2) ;; false

(< 1 2 3) ;; true

(< 1 3 2) ;; false

(and true true) ;; true

(and true false) ;; false

(and true true true) ;; true

(or true true) ;; true

(or true false true) ;; true

(or false false) ;; false

(not false) ;; true

(not true) ;; false

(not (> 1 2)) ;; true

