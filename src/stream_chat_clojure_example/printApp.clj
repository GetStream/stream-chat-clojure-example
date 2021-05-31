(ns stream-chat-clojure-example.printApp
  (:import (io.getstream.chat.java.models App)))

(defn -main [] (
                 println (.request (App/get))
                ))
