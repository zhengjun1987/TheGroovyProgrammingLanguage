package chapter08

import groovy.xml.DOMBuilder
import groovy.xml.dom.DOMCategory
import org.w3c.dom.Element

/**
 *   Author:Zheng Jun
 *   E-mail:zhengjun1987@outlook.com
 *   Date:2018/5/28 00:50
 *   Project:TheGroovyProgrammingLanguage
 */

doucument = DOMBuilder.parse(new FileReader("languages.xml"))
def rootElement = doucument.documentElement

use(DOMCategory){

}