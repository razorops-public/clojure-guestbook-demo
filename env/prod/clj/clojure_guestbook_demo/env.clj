(ns clojure-guestbook-demo.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[clojure-guestbook-demo started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[clojure-guestbook-demo has shut down successfully]=-"))
   :middleware identity})
