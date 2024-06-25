#{1 2 3 4 5}

(def set-desenvolvedores
    #{"Kalane" "Daniel" "Cherry" "Canhassi" "Fabrício"})

(set? desenvolvedores)


(contains? set-desenvolvedores "Daniel")


(set-desenvolvedores "Daniel")


(def letras #{:a :b :c})

(:a letras) ;; :a

(letras :a) ;; :a

(:d letras) ;; nil


(conj set-desenvolvedores "Guto")


(disj set-desenvolvedores "Fabrício")
