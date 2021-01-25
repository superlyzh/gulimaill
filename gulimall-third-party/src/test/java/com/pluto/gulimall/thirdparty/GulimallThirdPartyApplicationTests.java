package com.pluto.gulimall.thirdparty;



import com.aliyun.oss.OSS;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallThirdPartyApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    OSS ossClient;

    @Test
    public void testUpload(){
        // Endpoint以杭州为例，其它Region请按实际情况填写。
        String endpoint = "oss-cn-shanghai.aliyuncs.com";
// 云账号AccessKey有所有API访问权限，建议遵循阿里云安全最佳实践，创建并使用RAM子账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建。
        //用户登录名称 gulimall@1367308260143860.onaliyun.com
        //AccessKey ID LTAI4G91N1zp9N8H41njfNNp
        //AccessKey Secret 7vDoGQKMV5ZTS7D6PfiJWPpBdhycyA
//        String accessKeyId = "LTAI4G91N1zp9N8H41njfNNp";
//        String accessKeySecret = "7vDoGQKMV5ZTS7D6PfiJWPpBdhycyA";

// 创建OSSClient实例。
//        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

// 上传文件流。
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("C:\\Users\\17763\\Desktop\\壁纸\\精选1080P电脑壁纸第二期\\002.jpg");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ossClient.putObject("gulimall-pluto", "002.jpg", inputStream);

// 关闭OSSClient。
        ossClient.shutdown();
        System.out.println("上传完成....");
    }
}
