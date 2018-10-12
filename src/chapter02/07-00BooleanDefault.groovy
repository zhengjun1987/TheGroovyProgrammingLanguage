def testBoolean(target){
    if(target){
        println "target $target is TRUE"
    } else {
        println "target $target is FALSE"
    }
}

testBoolean ""
testBoolean " "
testBoolean 1
testBoolean 10
testBoolean 0
arr = []
testBoolean arr
arr << ''
testBoolean arr
arr << 'admin'
testBoolean arr

//        target  is FALSE
//        target   is TRUE
//        target 1 is TRUE
//        target 10 is TRUE
//        target 0 is FALSE
//        target [] is FALSE
//        target [] is TRUE
//        target [admin] is TRUE