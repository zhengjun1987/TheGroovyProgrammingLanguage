package chapter02

def openFile(fileName){
    new FileInputStream(fileName)
}

try {
    openFile("nonexistentfile")
} catch (FileNotFoundException ex) {
    println "Oops: "+ex
}
//    zhengjuns-MacBook-Pro:chapter02 zhengjun$ groovy ExceptionHandling
//    Oops: java.io.FileNotFoundException: nonexistentfile (No such file or directory)
