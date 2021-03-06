(defproject circleci/circleci.test "0.3.1-SNAPSHOT"
  :description "clojure.test compatible test-runner"
  :url "https://github.com/circleci/circleci.test"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :pedantic? :abort
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/data.xml "0.0.8"]]
  :aliases {"test" ["run" "-m" "circleci.test/dir" :project/test-paths]
            "retest" ["run" "-m" "circleci.test.retest"]}
  :profiles {:uberjar {:aot :all}})
