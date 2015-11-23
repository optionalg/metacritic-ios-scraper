(defproject metacritic-ios-scraper "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [clj-http "2.0.0"]
                 [cheshire "5.5.0"]
                 [clj-http "2.0.0"]
                 [hiccup "1.0.5"]
                 [enlive "1.1.6"]]
  :main ^:skip-aot metacritic-ios-scraper.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
