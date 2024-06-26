
(hash-map "a" "b" "c" "d")

(def musicas {"Dear Future Self (Hands Up)" "Fall Out Boy"
              "Onlyfans" "Bibi Babydoll"
              "Naquela Mesa" "Nelson Golçalves"
              "Everlong" "Foo Fighters"})

(get musicas "Everlong")

(assoc musicas "Zombie" "The Cranberries")


(dissoc musicas "Dear Future Self (Hands Up)")


(contains? musicas "Onlyfans")


(find musicas "Naquela Mesa")

(keys musicas)

(vals musicas)

(zipmap #{"a" "b" "c"} (repeat 1))

(def novas-musicas {"Sweet Child O' Mine" "Guns N' Roses"
                    "Dream On" "Aerosmith"
                    "Hotel California" "Eagles"
                    "Come As You Are" "Nirvana"})

(merge musicas novas-musicas)
