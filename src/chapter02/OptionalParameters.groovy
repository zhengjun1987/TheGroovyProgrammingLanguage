package chapter02

def log(x,base=10){
    Math.log(x)/Math.log(base)
}

println log(1024)//3.0102999566398116
println log(1024,10)//3.0102999566398116
println log(1024,2)//10.0

println Math.log(Math.E)//1.0
