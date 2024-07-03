(ns main.app
  (:require [axios]))

(-> (.. axios (get "https://jsonplaceholder.typicode.com/todos/2"))
    (.then #(js/console.log %)))


(js/console.log "Hello, World")
