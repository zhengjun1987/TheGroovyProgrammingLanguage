def method() {
    println "BlockInMethod.method";
//
//    {
//        println "it = $it";
//    }
}

method()
//        org.codehaus.groovy.control.MultipleCompilationErrorsException: startup failed:
//        C:\Users\Lenovo\IdeaProjects\TheGroovyProgrammingLanguage\src\chapter02\BlockInMethod:
//        3: Ambiguous expression could be a parameterless closure expression, an isolated open code block, or it may continue a previous statement;
//        solution: Add an explicit parameter list, e.g. {it -> ...}, or force it to be treated as an open block by giving it a label, e.g. L:{...},
//        and also either remove the previous newline, or add an explicit semicolon ';' @ line 3, column 13.