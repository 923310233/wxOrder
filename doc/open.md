# 微信开放平台的开发使用
> 本文档仅针对问我借用账号的情况（借用了公众平台账号并且有效期内）, 如果自己有开放账号, 可直接按照慕课网视频或者微信文档开发
1. 准备好openid和网址, openid是在“师兄干货”里的那个，网址的host保证与之前发的一样, 比如之前发给我的网址是`http://abc.natapp.cc`, 那么这次使用的网址必须是`http://abc.natapp.cc`开头
2. 电脑浏览器下面的链接, 注意替换openid和你的网址(需要urlEncode)

    ```
    https://open.weixin.qq.com/connect/qrconnect?appid=wx6ad144e54af67d87&redirect_uri=http%3A%2F%2Fsell.springboot.cn%2Fsell%2Fqr%2F{OPENID}&response_type=code&scope=snsapi_login&state={你的网址}
    ```
3. 最后会重定向到`你的网址?code=xxxxxxxxxxx`
4. 例子

    openid是oTgZpweNnfivA9ER9EIXoHAjlrWQ
    之前邮件发送的网址是http://coding.imooc.com
    这次使用的网址是http://coding.imooc.com/class/117.html
    那么访问的地址为
    
    ```
    https://open.weixin.qq.com/connect/qrconnect?appid=wx6ad144e54af67d87&redirect_uri=http%3A%2F%2Fsell.springboot.cn%2Fsell%2Fqr%2FoTgZpweNnfivA9ER9EIXoHAjlrWQ&response_type=code&scope=snsapi_login&state=http%3A%2F%2Fcoding.imooc.com%2Fclass%2F117.html
    ```
    
    最后会重定向到
    
    ```
    http://coding.imooc.com/class/117.html?code=001bitQu0uteYd13BsQu0TetQu0bitQ
    ```
    拿到code之后即可获取扫码者的openid了, 还不清楚? 请观看慕课网《Spring Boot企业微信点餐系统》第12章卖家扫码登录部分
5. 问：扫码之后, pc端不会跳转是什么原因?
   答：{你的网址}不能访问


