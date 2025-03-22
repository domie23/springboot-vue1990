const base = {
    get() {
        return {
            url : "http://localhost:8080/yundonghui/",
            name: "yundonghui",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/yundonghui/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "高校运动会管理系统"
        } 
    }
}
export default base
