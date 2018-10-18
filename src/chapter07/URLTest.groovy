def url = "http://api.douban.com/v2/movie/top250?start=0&count=1".toURL()

println url.getText("gbk")
url.properties.each {
    key, val ->
        println "$key => $val"
}


//        {
//            "count": 1,
//            "start": 0,
//            "total": 250,
//            "subjects": [{
//                             "rating": {
//                "max": 10,
//                "average": 9.6,
//                "stars": "50",
//                "min": 0
//            },
//                             "genres": [
//                    "犯罪",
//                    "剧情"
//            ],
//                             "title": "肖申克的救赎",
//                             "casts": [
//                    {
//                        "alt": "https://movie.douban.com/celebrity/1054521/",
//                        "avatars": {
//                        "small": "http://img7.doubanio.com/view/celebrity/s_ratio_celebrity/public/p17525.jpg",
//                        "large": "http://img7.doubanio.com/view/celebrity/s_ratio_celebrity/public/p17525.jpg",
//                        "medium": "http://img7.doubanio.com/view/celebrity/s_ratio_celebrity/public/p17525.jpg"
//                    },
//                        "name": "蒂姆·罗宾斯",
//                        "id": "1054521"
//                    },
//                    {
//                        "alt": "https://movie.douban.com/celebrity/1054534/",
//                        "avatars": {
//                        "small": "http://img7.doubanio.com/view/celebrity/s_ratio_celebrity/public/p34642.jpg",
//                        "large": "http://img7.doubanio.com/view/celebrity/s_ratio_celebrity/public/p34642.jpg",
//                        "medium": "http://img7.doubanio.com/view/celebrity/s_ratio_celebrity/public/p34642.jpg"
//                    },
//                        "name": "摩根·弗里曼",
//                        "id": "1054534"
//                    },
//                    {
//                        "alt": "https://movie.douban.com/celebrity/1041179/",
//                        "avatars": {
//                        "small": "http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p5837.jpg",
//                        "large": "http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p5837.jpg",
//                        "medium": "http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p5837.jpg"
//                    },
//                        "name": "鲍勃·冈顿",
//                        "id": "1041179"
//                    }
//            ],
//                             "collect_count": 1454968,
//                             "original_title": "The Shawshank Redemption",
//                             "subtype": "movie",
//                             "directors": [{
//                                               "alt": "https://movie.douban.com/celebrity/1047973/",
//                                               "avatars": {
//                    "small": "http://img7.doubanio.com/view/celebrity/s_ratio_celebrity/public/p230.jpg",
//                    "large": "http://img7.doubanio.com/view/celebrity/s_ratio_celebrity/public/p230.jpg",
//                    "medium": "http://img7.doubanio.com/view/celebrity/s_ratio_celebrity/public/p230.jpg"
//                },
//                                               "name": "弗兰克·德拉邦特",
//                                               "id": "1047973"
//                                           }],
//                             "year": "1994",
//                             "images": {
//                "small": "http://img7.doubanio.com/view/photo/s_ratio_poster/public/p480747492.jpg",
//                "large": "http://img7.doubanio.com/view/photo/s_ratio_poster/public/p480747492.jpg",
//                "medium": "http://img7.doubanio.com/view/photo/s_ratio_poster/public/p480747492.jpg"
//            },
//                             "alt": "https://movie.douban.com/subject/1292052/",
//                             "id": "1292052"
//                         }],
//            "title": "豆瓣电影Top250"
//        }

//        protocol => http
//        file => /v2/movie/top250?start=0&count=1
//                port => -1
//        query => start=0&count=1
//        host => api.douban.com
//        path => /v2/movie/top250
//        authority => api.douban.com
//        class => class java.net.URL
//        content => {"count": 1, "start": 0, "total": 250, "subjects": [{"rating": {"max": 10, "average": 9.6, "stars": "50", "min": 0}, "genres": ["\u72af\u7f6a", "\u5267\u60c5"], "title": "\u8096\u7533\u514b\u7684\u6551\u8d4e", "casts": [{"alt": "https:\/\/movie.douban.com\/celebrity\/1054521\/", "avatars": {"small": "http://img7.doubanio.com\/view\/celebrity\/s_ratio_celebrity\/public\/p17525.jpg", "large": "http://img7.doubanio.com\/view\/celebrity\/s_ratio_celebrity\/public\/p17525.jpg", "medium": "http://img7.doubanio.com\/view\/celebrity\/s_ratio_celebrity\/public\/p17525.jpg"}, "name": "\u8482\u59c6\u00b7\u7f57\u5bbe\u65af", "id": "1054521"}, {"alt": "https:\/\/movie.douban.com\/celebrity\/1054534\/", "avatars": {"small": "http://img7.doubanio.com\/view\/celebrity\/s_ratio_celebrity\/public\/p34642.jpg", "large": "http://img7.doubanio.com\/view\/celebrity\/s_ratio_celebrity\/public\/p34642.jpg", "medium": "http://img7.doubanio.com\/view\/celebrity\/s_ratio_celebrity\/public\/p34642.jpg"}, "name": "\u6469\u6839\u00b7\u5f17\u91cc\u66fc", "id": "1054534"}, {"alt": "https:\/\/movie.douban.com\/celebrity\/1041179\/", "avatars": {"small": "http://img3.doubanio.com\/view\/celebrity\/s_ratio_celebrity\/public\/p5837.jpg", "large": "http://img3.doubanio.com\/view\/celebrity\/s_ratio_celebrity\/public\/p5837.jpg", "medium": "http://img3.doubanio.com\/view\/celebrity\/s_ratio_celebrity\/public\/p5837.jpg"}, "name": "\u9c8d\u52c3\u00b7\u5188\u987f", "id": "1041179"}], "collect_count": 1454968, "original_title": "The Shawshank Redemption", "subtype": "movie", "directors": [{"alt": "https:\/\/movie.douban.com\/celebrity\/1047973\/", "avatars": {"small": "http://img7.doubanio.com\/view\/celebrity\/s_ratio_celebrity\/public\/p230.jpg", "large": "http://img7.doubanio.com\/view\/celebrity\/s_ratio_celebrity\/public\/p230.jpg", "medium": "http://img7.doubanio.com\/view\/celebrity\/s_ratio_celebrity\/public\/p230.jpg"}, "name": "\u5f17\u5170\u514b\u00b7\u5fb7\u62c9\u90a6\u7279", "id": "1047973"}], "year": "1994", "images": {"small": "http://img7.doubanio.com\/view\/photo\/s_ratio_poster\/public\/p480747492.jpg", "large": "http://img7.doubanio.com\/view\/photo\/s_ratio_poster\/public\/p480747492.jpg", "medium": "http://img7.doubanio.com\/view\/photo\/s_ratio_poster\/public\/p480747492.jpg"}, "alt": "https:\/\/movie.douban.com\/subject\/1292052\/", "id": "1292052"}], "title": "\u8c46\u74e3\u7535\u5f71Top250"}
//        userInfo => null
//        ref => null
//        defaultPort => 80