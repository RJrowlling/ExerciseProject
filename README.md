### 留言板项目：

在设置点赞的时候，你要用到<button onclick="点赞函数（this）">，这里面的this就是button按钮本身，通过**this.parentNode**,来访问到父级的容器节点，通过在**父级的容器节点.querySelect("点赞数")**，来获取到点赞按钮对应的点赞数。