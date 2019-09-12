# docker-sonarqube

## 搭建代码质量检测平台(中文) SonarQube

添加阿里java p3c检查

### download docker-compose.yml
```
$ git clone https://github.com
$ cd docker-sonarqube
```
### how to use
```
$ docker-compose up -d 
```
visit：localhost:9000
> username/password：admin/admin



## maven 配置

```.xml
    <build>
        <plugins>

            <plugin>
                <groupId>org.sonarsource.scanner.maven</groupId>
                <artifactId>sonar-maven-plugin</artifactId>
                <version>3.6.0.1398</version>
            </plugin>

        </plugins>
    </build>

    <!-- 代码质量检测 -->SonarQube
    <profiles>
        <profile>
            <id>sonar</id>
            <activation>
                <activeByDefault>true</activeByDefault>
            </activation>
            <properties>
<!--                <sonar.host.url>http://127.0.0.1:9000/</sonar.host.url>-->
                <sonar.host.url>http://10.1.1.97:9000/</sonar.host.url>
            </properties>
        </profile>
    </profiles>
```