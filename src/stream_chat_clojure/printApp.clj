(ns stream-chat-clojure.printApp
  (:import (io.getstream.models App)))

(defn -main [] (
                 println (.request (App/get))
                ))
