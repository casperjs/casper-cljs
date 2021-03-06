(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "A CasperJS project"
  :url "http://notyet.com"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [ghost "0.1.0-alpha1"]]
  :plugins [[lein-cljsbuild "0.2.7"]]
  :cljsbuild {:builds [{:source-path "src-cljs"
                        :compiler {:output-to "out/{{sanitized}}.js"
                                   :optimizations :simple, :pretty-print true}}]}
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"})



