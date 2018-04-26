/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/4/26 11:49
 */
class City {
    private String code;
    private String name;
    private String pCode;

    City(String code, String name, String pCode) {
        this.code = code;
        this.name = name;
        this.pCode = pCode;
    }

    String getCode() {
        return code;
    }

    String getName() {
        return name;
    }

    String getpCode() {
        return pCode;
    }

    @Override
    public String toString() {
        return "City{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", pCode='" + pCode + '\'' +
                '}';
    }
}

def use(Object instance) {
    if (instance instanceof String)
        println(instance.length())
    else
        println(instance)
}

use('hello')
use(4)
//        5
//        4


def arrayList = new ArrayList<City>()
def scanner = new Scanner(new FileInputStream("C:\\Users\\Lenovo\\IdeaProjects\\TheGroovyProgrammingLanguage\\src\\cities.txt"))
while (scanner.hasNextLine()) {
    def line = scanner.nextLine()
    def split = line.split("\\|")
    def city = new City(split[0], split[1], split[2])
    arrayList << city
}
println "arrayList = $arrayList.size"
def millis = System.currentTimeMillis()

def getCode(ArrayList<City> arrayList, String str) {
    for (item in arrayList) {
        if (item.name.contains(str))
            return item
    }
}

def city = getCode(arrayList, "松滋")
println "city = $city"