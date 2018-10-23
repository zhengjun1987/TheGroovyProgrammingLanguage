import java.util.zip.ZipFile

def zipFile = new ZipFile("D:\\databackup_2018-10-22_10-36-14.zip")
zipFile.entries().each {
    entry ->
        println "entry = ${entry}"
}
