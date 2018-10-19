String[] command = ['perl', 'say \'Groovy\'']
println "Calling ${command.join(' ')}"
println command.join(' ').execute().text
