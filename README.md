本地运行

# 克隆项目
git clone <repo_url>
cd MyApp

# 编译
mvn clean compile

# 运行
mvn exec:java -Dexec.mainClass="com.example.myapp.Main"


输出：

Hello, GitHub Actions!
3 + 5 = 8


GitHub Actions

push 到 main 分支或者手动触发

自动 checkout → 安装 JDK → 编译 → 运行 → 日志输出