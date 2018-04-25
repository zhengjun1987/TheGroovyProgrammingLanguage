package chapter03;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Author:Zheng Jun
 * E-mail:zhengjun1987@outlook.com
 * Date:2018/4/25 23:17
 * Project:TheGroovyProgrammingLanguage
 */
public class UsingCollectionJava {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        Collection<String> list = strings;
        strings.add("One");
        strings.add("Two");
        strings.add("Three");
        strings.remove(0);
        list.remove(0);

        System.out.println("strings = " + strings);
    }
}
//      strings = [Two, Three]
