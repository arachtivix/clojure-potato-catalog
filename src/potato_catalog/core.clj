(ns potato-catalog.core
  (:require [potato-catalog.handler :as h]
            [potato-catalog.db :as db])
  (:gen-class))

(defn -main []
  (db/init-db)
  (h/run-server))
