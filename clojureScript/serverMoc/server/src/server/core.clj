(ns server.core
  (:require [com.moclojer.adapters :as adapters]
            [com.moclojer.server :as server]
            [cheshire.core :as json])
  (:gen-class))

(defn app [req]
  {:status  200
   :headers {"Content-Type" "text/html"}
   :body    (str "TESTE TESTE")})

(defn json-response [data]
  {:status  200
   :headers {"Content-Type" "application/json"}
   :body    (json/generate-string data)})

(def lista-produtos
     '("Sofá" "Galadeira" "Armario" "Mesa" "TV-200" "Prato"))

(def *router
  "create a router from a config map"
  (adapters/generate-routes
   [{:endpoint
     {:method "GET"
      :path "/example"
      :response {:status 200
                 :headers {:Content-Type "application/json"}
                 :body {:id 123}}}}
    {:endpoint
     {:method "GET"
      :path "/produtos"
      :response (json-response lista-produtos)}}]))

(defn -main
  "start the server"
  [& args]
  (server/start-server! *router)  
  (println "Server inicializado com rotas configuradas na porta 8000"))
