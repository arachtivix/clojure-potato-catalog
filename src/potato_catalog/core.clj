(ns potato-catalog.core
  (:require [potato-catalog.handler :as h])
  (:gen-class))

(defn -main []
  (h/run-server))
