def receiveVarArgs(int a,int ... ints){
    println("You passed $a and $ints")
}

def receiveArray(int a,int[] ints){
    println("You passed $a and $ints")
}

receiveVarArgs(1,2,3,4,5)
receiveArray(1,2,3,4,5)
//        You passed 1 and [2, 3, 4, 5]
//        You passed 1 and [2, 3, 4, 5]
//
//        Process finished with exit code 0