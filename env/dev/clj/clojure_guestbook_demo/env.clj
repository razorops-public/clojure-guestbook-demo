(ns clojure-guestbook-demo.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [clojure-guestbook-demo.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[clojure-guestbook-demo started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[clojure-guestbook-demo has shut down successfully]=-"))
   :middleware wrap-dev})
