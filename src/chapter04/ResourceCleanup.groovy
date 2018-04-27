/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/4/27 10:10
 */

class Resource {
    def open(){
        print "Resource.open..."
    }
    def close(){
        print "Resource.close..."
    }
    def read(){
        print "Resource.read..."
    }
    def write(){
        print "Resource.write..."
    }
}

//典型的错误使用:
def resource = new Resource()
resource.open()
resource.read()
resource.write()
//        Resource.open...Resource.read...Resource.write...

println()

def static use(closure){
    def resource = new Resource()
    resource.open()
    closure resource
    resource.close()
}

use {
    it.read()
    it.write()
}
//        Resource.open...Resource.read...Resource.write...Resource.close...