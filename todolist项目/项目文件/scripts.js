const todoNums = document.getElementById("todoNums");
const doneNums = document.getElementById("doneNums");
const todoInput = document.getElementById("todoInput");
const InputBtn = document.getElementById("InputBtn");
const switchBtn = document.getElementById("switchBtn");
const todoList = document.querySelectorAll(".todoItem");
const doneList = document.querySelectorAll(".doneItem");
const listDone = document.querySelector(".doneList");
const listTodo = document.querySelector(".todoList");
const batchComplateBtn = document.getElementById("batchComplate");
const batchRemoveBtn = document.getElementById("batchRemove");

//切换列表
const switchList = () => {
    if (switchBtn.textContent === "代办任务"){
        switchBtn.textContent = "已完成任务";
        listDone.style.display = "contents";
        listTodo.style.display = "none";
        todoInput.disabled = true;
        InputBtn.disabled = true;
    }else {
        switchBtn.textContent = "代办任务";
        listTodo.style.display = "contents";
        listDone.style.display = "none";
        todoInput.disabled = false;
        InputBtn.disabled = false;
    }
}

//新增事项
const addItem = () => {
    const item = todoInput.value;
    if (!item) {
        alert("请输入代办事项");
        return;
    }
    const date = new Date();
    const itemDate = `${date.getFullYear()}-${Number(date.getMonth()+1)}-${date.getDate()} ${date.getHours()}:${date.getMinutes()}:${date.getSeconds()}`;
    const tbody = listTodo.querySelector("tbody")
    tbody.innerHTML = 
    `
    <tr  class="todoItem">
        <td><input type="checkbox" /></td>
        <td><p class="item">${item}</p></td>
        <td><p class="time">${itemDate}</p></td>
        <td><button onclick="removeItem(this)">删除</button><button onclick="completeItem(this)">完成</button></td>
    </tr>
    ` 
    + tbody.innerHTML

    todoNums.textContent = document.querySelectorAll(".todoItem").length
}

//删除事项
const removeItem = (Button) => {
    Button.parentNode.parentNode.remove();
    todoNums.textContent = document.querySelectorAll(".todoItem").length
}

//完成事项
const completeItem = (Button) => {
    const tbody = listDone.querySelector("tbody");
    const item = Button.parentNode.parentNode.querySelector(".item").textContent;
    const date = new Date();
    const itemDate = `${date.getFullYear()}-${Number(date.getMonth()+1)}-${date.getDate()} ${date.getHours()}:${date.getMinutes()}:${date.getSeconds()}`;
    tbody.innerHTML = 
    `
    <tr  class="doneItem">
        <td><input type="checkbox" /></td>
        <td><p class="item">${item}</p></td>
        <td><p class="time">${itemDate}</p></td>
        <td><button onclick="removeItem(this)">删除</button></td>
    </tr>
    `
    + tbody.innerHTML;
    Button.parentNode.parentNode.remove();
    todoNums.textContent = document.querySelectorAll(".todoItem").length
    doneNums.textContent = document.querySelectorAll(".doneItem").length
}

//批量完成
const batchComplate = () => {
    const todoList = document.querySelectorAll(".todoItem");
    todoList.forEach((item)=>{
        if(item.querySelector("input").checked) {
            completeItem(item.querySelector("td").querySelector("input"))
        }
    })
}

//批量删除
const batchRemove = () => {
    const todoList = document.querySelectorAll(".todoItem");
    const doneList = document.querySelectorAll(".doneItem");
    todoList.forEach((item)=>{
        if(item.querySelector("input").checked) {
            item.remove();
        }
    })
    doneList.forEach((item)=>{
        if(item.querySelector("input").checked) {
            item.remove();
        }
    })
    todoNums.textContent = document.querySelectorAll(".todoItem").length
    doneNums.textContent = document.querySelectorAll(".doneItem").length
}

switchBtn.addEventListener('click',switchList);

InputBtn.addEventListener('click',addItem);

batchComplateBtn.addEventListener('click',batchComplate);

batchRemoveBtn.addEventListener('click',batchRemove);