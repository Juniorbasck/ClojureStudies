(ns server.core
  (:require [org.httpkit.server :refer [run-server]]
            [com.moclojer.adapters :as adapters]
            [com.moclojer.server :as server])
  (:gen-class))

(defn app [req]
  {:status  200
   :headers {"Content-Type" "text/html"}
   :body    (str "TESTE TESTE")})

(def *router
  "create a router from a config map"
  (adapters/generate-routes
   [{:endpoint
     {:method "GET"
      :path "/example"
      :response {:status 200
                 :headers {:Content-Type "application/json"}
                 :body {:id 123}}}}]))

(defn -main
  "start the server"
  [& args]
  (server/start-server! *router))

(defn -main [& args]
  (run-server app {:port 3000})
  (println "Server inicializado na porta 3000"))

