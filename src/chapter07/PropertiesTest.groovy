def s = "properties.txt"
def file = new File(s)
file.withWriter {
    writer ->
        writer << "deviceType = BREAK_DZ\n"
        writer << "version = 1.2.2"
}

def properties = new Properties()
properties.load(new FileInputStream(file))
def deviceType = "deviceType"
println "{properties.get(\"deviceType\")} = ${properties.get(deviceType)}"
def version = "version"
println "{properties.get(\"version\")} = ${properties.get(version)}"
properties.with {
    setProperty(deviceType,"BREAK_YF")
    setProperty(version,"1.3.0")
    store(new PrintWriter(file,"utf-8"),"build config amendment 2018-10-18 18:22:57")
    println getProperty(deviceType)
    println getProperty(version)
}

file.text.readLines().each {
    text ->
        println text
}