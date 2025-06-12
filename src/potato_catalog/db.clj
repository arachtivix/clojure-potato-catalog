(ns potato-catalog.db
  (:require [next.jdbc.sql :as sql]
            [next.jdbc :as jdbc]))

(def db-spec {:dbtype "h2" :dbname "./my-db"})

(defn init-db [] (jdbc/execute-one! db-spec ["
              CREATE TABLE locations (
                id bigint primary key auto_increment,
                x  integer,
                y  integer
              )
              "]))

(defn add-location-to-db
  [x y]
  (let [results (sql/insert! db-spec :locations {:x x :y y})]
    (assert (and (map? results) (:LOCATIONS/ID results)))
    results))

(defn get-xy
  [loc-id]
  (let [results (sql/query db-spec
                           ["select x,y from locations where id = ?" loc-id])]
    (assert (= (count results) 1))
    (first results)))

(defn get-all-locations
  []
  (sql/query db-spec ["select id, x, y from locations"]))

(comment
  (get-all-locations)
  (get-xy 1))