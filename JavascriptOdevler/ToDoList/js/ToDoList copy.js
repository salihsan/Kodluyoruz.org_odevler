function newElement() {
  let listele = document.querySelector(".list");
  let task = document.getElementById("task").value;
  let yeniLi = document.createElement("LI");
  let textNode = document.createTextNode(task);

  yeniLi.appendChild(textNode);
  list.appendChild(yeniLi);
  document.getElementById("task").value = "";

  let close = document.querySelector(".close");

  var span = document.createElement("SPAN");
  var txt = document.createTextNode("\u00D7");
  span.className = "close";
  span.appendChild(txt);
  yeniLi.appendChild(span);

  yeniLi.addEventListener("click", function (e) {
    yeniLi.style.textDecoration = "line-through";
    yeniLi.style.backgroundColor = "#276678";
    yeniLi.style.color = "white";

    if (e.target.tagName === "LI") {
      e.target.classList.toggle("checked");
    }
    if (e.target.className === "close") {
      let close = document.querySelector(".close");
      let yeniLi = document.createElement("LI");
      yeniLi.style.display = "none";
    }
  });
}


fetch("https://jsonplaceholder.typicode.com/users")
.then((response)=>response.json())
  .then((json) => {
    let al = document.querySelector("#al")
    al.style.color = "blue";
    al.style.fontSize = "3rem";
    al.style.fontWeight = "bold";
    
  })
  
  .catch((err) => console.log(err));

    .then((response) => response.json())
  fetch("https://jsonplaceholder.typicode.com/comments")
    .then((json) => json.map((item) => {
      for (var i = 0; i < json.length; i++) {
        al.innerHTML = (item.name)
      }
    }))
    .catch((err) => console.log(err));




  

  
  
  
  
  
  
  
  
  













