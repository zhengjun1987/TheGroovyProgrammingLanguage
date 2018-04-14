package chapter02

5.times {print "$it "}
println ""

1.upto(5) {print "$it "}
println ""

0.step(10,2) {
    print "$it "
}
println ""

//    zhengjuns-MacBook-Pro:chapter02 zhengjun$ groovy Loops
//    0 1 2 3 4
//    1 2 3 4 5
//    0 2 4 6 8

