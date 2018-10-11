class PriceExtension1 {
    public static String getPrice(String self){
        def url = "https://api.douban.com/v2/book/1220562".toURL()
        url.content.properties.toString()
    }
}

println PriceExtension1.getPrice("1220562")


//        Caught: java.net.UnknownHostException: ichart.finance.yahoo.com
//        java.net.UnknownHostException: ichart.finance.yahoo.com
//        at PriceExtension1.getPrice(PriceExtension.groovy:4)
//        at PriceExtension1$getPrice.call(Unknown Source)
//        at PriceExtension.run(PriceExtension.groovy:9)
