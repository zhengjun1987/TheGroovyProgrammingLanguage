import chapter10.*

println(['Groovy','Rocks!'].join(' '))
def test = new Test("The day you went away")
println(test)

name = "Zheng Jun"

def shell = new GroovyShell(binding)
def evaluate = shell.evaluate(new File("Script1.groovy"))

println "evaluate = $evaluate"
println "Hello ${name}"

//evaluate(new File("Script1.groovy"))


//            Groovy Rocks!
//            Test{mText='The day you went away'}
//            Hello Zheng Jun from Script1.groovy
//            evaluate = Frank Underwood
//            Hello Frank Underwood