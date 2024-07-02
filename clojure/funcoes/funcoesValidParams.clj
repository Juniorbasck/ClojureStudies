(defn testando-argumentos
  ([a] (println "Apenas um argumento foi enviado!"))
  ([a b] (println "Dois argumentos foram enviados!")))

(testando-argumentos 1) ;; Apenas um argumento foi enviado!

(testando-argumentos 1 2) ;; Dois argumentos foram enviados!
