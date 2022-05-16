function click_me(){
    let element = document.getElementById("page_mode");

    if (document.body.style.backgroundColor == "black"){
        element.innerHTML = "Press here for dark mode";
        element.style.color = "black";
        document.body.style.backgroundColor = "white";
        document.body.style.color = "black";
    } else {
        element.innerHTML = "Press here for light mode";
        element.style.color = "white";
        document.body.style.backgroundColor = "black";
        document.body.style.color = "white";
    }
}

function analyseForm(){
    let new_blog = document.createElement("p");
    new_blog.innerHTML = document.getElementById("blog_title").value;

    let new_author = document.createElement("p");
    new_author.innerHTML = document.getElementById("author").value;

    let blog = document.createElement("p");
    blog.innerHTML = document.getElementById("blog_text").value;

    document.getElementById("blogs").appendChild(new_blog);
    document.getElementById("blogs").appendChild(new_author);
    document.getElementById("blogs").appendChild(blog);
}


