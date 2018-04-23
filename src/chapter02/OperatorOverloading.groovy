package chapter02

for (ch in 'a'..'z') {
    print "$ch "
}
println ""
//        192:chapter02 zhengjun$ groovy OperatorOverloading.groovy
//        a b c d e f g h i j k l m n o p q r s t u v w x y z

list = ['hello']
list << 'there'
println list
//        [hello, there]

class ComplexNumber {
    def real,imaginary
    def plus(ComplexNumber other){
        new ComplexNumber(real: real+other.real,imaginary: imaginary+other.imaginary)
    }


    @Override
    public String toString() {
        return "$real + ${imaginary}i";
    }
}
c1 = new ComplexNumber(real: 1,imaginary: 2)
c2 = new ComplexNumber(real: 4,imaginary: 1)

println c1.plus(c2) //   5 + 3i
