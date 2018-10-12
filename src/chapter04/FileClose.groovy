/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/4/27 9:38
 */

final String s = "岱宗夫如何\n齐鲁青未了\n荡胸生层云\n决眦入归鸟\n造化钟神秀\n阴阳割昏晓\n会当凌绝顶\n一览众山小"
def writer = new FileWriter("C:\\Users\\Lenovo\\IdeaProjects\\TheGroovyProgrammingLanguage\\src\\output.txt")
writer.write(s)
writer.close()   //这一句很容易被遗忘,导致实际文件并未被写入

new FileWriter("output2.txt").withWriter {
    it.write(s)
}//此闭包自动封装了打开写入冲刷缓存关闭的全过程，只需写入数据即可