package Proxy;

public class ProjectRunner {

    public static void main(String[] args) {
        Project realProject = new RealProject("https://github.com/SergeyYakimaha/JS");
        realProject.run();

        Project proxyProject = new ProxyProject("https://github.com/SergeyYakimaha/JS");
        proxyProject.run();
    }
}
