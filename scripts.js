//已有评论数
const commentNums = document.getElementById("commentNums");
const userName = document.getElementById("user");
const comment = document.getElementById("comment");
const iconImg = document.getElementById("iconImg");
const issueBtn = document.getElementById("issue");
const comments = document.querySelector(".comments")

let randomNum;

const addComment = () => {
    if (!comment.value || !userName.value) {
        alert("用户名和留言内容不能为空！");
        return ;
    }
    const commentCounts = document.querySelectorAll('.Signcomments').length+1;
    const date = new Date();
    const commentDate = `${date.getFullYear()}-${date.getMonth()}-${date.getDate()} ${date.getHours()}:${date.getMinutes()}:${date.getSeconds()}`;
    comments.innerHTML += 
    `
    <div class="Signcomments" id="Signcomment${commentCounts}">
        <p class="username"><img class="icon" src="./随机头像/${randomNum}.jpg" alt="[!头像显示失败]">${userName.value}</p>
        <p>${comment.value}</p>
        <span>${commentDate}</span>
        <button onclick="likeComment(this)"><img class="like" src="./点赞.png" /></button><span id="likenums">0</span>
        <hr>
    </div>
    `
    commentNums.textContent = commentCounts;
    comment.value = '';
    userName.value = '';
    randomNum = Math.floor(Math.random() * 8) + 1;
    iconImg.src = `./随机头像/${randomNum}.jpg`;
}

const likeComment = (button) => {
    const commentContainer = button.parentNode;
    const likenums = commentContainer.querySelector("#likenums");
    likenums.textContent = Number(likenums.textContent) + 1;
}


issueBtn.addEventListener('click',()=> {;
    addComment()
})

//用户在刷新页面时，会使用8种随机头像
window.addEventListener("load", (event) => {
    randomNum = Math.floor(Math.random() * 8) + 1;
    iconImg.src = `./随机头像/${randomNum}.jpg`;
  });