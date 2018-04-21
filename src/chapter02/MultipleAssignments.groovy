package chapter02

def splitName(fullName) {
    fullName.split(" ")
}

def (first, last) = splitName("James Bond")
println "$last,$first $last"
//        192:chapter02 zhengjun$ groovy MultipleAssignments
//        Bond,James Bond

def name1 = 'Thomson'
def name2 = 'Thompson'
println "$name1 and $name2"
(name1, name2) = [name2, name1]
println "$name1 and $name2"
//        Thomson and Thompson
//        Thompson and Thomson

def (cat, mouse) = ['Tom', 'Jerry', 'Spike', 'Tyke']
println "$cat and $mouse"
//        Tom and Jerry

def (top, second, third) = ['Tom', 'Jerry']
println "$top,$second and $third"
//        Tom,Jerry and null