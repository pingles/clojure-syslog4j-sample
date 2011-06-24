(ns clojure-syslog4j-sample.core
  (:import [org.productivity.java.syslog4j Syslog]))

(defn send-message
  [msg]
  (.info (Syslog/getInstance "udp") msg))
