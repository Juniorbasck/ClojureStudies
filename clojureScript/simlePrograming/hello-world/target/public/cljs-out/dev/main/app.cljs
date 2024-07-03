(ns main.app
  (:require [axios]
            [react]
            [react-dom]))

(-> (.. axios (get "https://jsonplaceholder.typicode.com/todos/2"))
    (.then #(js/console.log %)))

(def e react/createElement)

(def container (e "h1" nil "first container"))

(def dom-container (.. js/document (querySelector "#container")))

(react-dom/render container dom-container)

