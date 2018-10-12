def pickEven(n,Closure closure){
    for (int i = 2; i <= n; i+=2) {
        closure.call(i)
    }
}

pickEven(10) {
    print "$it "
}
println ""

sum = 0
pickEven(10) {
    sum += it
}
println "sum = $sum"

product = 1
pickEven(10) {
    product *= it
}
println "product = $product"
