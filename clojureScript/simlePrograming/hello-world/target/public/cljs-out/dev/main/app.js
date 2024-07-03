// Compiled by ClojureScript 1.11.54 {:target :nodejs, :nodejs-rt false, :optimizations :none}
goog.provide('main.app');
goog.require('cljs.core');
main.app.node$module$axios = require('axios');
main.app.node$module$react = require('react');
main.app.node$module$react_dom = require('react-dom');
main.app.node$module$axios.get("https://jsonplaceholder.typicode.com/todos/2").then((function (p1__9510_SHARP_){
return console.log(p1__9510_SHARP_);
}));
main.app.e = main.app.node$module$react.createElement;
main.app.container = main.app.e.call(null,"h1",null,"first container");
main.app.dom_container = document.querySelector("#container");
main.app.node$module$react_dom.render(main.app.container,main.app.dom_container);

//# sourceMappingURL=app.js.map
