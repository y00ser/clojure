# Kata sheet

###Syntaxes

- let me do some local(e call out to function)
- do

###Java

- call java methods
- static access of values

###Loops types

- recur with if
- recur with when
- loop
- doseq

###Data types

- demonstrate type eruption
- forcing precision
- make it overflow(unchecked-add)
- collapsing into zeros
- abce50 example vs rationalize(rational?)
- keyword as function
- namespaces??(70)
- symbol identical(same object)
- demonstrate metadata usage
- regex with split and re-seq, diff?

### Complext data types
- create an array, change its value
- create vector, change ist value, explain difference
- explain how ```first/last``` and ```rest``` works
- explain seq (empty/with elements(identical))
- 3 partitions of complex types? usage with =?
- maps keys/vals
- into/vector-of/nth/get/vector as a function to access/rseq/assoc what does it do?/replace
- vector is a stack, demonstrate: peek/pop/conj...double peek/subvec
- slice a map into key/value pairs and print them
- list/map/vector conj/cons
- collection operations: conj/cons/peek/pop/first/last/next/nth
- queue: clojure.lang.PersistentQueue/EMPTY, diff between pop & rest
- set: create/retrieval(2)/contains?/some/sorted-set/intersection/union/difference(is A-B)
- map: show how they functions of their own keys assoc/keys/vals/into/apply hash-map/zipmap(zip it together)/sorted-map/hash-map vs array-map
- ex: unify collections and write function to return index

###Functional programming

- create tree building functions {:value 1 :l nil :r nil}, also print tree
- and?
- understand and reproduce this 
	```(def very-lazy (-> (iterate #(do (print \.) (inc %)) 1)
								rest rest rest))```
- demonstrate usage of lazy-seq, explain while lazy is useful
- first vs last access when collection is big(use let?)
- show usage of infinite sequences
- usage of iterate/take/(map fn (range 10))/filter/reduce/drop-while/if-let/when-let
- delay/force(also see macros), create linked list with it
- implement quick sort taking elements lazily?								