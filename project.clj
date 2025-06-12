(defproject potato-catalog "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [ring/ring-core "1.13.0"]
                 [ring/ring-jetty-adapter "1.13.0"]
                 [org.slf4j/slf4j-simple "2.0.16"]
                 [compojure/compojure "1.7.1"]
                 [ring/ring-defaults "0.5.0"]
                 [hiccup/hiccup "1.0.5"]
                 [com.github.seancorfield/next.jdbc "1.3.981"]
                 [com.h2database/h2 "2.3.232"]]
  :main ^:skip-aot potato-catalog.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
