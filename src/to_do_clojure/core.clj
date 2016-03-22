(ns to-do-clojure.core
  (:gen-class))

(def todos (atom [])) ;holds todos

(defn -main []
  (println "Type a todo and hit enter. Type q to quit.")
  (loop []
    (let[text (read-line)]
      (when (not= text "q")
        (reset! todos (conj @todos text))
        (recur))))
  (println @todos))
         
         
  
  
