println "================== Script3 ====================="
def binding1 = new Binding()
binding1.setProperty("name","Kevin Spacey")
def shell = new GroovyShell(binding1)
shell.evaluate(new File("Script1.groovy"))
def binding2= new Binding()
binding2.setProperty("name","Frank Underwood")
def shell2 = new GroovyShell(binding2)
shell2.evaluate(new File("Script1.groovy"))