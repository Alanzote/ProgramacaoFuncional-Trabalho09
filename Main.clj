; Aluno: Alan Renato Bunese
; Disciplina: Programação Funcional
; Professor: Frank Alcantara

; 1.
; Utilizando a linguagem Clojure, crie uma função chamada ultimo que receba
; uma lista e devolva o último elemento desta lista sem usar as funções
; já prontas e disponíveis para esta mesma finalidade na linguagem Clojure.
(defn ultimo
  ([[fst & rst]]
   (if (empty? rst)
     fst
     (ultimo rst)))
)

; 2.
; Utilizando a linguagem Clojure, crie uma função chamada penultimo que receba
; uma lista e devolva o penúltimo elemento desta lista sem usar as funções
; já prontas e disponíveis para esta mesma finalidade na linguagem Clojure.
(defn penultimo
  ([[fst & rst]]
   (if (= (count rst) 1)
    fst
    (penultimo rst)))
)

; 3.
; Utilizando a linguagem Clojure, crie uma função chamada elementoN que receba
; uma lista e um inteiro N e devolva o elemento que está na posição N desta lista
; sem usar as funções já prontas e disponíveis para esta mesma finalidade
; na linguagem Clojure.
(defn elementoN
  ([elements n]
   (elementoN 0 elements n))
  ([ctn [elem & rst] n]
   (if (= ctn n)
    elem
    (elementoN (+ ctn 1) rst n)))
)

; 4.
; Utilizando a linguagem Clojure, cria uma função chamada inverso que receba uma lista
; e devolva esta lista com as posições dos elementos invertidas. Por exemplo recebe
; [1, 2, 3] e devolve [3, 2, 1]. Sem usar as funções já prontas e disponíveis
; para esta mesma finalidade na linguagem Clojure.
(defn inverso
  ([[fst & rst]]
   (if (empty? rst)
    (list fst)
    (concat (inverso rst) (list fst))))
)

; 5.
; Utilizando a linguagem Clojure, crie uma função chamda mdc que receba dois inteiros
; e devolve o mínimo divisor comum entre eles. Sem usar as funções já prontas e
; disponíveis para esta mesma finalidade na linguagem Clojure.
(defn mdc
 ([a b]
  (if (= b 0)
   a
   (mdc b (mod a b))))
)

; Testes das Funções.
(println "ultimo: entrada: [1 5 10 77]; resultado: " (ultimo [1 5 10 77]))
(println "ultimo: entrada: [10 7 8 3 5]; resultado: " (ultimo [10 7 8 3 5]))
(println "penultimo: entrada: [1 5 10 77]; resultado: " (penultimo [1 5 10 77]))
(println "penultimo: entrada: [10 7 8 3 5]; resultado: " (penultimo [10 7 8 3 5]))
(println "elementoN: entrada: [1 5 10 77] 1; resultado: "(elementoN [1 5 10 77] 1))
(println "elementoN: entrada: [10 7 8 3 5] 3; resultado: "(elementoN [10 7 8 3 5] 3))
(println "inverso: entrada: [1 5 10 77]; resultado: " (inverso [1 5 10 77]))
(println "inverso: entrada: [10 7 8 3 5]; resultado: " (inverso [10 7 8 3 5]))
(println "mdc: entrada: 10 5; resultado: " (mdc 10 5))
(println "mdc: entrada: 10 0; resultado: " (mdc 10 0))
(println "mdc: entrada: 25 30; resultado: " (mdc 25 30))
