# Learning Clojure

<p>Clojure is a functional programming language that uses JVM.
General-purpose language.</p>

## Clojure Basics

- 2007 - Rich Hickey
- Simplicity
- Interoperability with Java
- REPL - Read Eval Print Loop
- Immutability
- Map, Filter, Reduce
- Concurrency and parallelism
- Family of programming languages Lisp (List Processing)
  - John McCarthy
  - There are several dialects of LISP, including Common Lisp, Scheme and Clojure.
- Math functions
- Compiled language  (Clojure -> JVM code)
- One pass compiler -> func must be defined before called
- Everything is a list
- everything has a return | no break op | nil or null
- chaining ops | e.g. (println "Yasmin has " (+ 3 9) " appled") # return nil

- Cases of Clojure in production: Brazil Nubank / Walmart / ThoughWorks

- Use command:

```shell
clojure
```

## Language:

```clojure
(println "ola")
```

### Math operation

- Usage of Postfix notation, or Reverse Polish Notation (RPN)
- Infix: 3 + 4 * (2 - 1) Postfix: 3 4 2 1 - * +

```clojure
(+ 2 2)
``` 

- Common math functions receives a vector of elements

```clojure
(+ 3 3 1 2)
```

## Vectors

- can use comman (,) for legibility
- [] <= empty vector
- [1 2 3 5]
- ["String 1" "String 2"] 
- [1 "String" 3.14]
- (count [1 2 3 4]) => return size (4 in this case)
- (conj [1 2 3 4] 5) => add 5 to vector (conj => conjoin)
- (pop [1 2 3]) => remove 3 (last one)
- (peek [1 2 3]) => return last element
- (peek (conj [1 2 3 4] 5)) => return 5
- (println "Yasmin has " (+ 2 3) " apples") # return nil

## keywords

- ns => namespace | each file defines a namespace
- & => used as a parameter that can receive zero or any number of arguments
- (fn ...) OR #(...) == anonymous functions
- defn => creates a function
- def => symbol that refers to a value (this value can be a function)

## Data types

- Types inherited from java
  - java.lang.byte
  - java.lang.double
  - etc
- Some specifics to clojure
  - Atoms (good for concurrency and threading)

- string = (def type-string "asdsad")
- int = (def type-int 1)
- float = (def type-float 1.99)
- float-scientific-notation = (def type-float 1.99e-10)
- hex = (def type-hex 0xfcba03)
- boolean = (def type-boolean true)
- null = (def type-null nil)
- symbol = (def type-symbol 'something) <- to represent somthing
- keyword = (def type-keyword :something) <- tag, like :name or :user/id

## Variables

- immutable
- case sensitive

## Operator

- Symbols
  - math
    - `+` `-` `*` `/` `INC` `DEC` `MAX` `MIN` `REM` <- remainder of the division
  - relational
    - `=` `NOT=` `<` `<=` `>` `>=` 
  - logical
    - `AND` `OR` `NOT`
  - bitwise
    - `BIT-AND` `BIT-OR` `BIT-XOR` `BIT-NOT`

## Complex data types

- compose of one or more simple data type
- set = Different types of values in the same set
  - immutable
  - based on trees
  - `#{}` or `#{ "name" 123 2.11}`
- map = key value pair, 
  - `{:KEY1 VALUE1, :KEY2 VALUE2}`
  - immutable
- vectors = arrays
  - immutable
  - indexed by position
  - `[1 "asd" 1.233]`
- list
  - immutable
  - `(1 "123" "name" 1.23 (1 2 3))`

## Conventions

- Variables/Functions (lisp-case)
  - eg: (def some-var ...) | (defn some-fun ...)
- Namespaces (dot.separated)
  - eg: (ns com.my-company.my-project.my-module)
- functions that returns a boolean ends with ?
  - eg: (defn empty? [coll] (= 0 (count coll)))
